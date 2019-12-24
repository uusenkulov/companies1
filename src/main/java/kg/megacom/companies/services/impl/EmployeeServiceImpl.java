package kg.megacom.companies.services.impl;

import kg.megacom.companies.dao.CompanyRepositories;
import kg.megacom.companies.dao.EmployeeRepositories;
import kg.megacom.companies.entities.Employee;
import kg.megacom.companies.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepositories employeeRepositories;
    @Autowired
    private CompanyRepositories companyRepositories;

    @Override
    public Employee saveEmployee(Employee employee) {
        employee = employeeRepositories.save(employee);
        employee.setCompany(companyRepositories.findById(employee.getCompany().getId()).get());
         return employee;

    }

    @Override
    public List<Employee> getEmployeeList() {
        return  employeeRepositories.findAll();
    }


}
