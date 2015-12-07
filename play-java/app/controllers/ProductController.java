package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;
import models.*;
import services.*;

public class ProductController extends Controller {
    
    public Result product(Long id) {
        Product product = Product.find.byId(id);
        product.priceOff = product.originalPrice.add(product.currentPrice.negate());
        
        List<ProductImage> prodImgs = ProductService.getProductImages(product.productId);
        if(prodImgs != null && prodImgs.size() > 0)
            product.productImg = prodImgs.get(0).path;
        product.productImages = prodImgs;
        
        List<ProductImage> vendorImgs = ProductService.getVendorImages(product.productId);
        if(vendorImgs != null && vendorImgs.size() > 0)
            product.vendorImg = vendorImgs.get(0).path;
            
        return ok(Json.toJson(product));
    }
    
    public Result productList() {
        List<Product> productList = Product.find.where()
        .eq("isActive", "Y")
        .orderBy("createdDate asc")
        .findList();
        
        for(Product p : productList){
            p.priceOff = p.originalPrice.add(p.currentPrice.negate());
            List<ProductImage> prodImgs = ProductService.getProductImages(p.productId);
            if(prodImgs != null && prodImgs.size() > 0)
                p.productImg = prodImgs.get(0).path;
            List<ProductImage> vendorImgs = ProductService.getVendorImages(p.productId);
            if(vendorImgs != null && vendorImgs.size() > 0)
                p.vendorImg = vendorImgs.get(0).path;
        }
        
        return ok(Json.toJson(productList));
    }
    
}
