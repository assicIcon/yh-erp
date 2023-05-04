package com.yihong.product.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSkuCustomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSkuCustomsExample() {
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

        public Criteria andCustomsIdIsNull() {
            addCriterion("customs_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomsIdIsNotNull() {
            addCriterion("customs_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsIdEqualTo(String value) {
            addCriterion("customs_id =", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdNotEqualTo(String value) {
            addCriterion("customs_id <>", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdGreaterThan(String value) {
            addCriterion("customs_id >", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdGreaterThanOrEqualTo(String value) {
            addCriterion("customs_id >=", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdLessThan(String value) {
            addCriterion("customs_id <", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdLessThanOrEqualTo(String value) {
            addCriterion("customs_id <=", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdLike(String value) {
            addCriterion("customs_id like", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdNotLike(String value) {
            addCriterion("customs_id not like", value, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdIn(List<String> values) {
            addCriterion("customs_id in", values, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdNotIn(List<String> values) {
            addCriterion("customs_id not in", values, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdBetween(String value1, String value2) {
            addCriterion("customs_id between", value1, value2, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsIdNotBetween(String value1, String value2) {
            addCriterion("customs_id not between", value1, value2, "customsId");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnIsNull() {
            addCriterion("customs_name_cn is null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnIsNotNull() {
            addCriterion("customs_name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnEqualTo(String value) {
            addCriterion("customs_name_cn =", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnNotEqualTo(String value) {
            addCriterion("customs_name_cn <>", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnGreaterThan(String value) {
            addCriterion("customs_name_cn >", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("customs_name_cn >=", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnLessThan(String value) {
            addCriterion("customs_name_cn <", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnLessThanOrEqualTo(String value) {
            addCriterion("customs_name_cn <=", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnLike(String value) {
            addCriterion("customs_name_cn like", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnNotLike(String value) {
            addCriterion("customs_name_cn not like", value, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnIn(List<String> values) {
            addCriterion("customs_name_cn in", values, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnNotIn(List<String> values) {
            addCriterion("customs_name_cn not in", values, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnBetween(String value1, String value2) {
            addCriterion("customs_name_cn between", value1, value2, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameCnNotBetween(String value1, String value2) {
            addCriterion("customs_name_cn not between", value1, value2, "customsNameCn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnIsNull() {
            addCriterion("customs_name_en is null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnIsNotNull() {
            addCriterion("customs_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnEqualTo(String value) {
            addCriterion("customs_name_en =", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnNotEqualTo(String value) {
            addCriterion("customs_name_en <>", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnGreaterThan(String value) {
            addCriterion("customs_name_en >", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("customs_name_en >=", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnLessThan(String value) {
            addCriterion("customs_name_en <", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnLessThanOrEqualTo(String value) {
            addCriterion("customs_name_en <=", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnLike(String value) {
            addCriterion("customs_name_en like", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnNotLike(String value) {
            addCriterion("customs_name_en not like", value, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnIn(List<String> values) {
            addCriterion("customs_name_en in", values, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnNotIn(List<String> values) {
            addCriterion("customs_name_en not in", values, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnBetween(String value1, String value2) {
            addCriterion("customs_name_en between", value1, value2, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEnNotBetween(String value1, String value2) {
            addCriterion("customs_name_en not between", value1, value2, "customsNameEn");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceIsNull() {
            addCriterion("chinese_invoice is null");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceIsNotNull() {
            addCriterion("chinese_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceEqualTo(String value) {
            addCriterion("chinese_invoice =", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceNotEqualTo(String value) {
            addCriterion("chinese_invoice <>", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceGreaterThan(String value) {
            addCriterion("chinese_invoice >", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_invoice >=", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceLessThan(String value) {
            addCriterion("chinese_invoice <", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceLessThanOrEqualTo(String value) {
            addCriterion("chinese_invoice <=", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceLike(String value) {
            addCriterion("chinese_invoice like", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceNotLike(String value) {
            addCriterion("chinese_invoice not like", value, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceIn(List<String> values) {
            addCriterion("chinese_invoice in", values, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceNotIn(List<String> values) {
            addCriterion("chinese_invoice not in", values, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceBetween(String value1, String value2) {
            addCriterion("chinese_invoice between", value1, value2, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andChineseInvoiceNotBetween(String value1, String value2) {
            addCriterion("chinese_invoice not between", value1, value2, "chineseInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceIsNull() {
            addCriterion("overseas_invoice is null");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceIsNotNull() {
            addCriterion("overseas_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceEqualTo(String value) {
            addCriterion("overseas_invoice =", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceNotEqualTo(String value) {
            addCriterion("overseas_invoice <>", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceGreaterThan(String value) {
            addCriterion("overseas_invoice >", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("overseas_invoice >=", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceLessThan(String value) {
            addCriterion("overseas_invoice <", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceLessThanOrEqualTo(String value) {
            addCriterion("overseas_invoice <=", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceLike(String value) {
            addCriterion("overseas_invoice like", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceNotLike(String value) {
            addCriterion("overseas_invoice not like", value, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceIn(List<String> values) {
            addCriterion("overseas_invoice in", values, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceNotIn(List<String> values) {
            addCriterion("overseas_invoice not in", values, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceBetween(String value1, String value2) {
            addCriterion("overseas_invoice between", value1, value2, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andOverseasInvoiceNotBetween(String value1, String value2) {
            addCriterion("overseas_invoice not between", value1, value2, "overseasInvoice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceIsNull() {
            addCriterion("declaration_price is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceIsNotNull() {
            addCriterion("declaration_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceEqualTo(BigDecimal value) {
            addCriterion("declaration_price =", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceNotEqualTo(BigDecimal value) {
            addCriterion("declaration_price <>", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceGreaterThan(BigDecimal value) {
            addCriterion("declaration_price >", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("declaration_price >=", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceLessThan(BigDecimal value) {
            addCriterion("declaration_price <", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("declaration_price <=", value, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceIn(List<BigDecimal> values) {
            addCriterion("declaration_price in", values, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceNotIn(List<BigDecimal> values) {
            addCriterion("declaration_price not in", values, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("declaration_price between", value1, value2, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andDeclarationPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("declaration_price not between", value1, value2, "declarationPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceIsNull() {
            addCriterion("custom_clearance_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceIsNotNull() {
            addCriterion("custom_clearance_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceEqualTo(BigDecimal value) {
            addCriterion("custom_clearance_unit_price =", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("custom_clearance_unit_price <>", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("custom_clearance_unit_price >", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_clearance_unit_price >=", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceLessThan(BigDecimal value) {
            addCriterion("custom_clearance_unit_price <", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_clearance_unit_price <=", value, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceIn(List<BigDecimal> values) {
            addCriterion("custom_clearance_unit_price in", values, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("custom_clearance_unit_price not in", values, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_clearance_unit_price between", value1, value2, "customClearanceUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCustomClearanceUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_clearance_unit_price not between", value1, value2, "customClearanceUnitPrice");
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