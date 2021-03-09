package com.learningJavaLanguage.numbers;

public class Numbers {

    public static void main(String[] args) {
        String intBase5 = "230";
        Integer intbase1 = Integer.parseInt("230", 5);
        System.out.println(intbase1);

        //integers
        byte largestByte = Byte.MIN_VALUE;
        short largestShort = Short.MIN_VALUE;
        int largestInteger = Integer.MIN_VALUE;
        long largestLong = Long.MIN_VALUE;

        //real numbers
        float largestFloat = Float.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;

        //Display them all.
        System.out.println("The largest byte value is "
                + largestByte + ".");
        System.out.println("The largest short value is "
                + largestShort + ".");
        System.out.println("The largest integer value is "
                + largestInteger + ".");
        System.out.println("The largest long value is "
                + largestLong + ".");
        System.out.println("The largest float value is "
                + largestFloat + ".");
        System.out.println("The largest double value is "
                + largestDouble + ".");

        Integer sum = 0;
        if (args.length < 2) {
            System.out.println("Error");
        } else {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
        }
        System.out.println(sum);
    }
}
