package com.tdd.kata;

public class StringCalculator {
    /**
     * returns addition of numbers passed in a string separated by delimiter
     * @param numbers
     * @return sum
     */
    public int add(String numbers){
        if(numbers==null || numbers.isEmpty() || numbers.isBlank()){
            return 0;
        }
        String[] split = numbers.split(",");
        if(split.length==1){
            return Integer.parseInt(split[0]);
        }
        return 0;
    }

}
