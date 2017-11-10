package com.imooc.sell.controller;

import com.imooc.sell.VO.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 买家端
 * Created by Dream
 * 2017/11/10.
 */
@RestController
@RequestMapping(value = "/buyer/product")
public class BuyerProductController {

    @RequestMapping(value = "list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("商品详情");
        return resultVO;
    }

}
