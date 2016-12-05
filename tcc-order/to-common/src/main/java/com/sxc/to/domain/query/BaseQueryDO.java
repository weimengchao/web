package com.sxc.to.domain.query;

import java.io.Serializable;
import java.util.Date;

/**
 * PackageName: com.sxc.survey.domain.query
 * FileName: BaseQueryDO.java
 * Description: 查询基础类
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 *
 * @author wangzhang kylo.zw@gmail.com
 * @version 1.0, 16/9/5
 */
public class BaseQueryDO implements Serializable {

    private static final long serialVersionUID = 3227152619812675207L;

    /**
     * 查询条件-开始时间
     */
    private Date startTime;

    /**
     * 查询条件-结束时间
     */
    private Date endTime;

    /**
     * 查询条件-当前时间
     */
    private Date now;

    /**
     * 排序条件
     */
    private String orderByClause;

    /**
     * 自定义 select 条件
     */
    private String selectClause;

    /**
     * groupBy 条件
     */
    private String groupByClause;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 每页数
     */
    private Integer rows;

    /**
     * 是否去重
     */
    private boolean distinct = false;

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSelectClause() {
        return selectClause;
    }

    public void setSelectClause(String selectClause) {
        this.selectClause = selectClause;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
}
