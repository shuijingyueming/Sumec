package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.List;

public class yljsdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public yljsdExample() {
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

        public Criteria andJsd001IsNull() {
            addCriterion("JSD001 is null");
            return (Criteria) this;
        }

        public Criteria andJsd001IsNotNull() {
            addCriterion("JSD001 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd001EqualTo(Integer value) {
            addCriterion("JSD001 =", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001NotEqualTo(Integer value) {
            addCriterion("JSD001 <>", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001GreaterThan(Integer value) {
            addCriterion("JSD001 >", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSD001 >=", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001LessThan(Integer value) {
            addCriterion("JSD001 <", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001LessThanOrEqualTo(Integer value) {
            addCriterion("JSD001 <=", value, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001In(List<Integer> values) {
            addCriterion("JSD001 in", values, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001NotIn(List<Integer> values) {
            addCriterion("JSD001 not in", values, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001Between(Integer value1, Integer value2) {
            addCriterion("JSD001 between", value1, value2, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd001NotBetween(Integer value1, Integer value2) {
            addCriterion("JSD001 not between", value1, value2, "jsd001");
            return (Criteria) this;
        }

        public Criteria andJsd002IsNull() {
            addCriterion("JSD002 is null");
            return (Criteria) this;
        }

        public Criteria andJsd002IsNotNull() {
            addCriterion("JSD002 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd002EqualTo(String value) {
            addCriterion("JSD002 =", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002NotEqualTo(String value) {
            addCriterion("JSD002 <>", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002GreaterThan(String value) {
            addCriterion("JSD002 >", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002GreaterThanOrEqualTo(String value) {
            addCriterion("JSD002 >=", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002LessThan(String value) {
            addCriterion("JSD002 <", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002LessThanOrEqualTo(String value) {
            addCriterion("JSD002 <=", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002Like(String value) {
            addCriterion("JSD002 like", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002NotLike(String value) {
            addCriterion("JSD002 not like", value, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002In(List<String> values) {
            addCriterion("JSD002 in", values, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002NotIn(List<String> values) {
            addCriterion("JSD002 not in", values, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002Between(String value1, String value2) {
            addCriterion("JSD002 between", value1, value2, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd002NotBetween(String value1, String value2) {
            addCriterion("JSD002 not between", value1, value2, "jsd002");
            return (Criteria) this;
        }

        public Criteria andJsd003IsNull() {
            addCriterion("JSD003 is null");
            return (Criteria) this;
        }

        public Criteria andJsd003IsNotNull() {
            addCriterion("JSD003 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd003EqualTo(String value) {
            addCriterion("JSD003 =", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003NotEqualTo(String value) {
            addCriterion("JSD003 <>", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003GreaterThan(String value) {
            addCriterion("JSD003 >", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003GreaterThanOrEqualTo(String value) {
            addCriterion("JSD003 >=", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003LessThan(String value) {
            addCriterion("JSD003 <", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003LessThanOrEqualTo(String value) {
            addCriterion("JSD003 <=", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003Like(String value) {
            addCriterion("JSD003 like", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003NotLike(String value) {
            addCriterion("JSD003 not like", value, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003In(List<String> values) {
            addCriterion("JSD003 in", values, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003NotIn(List<String> values) {
            addCriterion("JSD003 not in", values, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003Between(String value1, String value2) {
            addCriterion("JSD003 between", value1, value2, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd003NotBetween(String value1, String value2) {
            addCriterion("JSD003 not between", value1, value2, "jsd003");
            return (Criteria) this;
        }

        public Criteria andJsd004IsNull() {
            addCriterion("JSD004 is null");
            return (Criteria) this;
        }

        public Criteria andJsd004IsNotNull() {
            addCriterion("JSD004 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd004EqualTo(Integer value) {
            addCriterion("JSD004 =", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004NotEqualTo(Integer value) {
            addCriterion("JSD004 <>", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004GreaterThan(Integer value) {
            addCriterion("JSD004 >", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSD004 >=", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004LessThan(Integer value) {
            addCriterion("JSD004 <", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004LessThanOrEqualTo(Integer value) {
            addCriterion("JSD004 <=", value, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004In(List<Integer> values) {
            addCriterion("JSD004 in", values, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004NotIn(List<Integer> values) {
            addCriterion("JSD004 not in", values, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004Between(Integer value1, Integer value2) {
            addCriterion("JSD004 between", value1, value2, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd004NotBetween(Integer value1, Integer value2) {
            addCriterion("JSD004 not between", value1, value2, "jsd004");
            return (Criteria) this;
        }

        public Criteria andJsd005IsNull() {
            addCriterion("JSD005 is null");
            return (Criteria) this;
        }

        public Criteria andJsd005IsNotNull() {
            addCriterion("JSD005 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd005EqualTo(String value) {
            addCriterion("JSD005 =", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005NotEqualTo(String value) {
            addCriterion("JSD005 <>", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005GreaterThan(String value) {
            addCriterion("JSD005 >", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005GreaterThanOrEqualTo(String value) {
            addCriterion("JSD005 >=", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005LessThan(String value) {
            addCriterion("JSD005 <", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005LessThanOrEqualTo(String value) {
            addCriterion("JSD005 <=", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005Like(String value) {
            addCriterion("JSD005 like", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005NotLike(String value) {
            addCriterion("JSD005 not like", value, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005In(List<String> values) {
            addCriterion("JSD005 in", values, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005NotIn(List<String> values) {
            addCriterion("JSD005 not in", values, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005Between(String value1, String value2) {
            addCriterion("JSD005 between", value1, value2, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd005NotBetween(String value1, String value2) {
            addCriterion("JSD005 not between", value1, value2, "jsd005");
            return (Criteria) this;
        }

        public Criteria andJsd006IsNull() {
            addCriterion("JSD006 is null");
            return (Criteria) this;
        }

        public Criteria andJsd006IsNotNull() {
            addCriterion("JSD006 is not null");
            return (Criteria) this;
        }

        public Criteria andJsd006EqualTo(String value) {
            addCriterion("JSD006 =", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006NotEqualTo(String value) {
            addCriterion("JSD006 <>", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006GreaterThan(String value) {
            addCriterion("JSD006 >", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006GreaterThanOrEqualTo(String value) {
            addCriterion("JSD006 >=", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006LessThan(String value) {
            addCriterion("JSD006 <", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006LessThanOrEqualTo(String value) {
            addCriterion("JSD006 <=", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006Like(String value) {
            addCriterion("JSD006 like", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006NotLike(String value) {
            addCriterion("JSD006 not like", value, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006In(List<String> values) {
            addCriterion("JSD006 in", values, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006NotIn(List<String> values) {
            addCriterion("JSD006 not in", values, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006Between(String value1, String value2) {
            addCriterion("JSD006 between", value1, value2, "jsd006");
            return (Criteria) this;
        }

        public Criteria andJsd006NotBetween(String value1, String value2) {
            addCriterion("JSD006 not between", value1, value2, "jsd006");
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