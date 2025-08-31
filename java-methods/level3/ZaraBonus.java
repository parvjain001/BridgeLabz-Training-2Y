package level3;

import java.util.*;

public class ZaraBonus {
    public static void main(String[] args) {
        double[][] employees = generateSalaryAndService(10);
        double[][] newDetails = calculateBonus(employees);
        displaySummary(employees, newDetails);
    }

    public static double[][] generateSalaryAndService(int n) {
        double[][] arr = new double[n][2]; // [salary, yearsOfService]
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary
            arr[i][1] = rand.nextInt(20) + 1;        // 1 to 20 years of service
        }
        return arr;
    }

    public static double[][] calculateBonus(double[][] employees) {
        double[][] newArr = new double[employees.length][3]; // [oldSalary, bonus, newSalary]
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            newArr[i][0] = salary;
            newArr[i][1] = bonus;
            newArr[i][2] = newSalary;
        }
        return newArr;
    }

    public static void displaySummary(double[][] oldArr, double[][] newArr) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < oldArr.length; i++) {
            double oldSalary = oldArr[i][0];
            double years = oldArr[i][1];
            double bonus = newArr[i][1];
            double newSalary = newArr[i][2];
            System.out.printf("%d\t%.2f\t\t%.0f\t%.2f\t\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOld, totalBonus, totalNew);
    }
}

