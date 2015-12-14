package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;

@MappedSuperclass
public class BaseModel extends Model {

    @Column(name="created_date")
    public Date createdDate;
    
    @Column(name="modified_date")
    public Date modifiedDate;

    @Column(name="is_active")
    public String isActive;
    
    @PrePersist
    public void createdDate() {
        this.createdDate = this.modifiedDate = new Date();
    }

    @PreUpdate
    public void modifiedDate() {
        this.modifiedDate = new Date();
    }
}