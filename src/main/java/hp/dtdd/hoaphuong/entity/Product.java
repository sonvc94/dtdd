package hp.dtdd.hoaphuong.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Product {
    private int id;
    private String name;
    private String descShort;
    private Integer categoryId;
    private String width;
    private String height;
    private String apt;
    private String descLong;
    private Byte isPublic;
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
    @Column(name = "name", length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "desc_short")
    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }

    @Basic
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "width", length = 255)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", length = 255)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "apt", length = 255)
    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    @Basic
    @Column(name = "desc_long")
    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    @Basic
    @Column(name = "is_public")
    public Byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
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
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(descShort, product.descShort) &&
                Objects.equals(categoryId, product.categoryId) &&
                Objects.equals(width, product.width) &&
                Objects.equals(height, product.height) &&
                Objects.equals(apt, product.apt) &&
                Objects.equals(descLong, product.descLong) &&
                Objects.equals(isPublic, product.isPublic) &&
                Objects.equals(flagDelete, product.flagDelete) &&
                Objects.equals(createTime, product.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descShort, categoryId, width, height, apt, descLong, isPublic, flagDelete, createTime);
    }
}
