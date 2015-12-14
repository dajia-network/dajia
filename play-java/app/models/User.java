package models;

import java.util.*;
import javax.persistence.*;

//import com.avaje.ebean.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
public class User extends BaseModel {

    @Column(name="user_id")
    @Id
    public Long userId;

    @Constraints.Required
    @Column(name="username")
    public String userName;
    
    @Column(name="email")
    public String email;
    
    @Constraints.Required
    @Column(name="mobile")
    public String mobile;
    
    @Constraints.Required
    @Column(name="password")
    public String password;
    
    @Column(name="wechat")
    public String wechat;
    
    @Column(name="last_visit_date")
    public Date lastVisitDate;
    
    @Column(name="last_visit_ip")
    public String lastVisitIp;
    
    public static Finder<Long, User> find = new Finder<Long, User>(User.class);
}