package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created By Dream
 * 2017/11/7 23:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotNull(list);
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryTypeList = Arrays.asList(3,4);
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(categoryTypeList);
        Assert.assertNotNull(list);
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = categoryService.save(new ProductCategory("男生热销", 5));
        Assert.assertEquals(new Integer(5),productCategory.getCategoryType());
    }

}