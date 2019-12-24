package kg.megacom.companies.controllers;


import kg.megacom.companies.entities.Company;
import kg.megacom.companies.services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyServices companyServices;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<?> getCompany() {
        return  new ResponseEntity<>(companyServices.getCompany(), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveCompany(@RequestBody Company company) {
        return  new ResponseEntity<>(companyServices.saveCompany(company), HttpStatus.OK);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<?> getCompanies() {
        return  new ResponseEntity<>(companyServices.getCompanyList(), HttpStatus.OK);
    }

    @RequestMapping(value = "/get{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCompaniesId(@PathVariable Long id) {
        return  new ResponseEntity<>(companyServices.getCompanyId(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
        public ResponseEntity<?> deleteCompanies(@RequestBody Company company) {
        return  new ResponseEntity<>(companyServices.delete(), HttpStatus.OK);
    }






}
