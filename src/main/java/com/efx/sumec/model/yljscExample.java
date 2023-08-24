package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class yljscExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public yljscExample() {
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

        public Criteria andJsc001IsNull() {
            addCriterion("JSC001 is null");
            return (Criteria) this;
        }

        public Criteria andJsc001IsNotNull() {
            addCriterion("JSC001 is not null");
            return (Criteria) this;
        }

        public Criteria andJsc001EqualTo(Integer value) {
            addCriterion("JSC001 =", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001NotEqualTo(Integer value) {
            addCriterion("JSC001 <>", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001GreaterThan(Integer value) {
            addCriterion("JSC001 >", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSC001 >=", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001LessThan(Integer value) {
            addCriterion("JSC001 <", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001LessThanOrEqualTo(Integer value) {
            addCriterion("JSC001 <=", value, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001In(List<Integer> values) {
            addCriterion("JSC001 in", values, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001NotIn(List<Integer> values) {
            addCriterion("JSC001 not in", values, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001Between(Integer value1, Integer value2) {
            addCriterion("JSC001 between", value1, value2, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc001NotBetween(Integer value1, Integer value2) {
            addCriterion("JSC001 not between", value1, value2, "jsc001");
            return (Criteria) this;
        }

        public Criteria andJsc002IsNull() {
            addCriterion("JSC002 is null");
            return (Criteria) this;
        }

        public Criteria andJsc002IsNotNull() {
            addCriterion("JSC002 is not null");
            return (Criteria) this;
        }

        public Criteria andJsc002EqualTo(Integer value) {
            addCriterion("JSC002 =", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002NotEqualTo(Integer value) {
            addCriterion("JSC002 <>", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002GreaterThan(Integer value) {
            addCriterion("JSC002 >", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSC002 >=", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002LessThan(Integer value) {
            addCriterion("JSC002 <", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002LessThanOrEqualTo(Integer value) {
            addCriterion("JSC002 <=", value, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002In(List<Integer> values) {
            addCriterion("JSC002 in", values, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002NotIn(List<Integer> values) {
            addCriterion("JSC002 not in", values, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002Between(Integer value1, Integer value2) {
            addCriterion("JSC002 between", value1, value2, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc002NotBetween(Integer value1, Integer value2) {
            addCriterion("JSC002 not between", value1, value2, "jsc002");
            return (Criteria) this;
        }

        public Criteria andJsc003IsNull() {
            addCriterion("JSC003 is null");
            return (Criteria) this;
        }

        public Criteria andJsc003IsNotNull() {
            addCriterion("JSC003 is not null");
            return (Criteria) this;
        }

        public Criteria andJsc003EqualTo(String value) {
            addCriterion("JSC003 =", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003NotEqualTo(String value) {
            addCriterion("JSC003 <>", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003GreaterThan(String value) {
            addCriterion("JSC003 >", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003GreaterThanOrEqualTo(String value) {
            addCriterion("JSC003 >=", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003LessThan(String value) {
            addCriterion("JSC003 <", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003LessThanOrEqualTo(String value) {
            addCriterion("JSC003 <=", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003Like(String value) {
            addCriterion("JSC003 like", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003NotLike(String value) {
            addCriterion("JSC003 not like", value, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003In(List<String> values) {
            addCriterion("JSC003 in", values, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003NotIn(List<String> values) {
            addCriterion("JSC003 not in", values, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003Between(String value1, String value2) {
            addCriterion("JSC003 between", value1, value2, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc003NotBetween(String value1, String value2) {
            addCriterion("JSC003 not between", value1, value2, "jsc003");
            return (Criteria) this;
        }

        public Criteria andJsc004IsNull() {
            addCriterion("JSC004 is null");
            return (Criteria) this;
        }

        public Criteria andJsc004IsNotNull() {
            addCriterion("JSC004 is not null");
            return (Criteria) this;
        }

        public Criteria andJsc004EqualTo(Integer value) {
            addCriterion("JSC004 =", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004NotEqualTo(Integer value) {
            addCriterion("JSC004 <>", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004GreaterThan(Integer value) {
            addCriterion("JSC004 >", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSC004 >=", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004LessThan(Integer value) {
            addCriterion("JSC004 <", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004LessThanOrEqualTo(Integer value) {
            addCriterion("JSC004 <=", value, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004In(List<Integer> values) {
            addCriterion("JSC004 in", values, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004NotIn(List<Integer> values) {
            addCriterion("JSC004 not in", values, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004Between(Integer value1, Integer value2) {
            addCriterion("JSC004 between", value1, value2, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc004NotBetween(Integer value1, Integer value2) {
            addCriterion("JSC004 not between", value1, value2, "jsc004");
            return (Criteria) this;
        }

        public Criteria andJsc005IsNull() {
            addCriterion("JSC005 is null");
            return (Criteria) this;
        }

        public Criteria andJsc005IsNotNull() {
            addCriterion("JSC005 is not null");
            return (Criteria) this;
        }

        public Criteria andJsc005EqualTo(String value) {
            addCriterion("JSC005 =", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005NotEqualTo(String value) {
            addCriterion("JSC005 <>", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005GreaterThan(String value) {
            addCriterion("JSC005 >", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005GreaterThanOrEqualTo(String value) {
            addCriterion("JSC005 >=", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005LessThan(String value) {
            addCriterion("JSC005 <", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005LessThanOrEqualTo(String value) {
            addCriterion("JSC005 <=", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005Like(String value) {
            addCriterion("JSC005 like", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005NotLike(String value) {
            addCriterion("JSC005 not like", value, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005In(List<String> values) {
            addCriterion("JSC005 in", values, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005NotIn(List<String> values) {
            addCriterion("JSC005 not in", values, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005Between(String value1, String value2) {
            addCriterion("JSC005 between", value1, value2, "jsc005");
            return (Criteria) this;
        }

        public Criteria andJsc005NotBetween(String value1, String value2) {
            addCriterion("JSC005 not between", value1, value2, "jsc005");
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