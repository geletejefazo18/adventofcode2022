package challenge;

import java.util.List;

public class Day3 {

    public void printResult(List<String> lines) {
        int priorityCount = 0;
        for(String line :lines) {
            char[] firstBag = line.substring(0,line.length()/2).toCharArray();
            char[] secondBag = line.substring(line.length()/2).toCharArray();
            char repeatedVal = 0;
            for(char charFirstBag:firstBag) {
                for(char charSecondBag:secondBag){
                    if(charFirstBag == charSecondBag) {
                        repeatedVal = charFirstBag;
                        break;
                    }
                }
                if (repeatedVal != 0) {
                    break;
                }
            }
            if(Character.isUpperCase(repeatedVal)){
                priorityCount = priorityCount + repeatedVal - 38;
            } else {
                priorityCount = priorityCount + repeatedVal - 96;
            }
        }
        System.out.println("Sum of Priority " + priorityCount);
    }

    public void printResult2(List<String> lines) {
        int priorityCount = 0;
        for(int i=0; i<lines.size(); i=i+3) {
            char[] firstElf = lines.get(i).toCharArray();
            String secondElf = lines.get(i+1);
            String thirdElf = lines.get(i+2);
            char itemGroup = 0;
            for(char charFirstElf:firstElf) {
                if(secondElf.indexOf(charFirstElf)>=0 && thirdElf.indexOf(charFirstElf)>=0) {
                    itemGroup = charFirstElf;
                    break;
                }
            }
            if(Character.isUpperCase(itemGroup)){
                priorityCount = priorityCount + itemGroup - 38;
            } else {
                priorityCount = priorityCount + itemGroup - 96;
            }
        }
        System.out.println("Sum of Priority " + priorityCount);
    }
}
