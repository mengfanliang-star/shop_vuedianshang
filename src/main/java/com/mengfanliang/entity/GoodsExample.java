package com.mengfanliang.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Short value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Short value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Short value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Short value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Short value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Short> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Short> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Short value1, Short value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Short value1, Short value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
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

        public Criteria andCatIdEqualTo(Short value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Short value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Short value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Short value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Short value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Short> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Short> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Short value1, Short value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Short value1, Short value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIsNull() {
            addCriterion("goods_introduce is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIsNotNull() {
            addCriterion("goods_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceEqualTo(String value) {
            addCriterion("goods_introduce =", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotEqualTo(String value) {
            addCriterion("goods_introduce <>", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceGreaterThan(String value) {
            addCriterion("goods_introduce >", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_introduce >=", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLessThan(String value) {
            addCriterion("goods_introduce <", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLessThanOrEqualTo(String value) {
            addCriterion("goods_introduce <=", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLike(String value) {
            addCriterion("goods_introduce like", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotLike(String value) {
            addCriterion("goods_introduce not like", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIn(List<String> values) {
            addCriterion("goods_introduce in", values, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotIn(List<String> values) {
            addCriterion("goods_introduce not in", values, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceBetween(String value1, String value2) {
            addCriterion("goods_introduce between", value1, value2, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotBetween(String value1, String value2) {
            addCriterion("goods_introduce not between", value1, value2, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoIsNull() {
            addCriterion("goods_big_logo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoIsNotNull() {
            addCriterion("goods_big_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoEqualTo(String value) {
            addCriterion("goods_big_logo =", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoNotEqualTo(String value) {
            addCriterion("goods_big_logo <>", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoGreaterThan(String value) {
            addCriterion("goods_big_logo >", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_big_logo >=", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoLessThan(String value) {
            addCriterion("goods_big_logo <", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoLessThanOrEqualTo(String value) {
            addCriterion("goods_big_logo <=", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoLike(String value) {
            addCriterion("goods_big_logo like", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoNotLike(String value) {
            addCriterion("goods_big_logo not like", value, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoIn(List<String> values) {
            addCriterion("goods_big_logo in", values, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoNotIn(List<String> values) {
            addCriterion("goods_big_logo not in", values, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoBetween(String value1, String value2) {
            addCriterion("goods_big_logo between", value1, value2, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsBigLogoNotBetween(String value1, String value2) {
            addCriterion("goods_big_logo not between", value1, value2, "goodsBigLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoIsNull() {
            addCriterion("goods_small_logo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoIsNotNull() {
            addCriterion("goods_small_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoEqualTo(String value) {
            addCriterion("goods_small_logo =", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoNotEqualTo(String value) {
            addCriterion("goods_small_logo <>", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoGreaterThan(String value) {
            addCriterion("goods_small_logo >", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_small_logo >=", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoLessThan(String value) {
            addCriterion("goods_small_logo <", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoLessThanOrEqualTo(String value) {
            addCriterion("goods_small_logo <=", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoLike(String value) {
            addCriterion("goods_small_logo like", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoNotLike(String value) {
            addCriterion("goods_small_logo not like", value, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoIn(List<String> values) {
            addCriterion("goods_small_logo in", values, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoNotIn(List<String> values) {
            addCriterion("goods_small_logo not in", values, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoBetween(String value1, String value2) {
            addCriterion("goods_small_logo between", value1, value2, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsSmallLogoNotBetween(String value1, String value2) {
            addCriterion("goods_small_logo not between", value1, value2, "goodsSmallLogo");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Object value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Object value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Object value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Object value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Object value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Object value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Object> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Object> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Object value1, Object value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Object value1, Object value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Integer value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Integer value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Integer value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Integer value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Integer value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Integer> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Integer> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Integer value1, Integer value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
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

        public Criteria andCatOneIdIsNull() {
            addCriterion("cat_one_id is null");
            return (Criteria) this;
        }

        public Criteria andCatOneIdIsNotNull() {
            addCriterion("cat_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatOneIdEqualTo(Short value) {
            addCriterion("cat_one_id =", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdNotEqualTo(Short value) {
            addCriterion("cat_one_id <>", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdGreaterThan(Short value) {
            addCriterion("cat_one_id >", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_one_id >=", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdLessThan(Short value) {
            addCriterion("cat_one_id <", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdLessThanOrEqualTo(Short value) {
            addCriterion("cat_one_id <=", value, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdIn(List<Short> values) {
            addCriterion("cat_one_id in", values, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdNotIn(List<Short> values) {
            addCriterion("cat_one_id not in", values, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdBetween(Short value1, Short value2) {
            addCriterion("cat_one_id between", value1, value2, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatOneIdNotBetween(Short value1, Short value2) {
            addCriterion("cat_one_id not between", value1, value2, "catOneId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdIsNull() {
            addCriterion("cat_two_id is null");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdIsNotNull() {
            addCriterion("cat_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdEqualTo(Short value) {
            addCriterion("cat_two_id =", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdNotEqualTo(Short value) {
            addCriterion("cat_two_id <>", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdGreaterThan(Short value) {
            addCriterion("cat_two_id >", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_two_id >=", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdLessThan(Short value) {
            addCriterion("cat_two_id <", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdLessThanOrEqualTo(Short value) {
            addCriterion("cat_two_id <=", value, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdIn(List<Short> values) {
            addCriterion("cat_two_id in", values, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdNotIn(List<Short> values) {
            addCriterion("cat_two_id not in", values, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdBetween(Short value1, Short value2) {
            addCriterion("cat_two_id between", value1, value2, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatTwoIdNotBetween(Short value1, Short value2) {
            addCriterion("cat_two_id not between", value1, value2, "catTwoId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdIsNull() {
            addCriterion("cat_three_id is null");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdIsNotNull() {
            addCriterion("cat_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdEqualTo(Short value) {
            addCriterion("cat_three_id =", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdNotEqualTo(Short value) {
            addCriterion("cat_three_id <>", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdGreaterThan(Short value) {
            addCriterion("cat_three_id >", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_three_id >=", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdLessThan(Short value) {
            addCriterion("cat_three_id <", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdLessThanOrEqualTo(Short value) {
            addCriterion("cat_three_id <=", value, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdIn(List<Short> values) {
            addCriterion("cat_three_id in", values, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdNotIn(List<Short> values) {
            addCriterion("cat_three_id not in", values, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdBetween(Short value1, Short value2) {
            addCriterion("cat_three_id between", value1, value2, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andCatThreeIdNotBetween(Short value1, Short value2) {
            addCriterion("cat_three_id not between", value1, value2, "catThreeId");
            return (Criteria) this;
        }

        public Criteria andHotMumberIsNull() {
            addCriterion("hot_mumber is null");
            return (Criteria) this;
        }

        public Criteria andHotMumberIsNotNull() {
            addCriterion("hot_mumber is not null");
            return (Criteria) this;
        }

        public Criteria andHotMumberEqualTo(Integer value) {
            addCriterion("hot_mumber =", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberNotEqualTo(Integer value) {
            addCriterion("hot_mumber <>", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberGreaterThan(Integer value) {
            addCriterion("hot_mumber >", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot_mumber >=", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberLessThan(Integer value) {
            addCriterion("hot_mumber <", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberLessThanOrEqualTo(Integer value) {
            addCriterion("hot_mumber <=", value, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberIn(List<Integer> values) {
            addCriterion("hot_mumber in", values, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberNotIn(List<Integer> values) {
            addCriterion("hot_mumber not in", values, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberBetween(Integer value1, Integer value2) {
            addCriterion("hot_mumber between", value1, value2, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andHotMumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hot_mumber not between", value1, value2, "hotMumber");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNull() {
            addCriterion("is_promote is null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNotNull() {
            addCriterion("is_promote is not null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteEqualTo(Short value) {
            addCriterion("is_promote =", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotEqualTo(Short value) {
            addCriterion("is_promote <>", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThan(Short value) {
            addCriterion("is_promote >", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThanOrEqualTo(Short value) {
            addCriterion("is_promote >=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThan(Short value) {
            addCriterion("is_promote <", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThanOrEqualTo(Short value) {
            addCriterion("is_promote <=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIn(List<Short> values) {
            addCriterion("is_promote in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotIn(List<Short> values) {
            addCriterion("is_promote not in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteBetween(Short value1, Short value2) {
            addCriterion("is_promote between", value1, value2, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotBetween(Short value1, Short value2) {
            addCriterion("is_promote not between", value1, value2, "isPromote");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Integer value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Integer value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Integer value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Integer value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Integer> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Integer> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
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