# MetricToEnglish
This program prompts the user for a measurement in meters and then converts to miles, feet, and inches, and prints these to the user in an organized, easy to read fashion.

import java.util.Scanner;
public class KFS_MetricToEnglish_Main
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        final double conversion_mile_meter = 0.000621371192;
        final double conversion_foot_meter = 3.2808399;
        final double conversion_inch_meter = 39.3700787;
        
        System.out.print("Please enter the measurement in meters: "); //user will plug in a number here
        double meters = in.nextDouble();
        
        double mile = meters * conversion_mile_meter; //user's number, which is in meters, will be converted to miles
        System.out.println(mile + " " + "miles");
        
        double foot = meters * conversion_foot_meter; //user's number, which is in meters, will be converted to feet
        System.out.println(foot + " " + "feet");
        
        double inch = meters * conversion_inch_meter;  //user's number, which is in meters, will be converted to inches
        System.out.println(inch + " " + "inches");
    }
}
