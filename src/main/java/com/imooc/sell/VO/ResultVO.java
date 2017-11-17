package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Http请求返回的最外层对象
 * Created by Dream on 2017/11/10.
 */
@Data
public class ResultVO<T> {


    private Integer code;

    private String msg;

    private T data;

}
