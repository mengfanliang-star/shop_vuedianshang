package com.mengfanliang.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNull() {
            addCriterion("order_pay is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNotNull() {
            addCriterion("order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayEqualTo(Object value) {
            addCriterion("order_pay =", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotEqualTo(Object value) {
            addCriterion("order_pay <>", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThan(Object value) {
            addCriterion("order_pay >", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThanOrEqualTo(Object value) {
            addCriterion("order_pay >=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThan(Object value) {
            addCriterion("order_pay <", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThanOrEqualTo(Object value) {
            addCriterion("order_pay <=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayIn(List<Object> values) {
            addCriterion("order_pay in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotIn(List<Object> values) {
            addCriterion("order_pay not in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayBetween(Object value1, Object value2) {
            addCriterion("order_pay between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotBetween(Object value1, Object value2) {
            addCriterion("order_pay not between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Object value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Object value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Object value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Object value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Object value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Object value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Object> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Object> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Object value1, Object value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Object value1, Object value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIsNull() {
            addCriterion("order_fapiao_title is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIsNotNull() {
            addCriterion("order_fapiao_title is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleEqualTo(Object value) {
            addCriterion("order_fapiao_title =", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotEqualTo(Object value) {
            addCriterion("order_fapiao_title <>", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleGreaterThan(Object value) {
            addCriterion("order_fapiao_title >", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleGreaterThanOrEqualTo(Object value) {
            addCriterion("order_fapiao_title >=", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleLessThan(Object value) {
            addCriterion("order_fapiao_title <", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleLessThanOrEqualTo(Object value) {
            addCriterion("order_fapiao_title <=", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIn(List<Object> values) {
            addCriterion("order_fapiao_title in", values, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotIn(List<Object> values) {
            addCriterion("order_fapiao_title not in", values, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleBetween(Object value1, Object value2) {
            addCriterion("order_fapiao_title between", value1, value2, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotBetween(Object value1, Object value2) {
            addCriterion("order_fapiao_title not between", value1, value2, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIsNull() {
            addCriterion("order_fapiao_company is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIsNotNull() {
            addCriterion("order_fapiao_company is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyEqualTo(String value) {
            addCriterion("order_fapiao_company =", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotEqualTo(String value) {
            addCriterion("order_fapiao_company <>", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyGreaterThan(String value) {
            addCriterion("order_fapiao_company >", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("order_fapiao_company >=", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLessThan(String value) {
            addCriterion("order_fapiao_company <", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLessThanOrEqualTo(String value) {
            addCriterion("order_fapiao_company <=", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLike(String value) {
            addCriterion("order_fapiao_company like", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotLike(String value) {
            addCriterion("order_fapiao_company not like", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIn(List<String> values) {
            addCriterion("order_fapiao_company in", values, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotIn(List<String> values) {
            addCriterion("order_fapiao_company not in", values, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyBetween(String value1, String value2) {
            addCriterion("order_fapiao_company between", value1, value2, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotBetween(String value1, String value2) {
            addCriterion("order_fapiao_company not between", value1, value2, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIsNull() {
            addCriterion("order_fapiao_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIsNotNull() {
            addCriterion("order_fapiao_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentEqualTo(String value) {
            addCriterion("order_fapiao_content =", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotEqualTo(String value) {
            addCriterion("order_fapiao_content <>", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentGreaterThan(String value) {
            addCriterion("order_fapiao_content >", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_fapiao_content >=", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLessThan(String value) {
            addCriterion("order_fapiao_content <", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLessThanOrEqualTo(String value) {
            addCriterion("order_fapiao_content <=", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLike(String value) {
            addCriterion("order_fapiao_content like", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotLike(String value) {
            addCriterion("order_fapiao_content not like", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIn(List<String> values) {
            addCriterion("order_fapiao_content in", values, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotIn(List<String> values) {
            addCriterion("order_fapiao_content not in", values, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentBetween(String value1, String value2) {
            addCriterion("order_fapiao_content between", value1, value2, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotBetween(String value1, String value2) {
            addCriterion("order_fapiao_content not between", value1, value2, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIsNull() {
            addCriterion("consignee_addr is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIsNotNull() {
            addCriterion("consignee_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrEqualTo(String value) {
            addCriterion("consignee_addr =", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotEqualTo(String value) {
            addCriterion("consignee_addr <>", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrGreaterThan(String value) {
            addCriterion("consignee_addr >", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_addr >=", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLessThan(String value) {
            addCriterion("consignee_addr <", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLessThanOrEqualTo(String value) {
            addCriterion("consignee_addr <=", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLike(String value) {
            addCriterion("consignee_addr like", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotLike(String value) {
            addCriterion("consignee_addr not like", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIn(List<String> values) {
            addCriterion("consignee_addr in", values, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotIn(List<String> values) {
            addCriterion("consignee_addr not in", values, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrBetween(String value1, String value2) {
            addCriterion("consignee_addr between", value1, value2, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotBetween(String value1, String value2) {
            addCriterion("consignee_addr not between", value1, value2, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Object value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Object value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Object value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Object value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Object value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Object value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Object> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Object> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Object value1, Object value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Object value1, Object value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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