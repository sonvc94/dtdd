package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rate_product", schema = "dtdd")
public class RateProduct {
    private int id;
    private String rate;
    private String rateComment;
    private Integer productId;
    private String product;
    private String userName;
    private String mail;
    private String status;
    private String telephone;
    private Timestamp createTime;
    private String updateTime;
    private String delFlag;
    private String delTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rate", length = 15)
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "rate_comment", length = 250)
    public String getRateComment() {
        return rateComment;
    }

    public void setRateComment(String rateComment) {
        this.rateComment = rateComment;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product", length = 255)
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "user_name", length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "status", length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", length = 255)
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "del_flag", length = 255)
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Basic
    @Column(name = "del_time", length = 255)
    public String getDelTime() {
        return delTime;
    }

    public void setDelTime(String delTime) {
        this.delTime = delTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateProduct that = (RateProduct) o;
        return id == that.id &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(rateComment, that.rateComment) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(product, that.product) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(status, that.status) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(delFlag, that.delFlag) &&
                Objects.equals(delTime, that.delTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rate, rateComment, productId, product, userName, mail, status, telephone, createTime, updateTime, delFlag, delTime);
    }
}
