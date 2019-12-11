package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shipping_zone_location", schema = "dtdd")
public class ShippingZoneLocation {
    private int id;
    private String name;
    private String namePersonCharge;
    private String address;
    private Timestamp createTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "name_person_charge", length = 100)
    public String getNamePersonCharge() {
        return namePersonCharge;
    }

    public void setNamePersonCharge(String namePersonCharge) {
        this.namePersonCharge = namePersonCharge;
    }

    @Basic
    @Column(name = "address", length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingZoneLocation that = (ShippingZoneLocation) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(namePersonCharge, that.namePersonCharge) &&
                Objects.equals(address, that.address) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, namePersonCharge, address, createTime);
    }
}
