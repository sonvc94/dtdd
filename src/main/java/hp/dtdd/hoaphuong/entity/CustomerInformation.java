package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer_information", schema = "dtdd")
public class CustomerInformation {
    private int id;
    private Integer custormerId;
    private String name;
    private String address;
    private String telephone;
    private String mail;
    private String sex;
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
    @Column(name = "custormer_id")
    public Integer getCustormerId() {
        return custormerId;
    }

    public void setCustormerId(Integer custormerId) {
        this.custormerId = custormerId;
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
    @Column(name = "address", length = 120)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "telephone", length = 10)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "mail", length = 50)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "sex", length = 8)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
        CustomerInformation that = (CustomerInformation) o;
        return id == that.id &&
                Objects.equals(custormerId, that.custormerId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(timeCreate, that.timeCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, custormerId, name, address, telephone, mail, sex, timeCreate);
    }
}
