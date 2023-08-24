package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class yljseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public yljseExample() {
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

        public Criteria andJse001IsNull() {
            addCriterion("JSE001 is null");
            return (Criteria) this;
        }

        public Criteria andJse001IsNotNull() {
            addCriterion("JSE001 is not null");
            return (Criteria) this;
        }

        public Criteria andJse001EqualTo(Integer value) {
            addCriterion("JSE001 =", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001NotEqualTo(Integer value) {
            addCriterion("JSE001 <>", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001GreaterThan(Integer value) {
            addCriterion("JSE001 >", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSE001 >=", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001LessThan(Integer value) {
            addCriterion("JSE001 <", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001LessThanOrEqualTo(Integer value) {
            addCriterion("JSE001 <=", value, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001In(List<Integer> values) {
            addCriterion("JSE001 in", values, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001NotIn(List<Integer> values) {
            addCriterion("JSE001 not in", values, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001Between(Integer value1, Integer value2) {
            addCriterion("JSE001 between", value1, value2, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse001NotBetween(Integer value1, Integer value2) {
            addCriterion("JSE001 not between", value1, value2, "jse001");
            return (Criteria) this;
        }

        public Criteria andJse002IsNull() {
            addCriterion("JSE002 is null");
            return (Criteria) this;
        }

        public Criteria andJse002IsNotNull() {
            addCriterion("JSE002 is not null");
            return (Criteria) this;
        }

        public Criteria andJse002EqualTo(String value) {
            addCriterion("JSE002 =", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002NotEqualTo(String value) {
            addCriterion("JSE002 <>", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002GreaterThan(String value) {
            addCriterion("JSE002 >", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002GreaterThanOrEqualTo(String value) {
            addCriterion("JSE002 >=", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002LessThan(String value) {
            addCriterion("JSE002 <", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002LessThanOrEqualTo(String value) {
            addCriterion("JSE002 <=", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002Like(String value) {
            addCriterion("JSE002 like", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002NotLike(String value) {
            addCriterion("JSE002 not like", value, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002In(List<String> values) {
            addCriterion("JSE002 in", values, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002NotIn(List<String> values) {
            addCriterion("JSE002 not in", values, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002Between(String value1, String value2) {
            addCriterion("JSE002 between", value1, value2, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse002NotBetween(String value1, String value2) {
            addCriterion("JSE002 not between", value1, value2, "jse002");
            return (Criteria) this;
        }

        public Criteria andJse003IsNull() {
            addCriterion("JSE003 is null");
            return (Criteria) this;
        }

        public Criteria andJse003IsNotNull() {
            addCriterion("JSE003 is not null");
            return (Criteria) this;
        }

        public Criteria andJse003EqualTo(String value) {
            addCriterion("JSE003 =", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003NotEqualTo(String value) {
            addCriterion("JSE003 <>", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003GreaterThan(String value) {
            addCriterion("JSE003 >", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003GreaterThanOrEqualTo(String value) {
            addCriterion("JSE003 >=", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003LessThan(String value) {
            addCriterion("JSE003 <", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003LessThanOrEqualTo(String value) {
            addCriterion("JSE003 <=", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003Like(String value) {
            addCriterion("JSE003 like", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003NotLike(String value) {
            addCriterion("JSE003 not like", value, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003In(List<String> values) {
            addCriterion("JSE003 in", values, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003NotIn(List<String> values) {
            addCriterion("JSE003 not in", values, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003Between(String value1, String value2) {
            addCriterion("JSE003 between", value1, value2, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse003NotBetween(String value1, String value2) {
            addCriterion("JSE003 not between", value1, value2, "jse003");
            return (Criteria) this;
        }

        public Criteria andJse004IsNull() {
            addCriterion("JSE004 is null");
            return (Criteria) this;
        }

        public Criteria andJse004IsNotNull() {
            addCriterion("JSE004 is not null");
            return (Criteria) this;
        }

        public Criteria andJse004EqualTo(String value) {
            addCriterion("JSE004 =", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004NotEqualTo(String value) {
            addCriterion("JSE004 <>", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004GreaterThan(String value) {
            addCriterion("JSE004 >", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004GreaterThanOrEqualTo(String value) {
            addCriterion("JSE004 >=", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004LessThan(String value) {
            addCriterion("JSE004 <", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004LessThanOrEqualTo(String value) {
            addCriterion("JSE004 <=", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004Like(String value) {
            addCriterion("JSE004 like", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004NotLike(String value) {
            addCriterion("JSE004 not like", value, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004In(List<String> values) {
            addCriterion("JSE004 in", values, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004NotIn(List<String> values) {
            addCriterion("JSE004 not in", values, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004Between(String value1, String value2) {
            addCriterion("JSE004 between", value1, value2, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse004NotBetween(String value1, String value2) {
            addCriterion("JSE004 not between", value1, value2, "jse004");
            return (Criteria) this;
        }

        public Criteria andJse005IsNull() {
            addCriterion("JSE005 is null");
            return (Criteria) this;
        }

        public Criteria andJse005IsNotNull() {
            addCriterion("JSE005 is not null");
            return (Criteria) this;
        }

        public Criteria andJse005EqualTo(Integer value) {
            addCriterion("JSE005 =", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005NotEqualTo(Integer value) {
            addCriterion("JSE005 <>", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005GreaterThan(Integer value) {
            addCriterion("JSE005 >", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSE005 >=", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005LessThan(Integer value) {
            addCriterion("JSE005 <", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005LessThanOrEqualTo(Integer value) {
            addCriterion("JSE005 <=", value, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005In(List<Integer> values) {
            addCriterion("JSE005 in", values, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005NotIn(List<Integer> values) {
            addCriterion("JSE005 not in", values, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005Between(Integer value1, Integer value2) {
            addCriterion("JSE005 between", value1, value2, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse005NotBetween(Integer value1, Integer value2) {
            addCriterion("JSE005 not between", value1, value2, "jse005");
            return (Criteria) this;
        }

        public Criteria andJse006IsNull() {
            addCriterion("JSE006 is null");
            return (Criteria) this;
        }

        public Criteria andJse006IsNotNull() {
            addCriterion("JSE006 is not null");
            return (Criteria) this;
        }

        public Criteria andJse006EqualTo(Date value) {
            addCriterion("JSE006 =", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006NotEqualTo(Date value) {
            addCriterion("JSE006 <>", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006GreaterThan(Date value) {
            addCriterion("JSE006 >", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006GreaterThanOrEqualTo(Date value) {
            addCriterion("JSE006 >=", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006LessThan(Date value) {
            addCriterion("JSE006 <", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006LessThanOrEqualTo(Date value) {
            addCriterion("JSE006 <=", value, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006In(List<Date> values) {
            addCriterion("JSE006 in", values, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006NotIn(List<Date> values) {
            addCriterion("JSE006 not in", values, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006Between(Date value1, Date value2) {
            addCriterion("JSE006 between", value1, value2, "jse006");
            return (Criteria) this;
        }

        public Criteria andJse006NotBetween(Date value1, Date value2) {
            addCriterion("JSE006 not between", value1, value2, "jse006");
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