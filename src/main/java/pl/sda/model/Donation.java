package pl.sda.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal value;
    private String donor;
    @ManyToOne
    @JoinColumn(name = "whipround_id")
    private Whipround whipround;


}
