package com.imooc.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created By Dream
 * 2017/11/7 23:24
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /*名字*/
    private String productName;

    /*单价*/
    private BigDecimal productPrice;

    /*库存*/
    private Integer productStock;

    /*描述*/
    private String productDescription;

    /*小图*/
    private String productIcon;

    /*状态0正常1下架*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /*类目编号*/
    private Integer categoryType;

    public ProductInfo() {
    }

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
