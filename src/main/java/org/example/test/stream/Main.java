package org.example.test.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        List<Dttm> dttmList = new ArrayList<>();
        List<Data> dataList = List.of(
                new Data("20240530", "1", BigDecimal.TEN),
                new Data("20240530", "2", BigDecimal.TEN),
                new Data("20240529", "1", BigDecimal.ONE),
                new Data("20240529", "2", BigDecimal.ONE),
                new Data("20240601", "2", BigDecimal.TEN),
                new Data("20240602", "1", BigDecimal.TEN)
        );

        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfLastMonth = currentDate.minusMonths(1).withDayOfMonth(1);
        YearMonth currentYearMonth = YearMonth.from(currentDate);
        LocalDate lastDayOfCurrentMonth = currentYearMonth.atEndOfMonth();
        LocalDate date = firstDayOfLastMonth;
        while (!date.isAfter(lastDayOfCurrentMonth)) {
            Dttm dttm = new Dttm(date.format(formatter));
            dttmList.add(dttm);
            date = date.plusDays(1);
        }



    }

    static class Dttm {
        private String date;

        public Dttm(String date) {
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return date;
        }
    }

    static class Data {
        private String date;
        private String divisionCode;
        private BigDecimal amount;

        public String getDate() {
            return date;
        }

        public String getDivisionCode() {
            return divisionCode;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public Data(String date, String divisionCode, BigDecimal amount) {
            this.date = date;
            this.divisionCode = divisionCode;
            this.amount = amount;
        }
    }
}
