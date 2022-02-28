package pl.sda.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Whipround {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal limit ;
    @OneToMany ( mappedBy = "whipround",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Donation> donationList ;


}
