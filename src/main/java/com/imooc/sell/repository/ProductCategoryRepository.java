package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Dream
 * 2017/11/7 22:09
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    /*需要无参的构造器支持*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
