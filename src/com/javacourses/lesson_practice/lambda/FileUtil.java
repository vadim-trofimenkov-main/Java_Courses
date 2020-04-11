package com.javacourses.lesson_practice.lambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Predicate;

public class FileUtil {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vadim\\IdeaProjects\\My Java Project\\src\\com\\javacourses\\lesson_practice\\lambda");

        List<File> files = new ArrayList<>();
        initFiles(file, files);

        List<File> javaFiles = getFilesByExpression(files, file1 -> file1.getName().endsWith(".java"));
        Map<File, FileStatistic> fileWithStatistic = new HashMap<>();

        try {
            for (File javaFile : javaFiles) {
                long linesCount = LineCounter.linesCount(javaFile, "", "import", "package");
                fileWithStatistic.put(javaFile, new FileStatistic(javaFile, linesCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Collection<FileStatistic> values = fileWithStatistic.values();
        List<FileStatistic> statistics = new ArrayList<>(values);

//

        System.out.println(statistics);

    }

    static class FileStatistic {
        private File file;
        private long lineCount;

        public FileStatistic(File file, long lineCount) {
            this.file = file;
            this.lineCount = lineCount;
        }

        public long getLineCount() {
            return lineCount;
        }

        @Override
        public String toString() {
            return file.getName() + " - " + lineCount + "\n";
        }
    }

    public static void initFiles(File dir, List<File> files) {
        File[] dirFiles = dir.listFiles();
        if (dirFiles != null) {
            for (File file : dirFiles) {
                if (file.isDirectory()) {
                    initFiles(file, files);
                } else {
                    files.add(file);
                }
            }
        }
    }

    public static List<File> getFilesWithExtension(Collection<File> files, String extension) {
        List<File> result = new ArrayList<>();

        for (File file : files) {
            if (file.getName().endsWith(extension)) {
                result.add(file);
            }
        }
        return result;
    }

    public static List<File> getFilesByExpression(Collection<File> files, Predicate<File> predicate) {
        List<File> result = new ArrayList<>();
        files.forEach((file) -> {
            if (predicate.test(file)) {
                result.add(file);
            }
        });
        return result;
    }
}
