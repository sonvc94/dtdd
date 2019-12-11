package hp.dtdd.hoaphuong.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Item {
    private int id;
    private Integer orderDetailId;
    private String imei;
    private String code;
    private String describes;
    private Integer shippingZoneMethodsId;
    private String itemStatus;
    private Integer productId;
    private String price;
    private String name;
    private String color;
    private String storage;
    private Timestamp createTime;
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
    @Column(name = "order_detail_id")
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
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
    @Column(name = "code", length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "describes")
    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    @Basic
    @Column(name = "shipping_zone_methods_id")
    public Integer getShippingZoneMethodsId() {
        return shippingZoneMethodsId;
    }

    public void setShippingZoneMethodsId(Integer shippingZoneMethodsId) {
        this.shippingZoneMethodsId = shippingZoneMethodsId;
    }

    @Basic
    @Column(name = "item_status", length = 255)
    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
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
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
    @Column(name = "color", length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "storage", length = 255)
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
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
    @Column(name = "flag_delete", length = 255)
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
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(orderDetailId, item.orderDetailId) &&
                Objects.equals(imei, item.imei) &&
                Objects.equals(code, item.code) &&
                Objects.equals(describes, item.describes) &&
                Objects.equals(shippingZoneMethodsId, item.shippingZoneMethodsId) &&
                Objects.equals(itemStatus, item.itemStatus) &&
                Objects.equals(productId, item.productId) &&
                Objects.equals(price, item.price) &&
                Objects.equals(name, item.name) &&
                Objects.equals(color, item.color) &&
                Objects.equals(storage, item.storage) &&
                Objects.equals(createTime, item.createTime) &&
                Objects.equals(flagDelete, item.flagDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDetailId, imei, code, describes, shippingZoneMethodsId, itemStatus, productId, price, name, color, storage, createTime, flagDelete);
    }
}
