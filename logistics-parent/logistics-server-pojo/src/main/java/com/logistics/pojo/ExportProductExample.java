package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExportProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportProductExample() {
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

        public Criteria andExportProductIdIsNull() {
            addCriterion("export_product_id is null");
            return (Criteria) this;
        }

        public Criteria andExportProductIdIsNotNull() {
            addCriterion("export_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportProductIdEqualTo(String value) {
            addCriterion("export_product_id =", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdNotEqualTo(String value) {
            addCriterion("export_product_id <>", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdGreaterThan(String value) {
            addCriterion("export_product_id >", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("export_product_id >=", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdLessThan(String value) {
            addCriterion("export_product_id <", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdLessThanOrEqualTo(String value) {
            addCriterion("export_product_id <=", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdLike(String value) {
            addCriterion("export_product_id like", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdNotLike(String value) {
            addCriterion("export_product_id not like", value, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdIn(List<String> values) {
            addCriterion("export_product_id in", values, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdNotIn(List<String> values) {
            addCriterion("export_product_id not in", values, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdBetween(String value1, String value2) {
            addCriterion("export_product_id between", value1, value2, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportProductIdNotBetween(String value1, String value2) {
            addCriterion("export_product_id not between", value1, value2, "exportProductId");
            return (Criteria) this;
        }

        public Criteria andExportIdIsNull() {
            addCriterion("export_id is null");
            return (Criteria) this;
        }

        public Criteria andExportIdIsNotNull() {
            addCriterion("export_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportIdEqualTo(String value) {
            addCriterion("export_id =", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotEqualTo(String value) {
            addCriterion("export_id <>", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThan(String value) {
            addCriterion("export_id >", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThanOrEqualTo(String value) {
            addCriterion("export_id >=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThan(String value) {
            addCriterion("export_id <", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThanOrEqualTo(String value) {
            addCriterion("export_id <=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLike(String value) {
            addCriterion("export_id like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotLike(String value) {
            addCriterion("export_id not like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdIn(List<String> values) {
            addCriterion("export_id in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotIn(List<String> values) {
            addCriterion("export_id not in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdBetween(String value1, String value2) {
            addCriterion("export_id between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotBetween(String value1, String value2) {
            addCriterion("export_id not between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("factory_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("factory_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(String value) {
            addCriterion("factory_id =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(String value) {
            addCriterion("factory_id <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(String value) {
            addCriterion("factory_id >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("factory_id >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(String value) {
            addCriterion("factory_id <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(String value) {
            addCriterion("factory_id <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLike(String value) {
            addCriterion("factory_id like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotLike(String value) {
            addCriterion("factory_id not like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<String> values) {
            addCriterion("factory_id in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<String> values) {
            addCriterion("factory_id not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(String value1, String value2) {
            addCriterion("factory_id between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(String value1, String value2) {
            addCriterion("factory_id not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("packing_unit is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("packing_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("packing_unit =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("packing_unit <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("packing_unit >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("packing_unit >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("packing_unit <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("packing_unit <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("packing_unit like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("packing_unit not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("packing_unit in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("packing_unit not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("packing_unit between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("packing_unit not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("cnumber is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("cnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Long value) {
            addCriterion("cnumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Long value) {
            addCriterion("cnumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Long value) {
            addCriterion("cnumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("cnumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Long value) {
            addCriterion("cnumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Long value) {
            addCriterion("cnumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Long> values) {
            addCriterion("cnumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Long> values) {
            addCriterion("cnumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Long value1, Long value2) {
            addCriterion("cnumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Long value1, Long value2) {
            addCriterion("cnumber not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNull() {
            addCriterion("box_num is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNotNull() {
            addCriterion("box_num is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumEqualTo(Long value) {
            addCriterion("box_num =", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotEqualTo(Long value) {
            addCriterion("box_num <>", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThan(Long value) {
            addCriterion("box_num >", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThanOrEqualTo(Long value) {
            addCriterion("box_num >=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThan(Long value) {
            addCriterion("box_num <", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThanOrEqualTo(Long value) {
            addCriterion("box_num <=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumIn(List<Long> values) {
            addCriterion("box_num in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotIn(List<Long> values) {
            addCriterion("box_num not in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumBetween(Long value1, Long value2) {
            addCriterion("box_num between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotBetween(Long value1, Long value2) {
            addCriterion("box_num not between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(Double value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(Double value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(Double value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(Double value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(Double value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<Double> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<Double> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(Double value1, Double value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(Double value1, Double value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("net_weight is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("net_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(Double value) {
            addCriterion("net_weight =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(Double value) {
            addCriterion("net_weight <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(Double value) {
            addCriterion("net_weight >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("net_weight >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(Double value) {
            addCriterion("net_weight <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(Double value) {
            addCriterion("net_weight <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<Double> values) {
            addCriterion("net_weight in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<Double> values) {
            addCriterion("net_weight not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(Double value1, Double value2) {
            addCriterion("net_weight between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(Double value1, Double value2) {
            addCriterion("net_weight not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNull() {
            addCriterion("size_length is null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNotNull() {
            addCriterion("size_length is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthEqualTo(Double value) {
            addCriterion("size_length =", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotEqualTo(Double value) {
            addCriterion("size_length <>", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThan(Double value) {
            addCriterion("size_length >", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("size_length >=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThan(Double value) {
            addCriterion("size_length <", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThanOrEqualTo(Double value) {
            addCriterion("size_length <=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIn(List<Double> values) {
            addCriterion("size_length in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotIn(List<Double> values) {
            addCriterion("size_length not in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthBetween(Double value1, Double value2) {
            addCriterion("size_length between", value1, value2, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotBetween(Double value1, Double value2) {
            addCriterion("size_length not between", value1, value2, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNull() {
            addCriterion("size_width is null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNotNull() {
            addCriterion("size_width is not null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthEqualTo(Double value) {
            addCriterion("size_width =", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotEqualTo(Double value) {
            addCriterion("size_width <>", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThan(Double value) {
            addCriterion("size_width >", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("size_width >=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThan(Double value) {
            addCriterion("size_width <", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThanOrEqualTo(Double value) {
            addCriterion("size_width <=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIn(List<Double> values) {
            addCriterion("size_width in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotIn(List<Double> values) {
            addCriterion("size_width not in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthBetween(Double value1, Double value2) {
            addCriterion("size_width between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotBetween(Double value1, Double value2) {
            addCriterion("size_width not between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNull() {
            addCriterion("size_height is null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNotNull() {
            addCriterion("size_height is not null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightEqualTo(Double value) {
            addCriterion("size_height =", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotEqualTo(Double value) {
            addCriterion("size_height <>", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThan(Double value) {
            addCriterion("size_height >", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("size_height >=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThan(Double value) {
            addCriterion("size_height <", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThanOrEqualTo(Double value) {
            addCriterion("size_height <=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIn(List<Double> values) {
            addCriterion("size_height in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotIn(List<Double> values) {
            addCriterion("size_height not in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightBetween(Double value1, Double value2) {
            addCriterion("size_height between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotBetween(Double value1, Double value2) {
            addCriterion("size_height not between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNull() {
            addCriterion("ex_price is null");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNotNull() {
            addCriterion("ex_price is not null");
            return (Criteria) this;
        }

        public Criteria andExPriceEqualTo(Double value) {
            addCriterion("ex_price =", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotEqualTo(Double value) {
            addCriterion("ex_price <>", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThan(Double value) {
            addCriterion("ex_price >", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ex_price >=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThan(Double value) {
            addCriterion("ex_price <", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThanOrEqualTo(Double value) {
            addCriterion("ex_price <=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceIn(List<Double> values) {
            addCriterion("ex_price in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotIn(List<Double> values) {
            addCriterion("ex_price not in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceBetween(Double value1, Double value2) {
            addCriterion("ex_price between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotBetween(Double value1, Double value2) {
            addCriterion("ex_price not between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Double value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Double value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Double value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Double value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Double value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Double> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Double> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Double value1, Double value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Double value1, Double value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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