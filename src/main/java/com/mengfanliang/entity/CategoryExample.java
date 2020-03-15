package com.mengfanliang.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatPidIsNull() {
            addCriterion("cat_pid is null");
            return (Criteria) this;
        }

        public Criteria andCatPidIsNotNull() {
            addCriterion("cat_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCatPidEqualTo(Integer value) {
            addCriterion("cat_pid =", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotEqualTo(Integer value) {
            addCriterion("cat_pid <>", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidGreaterThan(Integer value) {
            addCriterion("cat_pid >", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_pid >=", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidLessThan(Integer value) {
            addCriterion("cat_pid <", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidLessThanOrEqualTo(Integer value) {
            addCriterion("cat_pid <=", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidIn(List<Integer> values) {
            addCriterion("cat_pid in", values, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotIn(List<Integer> values) {
            addCriterion("cat_pid not in", values, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidBetween(Integer value1, Integer value2) {
            addCriterion("cat_pid between", value1, value2, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_pid not between", value1, value2, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatLevelIsNull() {
            addCriterion("cat_level is null");
            return (Criteria) this;
        }

        public Criteria andCatLevelIsNotNull() {
            addCriterion("cat_level is not null");
            return (Criteria) this;
        }

        public Criteria andCatLevelEqualTo(Integer value) {
            addCriterion("cat_level =", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotEqualTo(Integer value) {
            addCriterion("cat_level <>", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelGreaterThan(Integer value) {
            addCriterion("cat_level >", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_level >=", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelLessThan(Integer value) {
            addCriterion("cat_level <", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cat_level <=", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelIn(List<Integer> values) {
            addCriterion("cat_level in", values, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotIn(List<Integer> values) {
            addCriterion("cat_level not in", values, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelBetween(Integer value1, Integer value2) {
            addCriterion("cat_level between", value1, value2, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_level not between", value1, value2, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatDeletedIsNull() {
            addCriterion("cat_deleted is null");
            return (Criteria) this;
        }

        public Criteria andCatDeletedIsNotNull() {
            addCriterion("cat_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andCatDeletedEqualTo(Integer value) {
            addCriterion("cat_deleted =", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedNotEqualTo(Integer value) {
            addCriterion("cat_deleted <>", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedGreaterThan(Integer value) {
            addCriterion("cat_deleted >", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_deleted >=", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedLessThan(Integer value) {
            addCriterion("cat_deleted <", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("cat_deleted <=", value, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedIn(List<Integer> values) {
            addCriterion("cat_deleted in", values, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedNotIn(List<Integer> values) {
            addCriterion("cat_deleted not in", values, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedBetween(Integer value1, Integer value2) {
            addCriterion("cat_deleted between", value1, value2, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_deleted not between", value1, value2, "catDeleted");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNull() {
            addCriterion("cat_icon is null");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNotNull() {
            addCriterion("cat_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCatIconEqualTo(String value) {
            addCriterion("cat_icon =", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotEqualTo(String value) {
            addCriterion("cat_icon <>", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThan(String value) {
            addCriterion("cat_icon >", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThanOrEqualTo(String value) {
            addCriterion("cat_icon >=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThan(String value) {
            addCriterion("cat_icon <", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThanOrEqualTo(String value) {
            addCriterion("cat_icon <=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLike(String value) {
            addCriterion("cat_icon like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotLike(String value) {
            addCriterion("cat_icon not like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconIn(List<String> values) {
            addCriterion("cat_icon in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotIn(List<String> values) {
            addCriterion("cat_icon not in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconBetween(String value1, String value2) {
            addCriterion("cat_icon between", value1, value2, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotBetween(String value1, String value2) {
            addCriterion("cat_icon not between", value1, value2, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatSrcIsNull() {
            addCriterion("cat_src is null");
            return (Criteria) this;
        }

        public Criteria andCatSrcIsNotNull() {
            addCriterion("cat_src is not null");
            return (Criteria) this;
        }

        public Criteria andCatSrcEqualTo(String value) {
            addCriterion("cat_src =", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcNotEqualTo(String value) {
            addCriterion("cat_src <>", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcGreaterThan(String value) {
            addCriterion("cat_src >", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcGreaterThanOrEqualTo(String value) {
            addCriterion("cat_src >=", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcLessThan(String value) {
            addCriterion("cat_src <", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcLessThanOrEqualTo(String value) {
            addCriterion("cat_src <=", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcLike(String value) {
            addCriterion("cat_src like", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcNotLike(String value) {
            addCriterion("cat_src not like", value, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcIn(List<String> values) {
            addCriterion("cat_src in", values, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcNotIn(List<String> values) {
            addCriterion("cat_src not in", values, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcBetween(String value1, String value2) {
            addCriterion("cat_src between", value1, value2, "catSrc");
            return (Criteria) this;
        }

        public Criteria andCatSrcNotBetween(String value1, String value2) {
            addCriterion("cat_src not between", value1, value2, "catSrc");
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