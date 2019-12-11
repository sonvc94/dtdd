package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shipping_zone", schema = "dtdd")
public class ShippingZone {
    private int id;
    private String timeImport;
    private String total;
    private String name;
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
    @Column(name = "time_import", length = 255)
    public String getTimeImport() {
        return timeImport;
    }

    public void setTimeImport(String timeImport) {
        this.timeImport = timeImport;
    }

    @Basic
    @Column(name = "total")
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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
        ShippingZone that = (ShippingZone) o;
        return id == that.id &&
                Objects.equals(timeImport, that.timeImport) &&
                Objects.equals(total, that.total) &&
                Objects.equals(name, that.name) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeImport, total, name, createTime);
    }
}
