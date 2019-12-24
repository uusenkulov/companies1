package kg.megacom.companies.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  double salary;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
