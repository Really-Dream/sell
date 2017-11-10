package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品详情
 * Created by Dream on 2017/11/10.
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("prive")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productionDescription;

    @JsonProperty("icon")
    private String productionIcon;
}
