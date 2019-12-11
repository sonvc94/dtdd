package hp.dtdd.hoaphuong.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "phone")
//@Table(name = "tbl_phone")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable {

    private static final long serialVersionUID = 4256976042257402906L;
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String brandName;
    private BigDecimal price;
    private String color;
    private String imei;
    private String storage;
}
