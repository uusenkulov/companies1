package kg.megacom.companies.controllers;
import kg.megacom.companies.entities.Employee;
import kg.megacom.companies.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> save (@RequestBody Employee employee){
        employee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @RequestMapping(value = "/getempl", method = RequestMethod.GET)
    public ResponseEntity<?> getEmployee() {
        return  new ResponseEntity<>(employeeService.getEmployeeList(), HttpStatus.OK);
    }
}
