package com.yihong.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InboundOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InboundOrderItemExample() {
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

        public Criteria andInboundOrderIdIsNull() {
            addCriterion("inbound_order_id is null");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdIsNotNull() {
            addCriterion("inbound_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdEqualTo(String value) {
            addCriterion("inbound_order_id =", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdNotEqualTo(String value) {
            addCriterion("inbound_order_id <>", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdGreaterThan(String value) {
            addCriterion("inbound_order_id >", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("inbound_order_id >=", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdLessThan(String value) {
            addCriterion("inbound_order_id <", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdLessThanOrEqualTo(String value) {
            addCriterion("inbound_order_id <=", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdLike(String value) {
            addCriterion("inbound_order_id like", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdNotLike(String value) {
            addCriterion("inbound_order_id not like", value, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdIn(List<String> values) {
            addCriterion("inbound_order_id in", values, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdNotIn(List<String> values) {
            addCriterion("inbound_order_id not in", values, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdBetween(String value1, String value2) {
            addCriterion("inbound_order_id between", value1, value2, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andInboundOrderIdNotBetween(String value1, String value2) {
            addCriterion("inbound_order_id not between", value1, value2, "inboundOrderId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityIsNull() {
            addCriterion("package_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityIsNotNull() {
            addCriterion("package_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityEqualTo(Integer value) {
            addCriterion("package_quantity =", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityNotEqualTo(Integer value) {
            addCriterion("package_quantity <>", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityGreaterThan(Integer value) {
            addCriterion("package_quantity >", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_quantity >=", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityLessThan(Integer value) {
            addCriterion("package_quantity <", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("package_quantity <=", value, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityIn(List<Integer> values) {
            addCriterion("package_quantity in", values, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityNotIn(List<Integer> values) {
            addCriterion("package_quantity not in", values, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityBetween(Integer value1, Integer value2) {
            addCriterion("package_quantity between", value1, value2, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("package_quantity not between", value1, value2, "packageQuantity");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIsNull() {
            addCriterion("package_length is null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIsNotNull() {
            addCriterion("package_length is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthEqualTo(BigDecimal value) {
            addCriterion("package_length =", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotEqualTo(BigDecimal value) {
            addCriterion("package_length <>", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthGreaterThan(BigDecimal value) {
            addCriterion("package_length >", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_length >=", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthLessThan(BigDecimal value) {
            addCriterion("package_length <", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_length <=", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIn(List<BigDecimal> values) {
            addCriterion("package_length in", values, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotIn(List<BigDecimal> values) {
            addCriterion("package_length not in", values, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_length between", value1, value2, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_length not between", value1, value2, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNull() {
            addCriterion("package_width is null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNotNull() {
            addCriterion("package_width is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthEqualTo(BigDecimal value) {
            addCriterion("package_width =", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotEqualTo(BigDecimal value) {
            addCriterion("package_width <>", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThan(BigDecimal value) {
            addCriterion("package_width >", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_width >=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThan(BigDecimal value) {
            addCriterion("package_width <", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_width <=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIn(List<BigDecimal> values) {
            addCriterion("package_width in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotIn(List<BigDecimal> values) {
            addCriterion("package_width not in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_width between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_width not between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIsNull() {
            addCriterion("package_height is null");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIsNotNull() {
            addCriterion("package_height is not null");
            return (Criteria) this;
        }

        public Criteria andPackageHeightEqualTo(BigDecimal value) {
            addCriterion("package_height =", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotEqualTo(BigDecimal value) {
            addCriterion("package_height <>", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightGreaterThan(BigDecimal value) {
            addCriterion("package_height >", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_height >=", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightLessThan(BigDecimal value) {
            addCriterion("package_height <", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_height <=", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIn(List<BigDecimal> values) {
            addCriterion("package_height in", values, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotIn(List<BigDecimal> values) {
            addCriterion("package_height not in", values, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_height between", value1, value2, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_height not between", value1, value2, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNull() {
            addCriterion("package_weight is null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNotNull() {
            addCriterion("package_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightEqualTo(BigDecimal value) {
            addCriterion("package_weight =", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotEqualTo(BigDecimal value) {
            addCriterion("package_weight <>", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThan(BigDecimal value) {
            addCriterion("package_weight >", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_weight >=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThan(BigDecimal value) {
            addCriterion("package_weight <", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_weight <=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIn(List<BigDecimal> values) {
            addCriterion("package_weight in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotIn(List<BigDecimal> values) {
            addCriterion("package_weight not in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_weight between", value1, value2, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_weight not between", value1, value2, "packageWeight");
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