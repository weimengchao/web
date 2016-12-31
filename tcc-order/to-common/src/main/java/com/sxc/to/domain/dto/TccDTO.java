package com.sxc.to.domain.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * Description: TccDTO
 *
 * @author: weimengchao
 * @date: 2016/12/6
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/12/6       weimengchao    1.0       1.0 Version
 */
public class TccDTO implements Serializable {

    private String userName;

    private Integer payerUserId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(Integer payerUserId) {
        this.payerUserId = payerUserId;
    }
}
