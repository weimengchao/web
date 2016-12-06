package com.sxc.to.dao.manager;

import com.sxc.to.domain.model.Order;
import com.sxc.to.domain.query.OrderQueryDO;

import java.util.List;

/**
 * Description: OrderManager
 *
 * @author: weimengchao
 * @date: 2016/12/2
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/2       weimengchao    1.0       1.0 Version
 */
public interface OrderManager {
    List<Order> selectByExample(OrderQueryDO queryDO);

    int insertSelective(Order record);
}
