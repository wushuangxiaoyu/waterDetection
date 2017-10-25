package entity;

import java.util.ArrayList;
import java.util.List;

public class ThresholdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThresholdExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdIsNull() {
            addCriterion("water_eqp_id is null");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdIsNotNull() {
            addCriterion("water_eqp_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdEqualTo(Integer value) {
            addCriterion("water_eqp_id =", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdNotEqualTo(Integer value) {
            addCriterion("water_eqp_id <>", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdGreaterThan(Integer value) {
            addCriterion("water_eqp_id >", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_eqp_id >=", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdLessThan(Integer value) {
            addCriterion("water_eqp_id <", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdLessThanOrEqualTo(Integer value) {
            addCriterion("water_eqp_id <=", value, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdIn(List<Integer> values) {
            addCriterion("water_eqp_id in", values, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdNotIn(List<Integer> values) {
            addCriterion("water_eqp_id not in", values, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdBetween(Integer value1, Integer value2) {
            addCriterion("water_eqp_id between", value1, value2, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andWaterEqpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("water_eqp_id not between", value1, value2, "waterEqpId");
            return (Criteria) this;
        }

        public Criteria andMaxPhIsNull() {
            addCriterion("max_ph is null");
            return (Criteria) this;
        }

        public Criteria andMaxPhIsNotNull() {
            addCriterion("max_ph is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPhEqualTo(Double value) {
            addCriterion("max_ph =", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhNotEqualTo(Double value) {
            addCriterion("max_ph <>", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhGreaterThan(Double value) {
            addCriterion("max_ph >", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhGreaterThanOrEqualTo(Double value) {
            addCriterion("max_ph >=", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhLessThan(Double value) {
            addCriterion("max_ph <", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhLessThanOrEqualTo(Double value) {
            addCriterion("max_ph <=", value, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhIn(List<Double> values) {
            addCriterion("max_ph in", values, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhNotIn(List<Double> values) {
            addCriterion("max_ph not in", values, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhBetween(Double value1, Double value2) {
            addCriterion("max_ph between", value1, value2, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMaxPhNotBetween(Double value1, Double value2) {
            addCriterion("max_ph not between", value1, value2, "maxPh");
            return (Criteria) this;
        }

        public Criteria andMinPhIsNull() {
            addCriterion("min_ph is null");
            return (Criteria) this;
        }

        public Criteria andMinPhIsNotNull() {
            addCriterion("min_ph is not null");
            return (Criteria) this;
        }

        public Criteria andMinPhEqualTo(Double value) {
            addCriterion("min_ph =", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhNotEqualTo(Double value) {
            addCriterion("min_ph <>", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhGreaterThan(Double value) {
            addCriterion("min_ph >", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhGreaterThanOrEqualTo(Double value) {
            addCriterion("min_ph >=", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhLessThan(Double value) {
            addCriterion("min_ph <", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhLessThanOrEqualTo(Double value) {
            addCriterion("min_ph <=", value, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhIn(List<Double> values) {
            addCriterion("min_ph in", values, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhNotIn(List<Double> values) {
            addCriterion("min_ph not in", values, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhBetween(Double value1, Double value2) {
            addCriterion("min_ph between", value1, value2, "minPh");
            return (Criteria) this;
        }

        public Criteria andMinPhNotBetween(Double value1, Double value2) {
            addCriterion("min_ph not between", value1, value2, "minPh");
            return (Criteria) this;
        }

        public Criteria andMaxTmpIsNull() {
            addCriterion("max_tmp is null");
            return (Criteria) this;
        }

        public Criteria andMaxTmpIsNotNull() {
            addCriterion("max_tmp is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTmpEqualTo(Double value) {
            addCriterion("max_tmp =", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpNotEqualTo(Double value) {
            addCriterion("max_tmp <>", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpGreaterThan(Double value) {
            addCriterion("max_tmp >", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpGreaterThanOrEqualTo(Double value) {
            addCriterion("max_tmp >=", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpLessThan(Double value) {
            addCriterion("max_tmp <", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpLessThanOrEqualTo(Double value) {
            addCriterion("max_tmp <=", value, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpIn(List<Double> values) {
            addCriterion("max_tmp in", values, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpNotIn(List<Double> values) {
            addCriterion("max_tmp not in", values, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpBetween(Double value1, Double value2) {
            addCriterion("max_tmp between", value1, value2, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMaxTmpNotBetween(Double value1, Double value2) {
            addCriterion("max_tmp not between", value1, value2, "maxTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpIsNull() {
            addCriterion("min_tmp is null");
            return (Criteria) this;
        }

        public Criteria andMinTmpIsNotNull() {
            addCriterion("min_tmp is not null");
            return (Criteria) this;
        }

        public Criteria andMinTmpEqualTo(Double value) {
            addCriterion("min_tmp =", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpNotEqualTo(Double value) {
            addCriterion("min_tmp <>", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpGreaterThan(Double value) {
            addCriterion("min_tmp >", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpGreaterThanOrEqualTo(Double value) {
            addCriterion("min_tmp >=", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpLessThan(Double value) {
            addCriterion("min_tmp <", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpLessThanOrEqualTo(Double value) {
            addCriterion("min_tmp <=", value, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpIn(List<Double> values) {
            addCriterion("min_tmp in", values, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpNotIn(List<Double> values) {
            addCriterion("min_tmp not in", values, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpBetween(Double value1, Double value2) {
            addCriterion("min_tmp between", value1, value2, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMinTmpNotBetween(Double value1, Double value2) {
            addCriterion("min_tmp not between", value1, value2, "minTmp");
            return (Criteria) this;
        }

        public Criteria andMaxOxyIsNull() {
            addCriterion("max_oxy is null");
            return (Criteria) this;
        }

        public Criteria andMaxOxyIsNotNull() {
            addCriterion("max_oxy is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOxyEqualTo(Double value) {
            addCriterion("max_oxy =", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyNotEqualTo(Double value) {
            addCriterion("max_oxy <>", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyGreaterThan(Double value) {
            addCriterion("max_oxy >", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyGreaterThanOrEqualTo(Double value) {
            addCriterion("max_oxy >=", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyLessThan(Double value) {
            addCriterion("max_oxy <", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyLessThanOrEqualTo(Double value) {
            addCriterion("max_oxy <=", value, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyIn(List<Double> values) {
            addCriterion("max_oxy in", values, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyNotIn(List<Double> values) {
            addCriterion("max_oxy not in", values, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyBetween(Double value1, Double value2) {
            addCriterion("max_oxy between", value1, value2, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMaxOxyNotBetween(Double value1, Double value2) {
            addCriterion("max_oxy not between", value1, value2, "maxOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyIsNull() {
            addCriterion("min_oxy is null");
            return (Criteria) this;
        }

        public Criteria andMinOxyIsNotNull() {
            addCriterion("min_oxy is not null");
            return (Criteria) this;
        }

        public Criteria andMinOxyEqualTo(Double value) {
            addCriterion("min_oxy =", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyNotEqualTo(Double value) {
            addCriterion("min_oxy <>", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyGreaterThan(Double value) {
            addCriterion("min_oxy >", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyGreaterThanOrEqualTo(Double value) {
            addCriterion("min_oxy >=", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyLessThan(Double value) {
            addCriterion("min_oxy <", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyLessThanOrEqualTo(Double value) {
            addCriterion("min_oxy <=", value, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyIn(List<Double> values) {
            addCriterion("min_oxy in", values, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyNotIn(List<Double> values) {
            addCriterion("min_oxy not in", values, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyBetween(Double value1, Double value2) {
            addCriterion("min_oxy between", value1, value2, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMinOxyNotBetween(Double value1, Double value2) {
            addCriterion("min_oxy not between", value1, value2, "minOxy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyIsNull() {
            addCriterion("max_heavy is null");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyIsNotNull() {
            addCriterion("max_heavy is not null");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyEqualTo(Double value) {
            addCriterion("max_heavy =", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyNotEqualTo(Double value) {
            addCriterion("max_heavy <>", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyGreaterThan(Double value) {
            addCriterion("max_heavy >", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyGreaterThanOrEqualTo(Double value) {
            addCriterion("max_heavy >=", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyLessThan(Double value) {
            addCriterion("max_heavy <", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyLessThanOrEqualTo(Double value) {
            addCriterion("max_heavy <=", value, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyIn(List<Double> values) {
            addCriterion("max_heavy in", values, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyNotIn(List<Double> values) {
            addCriterion("max_heavy not in", values, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyBetween(Double value1, Double value2) {
            addCriterion("max_heavy between", value1, value2, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxHeavyNotBetween(Double value1, Double value2) {
            addCriterion("max_heavy not between", value1, value2, "maxHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyIsNull() {
            addCriterion("min_heavy is null");
            return (Criteria) this;
        }

        public Criteria andMinHeavyIsNotNull() {
            addCriterion("min_heavy is not null");
            return (Criteria) this;
        }

        public Criteria andMinHeavyEqualTo(Double value) {
            addCriterion("min_heavy =", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyNotEqualTo(Double value) {
            addCriterion("min_heavy <>", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyGreaterThan(Double value) {
            addCriterion("min_heavy >", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyGreaterThanOrEqualTo(Double value) {
            addCriterion("min_heavy >=", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyLessThan(Double value) {
            addCriterion("min_heavy <", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyLessThanOrEqualTo(Double value) {
            addCriterion("min_heavy <=", value, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyIn(List<Double> values) {
            addCriterion("min_heavy in", values, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyNotIn(List<Double> values) {
            addCriterion("min_heavy not in", values, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyBetween(Double value1, Double value2) {
            addCriterion("min_heavy between", value1, value2, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMinHeavyNotBetween(Double value1, Double value2) {
            addCriterion("min_heavy not between", value1, value2, "minHeavy");
            return (Criteria) this;
        }

        public Criteria andMaxChyIsNull() {
            addCriterion("max_chy is null");
            return (Criteria) this;
        }

        public Criteria andMaxChyIsNotNull() {
            addCriterion("max_chy is not null");
            return (Criteria) this;
        }

        public Criteria andMaxChyEqualTo(Double value) {
            addCriterion("max_chy =", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyNotEqualTo(Double value) {
            addCriterion("max_chy <>", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyGreaterThan(Double value) {
            addCriterion("max_chy >", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyGreaterThanOrEqualTo(Double value) {
            addCriterion("max_chy >=", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyLessThan(Double value) {
            addCriterion("max_chy <", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyLessThanOrEqualTo(Double value) {
            addCriterion("max_chy <=", value, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyIn(List<Double> values) {
            addCriterion("max_chy in", values, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyNotIn(List<Double> values) {
            addCriterion("max_chy not in", values, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyBetween(Double value1, Double value2) {
            addCriterion("max_chy between", value1, value2, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMaxChyNotBetween(Double value1, Double value2) {
            addCriterion("max_chy not between", value1, value2, "maxChy");
            return (Criteria) this;
        }

        public Criteria andMinChyIsNull() {
            addCriterion("min_chy is null");
            return (Criteria) this;
        }

        public Criteria andMinChyIsNotNull() {
            addCriterion("min_chy is not null");
            return (Criteria) this;
        }

        public Criteria andMinChyEqualTo(Double value) {
            addCriterion("min_chy =", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyNotEqualTo(Double value) {
            addCriterion("min_chy <>", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyGreaterThan(Double value) {
            addCriterion("min_chy >", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyGreaterThanOrEqualTo(Double value) {
            addCriterion("min_chy >=", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyLessThan(Double value) {
            addCriterion("min_chy <", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyLessThanOrEqualTo(Double value) {
            addCriterion("min_chy <=", value, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyIn(List<Double> values) {
            addCriterion("min_chy in", values, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyNotIn(List<Double> values) {
            addCriterion("min_chy not in", values, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyBetween(Double value1, Double value2) {
            addCriterion("min_chy between", value1, value2, "minChy");
            return (Criteria) this;
        }

        public Criteria andMinChyNotBetween(Double value1, Double value2) {
            addCriterion("min_chy not between", value1, value2, "minChy");
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