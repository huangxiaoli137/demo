package com.hxl.entity;

import javax.persistence.Table;
import java.util.List;

@Table(name = "easybuy_product_category")
public class ProductCategory{
    private Integer id;
    private String name;
    private Integer parentid;
    private Integer type;
    private String iconclass;
    private List<ProductCategory> children;

    private List<Product> products;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", type=" + type +
                ", iconclass='" + iconclass + '\'' +
                ", children=" + children +
                ", products=" + products +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
    }

    public List<ProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<ProductCategory> children) {
        this.children = children;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}