package hp.dtdd.hoaphuong.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Guarantee {
    private int id;
    private Integer itemId;
    private String nameCustomer;
    private String status;
    private String dest;
    private String nameEmployee;
    private String flagDelete;
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
    @Column(name = "item_id")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "name_customer", length = 100)
    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    @Basic
    @Column(name = "status", length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "dest")
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Basic
    @Column(name = "name_employee", length = 100)
    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    @Basic
    @Column(name = "flag_delete", length = 10)
    public String getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(String flagDelete) {
        this.flagDelete = flagDelete;
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
        Guarantee guarantee = (Guarantee) o;
        return id == guarantee.id &&
                Objects.equals(itemId, guarantee.itemId) &&
                Objects.equals(nameCustomer, guarantee.nameCustomer) &&
                Objects.equals(status, guarantee.status) &&
                Objects.equals(dest, guarantee.dest) &&
                Objects.equals(nameEmployee, guarantee.nameEmployee) &&
                Objects.equals(flagDelete, guarantee.flagDelete) &&
                Objects.equals(createTime, guarantee.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemId, nameCustomer, status, dest, nameEmployee, flagDelete, createTime);
    }
}
