package pl.sda.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Whipround {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal goal ;
    @OneToMany ( mappedBy = "whipround",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Donation> donationList ;


}
