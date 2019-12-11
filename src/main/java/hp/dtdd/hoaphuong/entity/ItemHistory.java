package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "item_history", schema = "dtdd")
public class ItemHistory {
    private int id;
    private Integer idItem;
    private String nameCustomer;
    private String describes;
    private Timestamp changeTime;
    private String namePersonCharge;
    private String reason;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_item")
    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    @Basic
    @Column(name = "name_customer", length = 255)
    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
    @Column(name = "change_time")
    public Timestamp getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Timestamp changeTime) {
        this.changeTime = changeTime;
    }

    @Basic
    @Column(name = "name_person_charge", length = 255)
    public String getNamePersonCharge() {
        return namePersonCharge;
    }

    public void setNamePersonCharge(String namePersonCharge) {
        this.namePersonCharge = namePersonCharge;
    }

    @Basic
    @Column(name = "reason", length = 255)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemHistory that = (ItemHistory) o;
        return id == that.id &&
                Objects.equals(idItem, that.idItem) &&
                Objects.equals(nameCustomer, that.nameCustomer) &&
                Objects.equals(describes, that.describes) &&
                Objects.equals(changeTime, that.changeTime) &&
                Objects.equals(namePersonCharge, that.namePersonCharge) &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idItem, nameCustomer, describes, changeTime, namePersonCharge, reason);
    }
}
