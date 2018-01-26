package com.tyan.mangkubumi.modul.belanja.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BelanjaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BelanjaExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdTransaksiIsNull() {
            addCriterion("id_transaksi is null");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiIsNotNull() {
            addCriterion("id_transaksi is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiEqualTo(Integer value) {
            addCriterion("id_transaksi =", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiNotEqualTo(Integer value) {
            addCriterion("id_transaksi <>", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiGreaterThan(Integer value) {
            addCriterion("id_transaksi >", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_transaksi >=", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiLessThan(Integer value) {
            addCriterion("id_transaksi <", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiLessThanOrEqualTo(Integer value) {
            addCriterion("id_transaksi <=", value, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiIn(List<Integer> values) {
            addCriterion("id_transaksi in", values, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiNotIn(List<Integer> values) {
            addCriterion("id_transaksi not in", values, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiBetween(Integer value1, Integer value2) {
            addCriterion("id_transaksi between", value1, value2, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andIdTransaksiNotBetween(Integer value1, Integer value2) {
            addCriterion("id_transaksi not between", value1, value2, "idTransaksi");
            return (Criteria) this;
        }

        public Criteria andNamaCrewIsNull() {
            addCriterion("nama_crew is null");
            return (Criteria) this;
        }

        public Criteria andNamaCrewIsNotNull() {
            addCriterion("nama_crew is not null");
            return (Criteria) this;
        }

        public Criteria andNamaCrewEqualTo(String value) {
            addCriterion("nama_crew =", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewNotEqualTo(String value) {
            addCriterion("nama_crew <>", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewGreaterThan(String value) {
            addCriterion("nama_crew >", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewGreaterThanOrEqualTo(String value) {
            addCriterion("nama_crew >=", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewLessThan(String value) {
            addCriterion("nama_crew <", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewLessThanOrEqualTo(String value) {
            addCriterion("nama_crew <=", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewLike(String value) {
            addCriterion("nama_crew like", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewNotLike(String value) {
            addCriterion("nama_crew not like", value, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewIn(List<String> values) {
            addCriterion("nama_crew in", values, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewNotIn(List<String> values) {
            addCriterion("nama_crew not in", values, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewBetween(String value1, String value2) {
            addCriterion("nama_crew between", value1, value2, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andNamaCrewNotBetween(String value1, String value2) {
            addCriterion("nama_crew not between", value1, value2, "namaCrew");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiIsNull() {
            addCriterion("tanggal_transaksi is null");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiIsNotNull() {
            addCriterion("tanggal_transaksi is not null");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiEqualTo(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi =", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiNotEqualTo(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi <>", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiGreaterThan(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi >", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi >=", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiLessThan(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi <", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tanggal_transaksi <=", value, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiIn(List<Date> values) {
            addCriterionForJDBCDate("tanggal_transaksi in", values, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiNotIn(List<Date> values) {
            addCriterionForJDBCDate("tanggal_transaksi not in", values, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tanggal_transaksi between", value1, value2, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTanggalTransaksiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tanggal_transaksi not between", value1, value2, "tanggalTransaksi");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaIsNull() {
            addCriterion("total_belanja is null");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaIsNotNull() {
            addCriterion("total_belanja is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaEqualTo(BigDecimal value) {
            addCriterion("total_belanja =", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaNotEqualTo(BigDecimal value) {
            addCriterion("total_belanja <>", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaGreaterThan(BigDecimal value) {
            addCriterion("total_belanja >", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_belanja >=", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaLessThan(BigDecimal value) {
            addCriterion("total_belanja <", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_belanja <=", value, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaIn(List<BigDecimal> values) {
            addCriterion("total_belanja in", values, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaNotIn(List<BigDecimal> values) {
            addCriterion("total_belanja not in", values, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_belanja between", value1, value2, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andTotalBelanjaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_belanja not between", value1, value2, "totalBelanja");
            return (Criteria) this;
        }

        public Criteria andSetoranIsNull() {
            addCriterion("setoran is null");
            return (Criteria) this;
        }

        public Criteria andSetoranIsNotNull() {
            addCriterion("setoran is not null");
            return (Criteria) this;
        }

        public Criteria andSetoranEqualTo(BigDecimal value) {
            addCriterion("setoran =", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranNotEqualTo(BigDecimal value) {
            addCriterion("setoran <>", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranGreaterThan(BigDecimal value) {
            addCriterion("setoran >", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("setoran >=", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranLessThan(BigDecimal value) {
            addCriterion("setoran <", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranLessThanOrEqualTo(BigDecimal value) {
            addCriterion("setoran <=", value, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranIn(List<BigDecimal> values) {
            addCriterion("setoran in", values, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranNotIn(List<BigDecimal> values) {
            addCriterion("setoran not in", values, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("setoran between", value1, value2, "setoran");
            return (Criteria) this;
        }

        public Criteria andSetoranNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("setoran not between", value1, value2, "setoran");
            return (Criteria) this;
        }

        public Criteria andUangMakanIsNull() {
            addCriterion("uang_makan is null");
            return (Criteria) this;
        }

        public Criteria andUangMakanIsNotNull() {
            addCriterion("uang_makan is not null");
            return (Criteria) this;
        }

        public Criteria andUangMakanEqualTo(BigDecimal value) {
            addCriterion("uang_makan =", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanNotEqualTo(BigDecimal value) {
            addCriterion("uang_makan <>", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanGreaterThan(BigDecimal value) {
            addCriterion("uang_makan >", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("uang_makan >=", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanLessThan(BigDecimal value) {
            addCriterion("uang_makan <", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("uang_makan <=", value, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanIn(List<BigDecimal> values) {
            addCriterion("uang_makan in", values, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanNotIn(List<BigDecimal> values) {
            addCriterion("uang_makan not in", values, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uang_makan between", value1, value2, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andUangMakanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uang_makan not between", value1, value2, "uangMakan");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaIsNull() {
            addCriterion("jumlah_terima is null");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaIsNotNull() {
            addCriterion("jumlah_terima is not null");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaEqualTo(BigDecimal value) {
            addCriterion("jumlah_terima =", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaNotEqualTo(BigDecimal value) {
            addCriterion("jumlah_terima <>", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaGreaterThan(BigDecimal value) {
            addCriterion("jumlah_terima >", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jumlah_terima >=", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaLessThan(BigDecimal value) {
            addCriterion("jumlah_terima <", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jumlah_terima <=", value, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaIn(List<BigDecimal> values) {
            addCriterion("jumlah_terima in", values, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaNotIn(List<BigDecimal> values) {
            addCriterion("jumlah_terima not in", values, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jumlah_terima between", value1, value2, "jumlahTerima");
            return (Criteria) this;
        }

        public Criteria andJumlahTerimaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jumlah_terima not between", value1, value2, "jumlahTerima");
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