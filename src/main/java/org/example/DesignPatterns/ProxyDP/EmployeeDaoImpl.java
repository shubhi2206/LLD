package org.example.DesignPatterns.ProxyDP;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("Employee object created");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        System.out.println("Employee deleted with Employee ID: "+id);
    }

    @Override
    public Employee get(String client, int id) throws Exception {
        System.out.println("Fetching Employee from DB");
        return new Employee();
    }
}
