package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_export", schema = "dtdd")
public class OrderExport {
    private int id;
    private Integer idOrder;
    private String nameEmployee;
    private String nameCustomer;
    private Timestamp time;
    private String flagDelete;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_order")
    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
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
    @Column(name = "name_customer", length = 100)
    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "flag_delete", length = 10)
    public String getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(String flagDelete) {
        this.flagDelete = flagDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderExport that = (OrderExport) o;
        return id == that.id &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(nameEmployee, that.nameEmployee) &&
                Objects.equals(nameCustomer, that.nameCustomer) &&
                Objects.equals(time, that.time) &&
                Objects.equals(flagDelete, that.flagDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOrder, nameEmployee, nameCustomer, time, flagDelete);
    }
}
