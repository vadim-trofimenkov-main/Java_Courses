package JavaCourses.collectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Map1 {
    public static void main(String[] args) {
        Map<Integer, Integer> mapNumbers = new HashMap<>();
        for (int i= 0; i < 100; i++){
            mapNumbers.put(i, i*2);
        }
        int a = mapNumbers.get(2);
        System.out.println(a);
        System.out.println(mapNumbers);
    }
}
