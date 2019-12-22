package hp.dtdd.hoaphuong.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Item {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Integer id;

    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    @Column(name = "imei", length = 255)
    private String imei;

    @Column(name = "code", length = 255)
    private String code;

    @Column(name = "describes")
    private String describes;

    @Column(name = "shipping_zone_methods_id")
    private Integer shippingZoneMethodsId;

    @Column(name = "item_status", length = 255)
    private String itemStatus;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "price")
    private String price;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "color", length = 255)

    private String color;
    @Column(name = "storage", length = 255)

    private String storage;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "flag_delete", length = 255)
    private String flagDelete;

}
