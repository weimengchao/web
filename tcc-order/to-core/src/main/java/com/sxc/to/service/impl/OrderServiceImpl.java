package com.sxc.to.service.impl;

import com.sxc.to.dao.manager.OrderManager;
import com.sxc.to.service.OrderService;
import com.sxc.to.domain.model.Order;
import com.sxc.to.domain.query.OrderQueryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: OrderServiceImpl
 *
 * @author: weimengchao
 * @date: 2016/12/2
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/2       weimengchao    1.0       1.0 Version
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderManager orderManager;

    @Override
    public List<Order> queryByExample(OrderQueryDO queryDO) {
        return orderManager.selectByExample(queryDO);
    }
}
