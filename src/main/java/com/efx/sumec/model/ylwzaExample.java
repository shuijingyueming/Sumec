package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class ylwzaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ylwzaExample() {
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

        public Criteria andWza001IsNull() {
            addCriterion("WZA001 is null");
            return (Criteria) this;
        }

        public Criteria andWza001IsNotNull() {
            addCriterion("WZA001 is not null");
            return (Criteria) this;
        }

        public Criteria andWza001EqualTo(Integer value) {
            addCriterion("WZA001 =", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001NotEqualTo(Integer value) {
            addCriterion("WZA001 <>", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001GreaterThan(Integer value) {
            addCriterion("WZA001 >", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZA001 >=", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001LessThan(Integer value) {
            addCriterion("WZA001 <", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001LessThanOrEqualTo(Integer value) {
            addCriterion("WZA001 <=", value, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001In(List<Integer> values) {
            addCriterion("WZA001 in", values, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001NotIn(List<Integer> values) {
            addCriterion("WZA001 not in", values, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001Between(Integer value1, Integer value2) {
            addCriterion("WZA001 between", value1, value2, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza001NotBetween(Integer value1, Integer value2) {
            addCriterion("WZA001 not between", value1, value2, "wza001");
            return (Criteria) this;
        }

        public Criteria andWza002IsNull() {
            addCriterion("WZA002 is null");
            return (Criteria) this;
        }

        public Criteria andWza002IsNotNull() {
            addCriterion("WZA002 is not null");
            return (Criteria) this;
        }

        public Criteria andWza002EqualTo(Integer value) {
            addCriterion("WZA002 =", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002NotEqualTo(Integer value) {
            addCriterion("WZA002 <>", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002GreaterThan(Integer value) {
            addCriterion("WZA002 >", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZA002 >=", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002LessThan(Integer value) {
            addCriterion("WZA002 <", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002LessThanOrEqualTo(Integer value) {
            addCriterion("WZA002 <=", value, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002In(List<Integer> values) {
            addCriterion("WZA002 in", values, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002NotIn(List<Integer> values) {
            addCriterion("WZA002 not in", values, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002Between(Integer value1, Integer value2) {
            addCriterion("WZA002 between", value1, value2, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza002NotBetween(Integer value1, Integer value2) {
            addCriterion("WZA002 not between", value1, value2, "wza002");
            return (Criteria) this;
        }

        public Criteria andWza003IsNull() {
            addCriterion("WZA003 is null");
            return (Criteria) this;
        }

        public Criteria andWza003IsNotNull() {
            addCriterion("WZA003 is not null");
            return (Criteria) this;
        }

        public Criteria andWza003EqualTo(Integer value) {
            addCriterion("WZA003 =", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003NotEqualTo(Integer value) {
            addCriterion("WZA003 <>", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003GreaterThan(Integer value) {
            addCriterion("WZA003 >", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZA003 >=", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003LessThan(Integer value) {
            addCriterion("WZA003 <", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003LessThanOrEqualTo(Integer value) {
            addCriterion("WZA003 <=", value, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003In(List<Integer> values) {
            addCriterion("WZA003 in", values, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003NotIn(List<Integer> values) {
            addCriterion("WZA003 not in", values, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003Between(Integer value1, Integer value2) {
            addCriterion("WZA003 between", value1, value2, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza003NotBetween(Integer value1, Integer value2) {
            addCriterion("WZA003 not between", value1, value2, "wza003");
            return (Criteria) this;
        }

        public Criteria andWza004IsNull() {
            addCriterion("WZA004 is null");
            return (Criteria) this;
        }

        public Criteria andWza004IsNotNull() {
            addCriterion("WZA004 is not null");
            return (Criteria) this;
        }

        public Criteria andWza004EqualTo(Integer value) {
            addCriterion("WZA004 =", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004NotEqualTo(Integer value) {
            addCriterion("WZA004 <>", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004GreaterThan(Integer value) {
            addCriterion("WZA004 >", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZA004 >=", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004LessThan(Integer value) {
            addCriterion("WZA004 <", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004LessThanOrEqualTo(Integer value) {
            addCriterion("WZA004 <=", value, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004In(List<Integer> values) {
            addCriterion("WZA004 in", values, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004NotIn(List<Integer> values) {
            addCriterion("WZA004 not in", values, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004Between(Integer value1, Integer value2) {
            addCriterion("WZA004 between", value1, value2, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza004NotBetween(Integer value1, Integer value2) {
            addCriterion("WZA004 not between", value1, value2, "wza004");
            return (Criteria) this;
        }

        public Criteria andWza005IsNull() {
            addCriterion("WZA005 is null");
            return (Criteria) this;
        }

        public Criteria andWza005IsNotNull() {
            addCriterion("WZA005 is not null");
            return (Criteria) this;
        }

        public Criteria andWza005EqualTo(String value) {
            addCriterion("WZA005 =", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005NotEqualTo(String value) {
            addCriterion("WZA005 <>", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005GreaterThan(String value) {
            addCriterion("WZA005 >", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005GreaterThanOrEqualTo(String value) {
            addCriterion("WZA005 >=", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005LessThan(String value) {
            addCriterion("WZA005 <", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005LessThanOrEqualTo(String value) {
            addCriterion("WZA005 <=", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005Like(String value) {
            addCriterion("WZA005 like", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005NotLike(String value) {
            addCriterion("WZA005 not like", value, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005In(List<String> values) {
            addCriterion("WZA005 in", values, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005NotIn(List<String> values) {
            addCriterion("WZA005 not in", values, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005Between(String value1, String value2) {
            addCriterion("WZA005 between", value1, value2, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza005NotBetween(String value1, String value2) {
            addCriterion("WZA005 not between", value1, value2, "wza005");
            return (Criteria) this;
        }

        public Criteria andWza006IsNull() {
            addCriterion("WZA006 is null");
            return (Criteria) this;
        }

        public Criteria andWza006IsNotNull() {
            addCriterion("WZA006 is not null");
            return (Criteria) this;
        }

        public Criteria andWza006EqualTo(String value) {
            addCriterion("WZA006 =", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006NotEqualTo(String value) {
            addCriterion("WZA006 <>", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006GreaterThan(String value) {
            addCriterion("WZA006 >", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006GreaterThanOrEqualTo(String value) {
            addCriterion("WZA006 >=", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006LessThan(String value) {
            addCriterion("WZA006 <", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006LessThanOrEqualTo(String value) {
            addCriterion("WZA006 <=", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006Like(String value) {
            addCriterion("WZA006 like", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006NotLike(String value) {
            addCriterion("WZA006 not like", value, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006In(List<String> values) {
            addCriterion("WZA006 in", values, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006NotIn(List<String> values) {
            addCriterion("WZA006 not in", values, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006Between(String value1, String value2) {
            addCriterion("WZA006 between", value1, value2, "wza006");
            return (Criteria) this;
        }

        public Criteria andWza006NotBetween(String value1, String value2) {
            addCriterion("WZA006 not between", value1, value2, "wza006");
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