package cn.edu.zucc.library.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecordDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordDetailExample() {
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

        public Criteria andRecorddetailidIsNull() {
            addCriterion("recordDetailid is null");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidIsNotNull() {
            addCriterion("recordDetailid is not null");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidEqualTo(Integer value) {
            addCriterion("recordDetailid =", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidNotEqualTo(Integer value) {
            addCriterion("recordDetailid <>", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidGreaterThan(Integer value) {
            addCriterion("recordDetailid >", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordDetailid >=", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidLessThan(Integer value) {
            addCriterion("recordDetailid <", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidLessThanOrEqualTo(Integer value) {
            addCriterion("recordDetailid <=", value, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidIn(List<Integer> values) {
            addCriterion("recordDetailid in", values, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidNotIn(List<Integer> values) {
            addCriterion("recordDetailid not in", values, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidBetween(Integer value1, Integer value2) {
            addCriterion("recordDetailid between", value1, value2, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andRecorddetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("recordDetailid not between", value1, value2, "recorddetailid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusIsNull() {
            addCriterion("borrowstatus is null");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusIsNotNull() {
            addCriterion("borrowstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusEqualTo(Integer value) {
            addCriterion("borrowstatus =", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusNotEqualTo(Integer value) {
            addCriterion("borrowstatus <>", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusGreaterThan(Integer value) {
            addCriterion("borrowstatus >", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowstatus >=", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusLessThan(Integer value) {
            addCriterion("borrowstatus <", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusLessThanOrEqualTo(Integer value) {
            addCriterion("borrowstatus <=", value, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusIn(List<Integer> values) {
            addCriterion("borrowstatus in", values, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusNotIn(List<Integer> values) {
            addCriterion("borrowstatus not in", values, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusBetween(Integer value1, Integer value2) {
            addCriterion("borrowstatus between", value1, value2, "borrowstatus");
            return (Criteria) this;
        }

        public Criteria andBorrowstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowstatus not between", value1, value2, "borrowstatus");
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