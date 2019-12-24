package kg.megacom.companies.services;

import kg.megacom.companies.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getEmployeeList();
}
