package hp.dtdd.hoaphuong.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "post_tag", schema = "dtdd")
public class PostTag {
    private int id;
    private Integer postId;
    private Integer tagId;
    private String namePost;
    private String nameTag;
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
    @Column(name = "post_id")
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "tag_id")
    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "name_post", length = 255)
    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    @Basic
    @Column(name = "name_tag", length = 255)
    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
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
        PostTag postTag = (PostTag) o;
        return id == postTag.id &&
                Objects.equals(postId, postTag.postId) &&
                Objects.equals(tagId, postTag.tagId) &&
                Objects.equals(namePost, postTag.namePost) &&
                Objects.equals(nameTag, postTag.nameTag) &&
                Objects.equals(createTime, postTag.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postId, tagId, namePost, nameTag, createTime);
    }
}
