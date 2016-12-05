package com.sxc.to.dao.manager.impl;

import com.github.pagehelper.PageHelper;
import com.sxc.to.dao.manager.OrderManager;
import com.sxc.to.dao.mapper.OrderMapper;
import com.sxc.to.domain.model.Order;
import com.sxc.to.domain.model.OrderExample;
import com.sxc.to.domain.query.OrderQueryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: OrderManagerImpl
 *
 * @author: weimengchao
 * @date: 2016/12/2
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/2       weimengchao    1.0       1.0 Version
 */
@Service("orderManager")
public class OrderManagerImpl implements OrderManager {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectByExample(OrderQueryDO queryDO) {
        OrderExample example = wrapOrderExample(queryDO);

        return orderMapper.selectByExample(example);
    }

    private OrderExample wrapOrderExample(OrderQueryDO queryDO) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();

        Integer orderId = queryDO.getOrderId();
        if (orderId != null) {
            criteria.andOrderIdEqualTo(orderId);
        }

        Integer page = queryDO.getPage();
        Integer rows = queryDO.getRows();
        if (page != null && rows != null) {
            PageHelper.startPage(page, rows);
        }
        return example;
    }
}
