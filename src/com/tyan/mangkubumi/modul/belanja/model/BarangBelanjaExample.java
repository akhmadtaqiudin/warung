package com.tyan.mangkubumi.modul.belanja.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BarangBelanjaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BarangBelanjaExample() {
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

        public Criteria andNamaBarangIsNull() {
            addCriterion("nama_barang is null");
            return (Criteria) this;
        }

        public Criteria andNamaBarangIsNotNull() {
            addCriterion("nama_barang is not null");
            return (Criteria) this;
        }

        public Criteria andNamaBarangEqualTo(String value) {
            addCriterion("nama_barang =", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangNotEqualTo(String value) {
            addCriterion("nama_barang <>", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangGreaterThan(String value) {
            addCriterion("nama_barang >", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangGreaterThanOrEqualTo(String value) {
            addCriterion("nama_barang >=", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangLessThan(String value) {
            addCriterion("nama_barang <", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangLessThanOrEqualTo(String value) {
            addCriterion("nama_barang <=", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangLike(String value) {
            addCriterion("nama_barang like", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangNotLike(String value) {
            addCriterion("nama_barang not like", value, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangIn(List<String> values) {
            addCriterion("nama_barang in", values, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangNotIn(List<String> values) {
            addCriterion("nama_barang not in", values, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangBetween(String value1, String value2) {
            addCriterion("nama_barang between", value1, value2, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andNamaBarangNotBetween(String value1, String value2) {
            addCriterion("nama_barang not between", value1, value2, "namaBarang");
            return (Criteria) this;
        }

        public Criteria andHargaIsNull() {
            addCriterion("harga is null");
            return (Criteria) this;
        }

        public Criteria andHargaIsNotNull() {
            addCriterion("harga is not null");
            return (Criteria) this;
        }

        public Criteria andHargaEqualTo(BigDecimal value) {
            addCriterion("harga =", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaNotEqualTo(BigDecimal value) {
            addCriterion("harga <>", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaGreaterThan(BigDecimal value) {
            addCriterion("harga >", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("harga >=", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaLessThan(BigDecimal value) {
            addCriterion("harga <", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("harga <=", value, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaIn(List<BigDecimal> values) {
            addCriterion("harga in", values, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaNotIn(List<BigDecimal> values) {
            addCriterion("harga not in", values, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("harga between", value1, value2, "harga");
            return (Criteria) this;
        }

        public Criteria andHargaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("harga not between", value1, value2, "harga");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaIsNull() {
            addCriterion("banyaknya is null");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaIsNotNull() {
            addCriterion("banyaknya is not null");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaEqualTo(Integer value) {
            addCriterion("banyaknya =", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaNotEqualTo(Integer value) {
            addCriterion("banyaknya <>", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaGreaterThan(Integer value) {
            addCriterion("banyaknya >", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaGreaterThanOrEqualTo(Integer value) {
            addCriterion("banyaknya >=", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaLessThan(Integer value) {
            addCriterion("banyaknya <", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaLessThanOrEqualTo(Integer value) {
            addCriterion("banyaknya <=", value, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaIn(List<Integer> values) {
            addCriterion("banyaknya in", values, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaNotIn(List<Integer> values) {
            addCriterion("banyaknya not in", values, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaBetween(Integer value1, Integer value2) {
            addCriterion("banyaknya between", value1, value2, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andBanyaknyaNotBetween(Integer value1, Integer value2) {
            addCriterion("banyaknya not between", value1, value2, "banyaknya");
            return (Criteria) this;
        }

        public Criteria andJumlahIsNull() {
            addCriterion("jumlah is null");
            return (Criteria) this;
        }

        public Criteria andJumlahIsNotNull() {
            addCriterion("jumlah is not null");
            return (Criteria) this;
        }

        public Criteria andJumlahEqualTo(BigDecimal value) {
            addCriterion("jumlah =", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahNotEqualTo(BigDecimal value) {
            addCriterion("jumlah <>", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahGreaterThan(BigDecimal value) {
            addCriterion("jumlah >", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jumlah >=", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahLessThan(BigDecimal value) {
            addCriterion("jumlah <", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jumlah <=", value, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahIn(List<BigDecimal> values) {
            addCriterion("jumlah in", values, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahNotIn(List<BigDecimal> values) {
            addCriterion("jumlah not in", values, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jumlah between", value1, value2, "jumlah");
            return (Criteria) this;
        }

        public Criteria andJumlahNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jumlah not between", value1, value2, "jumlah");
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