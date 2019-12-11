package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shipping_zone_methods_history", schema = "dtdd")
public class ShippingZoneMethodsHistory {
    private int id;
    private Integer shippingZoneLocationId;
    private Integer orderExportId;
    private Integer shippingZonesId;
    private Integer productId;
    private String price;
    private String note;
    private Timestamp createTime;
    private Integer itemId;
    private String status;
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
    @Column(name = "shipping_zone_location_id")
    public Integer getShippingZoneLocationId() {
        return shippingZoneLocationId;
    }

    public void setShippingZoneLocationId(Integer shippingZoneLocationId) {
        this.shippingZoneLocationId = shippingZoneLocationId;
    }

    @Basic
    @Column(name = "order_export_id")
    public Integer getOrderExportId() {
        return orderExportId;
    }

    public void setOrderExportId(Integer orderExportId) {
        this.orderExportId = orderExportId;
    }

    @Basic
    @Column(name = "shipping_zones_id")
    public Integer getShippingZonesId() {
        return shippingZonesId;
    }

    public void setShippingZonesId(Integer shippingZonesId) {
        this.shippingZonesId = shippingZonesId;
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
    @Column(name = "note", length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "item_id")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "status", length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        ShippingZoneMethodsHistory that = (ShippingZoneMethodsHistory) o;
        return id == that.id &&
                Objects.equals(shippingZoneLocationId, that.shippingZoneLocationId) &&
                Objects.equals(orderExportId, that.orderExportId) &&
                Objects.equals(shippingZonesId, that.shippingZonesId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(price, that.price) &&
                Objects.equals(note, that.note) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(flagDelete, that.flagDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shippingZoneLocationId, orderExportId, shippingZonesId, productId, price, note, createTime, itemId, status, flagDelete);
    }
}
