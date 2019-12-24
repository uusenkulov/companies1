package kg.megacom.companies.dao;

import kg.megacom.companies.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepositories extends JpaRepository<Company,Long> {


}
