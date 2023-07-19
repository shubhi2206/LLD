package org.example.DesignPatterns.ProxyDP;

public class Demo {
    public static void main(String[] args){
        try {
            EmployeeDao e = new EmployeeDaoProxy();
            e.create("ADMIN", new Employee());
            System.out.println("Operation Successful");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
