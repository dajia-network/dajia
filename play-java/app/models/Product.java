package models;

import java.util.*;
import javax.persistence.*;
import java.math.BigDecimal;

import com.avaje.ebean.*;
//import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="product")
public class Product extends Model {

    @Column(name="product_id")
    @Id
    public Long productId;

    @Column(name="short_name")
    public String shortName;
    
    @Constraints.Required
    @Column(name="name")
    public String name;
    
    @Column(name="brief")
    public String brief;
    
    @Column(name="description")
    public String description;
    
    @Column(name="spec")
    public String spec;
    
    @Column(name="order_num")
    public Long orderNum;
    
    @Column(name="max_order")
    public Long maxOrder;
    
    @Column(name="original_price")
    public BigDecimal originalPrice;
    
    @Column(name="current_price")
    public BigDecimal currentPrice;
    
    @Column(name="target_price")
    public BigDecimal targetPrice;
    
    @Column(name="start_date")
    public Date startDate;
    
    @Column(name="expired_date")
    public Date expiredDate;
    
    @Column(name="created_date")
    public Date createdDate;
    
    @Column(name="modified_date")
    public Date modifiedDate;

    @Column(name="is_active")
    public String isActive;
    
    @OneToMany(mappedBy="product", cascade=CascadeType.ALL)
    public List<ProductImage> productImages;
    
    public static Finder<Long, Product> find = new Finder<Long,Product>(Product.class);
}