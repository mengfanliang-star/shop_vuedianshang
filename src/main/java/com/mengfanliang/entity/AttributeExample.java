package com.mengfanliang.entity;

import java.util.ArrayList;
import java.util.List;

public class AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeExample() {
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

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Integer value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Integer value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Integer value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Integer value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Integer> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Integer> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andAttrSelIsNull() {
            addCriterion("attr_sel is null");
            return (Criteria) this;
        }

        public Criteria andAttrSelIsNotNull() {
            addCriterion("attr_sel is not null");
            return (Criteria) this;
        }

        public Criteria andAttrSelEqualTo(String value) {
            addCriterion("attr_sel =", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelNotEqualTo(String value) {
            addCriterion("attr_sel <>", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelGreaterThan(String value) {
            addCriterion("attr_sel >", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelGreaterThanOrEqualTo(String value) {
            addCriterion("attr_sel >=", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelLessThan(String value) {
            addCriterion("attr_sel <", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelLessThanOrEqualTo(String value) {
            addCriterion("attr_sel <=", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelLike(String value) {
            addCriterion("attr_sel like", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelNotLike(String value) {
            addCriterion("attr_sel not like", value, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelIn(List<String> values) {
            addCriterion("attr_sel in", values, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelNotIn(List<String> values) {
            addCriterion("attr_sel not in", values, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelBetween(String value1, String value2) {
            addCriterion("attr_sel between", value1, value2, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrSelNotBetween(String value1, String value2) {
            addCriterion("attr_sel not between", value1, value2, "attrSel");
            return (Criteria) this;
        }

        public Criteria andAttrWriteIsNull() {
            addCriterion("attr_write is null");
            return (Criteria) this;
        }

        public Criteria andAttrWriteIsNotNull() {
            addCriterion("attr_write is not null");
            return (Criteria) this;
        }

        public Criteria andAttrWriteEqualTo(String value) {
            addCriterion("attr_write =", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteNotEqualTo(String value) {
            addCriterion("attr_write <>", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteGreaterThan(String value) {
            addCriterion("attr_write >", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteGreaterThanOrEqualTo(String value) {
            addCriterion("attr_write >=", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteLessThan(String value) {
            addCriterion("attr_write <", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteLessThanOrEqualTo(String value) {
            addCriterion("attr_write <=", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteLike(String value) {
            addCriterion("attr_write like", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteNotLike(String value) {
            addCriterion("attr_write not like", value, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteIn(List<String> values) {
            addCriterion("attr_write in", values, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteNotIn(List<String> values) {
            addCriterion("attr_write not in", values, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteBetween(String value1, String value2) {
            addCriterion("attr_write between", value1, value2, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrWriteNotBetween(String value1, String value2) {
            addCriterion("attr_write not between", value1, value2, "attrWrite");
            return (Criteria) this;
        }

        public Criteria andAttrValsIsNull() {
            addCriterion("attr_vals is null");
            return (Criteria) this;
        }

        public Criteria andAttrValsIsNotNull() {
            addCriterion("attr_vals is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValsEqualTo(String value) {
            addCriterion("attr_vals =", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsNotEqualTo(String value) {
            addCriterion("attr_vals <>", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsGreaterThan(String value) {
            addCriterion("attr_vals >", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsGreaterThanOrEqualTo(String value) {
            addCriterion("attr_vals >=", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsLessThan(String value) {
            addCriterion("attr_vals <", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsLessThanOrEqualTo(String value) {
            addCriterion("attr_vals <=", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsLike(String value) {
            addCriterion("attr_vals like", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsNotLike(String value) {
            addCriterion("attr_vals not like", value, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsIn(List<String> values) {
            addCriterion("attr_vals in", values, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsNotIn(List<String> values) {
            addCriterion("attr_vals not in", values, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsBetween(String value1, String value2) {
            addCriterion("attr_vals between", value1, value2, "attrVals");
            return (Criteria) this;
        }

        public Criteria andAttrValsNotBetween(String value1, String value2) {
            addCriterion("attr_vals not between", value1, value2, "attrVals");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Integer value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Integer value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Integer value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Integer value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Integer> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Integer> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Integer value1, Integer value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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