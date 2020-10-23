package org.xinjing.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOcountIsNull() {
            addCriterion("ocount is null");
            return (Criteria) this;
        }

        public Criteria andOcountIsNotNull() {
            addCriterion("ocount is not null");
            return (Criteria) this;
        }

        public Criteria andOcountEqualTo(Integer value) {
            addCriterion("ocount =", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotEqualTo(Integer value) {
            addCriterion("ocount <>", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThan(Integer value) {
            addCriterion("ocount >", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocount >=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThan(Integer value) {
            addCriterion("ocount <", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThanOrEqualTo(Integer value) {
            addCriterion("ocount <=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountIn(List<Integer> values) {
            addCriterion("ocount in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotIn(List<Integer> values) {
            addCriterion("ocount not in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountBetween(Integer value1, Integer value2) {
            addCriterion("ocount between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ocount not between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOamountStatusIsNull() {
            addCriterion("oamount_status is null");
            return (Criteria) this;
        }

        public Criteria andOamountStatusIsNotNull() {
            addCriterion("oamount_status is not null");
            return (Criteria) this;
        }

        public Criteria andOamountStatusEqualTo(Integer value) {
            addCriterion("oamount_status =", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusNotEqualTo(Integer value) {
            addCriterion("oamount_status <>", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusGreaterThan(Integer value) {
            addCriterion("oamount_status >", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oamount_status >=", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusLessThan(Integer value) {
            addCriterion("oamount_status <", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oamount_status <=", value, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusIn(List<Integer> values) {
            addCriterion("oamount_status in", values, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusNotIn(List<Integer> values) {
            addCriterion("oamount_status not in", values, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusBetween(Integer value1, Integer value2) {
            addCriterion("oamount_status between", value1, value2, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andOamountStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oamount_status not between", value1, value2, "oamountStatus");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNull() {
            addCriterion("receivename is null");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNotNull() {
            addCriterion("receivename is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenameEqualTo(String value) {
            addCriterion("receivename =", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotEqualTo(String value) {
            addCriterion("receivename <>", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThan(String value) {
            addCriterion("receivename >", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThanOrEqualTo(String value) {
            addCriterion("receivename >=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThan(String value) {
            addCriterion("receivename <", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThanOrEqualTo(String value) {
            addCriterion("receivename <=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLike(String value) {
            addCriterion("receivename like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotLike(String value) {
            addCriterion("receivename not like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameIn(List<String> values) {
            addCriterion("receivename in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotIn(List<String> values) {
            addCriterion("receivename not in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameBetween(String value1, String value2) {
            addCriterion("receivename between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotBetween(String value1, String value2) {
            addCriterion("receivename not between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNull() {
            addCriterion("receiveaddress is null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNotNull() {
            addCriterion("receiveaddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressEqualTo(String value) {
            addCriterion("receiveaddress =", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotEqualTo(String value) {
            addCriterion("receiveaddress <>", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThan(String value) {
            addCriterion("receiveaddress >", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiveaddress >=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThan(String value) {
            addCriterion("receiveaddress <", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("receiveaddress <=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLike(String value) {
            addCriterion("receiveaddress like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotLike(String value) {
            addCriterion("receiveaddress not like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIn(List<String> values) {
            addCriterion("receiveaddress in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotIn(List<String> values) {
            addCriterion("receiveaddress not in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressBetween(String value1, String value2) {
            addCriterion("receiveaddress between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("receiveaddress not between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceivetelIsNull() {
            addCriterion("receivetel is null");
            return (Criteria) this;
        }

        public Criteria andReceivetelIsNotNull() {
            addCriterion("receivetel is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetelEqualTo(String value) {
            addCriterion("receivetel =", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotEqualTo(String value) {
            addCriterion("receivetel <>", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelGreaterThan(String value) {
            addCriterion("receivetel >", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelGreaterThanOrEqualTo(String value) {
            addCriterion("receivetel >=", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLessThan(String value) {
            addCriterion("receivetel <", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLessThanOrEqualTo(String value) {
            addCriterion("receivetel <=", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLike(String value) {
            addCriterion("receivetel like", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotLike(String value) {
            addCriterion("receivetel not like", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelIn(List<String> values) {
            addCriterion("receivetel in", values, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotIn(List<String> values) {
            addCriterion("receivetel not in", values, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelBetween(String value1, String value2) {
            addCriterion("receivetel between", value1, value2, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotBetween(String value1, String value2) {
            addCriterion("receivetel not between", value1, value2, "receivetel");
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

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andFcidIsNull() {
            addCriterion("fcid is null");
            return (Criteria) this;
        }

        public Criteria andFcidIsNotNull() {
            addCriterion("fcid is not null");
            return (Criteria) this;
        }

        public Criteria andFcidEqualTo(Integer value) {
            addCriterion("fcid =", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidNotEqualTo(Integer value) {
            addCriterion("fcid <>", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidGreaterThan(Integer value) {
            addCriterion("fcid >", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcid >=", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidLessThan(Integer value) {
            addCriterion("fcid <", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidLessThanOrEqualTo(Integer value) {
            addCriterion("fcid <=", value, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidIn(List<Integer> values) {
            addCriterion("fcid in", values, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidNotIn(List<Integer> values) {
            addCriterion("fcid not in", values, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidBetween(Integer value1, Integer value2) {
            addCriterion("fcid between", value1, value2, "fcid");
            return (Criteria) this;
        }

        public Criteria andFcidNotBetween(Integer value1, Integer value2) {
            addCriterion("fcid not between", value1, value2, "fcid");
            return (Criteria) this;
        }

        public Criteria andFpidIsNull() {
            addCriterion("fpid is null");
            return (Criteria) this;
        }

        public Criteria andFpidIsNotNull() {
            addCriterion("fpid is not null");
            return (Criteria) this;
        }

        public Criteria andFpidEqualTo(Integer value) {
            addCriterion("fpid =", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotEqualTo(Integer value) {
            addCriterion("fpid <>", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThan(Integer value) {
            addCriterion("fpid >", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fpid >=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThan(Integer value) {
            addCriterion("fpid <", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThanOrEqualTo(Integer value) {
            addCriterion("fpid <=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidIn(List<Integer> values) {
            addCriterion("fpid in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotIn(List<Integer> values) {
            addCriterion("fpid not in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidBetween(Integer value1, Integer value2) {
            addCriterion("fpid between", value1, value2, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotBetween(Integer value1, Integer value2) {
            addCriterion("fpid not between", value1, value2, "fpid");
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