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


        //Part 2: Wrapper Object Creation (valueOf)
        Double day1TempWrapper = Double.valueOf(day1TempPrimitive);
        Double day2TempWrapper = Double.valueOf(day2TempPrimitive);
        Double day3TempWrapper = Double.valueOf(day3TempPrimitive);


        //Part 3: Comparison (compareTo)
        int day1VsDay2 = day1TempWrapper.compareTo(day2TempWrapper);

        if (day1VsDay2 == -1){
            System.out.println("Day 1 " + day1TempPrimitive + "°C was cooler than Day 2" + day2TempPrimitive + "°C");
        }
        else if (day1VsDay2 == 0){
            System.out.println("Day 1 " + day1TempPrimitive + "°C was the same as Day 2" + day2TempPrimitive + "°C");
        }
        else if (day1VsDay2 == 1) {
            System.out.println("Day 1 (" + day1TempPrimitive + "°C) was warmer than Day 2(" + day2TempPrimitive + "°C)");
        }

        //Part 4: Primitive Extraction (xxxValue)
        float day1TempFloat = day1TempWrapper.floatValue();
        int day2TempInt = day2TempWrapper.intValue();

        System.out.println("Extracted Day 1 Temp (primitive float from Double wrapper): " + day1TempFloat);
        System.out.println("Extracted Day 2 Temp (primitive int from Double wrapper, truncated): " + day2TempInt);
    }
}
