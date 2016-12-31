package com.sxc.testweb.service.impl;

import com.sxc.testweb.dao.UserMapper;
import com.sxc.testweb.domain.User;
import com.sxc.testweb.domain.UserExample;
import com.sxc.testweb.service.UserService;
import com.sxc.to.domain.dto.TccDTO;
import com.sxc.to.domain.model.Order;
import com.sxc.to.service.OrderService;
import org.mengyun.tcctransaction.Compensable;
import org.mengyun.tcctransaction.api.TransactionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: UserServiceImpl
 *
 * @author: weimengchao
 * @version: 1.0
 * Create: 2016/6/1
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 * -
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/6/1       weimengchao    1.0       1.0 Version
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderService orderService;

    public boolean login(String username, String password) {
        boolean result = true;


            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();

            if (username != null && !"".equals(username)) {
                criteria.andUsernameEqualTo(username);
            }

            if (password != null && !"".equals(password)) {
                criteria.andPasswordEqualTo(password);
            }

            List<User> rs = userMapper.selectByExample(example);

            if (rs != null && rs.size() > 0) {
                result = true;
            } else {
                result = false;
            }


        return result;
    }

    @Compensable(confirmMethod = "confirmTcc", cancelMethod = "cancelTcc")
    public boolean tcc(TccDTO tccDTO) {
        System.out.println("tcc try");

        User user = new User();
        user.setUsername(tccDTO.getUserName());
        this.insertSelective(null, user);

        Order order = new Order();
        order.setPayerUserId(tccDTO.getPayerUserId());
        orderService.insertSelective(null, order);

        return false;
    }

    public void confirmTcc(User user) {
        System.out.println("tcc confirm");
        return ;
    }

    public void cancelTcc(TransactionContext transactionContext, User user) {
        System.out.println("tcc cancel");
        return ;
    }

    @Compensable(confirmMethod = "confirmInsertSelective", cancelMethod = "cancelInsertSelective")
    public boolean insertSelective(TransactionContext transactionContext, User user) {
        System.out.println("insertSelective try");
        userMapper.insertSelective(user);

        return true;
    }

    public void confirmInsertSelective(TransactionContext transactionContext, User user) {
        System.out.println("insertSelective try");
        return ;
    }

    public void cancelInsertSelective(TransactionContext transactionContext, User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        userMapper.deleteByExample(userExample);
    }


}
