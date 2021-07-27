package com.example.covidtracker;

public class CountryModel {
    private String flag, country, cases, recovered, critical, active, today, totalDeaths, todayDeaths;

    public CountryModel() {
    }

    public CountryModel(String flag, String country, String cases, String recovered, String critical, String active, String today, String totalDeaths, String todayDeaths) {
        this.flag = flag;
        this.country = country;
        this.cases = cases;
        this.recovered = recovered;
        this.critical = critical;
        this.active = active;
        this.today = today;
        this.totalDeaths = totalDeaths;
        this.todayDeaths = todayDeaths;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }
}
