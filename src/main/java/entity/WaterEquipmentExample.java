package entity;

import java.util.ArrayList;
import java.util.List;

public class WaterEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterEquipmentExample() {
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

        public Criteria andWatIdIsNull() {
            addCriterion("wat_id is null");
            return (Criteria) this;
        }

        public Criteria andWatIdIsNotNull() {
            addCriterion("wat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWatIdEqualTo(Integer value) {
            addCriterion("wat_id =", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdNotEqualTo(Integer value) {
            addCriterion("wat_id <>", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdGreaterThan(Integer value) {
            addCriterion("wat_id >", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wat_id >=", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdLessThan(Integer value) {
            addCriterion("wat_id <", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdLessThanOrEqualTo(Integer value) {
            addCriterion("wat_id <=", value, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdIn(List<Integer> values) {
            addCriterion("wat_id in", values, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdNotIn(List<Integer> values) {
            addCriterion("wat_id not in", values, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdBetween(Integer value1, Integer value2) {
            addCriterion("wat_id between", value1, value2, "watId");
            return (Criteria) this;
        }

        public Criteria andWatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wat_id not between", value1, value2, "watId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andClearnowIsNull() {
            addCriterion("clearNow is null");
            return (Criteria) this;
        }

        public Criteria andClearnowIsNotNull() {
            addCriterion("clearNow is not null");
            return (Criteria) this;
        }

        public Criteria andClearnowEqualTo(Integer value) {
            addCriterion("clearNow =", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowNotEqualTo(Integer value) {
            addCriterion("clearNow <>", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowGreaterThan(Integer value) {
            addCriterion("clearNow >", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowGreaterThanOrEqualTo(Integer value) {
            addCriterion("clearNow >=", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowLessThan(Integer value) {
            addCriterion("clearNow <", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowLessThanOrEqualTo(Integer value) {
            addCriterion("clearNow <=", value, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowIn(List<Integer> values) {
            addCriterion("clearNow in", values, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowNotIn(List<Integer> values) {
            addCriterion("clearNow not in", values, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowBetween(Integer value1, Integer value2) {
            addCriterion("clearNow between", value1, value2, "clearnow");
            return (Criteria) this;
        }

        public Criteria andClearnowNotBetween(Integer value1, Integer value2) {
            addCriterion("clearNow not between", value1, value2, "clearnow");
            return (Criteria) this;
        }

        public Criteria andWaterConditionIsNull() {
            addCriterion("water_condition is null");
            return (Criteria) this;
        }

        public Criteria andWaterConditionIsNotNull() {
            addCriterion("water_condition is not null");
            return (Criteria) this;
        }

        public Criteria andWaterConditionEqualTo(Integer value) {
            addCriterion("water_condition =", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionNotEqualTo(Integer value) {
            addCriterion("water_condition <>", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionGreaterThan(Integer value) {
            addCriterion("water_condition >", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_condition >=", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionLessThan(Integer value) {
            addCriterion("water_condition <", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionLessThanOrEqualTo(Integer value) {
            addCriterion("water_condition <=", value, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionIn(List<Integer> values) {
            addCriterion("water_condition in", values, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionNotIn(List<Integer> values) {
            addCriterion("water_condition not in", values, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionBetween(Integer value1, Integer value2) {
            addCriterion("water_condition between", value1, value2, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andWaterConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("water_condition not between", value1, value2, "waterCondition");
            return (Criteria) this;
        }

        public Criteria andXPointIsNull() {
            addCriterion("x_point is null");
            return (Criteria) this;
        }

        public Criteria andXPointIsNotNull() {
            addCriterion("x_point is not null");
            return (Criteria) this;
        }

        public Criteria andXPointEqualTo(Double value) {
            addCriterion("x_point =", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointNotEqualTo(Double value) {
            addCriterion("x_point <>", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointGreaterThan(Double value) {
            addCriterion("x_point >", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointGreaterThanOrEqualTo(Double value) {
            addCriterion("x_point >=", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointLessThan(Double value) {
            addCriterion("x_point <", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointLessThanOrEqualTo(Double value) {
            addCriterion("x_point <=", value, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointIn(List<Double> values) {
            addCriterion("x_point in", values, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointNotIn(List<Double> values) {
            addCriterion("x_point not in", values, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointBetween(Double value1, Double value2) {
            addCriterion("x_point between", value1, value2, "xPoint");
            return (Criteria) this;
        }

        public Criteria andXPointNotBetween(Double value1, Double value2) {
            addCriterion("x_point not between", value1, value2, "xPoint");
            return (Criteria) this;
        }

        public Criteria andYPointIsNull() {
            addCriterion("y_point is null");
            return (Criteria) this;
        }

        public Criteria andYPointIsNotNull() {
            addCriterion("y_point is not null");
            return (Criteria) this;
        }

        public Criteria andYPointEqualTo(Double value) {
            addCriterion("y_point =", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointNotEqualTo(Double value) {
            addCriterion("y_point <>", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointGreaterThan(Double value) {
            addCriterion("y_point >", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointGreaterThanOrEqualTo(Double value) {
            addCriterion("y_point >=", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointLessThan(Double value) {
            addCriterion("y_point <", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointLessThanOrEqualTo(Double value) {
            addCriterion("y_point <=", value, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointIn(List<Double> values) {
            addCriterion("y_point in", values, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointNotIn(List<Double> values) {
            addCriterion("y_point not in", values, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointBetween(Double value1, Double value2) {
            addCriterion("y_point between", value1, value2, "yPoint");
            return (Criteria) this;
        }

        public Criteria andYPointNotBetween(Double value1, Double value2) {
            addCriterion("y_point not between", value1, value2, "yPoint");
            return (Criteria) this;
        }

        public Criteria andFlagPhIsNull() {
            addCriterion("flag_ph is null");
            return (Criteria) this;
        }

        public Criteria andFlagPhIsNotNull() {
            addCriterion("flag_ph is not null");
            return (Criteria) this;
        }

        public Criteria andFlagPhEqualTo(Integer value) {
            addCriterion("flag_ph =", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhNotEqualTo(Integer value) {
            addCriterion("flag_ph <>", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhGreaterThan(Integer value) {
            addCriterion("flag_ph >", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_ph >=", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhLessThan(Integer value) {
            addCriterion("flag_ph <", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhLessThanOrEqualTo(Integer value) {
            addCriterion("flag_ph <=", value, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhIn(List<Integer> values) {
            addCriterion("flag_ph in", values, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhNotIn(List<Integer> values) {
            addCriterion("flag_ph not in", values, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhBetween(Integer value1, Integer value2) {
            addCriterion("flag_ph between", value1, value2, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagPhNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_ph not between", value1, value2, "flagPh");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyIsNull() {
            addCriterion("flag_tmp_oxy is null");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyIsNotNull() {
            addCriterion("flag_tmp_oxy is not null");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyEqualTo(Integer value) {
            addCriterion("flag_tmp_oxy =", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyNotEqualTo(Integer value) {
            addCriterion("flag_tmp_oxy <>", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyGreaterThan(Integer value) {
            addCriterion("flag_tmp_oxy >", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_tmp_oxy >=", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyLessThan(Integer value) {
            addCriterion("flag_tmp_oxy <", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyLessThanOrEqualTo(Integer value) {
            addCriterion("flag_tmp_oxy <=", value, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyIn(List<Integer> values) {
            addCriterion("flag_tmp_oxy in", values, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyNotIn(List<Integer> values) {
            addCriterion("flag_tmp_oxy not in", values, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyBetween(Integer value1, Integer value2) {
            addCriterion("flag_tmp_oxy between", value1, value2, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagTmpOxyNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_tmp_oxy not between", value1, value2, "flagTmpOxy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyIsNull() {
            addCriterion("flag_heavy is null");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyIsNotNull() {
            addCriterion("flag_heavy is not null");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyEqualTo(Integer value) {
            addCriterion("flag_heavy =", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyNotEqualTo(Integer value) {
            addCriterion("flag_heavy <>", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyGreaterThan(Integer value) {
            addCriterion("flag_heavy >", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_heavy >=", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyLessThan(Integer value) {
            addCriterion("flag_heavy <", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyLessThanOrEqualTo(Integer value) {
            addCriterion("flag_heavy <=", value, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyIn(List<Integer> values) {
            addCriterion("flag_heavy in", values, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyNotIn(List<Integer> values) {
            addCriterion("flag_heavy not in", values, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyBetween(Integer value1, Integer value2) {
            addCriterion("flag_heavy between", value1, value2, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagHeavyNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_heavy not between", value1, value2, "flagHeavy");
            return (Criteria) this;
        }

        public Criteria andFlagChyIsNull() {
            addCriterion("flag_chy is null");
            return (Criteria) this;
        }

        public Criteria andFlagChyIsNotNull() {
            addCriterion("flag_chy is not null");
            return (Criteria) this;
        }

        public Criteria andFlagChyEqualTo(Integer value) {
            addCriterion("flag_chy =", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyNotEqualTo(Integer value) {
            addCriterion("flag_chy <>", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyGreaterThan(Integer value) {
            addCriterion("flag_chy >", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_chy >=", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyLessThan(Integer value) {
            addCriterion("flag_chy <", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyLessThanOrEqualTo(Integer value) {
            addCriterion("flag_chy <=", value, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyIn(List<Integer> values) {
            addCriterion("flag_chy in", values, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyNotIn(List<Integer> values) {
            addCriterion("flag_chy not in", values, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyBetween(Integer value1, Integer value2) {
            addCriterion("flag_chy between", value1, value2, "flagChy");
            return (Criteria) this;
        }

        public Criteria andFlagChyNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_chy not between", value1, value2, "flagChy");
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