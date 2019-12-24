package kg.megacom.companies.services;

import kg.megacom.companies.entities.Company;

import java.util.List;

public interface CompanyServices {

    Company saveCompany(Company company);

    List<Company> getCompanyList();

    Company getCompany();

    Company getCompanyId(long id);

    Company delete();

    Company deleteAll();




}

