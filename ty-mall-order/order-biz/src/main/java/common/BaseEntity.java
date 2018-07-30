package common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hewei
 * @version [1.0.0, 2018/02/07]
 */
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    protected Long id;

    @Column(name = "created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("created_at")
    protected Date createdAt;

    @Column(name = "updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("updated_at")
    protected Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void initCreatedAndUpdatedDate(Date date) {
        if (date == null) {
            date = new Date();
        }
        this.setCreatedAt(date);
        this.setUpdatedAt(date);
    }
}
