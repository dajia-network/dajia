package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user_contact")
public class UserContact extends BaseModel {
    
    @Column(name="contact_info_id")
    @Id
    public Long contactId;
    
    @Constraints.Required
    @Column(name="user_id")
    public Long userId;

    @Constraints.Required
    @Column(name="contact_name")
    public String contactName;
    
    @Column(name="contact_mobile")
    public String contactMobile;
    
    @Constraints.Required
    @Column(name="mobile")
    public String mobile;
    
    @Column(name="province")
    public String province;
    
    @Column(name="city")
    public String city;
    
    @Column(name="district")
    public String district;
    
    @Column(name="zipcode")
    public String zipcode;
    
    @Column(name="is_default")
    public String isDefault;
    
    @Column(name="address_1")
    public String address1;
    
    @Column(name="address_2")
    public String address2;
    
    public static Finder<Long, UserContact> find = new Finder<Long, UserContact>(UserContact.class);
}