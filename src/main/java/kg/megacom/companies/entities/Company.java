package kg.megacom.companies.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.companies.enums.CompanyType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "companies")
public class Company {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "company_id")
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateCreate;
    @NonNull
    private boolean isActive;
    @NonNull
    private CompanyType companyType;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Employee> employeeList;


}
