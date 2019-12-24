package kg.megacom.companies.services.impl;

import kg.megacom.companies.dao.CompanyRepositories;
import kg.megacom.companies.entities.Company;
import kg.megacom.companies.enums.CompanyType;
import kg.megacom.companies.services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServicesImpl implements CompanyServices {

    @Autowired
    private CompanyRepositories companyRepositories;


    public Company getCompany(){
       return  new Company(
                "megacom",
               "Bishkek",
               LocalDate.of(2010,10,01),
               true,
               CompanyType.big
       );
   }

    @Override
    public Company getCompanyId(long id) {
         Company company = companyRepositories.findById(id)
        .orElse(null);
         return  company;
    }
    @Override
    public Company delete() {
        return null;
    }

    @Override
    public Company deleteAll() {
        return null ;
    }


    @Override
    public Company saveCompany(Company company) {
        return companyRepositories.save(company);
    }

    @Override
    public List<Company> getCompanyList() {
        return companyRepositories.findAll();
    }

}
