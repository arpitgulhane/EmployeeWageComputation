package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("   Welcome to Employee Wage Computation  ");
//        int WagePerHrs,numberofWorkingDays,FullDayHrs(workingHourPer month)

        Employee emp=new Employee("HCL",10,30,25);
        emp.calculate();

    }
}

class Employee{
    int WagePerHrs = 20;
    private int FullDayHrs = 8;
    int PartTimeHrs =4;

    int dailyWage=0;
    int month = 20;
    int monthWage = 20;

    int workingHoursPerMonth=100;

    public Employee(String comName ,int WagePerHrs,int FullDayHrs,int month){
        this.WagePerHrs=    WagePerHrs;
        this.FullDayHrs=    FullDayHrs;
        this.workingHoursPerMonth     =    workingHoursPerMonth;

    }
    public void calculate(){

        int totalWorkingHour=1 , day=1;


        while (day<=20 || totalWorkingHour<=workingHoursPerMonth){
            Random ran = new Random();
            int empCheck = ran.nextInt(3);
            switch (empCheck){
                case 0:
//                System.out.println(" Employee is Absent");
                    day=day+1;
                    break;
                case 1:
//                System.out.println("Employee is Present");
                    dailyWage = WagePerHrs*FullDayHrs+dailyWage;
                    monthWage = (dailyWage * month)+monthWage;
                    totalWorkingHour=totalWorkingHour+FullDayHrs;
                    day=day+1;
//                System.out.println("Employee Daily Wage is :"+dailyWage);
//                System.out.println("Employee Month Wage is :"+monthWage);
                    break;
                case 2:
//                System.out.println("Employee is Present but part time");
                    dailyWage = WagePerHrs*PartTimeHrs+dailyWage;
                    monthWage = dailyWage * month+monthWage;
                    totalWorkingHour=totalWorkingHour+PartTimeHrs;
                    day=day+1;
//                System.out.println("Employee Daily Wage is :"+dailyWage);
//                System.out.println("Employee Month Wage is :"+monthWage);
                    break;

            }}
        System.out.println("                Day ,  :"+day+" "+totalWorkingHour);
        System.out.println("Employee Daily Wage is :"+dailyWage);
        System.out.println("Employee Month Wage is :"+monthWage);
    }

}
