package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("   Welcome to Employee Wage Computation  ");

        Random ran = new Random();
        int empCheck = ran.nextInt(2);
        int WagePerHrs = 20;
        int FullDayHrs = 8;

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
        }

    }

}
