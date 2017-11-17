package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * Created by Dream
 * 2017/11/17.
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
