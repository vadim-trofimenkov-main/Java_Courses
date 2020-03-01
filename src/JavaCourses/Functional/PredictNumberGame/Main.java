package JavaCourses.Functional.PredictNumberGame;

public class Main {
    public static void main(String[] args) {
        PersonGuessGame personGuessGame = new PersonGuessGame(new Person("Вася"));
        personGuessGame.guessNumber();
    }
}