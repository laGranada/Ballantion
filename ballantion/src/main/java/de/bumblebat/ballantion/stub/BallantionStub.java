/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.stub;

import de.bumblebat.ballantion.entity.Expense;
import de.bumblebat.ballantion.entity.ExpenseType;
import de.bumblebat.ballantion.entity.Person;
import de.bumblebat.ballantion.entity.YearOverview;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author MaggieSaurusRex
 */
@Stateless
public class BallantionStub {

    private static final Logger L = LoggerFactory.getLogger(BallantionStub.class);

    private Person user;

    private List<Expense> currentMonthExpenses = new ArrayList<>();

    private List<Expense> selectedMonthExpenses = new ArrayList<>();

    private List<Expense> currentYearExpenses = new ArrayList<>();

    private List<ExpenseType> expenseTypes = new ArrayList<>(Arrays.asList(ExpenseType.values()));

    private YearOverview selectedYearOverview;

    private static final Random R = new Random();

    public BallantionStub() {
        //create user
        user = new Person(1l, "Karl-Heinz", "Müller");

        currentMonthExpenses = new ArrayList<>();
        currentYearExpenses = new ArrayList<>();

        List<Month> months = new ArrayList<>(Arrays.asList(Month.values()));
        LocalDate today = LocalDate.now();
        for (Month month : months) {
            while (month.getValue() <= today.getMonthValue()) {
                for (ExpenseType type : expenseTypes) {
                    //create for each expenseTyp x expenses
                    int amount = R.nextInt(10);
                    for (int i = 0; i < amount; i++) {
                        int day = (month.getValue() == today.getMonthValue() ? R.nextInt(today.getDayOfMonth()):R.nextInt(month.minLength())) +1;
                    }
                }
            }
        }

    }

    public Person getCurrentUser() {
        return user;
    }

    public List<Expense> findCurrenMonthExpenses() {
        return new ArrayList<>();
    }

    public List<Expense> findExpensesByMonth(Month selectedMonth) {
        return new ArrayList<>();
    }

    public void addExpenses(Expense expense) {

    }

    public void editExpense(Expense expense) {

    }

    public List<Expense> findCurrenYearExpenses() {
        return new ArrayList<>();
    }

    public YearOverview findYearOverviewByYear(Year selectedYear) {
        return null;
    }
}
