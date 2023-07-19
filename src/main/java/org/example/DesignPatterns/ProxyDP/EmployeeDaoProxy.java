package org.example.DesignPatterns.ProxyDP;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    EmployeeDaoProxy(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client,employee);
            return;
        }
         throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.delete(client,id);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int id) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDao.get(client,id);
        }
        throw new Exception("Access Denied");
    }
}
