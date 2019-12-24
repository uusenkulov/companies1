package kg.megacom.companies.services.impl;

import kg.megacom.companies.dao.SalaryRepositories;
import kg.megacom.companies.entities.Salary;
import kg.megacom.companies.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepositories salaryRepositories;

    @Override
    public Salary saveSalary(Salary salary) {
        return salaryRepositories.save(salary);
    }

    @Override
    public List<Salary> getAllSalaries() {
        return null;
    }
}
