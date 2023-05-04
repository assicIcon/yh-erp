package com.yihong.approval.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalConfigExample() {
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

        public Criteria andApprovalConfigIdIsNull() {
            addCriterion("approval_config_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdIsNotNull() {
            addCriterion("approval_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdEqualTo(String value) {
            addCriterion("approval_config_id =", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdNotEqualTo(String value) {
            addCriterion("approval_config_id <>", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdGreaterThan(String value) {
            addCriterion("approval_config_id >", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("approval_config_id >=", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdLessThan(String value) {
            addCriterion("approval_config_id <", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdLessThanOrEqualTo(String value) {
            addCriterion("approval_config_id <=", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdLike(String value) {
            addCriterion("approval_config_id like", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdNotLike(String value) {
            addCriterion("approval_config_id not like", value, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdIn(List<String> values) {
            addCriterion("approval_config_id in", values, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdNotIn(List<String> values) {
            addCriterion("approval_config_id not in", values, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdBetween(String value1, String value2) {
            addCriterion("approval_config_id between", value1, value2, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigIdNotBetween(String value1, String value2) {
            addCriterion("approval_config_id not between", value1, value2, "approvalConfigId");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameIsNull() {
            addCriterion("approval_config_name is null");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameIsNotNull() {
            addCriterion("approval_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameEqualTo(String value) {
            addCriterion("approval_config_name =", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameNotEqualTo(String value) {
            addCriterion("approval_config_name <>", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameGreaterThan(String value) {
            addCriterion("approval_config_name >", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_config_name >=", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameLessThan(String value) {
            addCriterion("approval_config_name <", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameLessThanOrEqualTo(String value) {
            addCriterion("approval_config_name <=", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameLike(String value) {
            addCriterion("approval_config_name like", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameNotLike(String value) {
            addCriterion("approval_config_name not like", value, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameIn(List<String> values) {
            addCriterion("approval_config_name in", values, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameNotIn(List<String> values) {
            addCriterion("approval_config_name not in", values, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameBetween(String value1, String value2) {
            addCriterion("approval_config_name between", value1, value2, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andApprovalConfigNameNotBetween(String value1, String value2) {
            addCriterion("approval_config_name not between", value1, value2, "approvalConfigName");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(Byte value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(Byte value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(Byte value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(Byte value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(Byte value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(Byte value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<Byte> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<Byte> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(Byte value1, Byte value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(Byte value1, Byte value2) {
            addCriterion("notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andCcTypeIsNull() {
            addCriterion("cc_type is null");
            return (Criteria) this;
        }

        public Criteria andCcTypeIsNotNull() {
            addCriterion("cc_type is not null");
            return (Criteria) this;
        }

        public Criteria andCcTypeEqualTo(Byte value) {
            addCriterion("cc_type =", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeNotEqualTo(Byte value) {
            addCriterion("cc_type <>", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeGreaterThan(Byte value) {
            addCriterion("cc_type >", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cc_type >=", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeLessThan(Byte value) {
            addCriterion("cc_type <", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cc_type <=", value, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeIn(List<Byte> values) {
            addCriterion("cc_type in", values, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeNotIn(List<Byte> values) {
            addCriterion("cc_type not in", values, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeBetween(Byte value1, Byte value2) {
            addCriterion("cc_type between", value1, value2, "ccType");
            return (Criteria) this;
        }

        public Criteria andCcTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cc_type not between", value1, value2, "ccType");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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