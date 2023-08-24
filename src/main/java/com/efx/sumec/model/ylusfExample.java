package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class ylusfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ylusfExample() {
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

        public Criteria andUsf001IsNull() {
            addCriterion("USF001 is null");
            return (Criteria) this;
        }

        public Criteria andUsf001IsNotNull() {
            addCriterion("USF001 is not null");
            return (Criteria) this;
        }

        public Criteria andUsf001EqualTo(Integer value) {
            addCriterion("USF001 =", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001NotEqualTo(Integer value) {
            addCriterion("USF001 <>", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001GreaterThan(Integer value) {
            addCriterion("USF001 >", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001GreaterThanOrEqualTo(Integer value) {
            addCriterion("USF001 >=", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001LessThan(Integer value) {
            addCriterion("USF001 <", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001LessThanOrEqualTo(Integer value) {
            addCriterion("USF001 <=", value, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001In(List<Integer> values) {
            addCriterion("USF001 in", values, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001NotIn(List<Integer> values) {
            addCriterion("USF001 not in", values, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001Between(Integer value1, Integer value2) {
            addCriterion("USF001 between", value1, value2, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf001NotBetween(Integer value1, Integer value2) {
            addCriterion("USF001 not between", value1, value2, "usf001");
            return (Criteria) this;
        }

        public Criteria andUsf002IsNull() {
            addCriterion("USF002 is null");
            return (Criteria) this;
        }

        public Criteria andUsf002IsNotNull() {
            addCriterion("USF002 is not null");
            return (Criteria) this;
        }

        public Criteria andUsf002EqualTo(String value) {
            addCriterion("USF002 =", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002NotEqualTo(String value) {
            addCriterion("USF002 <>", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002GreaterThan(String value) {
            addCriterion("USF002 >", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002GreaterThanOrEqualTo(String value) {
            addCriterion("USF002 >=", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002LessThan(String value) {
            addCriterion("USF002 <", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002LessThanOrEqualTo(String value) {
            addCriterion("USF002 <=", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002Like(String value) {
            addCriterion("USF002 like", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002NotLike(String value) {
            addCriterion("USF002 not like", value, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002In(List<String> values) {
            addCriterion("USF002 in", values, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002NotIn(List<String> values) {
            addCriterion("USF002 not in", values, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002Between(String value1, String value2) {
            addCriterion("USF002 between", value1, value2, "usf002");
            return (Criteria) this;
        }

        public Criteria andUsf002NotBetween(String value1, String value2) {
            addCriterion("USF002 not between", value1, value2, "usf002");
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