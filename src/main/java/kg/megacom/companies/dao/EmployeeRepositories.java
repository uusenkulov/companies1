package kg.megacom.companies.dao;

import kg.megacom.companies.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositories extends JpaRepository<Employee,Long> {
}
