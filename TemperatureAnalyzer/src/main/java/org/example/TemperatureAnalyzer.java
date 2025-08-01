package org.example;

import java.util.*;

public class TemperatureAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day 1 High Temperature (e.g., 28.5): ");
        String day1TempStr = scanner.nextLine();

        System.out.print("Enter Day 2 High Temperature (e.g., 28.5): ");
        String day2TempStr = scanner.nextLine();

        System.out.print("Enter Day 3 High Temperature (e.g., 28.5): ");
        String day3TempStr = scanner.nextLine();


        try{
            Double day1TempPrimitive = Double.parseDouble(day1TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 1 Temperature Format");
            return;
        }

        try{
            Double day2TempPrimitive = Double.parseDouble(day2TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 2 Temperature Format");
            return;
        }

        try{
            Double day3TempPrimitive = Double.parseDouble(day3TempStr);
        }catch(Exception e){
            System.out.println("Invalid Day 3 Temperature Format");
            return;
        }




    }
}
