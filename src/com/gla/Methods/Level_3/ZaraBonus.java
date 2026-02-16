package com.gla.Methods.Level_3;

public class ZaraBonus {
    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateSalaryAndService(employees);
        double[][] updatedData = calculateBonus(employeeData);

        displayReport(employeeData, updatedData);
    }

    // (b) Generate Salary and Years of Service
    public static double[][] generateSalaryAndService(int size) {

        double[][] data = new double[size][2];
        // column 0 → salary
        // column 1 → years of service

        for (int i = 0; i < size; i++) {

            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int years = 1 + (int)(Math.random() * 10); // 1–10 years

            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // (c) Calculate Bonus and New Salary
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][2];
        // column 0 → bonus
        // column 1 → new salary

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    // (d) Display Report
    public static void displayReport(double[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");

        for (int i = 0; i < oldData.length; i++) {

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n",
                    i + 1,
                    oldData[i][0],
                    oldData[i][1],
                    newData[i][0],
                    newData[i][1]);

            totalOld += oldData[i][0];
            totalBonus += newData[i][0];
            totalNew += newData[i][1];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
