package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("   Welcome to Employee Wage Computation  ");

        Random ran = new Random();
        int empCheck = ran.nextInt(3);
        int WagePerHrs = 20;
        int FullDayHrs = 8;
        int PartTimeHrs =4;

        int dailyWage=0;

        switch (empCheck){
            case 0:
                System.out.println(" Employee is Absent");
                break;
            case 1:
                System.out.println("Employee is Present");
                dailyWage = WagePerHrs*FullDayHrs;
                System.out.println("Employee Daily Wage is :"+dailyWage);
                 break;
            case 2:
                System.out.println("Employee is Present but part time");
                dailyWage = WagePerHrs*PartTimeHrs;
                System.out.println("Employee Daily Wage is :"+dailyWage);
                break;
        }

    }

}
