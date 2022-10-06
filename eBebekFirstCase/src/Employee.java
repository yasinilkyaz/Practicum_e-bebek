public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        double taxRatio = 0.03;
        if (salary < 1000) {
            return 0;
        } else {
            return salary * taxRatio;
        }

    }

    public double bonus(int workHours) {
        int overtimeWageForHour = 30;
        int overtime = workHours - 40;
        if (overtime > 0) {
            return overtime * overtimeWageForHour;
        }
        return 0;
    }

    public double raiseSalary(int hireYear, double salary) {

        double salaryWithTax = salary - tax(salary);

        int thisYear = 2021;
        int employeeWorkYear = thisYear - hireYear;
        double underTenYears = 0.05;
        double underTwentyYears = 0.1;
        double overTwentyYears = 0.15;

        if (employeeWorkYear < 10) {
            return salaryWithTax * underTenYears + bonus(workHours);
        } else if (employeeWorkYear > 9 && employeeWorkYear < 20) {
            return salaryWithTax * underTwentyYears + bonus(workHours);
        } else {
            return salaryWithTax * overTwentyYears + bonus(workHours);
        }

    }

    public double totalSalary() {
        return raiseSalary(hireYear, salary) + salary;
    }

    public void toString(Employee employee) {
        System.out.println("------------------------------------------------");
        System.out.println("Çalışan Adı Soyadı :" + employee.name);
        System.out.println("Çalışan Maaşı :" + employee.salary);
        System.out.println("Çalışma Saati :" + employee.workHours);
        System.out.println("Başlangıç Yılı :" + employee.hireYear);
        System.out.println("Vergi :" + tax(employee.salary));
        System.out.println("Bonus :" + bonus(employee.workHours));
        System.out.println("Maaş Artışı :" + raiseSalary(employee.hireYear, employee.salary));
        //Vergi ve bonuslarla birlikte maaş zaten toplam maaş yapar
        System.out.println("Toplam Maaş :" + totalSalary());


    }

}
