package com.imooc.sell.repository;

import com.imooc.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dream
 * 2017/11/17.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
