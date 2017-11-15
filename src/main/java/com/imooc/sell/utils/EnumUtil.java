package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * Created by Dream
 * 2017/11/15.
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code,Class<T> enumClass){
        for(T each : enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
