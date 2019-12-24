package kg.megacom.companies.services;

import kg.megacom.companies.entities.Salary;

import java.util.List;

public interface SalaryService {

    Salary saveSalary(Salary salary);
    List<Salary> getAllSalaries();
}
