package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackingListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackingListExample() {
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

        public Criteria andPackingListIdIsNull() {
            addCriterion("packing_list_id is null");
            return (Criteria) this;
        }

        public Criteria andPackingListIdIsNotNull() {
            addCriterion("packing_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackingListIdEqualTo(String value) {
            addCriterion("packing_list_id =", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotEqualTo(String value) {
            addCriterion("packing_list_id <>", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdGreaterThan(String value) {
            addCriterion("packing_list_id >", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdGreaterThanOrEqualTo(String value) {
            addCriterion("packing_list_id >=", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLessThan(String value) {
            addCriterion("packing_list_id <", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLessThanOrEqualTo(String value) {
            addCriterion("packing_list_id <=", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLike(String value) {
            addCriterion("packing_list_id like", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotLike(String value) {
            addCriterion("packing_list_id not like", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdIn(List<String> values) {
            addCriterion("packing_list_id in", values, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotIn(List<String> values) {
            addCriterion("packing_list_id not in", values, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdBetween(String value1, String value2) {
            addCriterion("packing_list_id between", value1, value2, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotBetween(String value1, String value2) {
            addCriterion("packing_list_id not between", value1, value2, "packingListId");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("invoice_date is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("invoice_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(Date value) {
            addCriterion("invoice_date =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(Date value) {
            addCriterion("invoice_date <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(Date value) {
            addCriterion("invoice_date >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_date >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(Date value) {
            addCriterion("invoice_date <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(Date value) {
            addCriterion("invoice_date <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<Date> values) {
            addCriterion("invoice_date in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<Date> values) {
            addCriterion("invoice_date not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(Date value1, Date value2) {
            addCriterion("invoice_date between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(Date value1, Date value2) {
            addCriterion("invoice_date not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("marks like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("marks not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNull() {
            addCriterion("descriptions is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNotNull() {
            addCriterion("descriptions is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsEqualTo(String value) {
            addCriterion("descriptions =", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotEqualTo(String value) {
            addCriterion("descriptions <>", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThan(String value) {
            addCriterion("descriptions >", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThanOrEqualTo(String value) {
            addCriterion("descriptions >=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThan(String value) {
            addCriterion("descriptions <", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThanOrEqualTo(String value) {
            addCriterion("descriptions <=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLike(String value) {
            addCriterion("descriptions like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotLike(String value) {
            addCriterion("descriptions not like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIn(List<String> values) {
            addCriterion("descriptions in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotIn(List<String> values) {
            addCriterion("descriptions not in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsBetween(String value1, String value2) {
            addCriterion("descriptions between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotBetween(String value1, String value2) {
            addCriterion("descriptions not between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andExportIdsIsNull() {
            addCriterion("export_ids is null");
            return (Criteria) this;
        }

        public Criteria andExportIdsIsNotNull() {
            addCriterion("export_ids is not null");
            return (Criteria) this;
        }

        public Criteria andExportIdsEqualTo(String value) {
            addCriterion("export_ids =", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsNotEqualTo(String value) {
            addCriterion("export_ids <>", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsGreaterThan(String value) {
            addCriterion("export_ids >", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsGreaterThanOrEqualTo(String value) {
            addCriterion("export_ids >=", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsLessThan(String value) {
            addCriterion("export_ids <", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsLessThanOrEqualTo(String value) {
            addCriterion("export_ids <=", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsLike(String value) {
            addCriterion("export_ids like", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsNotLike(String value) {
            addCriterion("export_ids not like", value, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsIn(List<String> values) {
            addCriterion("export_ids in", values, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsNotIn(List<String> values) {
            addCriterion("export_ids not in", values, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsBetween(String value1, String value2) {
            addCriterion("export_ids between", value1, value2, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportIdsNotBetween(String value1, String value2) {
            addCriterion("export_ids not between", value1, value2, "exportIds");
            return (Criteria) this;
        }

        public Criteria andExportNosIsNull() {
            addCriterion("export_nos is null");
            return (Criteria) this;
        }

        public Criteria andExportNosIsNotNull() {
            addCriterion("export_nos is not null");
            return (Criteria) this;
        }

        public Criteria andExportNosEqualTo(String value) {
            addCriterion("export_nos =", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosNotEqualTo(String value) {
            addCriterion("export_nos <>", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosGreaterThan(String value) {
            addCriterion("export_nos >", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosGreaterThanOrEqualTo(String value) {
            addCriterion("export_nos >=", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosLessThan(String value) {
            addCriterion("export_nos <", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosLessThanOrEqualTo(String value) {
            addCriterion("export_nos <=", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosLike(String value) {
            addCriterion("export_nos like", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosNotLike(String value) {
            addCriterion("export_nos not like", value, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosIn(List<String> values) {
            addCriterion("export_nos in", values, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosNotIn(List<String> values) {
            addCriterion("export_nos not in", values, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosBetween(String value1, String value2) {
            addCriterion("export_nos between", value1, value2, "exportNos");
            return (Criteria) this;
        }

        public Criteria andExportNosNotBetween(String value1, String value2) {
            addCriterion("export_nos not between", value1, value2, "exportNos");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNull() {
            addCriterion("create_dept is null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNotNull() {
            addCriterion("create_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptEqualTo(String value) {
            addCriterion("create_dept =", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotEqualTo(String value) {
            addCriterion("create_dept <>", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThan(String value) {
            addCriterion("create_dept >", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("create_dept >=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThan(String value) {
            addCriterion("create_dept <", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThanOrEqualTo(String value) {
            addCriterion("create_dept <=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLike(String value) {
            addCriterion("create_dept like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotLike(String value) {
            addCriterion("create_dept not like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIn(List<String> values) {
            addCriterion("create_dept in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotIn(List<String> values) {
            addCriterion("create_dept not in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptBetween(String value1, String value2) {
            addCriterion("create_dept between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotBetween(String value1, String value2) {
            addCriterion("create_dept not between", value1, value2, "createDept");
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