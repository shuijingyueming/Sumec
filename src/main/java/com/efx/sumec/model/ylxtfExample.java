package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class ylxtfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ylxtfExample() {
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

        public Criteria andXtf001IsNull() {
            addCriterion("XTF001 is null");
            return (Criteria) this;
        }

        public Criteria andXtf001IsNotNull() {
            addCriterion("XTF001 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf001EqualTo(Integer value) {
            addCriterion("XTF001 =", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001NotEqualTo(Integer value) {
            addCriterion("XTF001 <>", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001GreaterThan(Integer value) {
            addCriterion("XTF001 >", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001GreaterThanOrEqualTo(Integer value) {
            addCriterion("XTF001 >=", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001LessThan(Integer value) {
            addCriterion("XTF001 <", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001LessThanOrEqualTo(Integer value) {
            addCriterion("XTF001 <=", value, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001In(List<Integer> values) {
            addCriterion("XTF001 in", values, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001NotIn(List<Integer> values) {
            addCriterion("XTF001 not in", values, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001Between(Integer value1, Integer value2) {
            addCriterion("XTF001 between", value1, value2, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf001NotBetween(Integer value1, Integer value2) {
            addCriterion("XTF001 not between", value1, value2, "xtf001");
            return (Criteria) this;
        }

        public Criteria andXtf002IsNull() {
            addCriterion("XTF002 is null");
            return (Criteria) this;
        }

        public Criteria andXtf002IsNotNull() {
            addCriterion("XTF002 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf002EqualTo(String value) {
            addCriterion("XTF002 =", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002NotEqualTo(String value) {
            addCriterion("XTF002 <>", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002GreaterThan(String value) {
            addCriterion("XTF002 >", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002GreaterThanOrEqualTo(String value) {
            addCriterion("XTF002 >=", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002LessThan(String value) {
            addCriterion("XTF002 <", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002LessThanOrEqualTo(String value) {
            addCriterion("XTF002 <=", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002Like(String value) {
            addCriterion("XTF002 like", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002NotLike(String value) {
            addCriterion("XTF002 not like", value, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002In(List<String> values) {
            addCriterion("XTF002 in", values, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002NotIn(List<String> values) {
            addCriterion("XTF002 not in", values, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002Between(String value1, String value2) {
            addCriterion("XTF002 between", value1, value2, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf002NotBetween(String value1, String value2) {
            addCriterion("XTF002 not between", value1, value2, "xtf002");
            return (Criteria) this;
        }

        public Criteria andXtf003IsNull() {
            addCriterion("XTF003 is null");
            return (Criteria) this;
        }

        public Criteria andXtf003IsNotNull() {
            addCriterion("XTF003 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf003EqualTo(Integer value) {
            addCriterion("XTF003 =", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003NotEqualTo(Integer value) {
            addCriterion("XTF003 <>", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003GreaterThan(Integer value) {
            addCriterion("XTF003 >", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003GreaterThanOrEqualTo(Integer value) {
            addCriterion("XTF003 >=", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003LessThan(Integer value) {
            addCriterion("XTF003 <", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003LessThanOrEqualTo(Integer value) {
            addCriterion("XTF003 <=", value, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003In(List<Integer> values) {
            addCriterion("XTF003 in", values, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003NotIn(List<Integer> values) {
            addCriterion("XTF003 not in", values, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003Between(Integer value1, Integer value2) {
            addCriterion("XTF003 between", value1, value2, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf003NotBetween(Integer value1, Integer value2) {
            addCriterion("XTF003 not between", value1, value2, "xtf003");
            return (Criteria) this;
        }

        public Criteria andXtf004IsNull() {
            addCriterion("XTF004 is null");
            return (Criteria) this;
        }

        public Criteria andXtf004IsNotNull() {
            addCriterion("XTF004 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf004EqualTo(String value) {
            addCriterion("XTF004 =", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004NotEqualTo(String value) {
            addCriterion("XTF004 <>", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004GreaterThan(String value) {
            addCriterion("XTF004 >", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004GreaterThanOrEqualTo(String value) {
            addCriterion("XTF004 >=", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004LessThan(String value) {
            addCriterion("XTF004 <", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004LessThanOrEqualTo(String value) {
            addCriterion("XTF004 <=", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004Like(String value) {
            addCriterion("XTF004 like", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004NotLike(String value) {
            addCriterion("XTF004 not like", value, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004In(List<String> values) {
            addCriterion("XTF004 in", values, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004NotIn(List<String> values) {
            addCriterion("XTF004 not in", values, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004Between(String value1, String value2) {
            addCriterion("XTF004 between", value1, value2, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf004NotBetween(String value1, String value2) {
            addCriterion("XTF004 not between", value1, value2, "xtf004");
            return (Criteria) this;
        }

        public Criteria andXtf005IsNull() {
            addCriterion("XTF005 is null");
            return (Criteria) this;
        }

        public Criteria andXtf005IsNotNull() {
            addCriterion("XTF005 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf005EqualTo(Integer value) {
            addCriterion("XTF005 =", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005NotEqualTo(Integer value) {
            addCriterion("XTF005 <>", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005GreaterThan(Integer value) {
            addCriterion("XTF005 >", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005GreaterThanOrEqualTo(Integer value) {
            addCriterion("XTF005 >=", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005LessThan(Integer value) {
            addCriterion("XTF005 <", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005LessThanOrEqualTo(Integer value) {
            addCriterion("XTF005 <=", value, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005In(List<Integer> values) {
            addCriterion("XTF005 in", values, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005NotIn(List<Integer> values) {
            addCriterion("XTF005 not in", values, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005Between(Integer value1, Integer value2) {
            addCriterion("XTF005 between", value1, value2, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf005NotBetween(Integer value1, Integer value2) {
            addCriterion("XTF005 not between", value1, value2, "xtf005");
            return (Criteria) this;
        }

        public Criteria andXtf006IsNull() {
            addCriterion("XTF006 is null");
            return (Criteria) this;
        }

        public Criteria andXtf006IsNotNull() {
            addCriterion("XTF006 is not null");
            return (Criteria) this;
        }

        public Criteria andXtf006EqualTo(String value) {
            addCriterion("XTF006 =", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006NotEqualTo(String value) {
            addCriterion("XTF006 <>", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006GreaterThan(String value) {
            addCriterion("XTF006 >", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006GreaterThanOrEqualTo(String value) {
            addCriterion("XTF006 >=", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006LessThan(String value) {
            addCriterion("XTF006 <", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006LessThanOrEqualTo(String value) {
            addCriterion("XTF006 <=", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006Like(String value) {
            addCriterion("XTF006 like", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006NotLike(String value) {
            addCriterion("XTF006 not like", value, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006In(List<String> values) {
            addCriterion("XTF006 in", values, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006NotIn(List<String> values) {
            addCriterion("XTF006 not in", values, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006Between(String value1, String value2) {
            addCriterion("XTF006 between", value1, value2, "xtf006");
            return (Criteria) this;
        }

        public Criteria andXtf006NotBetween(String value1, String value2) {
            addCriterion("XTF006 not between", value1, value2, "xtf006");
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