package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tbl_phone", schema = "dtdd")
public class TblPhone {
    private long id;
    private String brandName;
    private String color;
    private String imei;
    private String name;
    private BigDecimal price;
    private String storage;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "brand_name", length = 255)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "color", length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "imei", length = 255)
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @Column(name = "name", length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "storage", length = 255)
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblPhone tblPhone = (TblPhone) o;
        return id == tblPhone.id &&
                Objects.equals(brandName, tblPhone.brandName) &&
                Objects.equals(color, tblPhone.color) &&
                Objects.equals(imei, tblPhone.imei) &&
                Objects.equals(name, tblPhone.name) &&
                Objects.equals(price, tblPhone.price) &&
                Objects.equals(storage, tblPhone.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandName, color, imei, name, price, storage);
    }
}
