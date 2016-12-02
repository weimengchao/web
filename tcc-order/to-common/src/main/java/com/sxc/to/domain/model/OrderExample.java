package com.sxc.to.domain.model;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIsNull() {
            addCriterion("PAYER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIsNotNull() {
            addCriterion("PAYER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdEqualTo(Integer value) {
            addCriterion("PAYER_USER_ID =", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotEqualTo(Integer value) {
            addCriterion("PAYER_USER_ID <>", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThan(Integer value) {
            addCriterion("PAYER_USER_ID >", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYER_USER_ID >=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThan(Integer value) {
            addCriterion("PAYER_USER_ID <", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYER_USER_ID <=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIn(List<Integer> values) {
            addCriterion("PAYER_USER_ID in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotIn(List<Integer> values) {
            addCriterion("PAYER_USER_ID not in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYER_USER_ID between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYER_USER_ID not between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNull() {
            addCriterion("PAYEE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNotNull() {
            addCriterion("PAYEE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdEqualTo(Integer value) {
            addCriterion("PAYEE_USER_ID =", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotEqualTo(Integer value) {
            addCriterion("PAYEE_USER_ID <>", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThan(Integer value) {
            addCriterion("PAYEE_USER_ID >", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYEE_USER_ID >=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThan(Integer value) {
            addCriterion("PAYEE_USER_ID <", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYEE_USER_ID <=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIn(List<Integer> values) {
            addCriterion("PAYEE_USER_ID in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotIn(List<Integer> values) {
            addCriterion("PAYEE_USER_ID not in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYEE_USER_ID between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYEE_USER_ID not between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountIsNull() {
            addCriterion("RED_PACKET_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountIsNotNull() {
            addCriterion("RED_PACKET_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountEqualTo(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT =", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountNotEqualTo(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT <>", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountGreaterThan(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT >", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT >=", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountLessThan(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT <", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("RED_PACKET_PAY_AMOUNT <=", value, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountIn(List<Long> values) {
            addCriterion("RED_PACKET_PAY_AMOUNT in", values, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountNotIn(List<Long> values) {
            addCriterion("RED_PACKET_PAY_AMOUNT not in", values, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountBetween(Long value1, Long value2) {
            addCriterion("RED_PACKET_PAY_AMOUNT between", value1, value2, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andRedPacketPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("RED_PACKET_PAY_AMOUNT not between", value1, value2, "redPacketPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountIsNull() {
            addCriterion("CAPITAL_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountIsNotNull() {
            addCriterion("CAPITAL_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountEqualTo(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT =", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountNotEqualTo(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT <>", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountGreaterThan(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT >", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT >=", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountLessThan(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT <", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("CAPITAL_PAY_AMOUNT <=", value, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountIn(List<Long> values) {
            addCriterion("CAPITAL_PAY_AMOUNT in", values, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountNotIn(List<Long> values) {
            addCriterion("CAPITAL_PAY_AMOUNT not in", values, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountBetween(Long value1, Long value2) {
            addCriterion("CAPITAL_PAY_AMOUNT between", value1, value2, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("CAPITAL_PAY_AMOUNT not between", value1, value2, "capitalPayAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("MERCHANT_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("MERCHANT_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER_NO >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("MERCHANT_ORDER_NO <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("MERCHANT_ORDER_NO like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("MERCHANT_ORDER_NO not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_NO in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_NO not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_NO between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_NO not between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}