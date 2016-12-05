package com.sxc.to.domain.query;

/**
 * Description: OrderQueryDO
 *
 * @author: weimengchao
 * @date: 2016/12/2
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/2       weimengchao    1.0       1.0 Version
 */
public class OrderQueryDO extends BaseQueryDO{
    private Integer orderId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
