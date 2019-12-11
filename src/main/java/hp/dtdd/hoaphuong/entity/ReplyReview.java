package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reply_review", schema = "dtdd")
public class ReplyReview {
    private int id;
    private String author;
    private Integer reivewId;
    private String content;
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
    @Column(name = "author", length = 100)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "reivew_id")
    public Integer getReivewId() {
        return reivewId;
    }

    public void setReivewId(Integer reivewId) {
        this.reivewId = reivewId;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        ReplyReview that = (ReplyReview) o;
        return id == that.id &&
                Objects.equals(author, that.author) &&
                Objects.equals(reivewId, that.reivewId) &&
                Objects.equals(content, that.content) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, reivewId, content, createTime);
    }
}
