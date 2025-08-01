package org.example;

import java.util.*;

public class TemperatureAnalyzer {
    public static void main(String[] args) {

        //Part 1: Input and String Parsing
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day 1 High Temperature (e.g., 28.5): ");
        String day1TempStr = scanner.nextLine();

        System.out.print("Enter Day 2 High Temperature (e.g., 28.5): ");
        String day2TempStr = scanner.nextLine();

        System.out.print("Enter Day 3 High Temperature (e.g., 28.5): ");
        String day3TempStr = scanner.nextLine();


        Double day1TempPrimitive;
        Double day2TempPrimitive;
        Double day3TempPrimitive;

        try{
            day1TempPrimitive = Double.parseDouble(day1TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 1 Temperature Format");
            return;
        }

        try{
            day2TempPrimitive = Double.parseDouble(day2TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 2 Temperature Format");
            return;
        }

        try{
            day3TempPrimitive = Double.parseDouble(day3TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 3 Temperature Format");
            return;
        }

        System.out.println("\n--- Temperature Analysis ---\n");
        System.out.println("Parsed Day 1 Temp (primitive double): " + day1TempPrimitive);
        System.out.println("Parsed Day 2 Temp (primitive double): " + day2TempPrimitive + "\n");

        //Part 2: Wrapper Object Creation (valueOf)
        Double day1TempWrapper = Double.valueOf(day1TempPrimitive);
        Double day2TempWrapper = Double.valueOf(day2TempPrimitive);
        Double day3TempWrapper = Double.valueOf(day3TempPrimitive);

        //Part 3: Comparison (compareTo)
        int day1VsDay2 = day1TempWrapper.compareTo(day2TempWrapper);

        if (day1VsDay2 == -1){
            System.out.println("Day 1 (" + day1TempPrimitive + "°C) was cooler than Day 2 (" + day2TempPrimitive + "°C)\n");
        }
        else if (day1VsDay2 == 0){
            System.out.println("Day 1 (" + day1TempPrimitive + "°C) was the same as Day 2 (" + day2TempPrimitive + "°C)\n");
        }
        else if (day1VsDay2 == 1) {
            System.out.println("Day 1 (" + day1TempPrimitive + "°C) was warmer than Day 2 (" + day2TempPrimitive + "°C)\n");
        }

        //Part 4: Primitive Extraction (xxxValue)
        float day1TempFloat = day1TempWrapper.floatValue();
        int day2TempInt = day2TempWrapper.intValue();

        System.out.println("Extracted Day 1 Temp (primitive float from Double wrapper): " + day1TempFloat);
        System.out.println("Extracted Day 2 Temp (primitive int from Double wrapper, truncated): " + day2TempInt);

        //Part 5: Extension (For the Third Temperature & Finding Max)
        double day1Primitive = day1TempWrapper.doubleValue();
        double day2Primitive = day2TempWrapper.doubleValue();
        double day3Primitive = day3TempWrapper.doubleValue();
        double temporaryMaxTemp;

        temporaryMaxTemp = Math.max(day1Primitive, day2Primitive); //Compare 1 and 2
        temporaryMaxTemp = Math.max(temporaryMaxTemp, day2Primitive); //Temp Max and 3
        temporaryMaxTemp = Math.max(temporaryMaxTemp, day3Primitive); //Temp Max and 3

        System.out.println("\nThe highest temperature recorded was: " + temporaryMaxTemp +"°C");
    }
}
