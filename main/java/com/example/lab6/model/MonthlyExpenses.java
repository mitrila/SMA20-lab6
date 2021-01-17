package com.example.lab6.model;

public class MonthlyExpenses {

    public String month;
    private float income, expenses;

    public MonthlyExpenses(){
        //default constructor to implement
    }

    public MonthlyExpenses(String month, float income, float expenses){
        this.expenses=expenses;
        this.income=income;
        this.month=month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }
}
