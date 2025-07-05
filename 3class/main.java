import java.util.Scanner;

class scannerExample {
    private String name;
    private String gender;
    private int age;
    private long mobileNumber;
    private int income;
    private double tax;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public long getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(long mobileNumber) { this.mobileNumber = mobileNumber; }

    public int getIncome() { return income; }
    public void setIncome(int income) { this.income = income; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }
}

class taxCalc {
    public void calculateTax(scannerExample scEx) {
        double income = scEx.getIncome();
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }

        scEx.setTax(tax);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your gender: ");
        String gender = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your mobile number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        scannerExample scExample = new scannerExample();
        scExample.setName(name);
        scExample.setGender(gender);
        scExample.setAge(age);
        scExample.setMobileNumber(mobileNumber);
        scExample.setIncome(income);

        System.out.println("----- User Details -----");
        System.out.println("Name: " + scExample.getName());
        System.out.println("Age: " + scExample.getAge());
        System.out.println("Gender: " + scExample.getGender());
        System.out.println("Income: " + scExample.getIncome());

        taxCalc calc = new taxCalc();
        calc.calculateTax(scExample);

        System.out.println("After calculation, tax is: " + scExample.getTax());

        sc.close();
    }
}
