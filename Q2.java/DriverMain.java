import java.util.Scanner;

interface Taxable {
    double SALES_TAX = 0.07;      
    double INCOME_TAX = 0.105;    

    double calcTax();
}

class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public double calcTax() {
        double yearlySalary = salary * 12;
        return yearlySalary * INCOME_TAX;
    }
}

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        return price * SALES_TAX;
    }
}
public class DriverMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee Name: ");

        String name = scan.nextLine();
        System.out.println("Enter Monthly Salary: ");
        double sal = scan.nextDouble();

        Employee emp = new Employee(id, name, sal);
        System.out.println("Enter Product ID: ");
        int pid = scan.nextInt();

        System.out.println("Enter Product Price: ");
        double price = scan.nextDouble();

        System.out.println("Enter Product Quantity: ");
        int qty = scan.nextInt();

        Product prod = new Product(pid, price, qty);
    

        System.out.println("\n----- TAX DETAILS -----");
        System.out.printf("Income Tax for Employee: ₹%.2f\n" , emp.calcTax());
        System.out.printf("Sales Tax on Product Unit Price: ₹%.2f\n", prod.calcTax());

        scan.close();
    }
}




