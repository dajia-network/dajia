package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;
import models.*;

public class ProductController extends Controller {
    
    public Result product(Long id) {
        Product product = Product.find.byId(id);
        return ok(Json.toJson(product));
    }
    
    public Result productList() {
        List<Product> productList = Product.find.where()
        .eq("isActive", "Y")
        .orderBy("createdDate asc")
        .findList();
        System.out.println(productList.get(0));
        return ok(Json.toJson(productList));
    }
    
}
