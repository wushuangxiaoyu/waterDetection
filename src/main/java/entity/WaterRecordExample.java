package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaterRecordExample {
    protected String orderByClause;

    protected boolean distinct;
    protected String eqpId="";

    public String getEqpId() {
        return eqpId;
    }

    public void setEqpId(String eqpId) {
        this.eqpId = eqpId;
    }

    protected List<Criteria> oredCriteria;

    public WaterRecordExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andWaterOxyIsNull() {
            addCriterion("water_oxy is null");
            return (Criteria) this;
        }

        public Criteria andWaterOxyIsNotNull() {
            addCriterion("water_oxy is not null");
            return (Criteria) this;
        }

        public Criteria andWaterOxyEqualTo(Double value) {
            addCriterion("water_oxy =", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyNotEqualTo(Double value) {
            addCriterion("water_oxy <>", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyGreaterThan(Double value) {
            addCriterion("water_oxy >", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyGreaterThanOrEqualTo(Double value) {
            addCriterion("water_oxy >=", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyLessThan(Double value) {
            addCriterion("water_oxy <", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyLessThanOrEqualTo(Double value) {
            addCriterion("water_oxy <=", value, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyIn(List<Double> values) {
            addCriterion("water_oxy in", values, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyNotIn(List<Double> values) {
            addCriterion("water_oxy not in", values, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyBetween(Double value1, Double value2) {
            addCriterion("water_oxy between", value1, value2, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterOxyNotBetween(Double value1, Double value2) {
            addCriterion("water_oxy not between", value1, value2, "waterOxy");
            return (Criteria) this;
        }

        public Criteria andWaterTmpIsNull() {
            addCriterion("water_tmp is null");
            return (Criteria) this;
        }

        public Criteria andWaterTmpIsNotNull() {
            addCriterion("water_tmp is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTmpEqualTo(Double value) {
            addCriterion("water_tmp =", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpNotEqualTo(Double value) {
            addCriterion("water_tmp <>", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpGreaterThan(Double value) {
            addCriterion("water_tmp >", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpGreaterThanOrEqualTo(Double value) {
            addCriterion("water_tmp >=", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpLessThan(Double value) {
            addCriterion("water_tmp <", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpLessThanOrEqualTo(Double value) {
            addCriterion("water_tmp <=", value, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpIn(List<Double> values) {
            addCriterion("water_tmp in", values, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpNotIn(List<Double> values) {
            addCriterion("water_tmp not in", values, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpBetween(Double value1, Double value2) {
            addCriterion("water_tmp between", value1, value2, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterTmpNotBetween(Double value1, Double value2) {
            addCriterion("water_tmp not between", value1, value2, "waterTmp");
            return (Criteria) this;
        }

        public Criteria andWaterPhIsNull() {
            addCriterion("water_ph is null");
            return (Criteria) this;
        }

        public Criteria andWaterPhIsNotNull() {
            addCriterion("water_ph is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPhEqualTo(Double value) {
            addCriterion("water_ph =", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhNotEqualTo(Double value) {
            addCriterion("water_ph <>", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhGreaterThan(Double value) {
            addCriterion("water_ph >", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhGreaterThanOrEqualTo(Double value) {
            addCriterion("water_ph >=", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhLessThan(Double value) {
            addCriterion("water_ph <", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhLessThanOrEqualTo(Double value) {
            addCriterion("water_ph <=", value, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhIn(List<Double> values) {
            addCriterion("water_ph in", values, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhNotIn(List<Double> values) {
            addCriterion("water_ph not in", values, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhBetween(Double value1, Double value2) {
            addCriterion("water_ph between", value1, value2, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterPhNotBetween(Double value1, Double value2) {
            addCriterion("water_ph not between", value1, value2, "waterPh");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyIsNull() {
            addCriterion("water_heavy is null");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyIsNotNull() {
            addCriterion("water_heavy is not null");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyEqualTo(Double value) {
            addCriterion("water_heavy =", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyNotEqualTo(Double value) {
            addCriterion("water_heavy <>", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyGreaterThan(Double value) {
            addCriterion("water_heavy >", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyGreaterThanOrEqualTo(Double value) {
            addCriterion("water_heavy >=", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyLessThan(Double value) {
            addCriterion("water_heavy <", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyLessThanOrEqualTo(Double value) {
            addCriterion("water_heavy <=", value, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyIn(List<Double> values) {
            addCriterion("water_heavy in", values, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyNotIn(List<Double> values) {
            addCriterion("water_heavy not in", values, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyBetween(Double value1, Double value2) {
            addCriterion("water_heavy between", value1, value2, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterHeavyNotBetween(Double value1, Double value2) {
            addCriterion("water_heavy not between", value1, value2, "waterHeavy");
            return (Criteria) this;
        }

        public Criteria andWaterChyIsNull() {
            addCriterion("water_chy is null");
            return (Criteria) this;
        }

        public Criteria andWaterChyIsNotNull() {
            addCriterion("water_chy is not null");
            return (Criteria) this;
        }

        public Criteria andWaterChyEqualTo(Double value) {
            addCriterion("water_chy =", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyNotEqualTo(Double value) {
            addCriterion("water_chy <>", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyGreaterThan(Double value) {
            addCriterion("water_chy >", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyGreaterThanOrEqualTo(Double value) {
            addCriterion("water_chy >=", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyLessThan(Double value) {
            addCriterion("water_chy <", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyLessThanOrEqualTo(Double value) {
            addCriterion("water_chy <=", value, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyIn(List<Double> values) {
            addCriterion("water_chy in", values, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyNotIn(List<Double> values) {
            addCriterion("water_chy not in", values, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyBetween(Double value1, Double value2) {
            addCriterion("water_chy between", value1, value2, "waterChy");
            return (Criteria) this;
        }

        public Criteria andWaterChyNotBetween(Double value1, Double value2) {
            addCriterion("water_chy not between", value1, value2, "waterChy");
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