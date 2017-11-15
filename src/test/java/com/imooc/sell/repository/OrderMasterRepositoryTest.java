package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Dream
 * 2017/11/15.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    OrderMasterRepository repository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("13866131255");
        orderMaster.setBuyerAddress("中南海");
        orderMaster.setBuyerOpenid("123456");
        orderMaster.setOrderAmount(new BigDecimal(55.32));
        repository.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(0,1);

        Page<OrderMaster> page = repository.findByBuyerOpenid("123456",request);

        System.out.println(page.getTotalElements());
    }

}