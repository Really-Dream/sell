package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Dream
 * 2017/11/7 22:09
 */
@Entity
/*自动更新*/
@DynamicUpdate
/*自动生产get,set,toString方法*/
@Data
public class ProductCategory {

    /*类目ID*/
    @Id
    /*主键自增*/
    @GeneratedValue
    private Integer categoryId;

    /*类目名字*/
    private String categoryName;

    /*类目编号*/
    private  Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
