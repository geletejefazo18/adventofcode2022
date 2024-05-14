package challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 {
    public void printResult(List<String> lines) {

        Map<String, Integer> pointsPlay = new HashMap<>();
        pointsPlay.put("X",1);
        pointsPlay.put("Y",2);
        pointsPlay.put("Z",3);

        Map<String, Integer> result = new HashMap<>();
        result.put("AX", 3);
        result.put("AY", 6);
        result.put("AZ", 0);
        result.put("BX", 0);
        result.put("BY", 3);
        result.put("BZ", 6);
        result.put("CX", 6);
        result.put("CY", 0);
        result.put("CZ", 3);

        int counter = 0;
        for (String line : lines) {
            String combination = line.replace(" ","");
            String[] split = line.split("\\s+");
            counter = counter + result.get(combination) + pointsPlay.get(split[1]);
        }
        System.out.println("Total result is "+ counter);
    }

    public void printResult2(List<String> lines) {

        Map<String, Integer> pointsVictory = new HashMap<>();
        pointsVictory.put("X",0);
        pointsVictory.put("Y",3);
        pointsVictory.put("Z",6);

        Map<String, Integer> secondPlayerChoice = new HashMap<>();
        secondPlayerChoice.put("AX", 3);
        secondPlayerChoice.put("AY", 1);
        secondPlayerChoice.put("AZ", 2);
        secondPlayerChoice.put("BX", 1);
        secondPlayerChoice.put("BY", 2);
        secondPlayerChoice.put("BZ", 3);
        secondPlayerChoice.put("CX", 2);
        secondPlayerChoice.put("CY", 3);
        secondPlayerChoice.put("CZ", 1);

        int counter = 0;
        for (String line : lines) {
            String combination = line.replace(" ","");
            String[] split = line.split("\\s+");
            counter = counter + pointsVictory.get(split[1]) + secondPlayerChoice.get(combination);
        }
        System.out.println("Total result is "+ counter);
    }

}
