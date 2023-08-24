package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class ylwzbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ylwzbExample() {
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

        public Criteria andWzb001IsNull() {
            addCriterion("WZB001 is null");
            return (Criteria) this;
        }

        public Criteria andWzb001IsNotNull() {
            addCriterion("WZB001 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb001EqualTo(Integer value) {
            addCriterion("WZB001 =", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001NotEqualTo(Integer value) {
            addCriterion("WZB001 <>", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001GreaterThan(Integer value) {
            addCriterion("WZB001 >", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZB001 >=", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001LessThan(Integer value) {
            addCriterion("WZB001 <", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001LessThanOrEqualTo(Integer value) {
            addCriterion("WZB001 <=", value, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001In(List<Integer> values) {
            addCriterion("WZB001 in", values, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001NotIn(List<Integer> values) {
            addCriterion("WZB001 not in", values, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001Between(Integer value1, Integer value2) {
            addCriterion("WZB001 between", value1, value2, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb001NotBetween(Integer value1, Integer value2) {
            addCriterion("WZB001 not between", value1, value2, "wzb001");
            return (Criteria) this;
        }

        public Criteria andWzb002IsNull() {
            addCriterion("WZB002 is null");
            return (Criteria) this;
        }

        public Criteria andWzb002IsNotNull() {
            addCriterion("WZB002 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb002EqualTo(String value) {
            addCriterion("WZB002 =", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002NotEqualTo(String value) {
            addCriterion("WZB002 <>", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002GreaterThan(String value) {
            addCriterion("WZB002 >", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002GreaterThanOrEqualTo(String value) {
            addCriterion("WZB002 >=", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002LessThan(String value) {
            addCriterion("WZB002 <", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002LessThanOrEqualTo(String value) {
            addCriterion("WZB002 <=", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002Like(String value) {
            addCriterion("WZB002 like", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002NotLike(String value) {
            addCriterion("WZB002 not like", value, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002In(List<String> values) {
            addCriterion("WZB002 in", values, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002NotIn(List<String> values) {
            addCriterion("WZB002 not in", values, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002Between(String value1, String value2) {
            addCriterion("WZB002 between", value1, value2, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb002NotBetween(String value1, String value2) {
            addCriterion("WZB002 not between", value1, value2, "wzb002");
            return (Criteria) this;
        }

        public Criteria andWzb003IsNull() {
            addCriterion("WZB003 is null");
            return (Criteria) this;
        }

        public Criteria andWzb003IsNotNull() {
            addCriterion("WZB003 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb003EqualTo(Integer value) {
            addCriterion("WZB003 =", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003NotEqualTo(Integer value) {
            addCriterion("WZB003 <>", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003GreaterThan(Integer value) {
            addCriterion("WZB003 >", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZB003 >=", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003LessThan(Integer value) {
            addCriterion("WZB003 <", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003LessThanOrEqualTo(Integer value) {
            addCriterion("WZB003 <=", value, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003In(List<Integer> values) {
            addCriterion("WZB003 in", values, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003NotIn(List<Integer> values) {
            addCriterion("WZB003 not in", values, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003Between(Integer value1, Integer value2) {
            addCriterion("WZB003 between", value1, value2, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb003NotBetween(Integer value1, Integer value2) {
            addCriterion("WZB003 not between", value1, value2, "wzb003");
            return (Criteria) this;
        }

        public Criteria andWzb004IsNull() {
            addCriterion("WZB004 is null");
            return (Criteria) this;
        }

        public Criteria andWzb004IsNotNull() {
            addCriterion("WZB004 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb004EqualTo(String value) {
            addCriterion("WZB004 =", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004NotEqualTo(String value) {
            addCriterion("WZB004 <>", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004GreaterThan(String value) {
            addCriterion("WZB004 >", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004GreaterThanOrEqualTo(String value) {
            addCriterion("WZB004 >=", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004LessThan(String value) {
            addCriterion("WZB004 <", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004LessThanOrEqualTo(String value) {
            addCriterion("WZB004 <=", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004Like(String value) {
            addCriterion("WZB004 like", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004NotLike(String value) {
            addCriterion("WZB004 not like", value, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004In(List<String> values) {
            addCriterion("WZB004 in", values, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004NotIn(List<String> values) {
            addCriterion("WZB004 not in", values, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004Between(String value1, String value2) {
            addCriterion("WZB004 between", value1, value2, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb004NotBetween(String value1, String value2) {
            addCriterion("WZB004 not between", value1, value2, "wzb004");
            return (Criteria) this;
        }

        public Criteria andWzb005IsNull() {
            addCriterion("WZB005 is null");
            return (Criteria) this;
        }

        public Criteria andWzb005IsNotNull() {
            addCriterion("WZB005 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb005EqualTo(Integer value) {
            addCriterion("WZB005 =", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005NotEqualTo(Integer value) {
            addCriterion("WZB005 <>", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005GreaterThan(Integer value) {
            addCriterion("WZB005 >", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005GreaterThanOrEqualTo(Integer value) {
            addCriterion("WZB005 >=", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005LessThan(Integer value) {
            addCriterion("WZB005 <", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005LessThanOrEqualTo(Integer value) {
            addCriterion("WZB005 <=", value, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005In(List<Integer> values) {
            addCriterion("WZB005 in", values, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005NotIn(List<Integer> values) {
            addCriterion("WZB005 not in", values, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005Between(Integer value1, Integer value2) {
            addCriterion("WZB005 between", value1, value2, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb005NotBetween(Integer value1, Integer value2) {
            addCriterion("WZB005 not between", value1, value2, "wzb005");
            return (Criteria) this;
        }

        public Criteria andWzb006IsNull() {
            addCriterion("WZB006 is null");
            return (Criteria) this;
        }

        public Criteria andWzb006IsNotNull() {
            addCriterion("WZB006 is not null");
            return (Criteria) this;
        }

        public Criteria andWzb006EqualTo(String value) {
            addCriterion("WZB006 =", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006NotEqualTo(String value) {
            addCriterion("WZB006 <>", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006GreaterThan(String value) {
            addCriterion("WZB006 >", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006GreaterThanOrEqualTo(String value) {
            addCriterion("WZB006 >=", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006LessThan(String value) {
            addCriterion("WZB006 <", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006LessThanOrEqualTo(String value) {
            addCriterion("WZB006 <=", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006Like(String value) {
            addCriterion("WZB006 like", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006NotLike(String value) {
            addCriterion("WZB006 not like", value, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006In(List<String> values) {
            addCriterion("WZB006 in", values, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006NotIn(List<String> values) {
            addCriterion("WZB006 not in", values, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006Between(String value1, String value2) {
            addCriterion("WZB006 between", value1, value2, "wzb006");
            return (Criteria) this;
        }

        public Criteria andWzb006NotBetween(String value1, String value2) {
            addCriterion("WZB006 not between", value1, value2, "wzb006");
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