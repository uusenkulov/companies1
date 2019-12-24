package kg.megacom.companies.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long id;
    private String name;
    private String address;
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
