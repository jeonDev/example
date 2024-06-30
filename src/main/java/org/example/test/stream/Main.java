package org.example.test.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<String> divisionCodeList = List.of("2", "3", "6");

        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfLastMonth = currentDate.minusMonths(1).withDayOfMonth(1);
        YearMonth currentYearMonth = YearMonth.from(currentDate);
        LocalDate lastDayOfCurrentMonth = currentYearMonth.atEndOfMonth();
        LocalDate date = firstDayOfLastMonth;
        while (!date.isAfter(lastDayOfCurrentMonth)) {
            String format = date.format(formatter);
            List<Dttm> collect = divisionCodeList.stream()
                    .map(s -> new Dttm(format, s))
                    .collect(Collectors.toList());
            dttmList.addAll(collect);
            date = date.plusDays(1);
        }

        Map<String, Map<String, Data>> collect = dataList.stream()
                .collect(Collectors.groupingBy(Data::getDate,
                        Collectors.toMap(Data::getDivisionCode, payment -> payment)));

        dttmList.stream()
                .flatMap(d -> {
                    Data data = collect.getOrDefault(d.getDate(), Collections.emptyMap()).get(d.getDivisionCode());
                    if (data == null) {
                        return Stream.of(new Data(d.getDate(), d.getDivisionCode(), BigDecimal.ZERO));
                    } else {
                        return Stream.of(data);
                    }
                })
                .toList()
                .forEach(System.out::println);
    }

    static class Dttm {
        private String date;
        private String divisionCode;

        public Dttm(String date, String divisionCode) {
            this.date = date;
            this.divisionCode = divisionCode;
        }

        public String getDate() {
            return date;
        }

        public String getDivisionCode() {
            return divisionCode;
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

        @Override
        public String toString() {
            return "Data{" +
                    "date='" + date + '\'' +
                    ", divisionCode='" + divisionCode + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
}
