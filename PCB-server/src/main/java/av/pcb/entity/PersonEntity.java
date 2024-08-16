package av.pcb.entity;

import av.pcb.constant.Company;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "person")
@Getter
@Setter
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column(nullable = false)
    private Long internalNumber;

    @Column(nullable = false)
    private Float workingTime;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private String bank;

    @Column
    private String vs;

    @Column
    private String ss;

    @Column
    private String ks;

    @Column
    @Enumerated(EnumType.STRING)
    private Company company;

    private boolean hidden = false;


}

