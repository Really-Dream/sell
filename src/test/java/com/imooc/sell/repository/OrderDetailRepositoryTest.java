package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Dream
 * 2017/11/15.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailRepositoryTest {

    @Autowired
    OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1231321");
        orderDetail.setOrderId("1");
        orderDetail.setProductId("2");
        orderDetail.setProductName("大大");
        orderDetail.setProductPrice(new BigDecimal(22));
        orderDetail.setProductQuantity(3);
        orderDetail.setProductIcon("sdasda");
        repository.save(orderDetail);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> lits =  repository.findByOrderId("1");
        Assert.assertNotNull(lits);
    }

}