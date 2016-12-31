package com.sxc.testweb.service;

import com.sxc.testweb.domain.User;
import com.sxc.to.domain.dto.TccDTO;
import org.mengyun.tcctransaction.api.TransactionContext;

/**
 * Description: UserService
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
public interface UserService {
    boolean login(String username, String password);

    boolean tcc(TccDTO tccDTO);

    boolean insertSelective(TransactionContext transactionContext, User user);


}
