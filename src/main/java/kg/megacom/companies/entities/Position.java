package kg.megacom.companies.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_id")
    private Long id;
    private String name;
    private boolean active;

}
