package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created By Dream
 * 2017/11/7 23:54
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
