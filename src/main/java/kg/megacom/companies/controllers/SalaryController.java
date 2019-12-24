package kg.megacom.companies.controllers;
import kg.megacom.companies.entities.Salary;
import kg.megacom.companies.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/salary")
public class SalaryController {


    @Autowired
    private SalaryService salaryService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Salary salary){
     return new ResponseEntity<>(salaryService.saveSalary(salary), HttpStatus.OK);
    }

}
