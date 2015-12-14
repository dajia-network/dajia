package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="product_img")
public class ProductImage extends BaseModel {
    
    @Column(name="img_id")
    @Id
    public Long imgId;
    
    @Constraints.Required
    @Column(name="product_id")
    public Long productId;

    @Column(name="sort")
    public int sort;
    
    @Column(name="location")
    public String location;
    
    @Column(name="path")
    public String path;
    
    @Column(name="img_type")
    public Integer imgType;
    
    // @ManyToOne
    // @JoinColumn(name="product_id")
    // private Product product;
    
    public static Finder<Long, ProductImage> find = new Finder<Long,ProductImage>(ProductImage.class);
}