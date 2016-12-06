package com.sxc.to.service;

import com.sxc.to.domain.model.Order;
import com.sxc.to.domain.query.OrderQueryDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Description: OrderServiceTest
 *
 * @author: weimengchao
 * @date: 2016/12/2
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/2       weimengchao    1.0       1.0 Version
 */
public class OrderServiceTest extends BaseTest{

    @Autowired
    public OrderService orderService;

    @Test
    public void testQueryByExample() {
        List<Order> orders = orderService.queryByExample(new OrderQueryDO());
        Assert.notNull(orders);
    }

    @Test
    public void testInsertSelective() {
        Order order = new Order();
        order.setPayerUserId(1);
        int nums = orderService.insertSelective(order);
        Assert.isTrue(nums == 1);
    }
}
