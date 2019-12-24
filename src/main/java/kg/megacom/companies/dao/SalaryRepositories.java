package kg.megacom.companies.dao;

import kg.megacom.companies.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepositories extends JpaRepository<Salary, Long> {
}
