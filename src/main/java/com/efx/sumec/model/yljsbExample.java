package com.efx.sumec.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class yljsbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public yljsbExample() {
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

        public Criteria andJsb001IsNull() {
            addCriterion("JSB001 is null");
            return (Criteria) this;
        }

        public Criteria andJsb001IsNotNull() {
            addCriterion("JSB001 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb001EqualTo(Integer value) {
            addCriterion("JSB001 =", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001NotEqualTo(Integer value) {
            addCriterion("JSB001 <>", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001GreaterThan(Integer value) {
            addCriterion("JSB001 >", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB001 >=", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001LessThan(Integer value) {
            addCriterion("JSB001 <", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001LessThanOrEqualTo(Integer value) {
            addCriterion("JSB001 <=", value, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001In(List<Integer> values) {
            addCriterion("JSB001 in", values, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001NotIn(List<Integer> values) {
            addCriterion("JSB001 not in", values, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001Between(Integer value1, Integer value2) {
            addCriterion("JSB001 between", value1, value2, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb001NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB001 not between", value1, value2, "jsb001");
            return (Criteria) this;
        }

        public Criteria andJsb002IsNull() {
            addCriterion("JSB002 is null");
            return (Criteria) this;
        }

        public Criteria andJsb002IsNotNull() {
            addCriterion("JSB002 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb002EqualTo(String value) {
            addCriterion("JSB002 =", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002NotEqualTo(String value) {
            addCriterion("JSB002 <>", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002GreaterThan(String value) {
            addCriterion("JSB002 >", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002GreaterThanOrEqualTo(String value) {
            addCriterion("JSB002 >=", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002LessThan(String value) {
            addCriterion("JSB002 <", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002LessThanOrEqualTo(String value) {
            addCriterion("JSB002 <=", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002Like(String value) {
            addCriterion("JSB002 like", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002NotLike(String value) {
            addCriterion("JSB002 not like", value, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002In(List<String> values) {
            addCriterion("JSB002 in", values, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002NotIn(List<String> values) {
            addCriterion("JSB002 not in", values, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002Between(String value1, String value2) {
            addCriterion("JSB002 between", value1, value2, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb002NotBetween(String value1, String value2) {
            addCriterion("JSB002 not between", value1, value2, "jsb002");
            return (Criteria) this;
        }

        public Criteria andJsb003IsNull() {
            addCriterion("JSB003 is null");
            return (Criteria) this;
        }

        public Criteria andJsb003IsNotNull() {
            addCriterion("JSB003 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb003EqualTo(String value) {
            addCriterion("JSB003 =", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003NotEqualTo(String value) {
            addCriterion("JSB003 <>", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003GreaterThan(String value) {
            addCriterion("JSB003 >", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003GreaterThanOrEqualTo(String value) {
            addCriterion("JSB003 >=", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003LessThan(String value) {
            addCriterion("JSB003 <", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003LessThanOrEqualTo(String value) {
            addCriterion("JSB003 <=", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003Like(String value) {
            addCriterion("JSB003 like", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003NotLike(String value) {
            addCriterion("JSB003 not like", value, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003In(List<String> values) {
            addCriterion("JSB003 in", values, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003NotIn(List<String> values) {
            addCriterion("JSB003 not in", values, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003Between(String value1, String value2) {
            addCriterion("JSB003 between", value1, value2, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb003NotBetween(String value1, String value2) {
            addCriterion("JSB003 not between", value1, value2, "jsb003");
            return (Criteria) this;
        }

        public Criteria andJsb004IsNull() {
            addCriterion("JSB004 is null");
            return (Criteria) this;
        }

        public Criteria andJsb004IsNotNull() {
            addCriterion("JSB004 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb004EqualTo(Integer value) {
            addCriterion("JSB004 =", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004NotEqualTo(Integer value) {
            addCriterion("JSB004 <>", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004GreaterThan(Integer value) {
            addCriterion("JSB004 >", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB004 >=", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004LessThan(Integer value) {
            addCriterion("JSB004 <", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004LessThanOrEqualTo(Integer value) {
            addCriterion("JSB004 <=", value, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004In(List<Integer> values) {
            addCriterion("JSB004 in", values, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004NotIn(List<Integer> values) {
            addCriterion("JSB004 not in", values, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004Between(Integer value1, Integer value2) {
            addCriterion("JSB004 between", value1, value2, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb004NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB004 not between", value1, value2, "jsb004");
            return (Criteria) this;
        }

        public Criteria andJsb005IsNull() {
            addCriterion("JSB005 is null");
            return (Criteria) this;
        }

        public Criteria andJsb005IsNotNull() {
            addCriterion("JSB005 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb005EqualTo(Date value) {
            addCriterion("JSB005 =", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005NotEqualTo(Date value) {
            addCriterion("JSB005 <>", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005GreaterThan(Date value) {
            addCriterion("JSB005 >", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005GreaterThanOrEqualTo(Date value) {
            addCriterion("JSB005 >=", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005LessThan(Date value) {
            addCriterion("JSB005 <", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005LessThanOrEqualTo(Date value) {
            addCriterion("JSB005 <=", value, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005In(List<Date> values) {
            addCriterion("JSB005 in", values, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005NotIn(List<Date> values) {
            addCriterion("JSB005 not in", values, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005Between(Date value1, Date value2) {
            addCriterion("JSB005 between", value1, value2, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb005NotBetween(Date value1, Date value2) {
            addCriterion("JSB005 not between", value1, value2, "jsb005");
            return (Criteria) this;
        }

        public Criteria andJsb006IsNull() {
            addCriterion("JSB006 is null");
            return (Criteria) this;
        }

        public Criteria andJsb006IsNotNull() {
            addCriterion("JSB006 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb006EqualTo(String value) {
            addCriterion("JSB006 =", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006NotEqualTo(String value) {
            addCriterion("JSB006 <>", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006GreaterThan(String value) {
            addCriterion("JSB006 >", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006GreaterThanOrEqualTo(String value) {
            addCriterion("JSB006 >=", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006LessThan(String value) {
            addCriterion("JSB006 <", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006LessThanOrEqualTo(String value) {
            addCriterion("JSB006 <=", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006Like(String value) {
            addCriterion("JSB006 like", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006NotLike(String value) {
            addCriterion("JSB006 not like", value, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006In(List<String> values) {
            addCriterion("JSB006 in", values, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006NotIn(List<String> values) {
            addCriterion("JSB006 not in", values, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006Between(String value1, String value2) {
            addCriterion("JSB006 between", value1, value2, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb006NotBetween(String value1, String value2) {
            addCriterion("JSB006 not between", value1, value2, "jsb006");
            return (Criteria) this;
        }

        public Criteria andJsb007IsNull() {
            addCriterion("JSB007 is null");
            return (Criteria) this;
        }

        public Criteria andJsb007IsNotNull() {
            addCriterion("JSB007 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb007EqualTo(String value) {
            addCriterion("JSB007 =", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007NotEqualTo(String value) {
            addCriterion("JSB007 <>", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007GreaterThan(String value) {
            addCriterion("JSB007 >", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007GreaterThanOrEqualTo(String value) {
            addCriterion("JSB007 >=", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007LessThan(String value) {
            addCriterion("JSB007 <", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007LessThanOrEqualTo(String value) {
            addCriterion("JSB007 <=", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007Like(String value) {
            addCriterion("JSB007 like", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007NotLike(String value) {
            addCriterion("JSB007 not like", value, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007In(List<String> values) {
            addCriterion("JSB007 in", values, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007NotIn(List<String> values) {
            addCriterion("JSB007 not in", values, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007Between(String value1, String value2) {
            addCriterion("JSB007 between", value1, value2, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb007NotBetween(String value1, String value2) {
            addCriterion("JSB007 not between", value1, value2, "jsb007");
            return (Criteria) this;
        }

        public Criteria andJsb008IsNull() {
            addCriterion("JSB008 is null");
            return (Criteria) this;
        }

        public Criteria andJsb008IsNotNull() {
            addCriterion("JSB008 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb008EqualTo(String value) {
            addCriterion("JSB008 =", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008NotEqualTo(String value) {
            addCriterion("JSB008 <>", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008GreaterThan(String value) {
            addCriterion("JSB008 >", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008GreaterThanOrEqualTo(String value) {
            addCriterion("JSB008 >=", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008LessThan(String value) {
            addCriterion("JSB008 <", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008LessThanOrEqualTo(String value) {
            addCriterion("JSB008 <=", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008Like(String value) {
            addCriterion("JSB008 like", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008NotLike(String value) {
            addCriterion("JSB008 not like", value, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008In(List<String> values) {
            addCriterion("JSB008 in", values, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008NotIn(List<String> values) {
            addCriterion("JSB008 not in", values, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008Between(String value1, String value2) {
            addCriterion("JSB008 between", value1, value2, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb008NotBetween(String value1, String value2) {
            addCriterion("JSB008 not between", value1, value2, "jsb008");
            return (Criteria) this;
        }

        public Criteria andJsb009IsNull() {
            addCriterion("JSB009 is null");
            return (Criteria) this;
        }

        public Criteria andJsb009IsNotNull() {
            addCriterion("JSB009 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb009EqualTo(Integer value) {
            addCriterion("JSB009 =", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009NotEqualTo(Integer value) {
            addCriterion("JSB009 <>", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009GreaterThan(Integer value) {
            addCriterion("JSB009 >", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB009 >=", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009LessThan(Integer value) {
            addCriterion("JSB009 <", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009LessThanOrEqualTo(Integer value) {
            addCriterion("JSB009 <=", value, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009In(List<Integer> values) {
            addCriterion("JSB009 in", values, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009NotIn(List<Integer> values) {
            addCriterion("JSB009 not in", values, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009Between(Integer value1, Integer value2) {
            addCriterion("JSB009 between", value1, value2, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb009NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB009 not between", value1, value2, "jsb009");
            return (Criteria) this;
        }

        public Criteria andJsb010IsNull() {
            addCriterion("JSB010 is null");
            return (Criteria) this;
        }

        public Criteria andJsb010IsNotNull() {
            addCriterion("JSB010 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb010EqualTo(Date value) {
            addCriterion("JSB010 =", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010NotEqualTo(Date value) {
            addCriterion("JSB010 <>", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010GreaterThan(Date value) {
            addCriterion("JSB010 >", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010GreaterThanOrEqualTo(Date value) {
            addCriterion("JSB010 >=", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010LessThan(Date value) {
            addCriterion("JSB010 <", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010LessThanOrEqualTo(Date value) {
            addCriterion("JSB010 <=", value, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010In(List<Date> values) {
            addCriterion("JSB010 in", values, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010NotIn(List<Date> values) {
            addCriterion("JSB010 not in", values, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010Between(Date value1, Date value2) {
            addCriterion("JSB010 between", value1, value2, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb010NotBetween(Date value1, Date value2) {
            addCriterion("JSB010 not between", value1, value2, "jsb010");
            return (Criteria) this;
        }

        public Criteria andJsb011IsNull() {
            addCriterion("JSB011 is null");
            return (Criteria) this;
        }

        public Criteria andJsb011IsNotNull() {
            addCriterion("JSB011 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb011EqualTo(Integer value) {
            addCriterion("JSB011 =", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011NotEqualTo(Integer value) {
            addCriterion("JSB011 <>", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011GreaterThan(Integer value) {
            addCriterion("JSB011 >", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB011 >=", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011LessThan(Integer value) {
            addCriterion("JSB011 <", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011LessThanOrEqualTo(Integer value) {
            addCriterion("JSB011 <=", value, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011In(List<Integer> values) {
            addCriterion("JSB011 in", values, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011NotIn(List<Integer> values) {
            addCriterion("JSB011 not in", values, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011Between(Integer value1, Integer value2) {
            addCriterion("JSB011 between", value1, value2, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb011NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB011 not between", value1, value2, "jsb011");
            return (Criteria) this;
        }

        public Criteria andJsb012IsNull() {
            addCriterion("JSB012 is null");
            return (Criteria) this;
        }

        public Criteria andJsb012IsNotNull() {
            addCriterion("JSB012 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb012EqualTo(Integer value) {
            addCriterion("JSB012 =", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012NotEqualTo(Integer value) {
            addCriterion("JSB012 <>", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012GreaterThan(Integer value) {
            addCriterion("JSB012 >", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB012 >=", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012LessThan(Integer value) {
            addCriterion("JSB012 <", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012LessThanOrEqualTo(Integer value) {
            addCriterion("JSB012 <=", value, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012In(List<Integer> values) {
            addCriterion("JSB012 in", values, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012NotIn(List<Integer> values) {
            addCriterion("JSB012 not in", values, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012Between(Integer value1, Integer value2) {
            addCriterion("JSB012 between", value1, value2, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb012NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB012 not between", value1, value2, "jsb012");
            return (Criteria) this;
        }

        public Criteria andJsb013IsNull() {
            addCriterion("JSB013 is null");
            return (Criteria) this;
        }

        public Criteria andJsb013IsNotNull() {
            addCriterion("JSB013 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb013EqualTo(Date value) {
            addCriterion("JSB013 =", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013NotEqualTo(Date value) {
            addCriterion("JSB013 <>", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013GreaterThan(Date value) {
            addCriterion("JSB013 >", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013GreaterThanOrEqualTo(Date value) {
            addCriterion("JSB013 >=", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013LessThan(Date value) {
            addCriterion("JSB013 <", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013LessThanOrEqualTo(Date value) {
            addCriterion("JSB013 <=", value, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013In(List<Date> values) {
            addCriterion("JSB013 in", values, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013NotIn(List<Date> values) {
            addCriterion("JSB013 not in", values, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013Between(Date value1, Date value2) {
            addCriterion("JSB013 between", value1, value2, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb013NotBetween(Date value1, Date value2) {
            addCriterion("JSB013 not between", value1, value2, "jsb013");
            return (Criteria) this;
        }

        public Criteria andJsb014IsNull() {
            addCriterion("JSB014 is null");
            return (Criteria) this;
        }

        public Criteria andJsb014IsNotNull() {
            addCriterion("JSB014 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb014EqualTo(Integer value) {
            addCriterion("JSB014 =", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014NotEqualTo(Integer value) {
            addCriterion("JSB014 <>", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014GreaterThan(Integer value) {
            addCriterion("JSB014 >", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014GreaterThanOrEqualTo(Integer value) {
            addCriterion("JSB014 >=", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014LessThan(Integer value) {
            addCriterion("JSB014 <", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014LessThanOrEqualTo(Integer value) {
            addCriterion("JSB014 <=", value, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014In(List<Integer> values) {
            addCriterion("JSB014 in", values, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014NotIn(List<Integer> values) {
            addCriterion("JSB014 not in", values, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014Between(Integer value1, Integer value2) {
            addCriterion("JSB014 between", value1, value2, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb014NotBetween(Integer value1, Integer value2) {
            addCriterion("JSB014 not between", value1, value2, "jsb014");
            return (Criteria) this;
        }

        public Criteria andJsb015IsNull() {
            addCriterion("JSB015 is null");
            return (Criteria) this;
        }

        public Criteria andJsb015IsNotNull() {
            addCriterion("JSB015 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb015EqualTo(String value) {
            addCriterion("JSB015 =", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015NotEqualTo(String value) {
            addCriterion("JSB015 <>", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015GreaterThan(String value) {
            addCriterion("JSB015 >", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015GreaterThanOrEqualTo(String value) {
            addCriterion("JSB015 >=", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015LessThan(String value) {
            addCriterion("JSB015 <", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015LessThanOrEqualTo(String value) {
            addCriterion("JSB015 <=", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015Like(String value) {
            addCriterion("JSB015 like", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015NotLike(String value) {
            addCriterion("JSB015 not like", value, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015In(List<String> values) {
            addCriterion("JSB015 in", values, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015NotIn(List<String> values) {
            addCriterion("JSB015 not in", values, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015Between(String value1, String value2) {
            addCriterion("JSB015 between", value1, value2, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb015NotBetween(String value1, String value2) {
            addCriterion("JSB015 not between", value1, value2, "jsb015");
            return (Criteria) this;
        }

        public Criteria andJsb016IsNull() {
            addCriterion("JSB016 is null");
            return (Criteria) this;
        }

        public Criteria andJsb016IsNotNull() {
            addCriterion("JSB016 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb016EqualTo(String value) {
            addCriterion("JSB016 =", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016NotEqualTo(String value) {
            addCriterion("JSB016 <>", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016GreaterThan(String value) {
            addCriterion("JSB016 >", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016GreaterThanOrEqualTo(String value) {
            addCriterion("JSB016 >=", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016LessThan(String value) {
            addCriterion("JSB016 <", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016LessThanOrEqualTo(String value) {
            addCriterion("JSB016 <=", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016Like(String value) {
            addCriterion("JSB016 like", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016NotLike(String value) {
            addCriterion("JSB016 not like", value, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016In(List<String> values) {
            addCriterion("JSB016 in", values, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016NotIn(List<String> values) {
            addCriterion("JSB016 not in", values, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016Between(String value1, String value2) {
            addCriterion("JSB016 between", value1, value2, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb016NotBetween(String value1, String value2) {
            addCriterion("JSB016 not between", value1, value2, "jsb016");
            return (Criteria) this;
        }

        public Criteria andJsb017IsNull() {
            addCriterion("JSB017 is null");
            return (Criteria) this;
        }

        public Criteria andJsb017IsNotNull() {
            addCriterion("JSB017 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb017EqualTo(String value) {
            addCriterion("JSB017 =", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017NotEqualTo(String value) {
            addCriterion("JSB017 <>", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017GreaterThan(String value) {
            addCriterion("JSB017 >", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017GreaterThanOrEqualTo(String value) {
            addCriterion("JSB017 >=", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017LessThan(String value) {
            addCriterion("JSB017 <", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017LessThanOrEqualTo(String value) {
            addCriterion("JSB017 <=", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017Like(String value) {
            addCriterion("JSB017 like", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017NotLike(String value) {
            addCriterion("JSB017 not like", value, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017In(List<String> values) {
            addCriterion("JSB017 in", values, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017NotIn(List<String> values) {
            addCriterion("JSB017 not in", values, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017Between(String value1, String value2) {
            addCriterion("JSB017 between", value1, value2, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb017NotBetween(String value1, String value2) {
            addCriterion("JSB017 not between", value1, value2, "jsb017");
            return (Criteria) this;
        }

        public Criteria andJsb018IsNull() {
            addCriterion("JSB018 is null");
            return (Criteria) this;
        }

        public Criteria andJsb018IsNotNull() {
            addCriterion("JSB018 is not null");
            return (Criteria) this;
        }

        public Criteria andJsb018EqualTo(String value) {
            addCriterion("JSB018 =", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018NotEqualTo(String value) {
            addCriterion("JSB018 <>", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018GreaterThan(String value) {
            addCriterion("JSB018 >", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018GreaterThanOrEqualTo(String value) {
            addCriterion("JSB018 >=", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018LessThan(String value) {
            addCriterion("JSB018 <", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018LessThanOrEqualTo(String value) {
            addCriterion("JSB018 <=", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018Like(String value) {
            addCriterion("JSB018 like", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018NotLike(String value) {
            addCriterion("JSB018 not like", value, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018In(List<String> values) {
            addCriterion("JSB018 in", values, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018NotIn(List<String> values) {
            addCriterion("JSB018 not in", values, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018Between(String value1, String value2) {
            addCriterion("JSB018 between", value1, value2, "jsb018");
            return (Criteria) this;
        }

        public Criteria andJsb018NotBetween(String value1, String value2) {
            addCriterion("JSB018 not between", value1, value2, "jsb018");
            return (Criteria) this;
        }

        public Criteria andSql(String value) {
            addCriterion(value);
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