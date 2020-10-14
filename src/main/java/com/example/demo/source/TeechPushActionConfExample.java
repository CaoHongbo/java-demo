package com.example.demo.source;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeechPushActionConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeechPushActionConfExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNull() {
            addCriterion("action_name is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("action_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("action_name =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("action_name <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("action_name >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("action_name >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("action_name <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("action_name <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("action_name like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("action_name not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("action_name in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("action_name not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("action_name between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("action_name not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitIsNull() {
            addCriterion("action_fatigue_limit is null");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitIsNotNull() {
            addCriterion("action_fatigue_limit is not null");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitEqualTo(Integer value) {
            addCriterion("action_fatigue_limit =", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitNotEqualTo(Integer value) {
            addCriterion("action_fatigue_limit <>", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitGreaterThan(Integer value) {
            addCriterion("action_fatigue_limit >", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_fatigue_limit >=", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitLessThan(Integer value) {
            addCriterion("action_fatigue_limit <", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitLessThanOrEqualTo(Integer value) {
            addCriterion("action_fatigue_limit <=", value, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitIn(List<Integer> values) {
            addCriterion("action_fatigue_limit in", values, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitNotIn(List<Integer> values) {
            addCriterion("action_fatigue_limit not in", values, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitBetween(Integer value1, Integer value2) {
            addCriterion("action_fatigue_limit between", value1, value2, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andActionFatigueLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("action_fatigue_limit not between", value1, value2, "actionFatigueLimit");
            return (Criteria) this;
        }

        public Criteria andTimeToResultIsNull() {
            addCriterion("time_to_result is null");
            return (Criteria) this;
        }

        public Criteria andTimeToResultIsNotNull() {
            addCriterion("time_to_result is not null");
            return (Criteria) this;
        }

        public Criteria andTimeToResultEqualTo(Long value) {
            addCriterion("time_to_result =", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultNotEqualTo(Long value) {
            addCriterion("time_to_result <>", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultGreaterThan(Long value) {
            addCriterion("time_to_result >", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultGreaterThanOrEqualTo(Long value) {
            addCriterion("time_to_result >=", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultLessThan(Long value) {
            addCriterion("time_to_result <", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultLessThanOrEqualTo(Long value) {
            addCriterion("time_to_result <=", value, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultIn(List<Long> values) {
            addCriterion("time_to_result in", values, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultNotIn(List<Long> values) {
            addCriterion("time_to_result not in", values, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultBetween(Long value1, Long value2) {
            addCriterion("time_to_result between", value1, value2, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeToResultNotBetween(Long value1, Long value2) {
            addCriterion("time_to_result not between", value1, value2, "timeToResult");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumIsNull() {
            addCriterion("time_quantum is null");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumIsNotNull() {
            addCriterion("time_quantum is not null");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumEqualTo(String value) {
            addCriterion("time_quantum =", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumNotEqualTo(String value) {
            addCriterion("time_quantum <>", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumGreaterThan(String value) {
            addCriterion("time_quantum >", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumGreaterThanOrEqualTo(String value) {
            addCriterion("time_quantum >=", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumLessThan(String value) {
            addCriterion("time_quantum <", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumLessThanOrEqualTo(String value) {
            addCriterion("time_quantum <=", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumLike(String value) {
            addCriterion("time_quantum like", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumNotLike(String value) {
            addCriterion("time_quantum not like", value, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumIn(List<String> values) {
            addCriterion("time_quantum in", values, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumNotIn(List<String> values) {
            addCriterion("time_quantum not in", values, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumBetween(String value1, String value2) {
            addCriterion("time_quantum between", value1, value2, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andTimeQuantumNotBetween(String value1, String value2) {
            addCriterion("time_quantum not between", value1, value2, "timeQuantum");
            return (Criteria) this;
        }

        public Criteria andIsReducedIsNull() {
            addCriterion("is_reduced is null");
            return (Criteria) this;
        }

        public Criteria andIsReducedIsNotNull() {
            addCriterion("is_reduced is not null");
            return (Criteria) this;
        }

        public Criteria andIsReducedEqualTo(Boolean value) {
            addCriterion("is_reduced =", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedNotEqualTo(Boolean value) {
            addCriterion("is_reduced <>", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedGreaterThan(Boolean value) {
            addCriterion("is_reduced >", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_reduced >=", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedLessThan(Boolean value) {
            addCriterion("is_reduced <", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_reduced <=", value, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedIn(List<Boolean> values) {
            addCriterion("is_reduced in", values, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedNotIn(List<Boolean> values) {
            addCriterion("is_reduced not in", values, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reduced between", value1, value2, "isReduced");
            return (Criteria) this;
        }

        public Criteria andIsReducedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reduced not between", value1, value2, "isReduced");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNull() {
            addCriterion("rent_status is null");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNotNull() {
            addCriterion("rent_status is not null");
            return (Criteria) this;
        }

        public Criteria andRentStatusEqualTo(Boolean value) {
            addCriterion("rent_status =", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotEqualTo(Boolean value) {
            addCriterion("rent_status <>", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThan(Boolean value) {
            addCriterion("rent_status >", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rent_status >=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThan(Boolean value) {
            addCriterion("rent_status <", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("rent_status <=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusIn(List<Boolean> values) {
            addCriterion("rent_status in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotIn(List<Boolean> values) {
            addCriterion("rent_status not in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("rent_status between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rent_status not between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNull() {
            addCriterion("push_type is null");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNotNull() {
            addCriterion("push_type is not null");
            return (Criteria) this;
        }

        public Criteria andPushTypeEqualTo(Boolean value) {
            addCriterion("push_type =", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotEqualTo(Boolean value) {
            addCriterion("push_type <>", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThan(Boolean value) {
            addCriterion("push_type >", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_type >=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThan(Boolean value) {
            addCriterion("push_type <", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("push_type <=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeIn(List<Boolean> values) {
            addCriterion("push_type in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotIn(List<Boolean> values) {
            addCriterion("push_type not in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("push_type between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_type not between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushContentIdIsNull() {
            addCriterion("push_content_id is null");
            return (Criteria) this;
        }

        public Criteria andPushContentIdIsNotNull() {
            addCriterion("push_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushContentIdEqualTo(Long value) {
            addCriterion("push_content_id =", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdNotEqualTo(Long value) {
            addCriterion("push_content_id <>", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdGreaterThan(Long value) {
            addCriterion("push_content_id >", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("push_content_id >=", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdLessThan(Long value) {
            addCriterion("push_content_id <", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdLessThanOrEqualTo(Long value) {
            addCriterion("push_content_id <=", value, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdIn(List<Long> values) {
            addCriterion("push_content_id in", values, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdNotIn(List<Long> values) {
            addCriterion("push_content_id not in", values, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdBetween(Long value1, Long value2) {
            addCriterion("push_content_id between", value1, value2, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIdNotBetween(Long value1, Long value2) {
            addCriterion("push_content_id not between", value1, value2, "pushContentId");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNull() {
            addCriterion("push_content is null");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNotNull() {
            addCriterion("push_content is not null");
            return (Criteria) this;
        }

        public Criteria andPushContentEqualTo(String value) {
            addCriterion("push_content =", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotEqualTo(String value) {
            addCriterion("push_content <>", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThan(String value) {
            addCriterion("push_content >", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThanOrEqualTo(String value) {
            addCriterion("push_content >=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThan(String value) {
            addCriterion("push_content <", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThanOrEqualTo(String value) {
            addCriterion("push_content <=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLike(String value) {
            addCriterion("push_content like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotLike(String value) {
            addCriterion("push_content not like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentIn(List<String> values) {
            addCriterion("push_content in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotIn(List<String> values) {
            addCriterion("push_content not in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentBetween(String value1, String value2) {
            addCriterion("push_content between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotBetween(String value1, String value2) {
            addCriterion("push_content not between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRentModeIsNull() {
            addCriterion("rent_mode is null");
            return (Criteria) this;
        }

        public Criteria andRentModeIsNotNull() {
            addCriterion("rent_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRentModeEqualTo(Short value) {
            addCriterion("rent_mode =", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeNotEqualTo(Short value) {
            addCriterion("rent_mode <>", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeGreaterThan(Short value) {
            addCriterion("rent_mode >", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeGreaterThanOrEqualTo(Short value) {
            addCriterion("rent_mode >=", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeLessThan(Short value) {
            addCriterion("rent_mode <", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeLessThanOrEqualTo(Short value) {
            addCriterion("rent_mode <=", value, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeIn(List<Short> values) {
            addCriterion("rent_mode in", values, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeNotIn(List<Short> values) {
            addCriterion("rent_mode not in", values, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeBetween(Short value1, Short value2) {
            addCriterion("rent_mode between", value1, value2, "rentMode");
            return (Criteria) this;
        }

        public Criteria andRentModeNotBetween(Short value1, Short value2) {
            addCriterion("rent_mode not between", value1, value2, "rentMode");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedIsNull() {
            addCriterion("staff_created is null");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedIsNotNull() {
            addCriterion("staff_created is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedEqualTo(String value) {
            addCriterion("staff_created =", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedNotEqualTo(String value) {
            addCriterion("staff_created <>", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedGreaterThan(String value) {
            addCriterion("staff_created >", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("staff_created >=", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedLessThan(String value) {
            addCriterion("staff_created <", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedLessThanOrEqualTo(String value) {
            addCriterion("staff_created <=", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedLike(String value) {
            addCriterion("staff_created like", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedNotLike(String value) {
            addCriterion("staff_created not like", value, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedIn(List<String> values) {
            addCriterion("staff_created in", values, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedNotIn(List<String> values) {
            addCriterion("staff_created not in", values, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedBetween(String value1, String value2) {
            addCriterion("staff_created between", value1, value2, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffCreatedNotBetween(String value1, String value2) {
            addCriterion("staff_created not between", value1, value2, "staffCreated");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedIsNull() {
            addCriterion("staff_modified is null");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedIsNotNull() {
            addCriterion("staff_modified is not null");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedEqualTo(String value) {
            addCriterion("staff_modified =", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedNotEqualTo(String value) {
            addCriterion("staff_modified <>", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedGreaterThan(String value) {
            addCriterion("staff_modified >", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("staff_modified >=", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedLessThan(String value) {
            addCriterion("staff_modified <", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedLessThanOrEqualTo(String value) {
            addCriterion("staff_modified <=", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedLike(String value) {
            addCriterion("staff_modified like", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedNotLike(String value) {
            addCriterion("staff_modified not like", value, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedIn(List<String> values) {
            addCriterion("staff_modified in", values, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedNotIn(List<String> values) {
            addCriterion("staff_modified not in", values, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedBetween(String value1, String value2) {
            addCriterion("staff_modified between", value1, value2, "staffModified");
            return (Criteria) this;
        }

        public Criteria andStaffModifiedNotBetween(String value1, String value2) {
            addCriterion("staff_modified not between", value1, value2, "staffModified");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
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