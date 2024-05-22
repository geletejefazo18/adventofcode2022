package challenge;

import java.util.List;

public class Day4 {

    public void printResult(List<String> lines) {
        int count = 0;
        PairSection firstPair = new PairSection();
        PairSection secondPair = new PairSection();
        for(String line: lines) {
            String [] pairs = line.split(",");
            String [] valuesFirst = pairs[0].split("-");
            firstPair.setMinorVal(Integer.parseInt(valuesFirst[0]));
            firstPair.setMajorVal(Integer.parseInt(valuesFirst[1]));
            String [] valuesSecond= pairs[1].split("-");
            secondPair.setMinorVal(Integer.parseInt(valuesSecond[0]));
            secondPair.setMajorVal(Integer.parseInt(valuesSecond[1]));
            if((firstPair.getMinorVal() >= secondPair.getMinorVal() && firstPair.getMajorVal() <= secondPair.getMajorVal()) ||
               (secondPair.getMinorVal() >= firstPair.getMinorVal() && secondPair.getMajorVal() <= firstPair.getMajorVal())) {
                count++;
            }
        }
        System.out.println("Pairs fully contained " + count);

    }

    public void printResult2(List<String> lines) {
        int count = 0;
        PairSection firstPair = new PairSection();
        PairSection secondPair = new PairSection();
        for(String line: lines) {
            String [] pairs = line.split(",");
            String [] valuesFirst = pairs[0].split("-");
            firstPair.setMinorVal(Integer.parseInt(valuesFirst[0]));
            firstPair.setMajorVal(Integer.parseInt(valuesFirst[1]));
            String [] valuesSecond= pairs[1].split("-");
            secondPair.setMinorVal(Integer.parseInt(valuesSecond[0]));
            secondPair.setMajorVal(Integer.parseInt(valuesSecond[1]));
            if((secondPair.getMinorVal() <= firstPair.getMajorVal() && secondPair.getMinorVal() >= firstPair.getMinorVal()) ||
                    (firstPair.getMinorVal() <= secondPair.getMajorVal() && firstPair.getMinorVal() >= secondPair.getMinorVal())) {
                count++;
            }
        }
        System.out.println("Pairs something contained " + count);

    }

    public static class PairSection {

        private int minorVal;
        private int majorVal;


        public int getMinorVal() {
            return minorVal;
        }

        public int getMajorVal() {
            return majorVal;
        }

        public void setMinorVal(int minorVal) {
            this.minorVal = minorVal;
        }

        public void setMajorVal(int majorVal) {
            this.majorVal = majorVal;
        }
    }
}
