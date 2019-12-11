package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_detail", schema = "dtdd")
public class OrderDetail {
    private int id;
    private Integer orderId;
    private Integer itemId;
    private String price;
    private String nameProduct;
    private String discount;
    private String typeDiscount;
    private String count;
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
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "name_product", length = 255)
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Basic
    @Column(name = "discount")
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "type_discount", length = 50)
    public String getTypeDiscount() {
        return typeDiscount;
    }

    public void setTypeDiscount(String typeDiscount) {
        this.typeDiscount = typeDiscount;
    }

    @Basic
    @Column(name = "count")
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
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
        OrderDetail that = (OrderDetail) o;
        return id == that.id &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(price, that.price) &&
                Objects.equals(nameProduct, that.nameProduct) &&
                Objects.equals(discount, that.discount) &&
                Objects.equals(typeDiscount, that.typeDiscount) &&
                Objects.equals(count, that.count) &&
                Objects.equals(flagDelete, that.flagDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, itemId, price, nameProduct, discount, typeDiscount, count, flagDelete);
    }
}
