package com.yihong.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseInventoryExample() {
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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

        public Criteria andPlanQuantityIsNull() {
            addCriterion("plan_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityIsNotNull() {
            addCriterion("plan_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityEqualTo(Long value) {
            addCriterion("plan_quantity =", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotEqualTo(Long value) {
            addCriterion("plan_quantity <>", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityGreaterThan(Long value) {
            addCriterion("plan_quantity >", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_quantity >=", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityLessThan(Long value) {
            addCriterion("plan_quantity <", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityLessThanOrEqualTo(Long value) {
            addCriterion("plan_quantity <=", value, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityIn(List<Long> values) {
            addCriterion("plan_quantity in", values, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotIn(List<Long> values) {
            addCriterion("plan_quantity not in", values, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityBetween(Long value1, Long value2) {
            addCriterion("plan_quantity between", value1, value2, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andPlanQuantityNotBetween(Long value1, Long value2) {
            addCriterion("plan_quantity not between", value1, value2, "planQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityIsNull() {
            addCriterion("product_quantity is null");
            return (Criteria) this;
        }

        public Criteria andProductQuantityIsNotNull() {
            addCriterion("product_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andProductQuantityEqualTo(Long value) {
            addCriterion("product_quantity =", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotEqualTo(Long value) {
            addCriterion("product_quantity <>", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityGreaterThan(Long value) {
            addCriterion("product_quantity >", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("product_quantity >=", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityLessThan(Long value) {
            addCriterion("product_quantity <", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityLessThanOrEqualTo(Long value) {
            addCriterion("product_quantity <=", value, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityIn(List<Long> values) {
            addCriterion("product_quantity in", values, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotIn(List<Long> values) {
            addCriterion("product_quantity not in", values, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityBetween(Long value1, Long value2) {
            addCriterion("product_quantity between", value1, value2, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andProductQuantityNotBetween(Long value1, Long value2) {
            addCriterion("product_quantity not between", value1, value2, "productQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityIsNull() {
            addCriterion("in_transit_quantity is null");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityIsNotNull() {
            addCriterion("in_transit_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityEqualTo(Long value) {
            addCriterion("in_transit_quantity =", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityNotEqualTo(Long value) {
            addCriterion("in_transit_quantity <>", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityGreaterThan(Long value) {
            addCriterion("in_transit_quantity >", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("in_transit_quantity >=", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityLessThan(Long value) {
            addCriterion("in_transit_quantity <", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityLessThanOrEqualTo(Long value) {
            addCriterion("in_transit_quantity <=", value, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityIn(List<Long> values) {
            addCriterion("in_transit_quantity in", values, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityNotIn(List<Long> values) {
            addCriterion("in_transit_quantity not in", values, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityBetween(Long value1, Long value2) {
            addCriterion("in_transit_quantity between", value1, value2, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInTransitQuantityNotBetween(Long value1, Long value2) {
            addCriterion("in_transit_quantity not between", value1, value2, "inTransitQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityIsNull() {
            addCriterion("inbound_quantity is null");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityIsNotNull() {
            addCriterion("inbound_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityEqualTo(Long value) {
            addCriterion("inbound_quantity =", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityNotEqualTo(Long value) {
            addCriterion("inbound_quantity <>", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityGreaterThan(Long value) {
            addCriterion("inbound_quantity >", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("inbound_quantity >=", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityLessThan(Long value) {
            addCriterion("inbound_quantity <", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityLessThanOrEqualTo(Long value) {
            addCriterion("inbound_quantity <=", value, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityIn(List<Long> values) {
            addCriterion("inbound_quantity in", values, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityNotIn(List<Long> values) {
            addCriterion("inbound_quantity not in", values, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityBetween(Long value1, Long value2) {
            addCriterion("inbound_quantity between", value1, value2, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andInboundQuantityNotBetween(Long value1, Long value2) {
            addCriterion("inbound_quantity not between", value1, value2, "inboundQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityIsNull() {
            addCriterion("lock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andLockQuantityIsNotNull() {
            addCriterion("lock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andLockQuantityEqualTo(Long value) {
            addCriterion("lock_quantity =", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityNotEqualTo(Long value) {
            addCriterion("lock_quantity <>", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityGreaterThan(Long value) {
            addCriterion("lock_quantity >", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("lock_quantity >=", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityLessThan(Long value) {
            addCriterion("lock_quantity <", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityLessThanOrEqualTo(Long value) {
            addCriterion("lock_quantity <=", value, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityIn(List<Long> values) {
            addCriterion("lock_quantity in", values, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityNotIn(List<Long> values) {
            addCriterion("lock_quantity not in", values, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityBetween(Long value1, Long value2) {
            addCriterion("lock_quantity between", value1, value2, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andLockQuantityNotBetween(Long value1, Long value2) {
            addCriterion("lock_quantity not between", value1, value2, "lockQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIsNull() {
            addCriterion("available_quantity is null");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIsNotNull() {
            addCriterion("available_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityEqualTo(Long value) {
            addCriterion("available_quantity =", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotEqualTo(Long value) {
            addCriterion("available_quantity <>", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityGreaterThan(Long value) {
            addCriterion("available_quantity >", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("available_quantity >=", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityLessThan(Long value) {
            addCriterion("available_quantity <", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityLessThanOrEqualTo(Long value) {
            addCriterion("available_quantity <=", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIn(List<Long> values) {
            addCriterion("available_quantity in", values, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotIn(List<Long> values) {
            addCriterion("available_quantity not in", values, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityBetween(Long value1, Long value2) {
            addCriterion("available_quantity between", value1, value2, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotBetween(Long value1, Long value2) {
            addCriterion("available_quantity not between", value1, value2, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIsNull() {
            addCriterion("bad_quantity is null");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIsNotNull() {
            addCriterion("bad_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andBadQuantityEqualTo(Long value) {
            addCriterion("bad_quantity =", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotEqualTo(Long value) {
            addCriterion("bad_quantity <>", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityGreaterThan(Long value) {
            addCriterion("bad_quantity >", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("bad_quantity >=", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityLessThan(Long value) {
            addCriterion("bad_quantity <", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityLessThanOrEqualTo(Long value) {
            addCriterion("bad_quantity <=", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIn(List<Long> values) {
            addCriterion("bad_quantity in", values, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotIn(List<Long> values) {
            addCriterion("bad_quantity not in", values, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityBetween(Long value1, Long value2) {
            addCriterion("bad_quantity between", value1, value2, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotBetween(Long value1, Long value2) {
            addCriterion("bad_quantity not between", value1, value2, "badQuantity");
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