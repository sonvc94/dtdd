package hp.dtdd.hoaphuong.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Campain {
    private int id;
    private String describes;
    private String campainName;
    private String campainType;
    private String discount;
    private Timestamp timeCreate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "describes", length = 255)
    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    @Basic
    @Column(name = "campain_name", length = 255)
    public String getCampainName() {
        return campainName;
    }

    public void setCampainName(String campainName) {
        this.campainName = campainName;
    }

    @Basic
    @Column(name = "campain_type", length = 255)
    public String getCampainType() {
        return campainType;
    }

    public void setCampainType(String campainType) {
        this.campainType = campainType;
    }

    @Basic
    @Column(name = "discount", length = 255)
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "time_create")
    public Timestamp getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Timestamp timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campain campain = (Campain) o;
        return id == campain.id &&
                Objects.equals(describes, campain.describes) &&
                Objects.equals(campainName, campain.campainName) &&
                Objects.equals(campainType, campain.campainType) &&
                Objects.equals(discount, campain.discount) &&
                Objects.equals(timeCreate, campain.timeCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, describes, campainName, campainType, discount, timeCreate);
    }
}
