package models;

import java.util.*;
import javax.persistence.*;
import java.math.BigDecimal;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user_order")
public class UserOrder extends BaseModel {
    
    @Column(name="order_id")
    @Id
    public Long orderId;
    
    @Constraints.Required
    @Column(name="product_id")
    public Long productId;
    
    @Constraints.Required
    @Column(name="user_contact_id")
    public Long contactId;
    
    @Constraints.Required
    @Column(name="user_id")
    public Long userId;

    @Constraints.Required
    @Column(name="payment_id")
    public Long paymentId;

    @Column(name="quantity")
    public Integer quantity;
    
    @Column(name="order_status")
    public String orderStatus;
    
    @Column(name="pay_type")
    public String payType;
    
    @Column(name="unit_price")
    public BigDecimal unitPrice;
    
    @Column(name="total_price")
    public BigDecimal totalPrice;
    
    @Column(name="order_date")
    public Date orderDate;
    
    @Column(name="deliver_date")
    public Date deliverDate;
    
    @Column(name="close_date")
    public Date closeDate;
    
    public static Finder<Long, UserOrder> find = new Finder<Long, UserOrder>(UserOrder.class);
}