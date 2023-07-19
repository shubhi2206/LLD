package org.example.DesignPatterns.ProxyDP;

public interface EmployeeDao {
    public void create(String client, Employee employee) throws Exception;
    public void delete(String client, int id) throws Exception;
    public Employee get(String client, int id) throws Exception;
}
