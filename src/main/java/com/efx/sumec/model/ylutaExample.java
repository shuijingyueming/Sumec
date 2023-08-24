package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ylutaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ylutaExample() {
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

        public Criteria andUta001IsNull() {
            addCriterion("UTA001 is null");
            return (Criteria) this;
        }

        public Criteria andUta001IsNotNull() {
            addCriterion("UTA001 is not null");
            return (Criteria) this;
        }

        public Criteria andUta001EqualTo(String value) {
            addCriterion("UTA001 =", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001NotEqualTo(String value) {
            addCriterion("UTA001 <>", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001GreaterThan(String value) {
            addCriterion("UTA001 >", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001GreaterThanOrEqualTo(String value) {
            addCriterion("UTA001 >=", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001LessThan(String value) {
            addCriterion("UTA001 <", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001LessThanOrEqualTo(String value) {
            addCriterion("UTA001 <=", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001Like(String value) {
            addCriterion("UTA001 like", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001NotLike(String value) {
            addCriterion("UTA001 not like", value, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001In(List<String> values) {
            addCriterion("UTA001 in", values, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001NotIn(List<String> values) {
            addCriterion("UTA001 not in", values, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001Between(String value1, String value2) {
            addCriterion("UTA001 between", value1, value2, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta001NotBetween(String value1, String value2) {
            addCriterion("UTA001 not between", value1, value2, "uta001");
            return (Criteria) this;
        }

        public Criteria andUta002IsNull() {
            addCriterion("UTA002 is null");
            return (Criteria) this;
        }

        public Criteria andUta002IsNotNull() {
            addCriterion("UTA002 is not null");
            return (Criteria) this;
        }

        public Criteria andUta002EqualTo(String value) {
            addCriterion("UTA002 =", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002NotEqualTo(String value) {
            addCriterion("UTA002 <>", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002GreaterThan(String value) {
            addCriterion("UTA002 >", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002GreaterThanOrEqualTo(String value) {
            addCriterion("UTA002 >=", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002LessThan(String value) {
            addCriterion("UTA002 <", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002LessThanOrEqualTo(String value) {
            addCriterion("UTA002 <=", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002Like(String value) {
            addCriterion("UTA002 like", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002NotLike(String value) {
            addCriterion("UTA002 not like", value, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002In(List<String> values) {
            addCriterion("UTA002 in", values, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002NotIn(List<String> values) {
            addCriterion("UTA002 not in", values, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002Between(String value1, String value2) {
            addCriterion("UTA002 between", value1, value2, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta002NotBetween(String value1, String value2) {
            addCriterion("UTA002 not between", value1, value2, "uta002");
            return (Criteria) this;
        }

        public Criteria andUta003IsNull() {
            addCriterion("UTA003 is null");
            return (Criteria) this;
        }

        public Criteria andUta003IsNotNull() {
            addCriterion("UTA003 is not null");
            return (Criteria) this;
        }

        public Criteria andUta003EqualTo(Integer value) {
            addCriterion("UTA003 =", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003NotEqualTo(Integer value) {
            addCriterion("UTA003 <>", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003GreaterThan(Integer value) {
            addCriterion("UTA003 >", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003GreaterThanOrEqualTo(Integer value) {
            addCriterion("UTA003 >=", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003LessThan(Integer value) {
            addCriterion("UTA003 <", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003LessThanOrEqualTo(Integer value) {
            addCriterion("UTA003 <=", value, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003In(List<Integer> values) {
            addCriterion("UTA003 in", values, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003NotIn(List<Integer> values) {
            addCriterion("UTA003 not in", values, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003Between(Integer value1, Integer value2) {
            addCriterion("UTA003 between", value1, value2, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta003NotBetween(Integer value1, Integer value2) {
            addCriterion("UTA003 not between", value1, value2, "uta003");
            return (Criteria) this;
        }

        public Criteria andUta004IsNull() {
            addCriterion("UTA004 is null");
            return (Criteria) this;
        }

        public Criteria andUta004IsNotNull() {
            addCriterion("UTA004 is not null");
            return (Criteria) this;
        }

        public Criteria andUta004EqualTo(String value) {
            addCriterion("UTA004 =", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004NotEqualTo(String value) {
            addCriterion("UTA004 <>", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004GreaterThan(String value) {
            addCriterion("UTA004 >", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004GreaterThanOrEqualTo(String value) {
            addCriterion("UTA004 >=", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004LessThan(String value) {
            addCriterion("UTA004 <", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004LessThanOrEqualTo(String value) {
            addCriterion("UTA004 <=", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004Like(String value) {
            addCriterion("UTA004 like", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004NotLike(String value) {
            addCriterion("UTA004 not like", value, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004In(List<String> values) {
            addCriterion("UTA004 in", values, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004NotIn(List<String> values) {
            addCriterion("UTA004 not in", values, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004Between(String value1, String value2) {
            addCriterion("UTA004 between", value1, value2, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta004NotBetween(String value1, String value2) {
            addCriterion("UTA004 not between", value1, value2, "uta004");
            return (Criteria) this;
        }

        public Criteria andUta005IsNull() {
            addCriterion("UTA005 is null");
            return (Criteria) this;
        }

        public Criteria andUta005IsNotNull() {
            addCriterion("UTA005 is not null");
            return (Criteria) this;
        }

        public Criteria andUta005EqualTo(String value) {
            addCriterion("UTA005 =", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005NotEqualTo(String value) {
            addCriterion("UTA005 <>", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005GreaterThan(String value) {
            addCriterion("UTA005 >", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005GreaterThanOrEqualTo(String value) {
            addCriterion("UTA005 >=", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005LessThan(String value) {
            addCriterion("UTA005 <", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005LessThanOrEqualTo(String value) {
            addCriterion("UTA005 <=", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005Like(String value) {
            addCriterion("UTA005 like", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005NotLike(String value) {
            addCriterion("UTA005 not like", value, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005In(List<String> values) {
            addCriterion("UTA005 in", values, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005NotIn(List<String> values) {
            addCriterion("UTA005 not in", values, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005Between(String value1, String value2) {
            addCriterion("UTA005 between", value1, value2, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta005NotBetween(String value1, String value2) {
            addCriterion("UTA005 not between", value1, value2, "uta005");
            return (Criteria) this;
        }

        public Criteria andUta006IsNull() {
            addCriterion("UTA006 is null");
            return (Criteria) this;
        }

        public Criteria andUta006IsNotNull() {
            addCriterion("UTA006 is not null");
            return (Criteria) this;
        }

        public Criteria andUta006EqualTo(Date value) {
            addCriterion("UTA006 =", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006NotEqualTo(Date value) {
            addCriterion("UTA006 <>", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006GreaterThan(Date value) {
            addCriterion("UTA006 >", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006GreaterThanOrEqualTo(Date value) {
            addCriterion("UTA006 >=", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006LessThan(Date value) {
            addCriterion("UTA006 <", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006LessThanOrEqualTo(Date value) {
            addCriterion("UTA006 <=", value, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006In(List<Date> values) {
            addCriterion("UTA006 in", values, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006NotIn(List<Date> values) {
            addCriterion("UTA006 not in", values, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006Between(Date value1, Date value2) {
            addCriterion("UTA006 between", value1, value2, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta006NotBetween(Date value1, Date value2) {
            addCriterion("UTA006 not between", value1, value2, "uta006");
            return (Criteria) this;
        }

        public Criteria andUta007IsNull() {
            addCriterion("UTA007 is null");
            return (Criteria) this;
        }

        public Criteria andUta007IsNotNull() {
            addCriterion("UTA007 is not null");
            return (Criteria) this;
        }

        public Criteria andUta007EqualTo(String value) {
            addCriterion("UTA007 =", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007NotEqualTo(String value) {
            addCriterion("UTA007 <>", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007GreaterThan(String value) {
            addCriterion("UTA007 >", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007GreaterThanOrEqualTo(String value) {
            addCriterion("UTA007 >=", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007LessThan(String value) {
            addCriterion("UTA007 <", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007LessThanOrEqualTo(String value) {
            addCriterion("UTA007 <=", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007Like(String value) {
            addCriterion("UTA007 like", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007NotLike(String value) {
            addCriterion("UTA007 not like", value, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007In(List<String> values) {
            addCriterion("UTA007 in", values, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007NotIn(List<String> values) {
            addCriterion("UTA007 not in", values, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007Between(String value1, String value2) {
            addCriterion("UTA007 between", value1, value2, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta007NotBetween(String value1, String value2) {
            addCriterion("UTA007 not between", value1, value2, "uta007");
            return (Criteria) this;
        }

        public Criteria andUta008IsNull() {
            addCriterion("UTA008 is null");
            return (Criteria) this;
        }

        public Criteria andUta008IsNotNull() {
            addCriterion("UTA008 is not null");
            return (Criteria) this;
        }

        public Criteria andUta008EqualTo(String value) {
            addCriterion("UTA008 =", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008NotEqualTo(String value) {
            addCriterion("UTA008 <>", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008GreaterThan(String value) {
            addCriterion("UTA008 >", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008GreaterThanOrEqualTo(String value) {
            addCriterion("UTA008 >=", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008LessThan(String value) {
            addCriterion("UTA008 <", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008LessThanOrEqualTo(String value) {
            addCriterion("UTA008 <=", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008Like(String value) {
            addCriterion("UTA008 like", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008NotLike(String value) {
            addCriterion("UTA008 not like", value, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008In(List<String> values) {
            addCriterion("UTA008 in", values, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008NotIn(List<String> values) {
            addCriterion("UTA008 not in", values, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008Between(String value1, String value2) {
            addCriterion("UTA008 between", value1, value2, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta008NotBetween(String value1, String value2) {
            addCriterion("UTA008 not between", value1, value2, "uta008");
            return (Criteria) this;
        }

        public Criteria andUta009IsNull() {
            addCriterion("UTA009 is null");
            return (Criteria) this;
        }

        public Criteria andUta009IsNotNull() {
            addCriterion("UTA009 is not null");
            return (Criteria) this;
        }

        public Criteria andUta009EqualTo(String value) {
            addCriterion("UTA009 =", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009NotEqualTo(String value) {
            addCriterion("UTA009 <>", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009GreaterThan(String value) {
            addCriterion("UTA009 >", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009GreaterThanOrEqualTo(String value) {
            addCriterion("UTA009 >=", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009LessThan(String value) {
            addCriterion("UTA009 <", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009LessThanOrEqualTo(String value) {
            addCriterion("UTA009 <=", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009Like(String value) {
            addCriterion("UTA009 like", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009NotLike(String value) {
            addCriterion("UTA009 not like", value, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009In(List<String> values) {
            addCriterion("UTA009 in", values, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009NotIn(List<String> values) {
            addCriterion("UTA009 not in", values, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009Between(String value1, String value2) {
            addCriterion("UTA009 between", value1, value2, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta009NotBetween(String value1, String value2) {
            addCriterion("UTA009 not between", value1, value2, "uta009");
            return (Criteria) this;
        }

        public Criteria andUta010IsNull() {
            addCriterion("UTA010 is null");
            return (Criteria) this;
        }

        public Criteria andUta010IsNotNull() {
            addCriterion("UTA010 is not null");
            return (Criteria) this;
        }

        public Criteria andUta010EqualTo(String value) {
            addCriterion("UTA010 =", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010NotEqualTo(String value) {
            addCriterion("UTA010 <>", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010GreaterThan(String value) {
            addCriterion("UTA010 >", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010GreaterThanOrEqualTo(String value) {
            addCriterion("UTA010 >=", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010LessThan(String value) {
            addCriterion("UTA010 <", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010LessThanOrEqualTo(String value) {
            addCriterion("UTA010 <=", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010Like(String value) {
            addCriterion("UTA010 like", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010NotLike(String value) {
            addCriterion("UTA010 not like", value, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010In(List<String> values) {
            addCriterion("UTA010 in", values, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010NotIn(List<String> values) {
            addCriterion("UTA010 not in", values, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010Between(String value1, String value2) {
            addCriterion("UTA010 between", value1, value2, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta010NotBetween(String value1, String value2) {
            addCriterion("UTA010 not between", value1, value2, "uta010");
            return (Criteria) this;
        }

        public Criteria andUta011IsNull() {
            addCriterion("UTA011 is null");
            return (Criteria) this;
        }

        public Criteria andUta011IsNotNull() {
            addCriterion("UTA011 is not null");
            return (Criteria) this;
        }

        public Criteria andUta011EqualTo(String value) {
            addCriterion("UTA011 =", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011NotEqualTo(String value) {
            addCriterion("UTA011 <>", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011GreaterThan(String value) {
            addCriterion("UTA011 >", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011GreaterThanOrEqualTo(String value) {
            addCriterion("UTA011 >=", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011LessThan(String value) {
            addCriterion("UTA011 <", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011LessThanOrEqualTo(String value) {
            addCriterion("UTA011 <=", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011Like(String value) {
            addCriterion("UTA011 like", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011NotLike(String value) {
            addCriterion("UTA011 not like", value, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011In(List<String> values) {
            addCriterion("UTA011 in", values, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011NotIn(List<String> values) {
            addCriterion("UTA011 not in", values, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011Between(String value1, String value2) {
            addCriterion("UTA011 between", value1, value2, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta011NotBetween(String value1, String value2) {
            addCriterion("UTA011 not between", value1, value2, "uta011");
            return (Criteria) this;
        }

        public Criteria andUta012IsNull() {
            addCriterion("UTA012 is null");
            return (Criteria) this;
        }

        public Criteria andUta012IsNotNull() {
            addCriterion("UTA012 is not null");
            return (Criteria) this;
        }

        public Criteria andUta012EqualTo(String value) {
            addCriterion("UTA012 =", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012NotEqualTo(String value) {
            addCriterion("UTA012 <>", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012GreaterThan(String value) {
            addCriterion("UTA012 >", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012GreaterThanOrEqualTo(String value) {
            addCriterion("UTA012 >=", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012LessThan(String value) {
            addCriterion("UTA012 <", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012LessThanOrEqualTo(String value) {
            addCriterion("UTA012 <=", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012Like(String value) {
            addCriterion("UTA012 like", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012NotLike(String value) {
            addCriterion("UTA012 not like", value, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012In(List<String> values) {
            addCriterion("UTA012 in", values, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012NotIn(List<String> values) {
            addCriterion("UTA012 not in", values, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012Between(String value1, String value2) {
            addCriterion("UTA012 between", value1, value2, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta012NotBetween(String value1, String value2) {
            addCriterion("UTA012 not between", value1, value2, "uta012");
            return (Criteria) this;
        }

        public Criteria andUta013IsNull() {
            addCriterion("UTA013 is null");
            return (Criteria) this;
        }

        public Criteria andUta013IsNotNull() {
            addCriterion("UTA013 is not null");
            return (Criteria) this;
        }

        public Criteria andUta013EqualTo(Date value) {
            addCriterion("UTA013 =", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013NotEqualTo(Date value) {
            addCriterion("UTA013 <>", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013GreaterThan(Date value) {
            addCriterion("UTA013 >", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013GreaterThanOrEqualTo(Date value) {
            addCriterion("UTA013 >=", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013LessThan(Date value) {
            addCriterion("UTA013 <", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013LessThanOrEqualTo(Date value) {
            addCriterion("UTA013 <=", value, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013In(List<Date> values) {
            addCriterion("UTA013 in", values, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013NotIn(List<Date> values) {
            addCriterion("UTA013 not in", values, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013Between(Date value1, Date value2) {
            addCriterion("UTA013 between", value1, value2, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta013NotBetween(Date value1, Date value2) {
            addCriterion("UTA013 not between", value1, value2, "uta013");
            return (Criteria) this;
        }

        public Criteria andUta014IsNull() {
            addCriterion("UTA014 is null");
            return (Criteria) this;
        }

        public Criteria andUta014IsNotNull() {
            addCriterion("UTA014 is not null");
            return (Criteria) this;
        }

        public Criteria andUta014EqualTo(Integer value) {
            addCriterion("UTA014 =", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014NotEqualTo(Integer value) {
            addCriterion("UTA014 <>", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014GreaterThan(Integer value) {
            addCriterion("UTA014 >", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014GreaterThanOrEqualTo(Integer value) {
            addCriterion("UTA014 >=", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014LessThan(Integer value) {
            addCriterion("UTA014 <", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014LessThanOrEqualTo(Integer value) {
            addCriterion("UTA014 <=", value, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014In(List<Integer> values) {
            addCriterion("UTA014 in", values, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014NotIn(List<Integer> values) {
            addCriterion("UTA014 not in", values, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014Between(Integer value1, Integer value2) {
            addCriterion("UTA014 between", value1, value2, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta014NotBetween(Integer value1, Integer value2) {
            addCriterion("UTA014 not between", value1, value2, "uta014");
            return (Criteria) this;
        }

        public Criteria andUta015IsNull() {
            addCriterion("UTA015 is null");
            return (Criteria) this;
        }

        public Criteria andUta015IsNotNull() {
            addCriterion("UTA015 is not null");
            return (Criteria) this;
        }

        public Criteria andUta015EqualTo(Integer value) {
            addCriterion("UTA015 =", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015NotEqualTo(Integer value) {
            addCriterion("UTA015 <>", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015GreaterThan(Integer value) {
            addCriterion("UTA015 >", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015GreaterThanOrEqualTo(Integer value) {
            addCriterion("UTA015 >=", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015LessThan(Integer value) {
            addCriterion("UTA015 <", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015LessThanOrEqualTo(Integer value) {
            addCriterion("UTA015 <=", value, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015In(List<Integer> values) {
            addCriterion("UTA015 in", values, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015NotIn(List<Integer> values) {
            addCriterion("UTA015 not in", values, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015Between(Integer value1, Integer value2) {
            addCriterion("UTA015 between", value1, value2, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta015NotBetween(Integer value1, Integer value2) {
            addCriterion("UTA015 not between", value1, value2, "uta015");
            return (Criteria) this;
        }

        public Criteria andUta016IsNull() {
            addCriterion("UTA016 is null");
            return (Criteria) this;
        }

        public Criteria andUta016IsNotNull() {
            addCriterion("UTA016 is not null");
            return (Criteria) this;
        }

        public Criteria andUta016EqualTo(Date value) {
            addCriterion("UTA016 =", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016NotEqualTo(Date value) {
            addCriterion("UTA016 <>", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016GreaterThan(Date value) {
            addCriterion("UTA016 >", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016GreaterThanOrEqualTo(Date value) {
            addCriterion("UTA016 >=", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016LessThan(Date value) {
            addCriterion("UTA016 <", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016LessThanOrEqualTo(Date value) {
            addCriterion("UTA016 <=", value, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016In(List<Date> values) {
            addCriterion("UTA016 in", values, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016NotIn(List<Date> values) {
            addCriterion("UTA016 not in", values, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016Between(Date value1, Date value2) {
            addCriterion("UTA016 between", value1, value2, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta016NotBetween(Date value1, Date value2) {
            addCriterion("UTA016 not between", value1, value2, "uta016");
            return (Criteria) this;
        }

        public Criteria andUta017IsNull() {
            addCriterion("UTA017 is null");
            return (Criteria) this;
        }

        public Criteria andUta017IsNotNull() {
            addCriterion("UTA017 is not null");
            return (Criteria) this;
        }

        public Criteria andUta017EqualTo(String value) {
            addCriterion("UTA017 =", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017NotEqualTo(String value) {
            addCriterion("UTA017 <>", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017GreaterThan(String value) {
            addCriterion("UTA017 >", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017GreaterThanOrEqualTo(String value) {
            addCriterion("UTA017 >=", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017LessThan(String value) {
            addCriterion("UTA017 <", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017LessThanOrEqualTo(String value) {
            addCriterion("UTA017 <=", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017Like(String value) {
            addCriterion("UTA017 like", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017NotLike(String value) {
            addCriterion("UTA017 not like", value, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017In(List<String> values) {
            addCriterion("UTA017 in", values, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017NotIn(List<String> values) {
            addCriterion("UTA017 not in", values, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017Between(String value1, String value2) {
            addCriterion("UTA017 between", value1, value2, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta017NotBetween(String value1, String value2) {
            addCriterion("UTA017 not between", value1, value2, "uta017");
            return (Criteria) this;
        }

        public Criteria andUta018IsNull() {
            addCriterion("UTA018 is null");
            return (Criteria) this;
        }

        public Criteria andUta018IsNotNull() {
            addCriterion("UTA018 is not null");
            return (Criteria) this;
        }

        public Criteria andUta018EqualTo(String value) {
            addCriterion("UTA018 =", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018NotEqualTo(String value) {
            addCriterion("UTA018 <>", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018GreaterThan(String value) {
            addCriterion("UTA018 >", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018GreaterThanOrEqualTo(String value) {
            addCriterion("UTA018 >=", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018LessThan(String value) {
            addCriterion("UTA018 <", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018LessThanOrEqualTo(String value) {
            addCriterion("UTA018 <=", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018Like(String value) {
            addCriterion("UTA018 like", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018NotLike(String value) {
            addCriterion("UTA018 not like", value, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018In(List<String> values) {
            addCriterion("UTA018 in", values, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018NotIn(List<String> values) {
            addCriterion("UTA018 not in", values, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018Between(String value1, String value2) {
            addCriterion("UTA018 between", value1, value2, "uta018");
            return (Criteria) this;
        }

        public Criteria andUta018NotBetween(String value1, String value2) {
            addCriterion("UTA018 not between", value1, value2, "uta018");
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