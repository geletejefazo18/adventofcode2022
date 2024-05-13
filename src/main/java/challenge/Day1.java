package challenge;

import java.util.List;

public class Day1 {

    public void printResult(List<String> lines) {
        int elfNumber = 0;
        int calories = 0;
        Elf elfWithMaxCalories = new Elf();

        for(String line: lines){
            if (line.isEmpty()) {
                elfNumber++;
                if(calories > elfWithMaxCalories.getCalories()) {
                    elfWithMaxCalories.setCalories(calories);
                    elfWithMaxCalories.setOrderNumber(elfNumber);
                }
                calories = 0;
            } else {
                calories = calories + Integer.parseInt(line);
            }
        }
        System.out.println("Elf with Max Calories " + elfWithMaxCalories.getCalories());

    }

    public void printResult2(List<String> lines) {
        int elfNumber = 0;
        int calories = 0;
        Elf[] threeElfs = new Elf[]{new Elf(), new Elf(), new Elf()};

        for(String line: lines){
            if (line.isEmpty()) {
                elfNumber++;
                for(int i = 0; i< threeElfs.length; i++) {
                    if(calories > threeElfs[i].getCalories()) {
                        int oldCalories = threeElfs[i].getCalories();
                        threeElfs[i].setCalories(calories);
                        threeElfs[i].setOrderNumber(elfNumber);
                        calories = oldCalories;
                    }
                }
                calories = 0;
            } else {
                calories = calories + Integer.parseInt(line);
            }
        }
        int sum = 0;
        for(int i = 0; i< threeElfs.length; i++) {
            sum = sum + threeElfs[i].getCalories();
        }
        System.out.println("Three Elfs with Max Calories " + sum);

    }

    private static class Elf {
        int orderNumber = 0;
        int calories = 0;

        public int getOrderNumber() {
            return this.orderNumber;
        }

        public int getCalories() {
            return calories;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }
    }
}
