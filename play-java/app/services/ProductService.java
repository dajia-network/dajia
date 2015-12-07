package services;

import java.util.*;
import models.*;

public class ProductService {
    
    public static List<ProductImage> getProductImages(Long productId) {
        List<ProductImage> prodImgs = ProductImage.find.select("path").where()
        .eq("productId", productId).eq("imgType", 1).eq("isActive", "Y")
        .findList();
        return prodImgs;
    }
    
    public static List<ProductImage> getVendorImages(Long productId) {
        List<ProductImage> vendorImgs = ProductImage.find.select("path").where()
        .eq("productId", productId).eq("imgType", 2).eq("isActive", "Y")
        .findList();
        return vendorImgs;
    }
}