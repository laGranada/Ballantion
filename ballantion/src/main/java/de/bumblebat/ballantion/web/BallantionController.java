/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.web;

import de.bumblebat.ballantion.entity.Expenses;
import de.bumblebat.ballantion.entity.Person;
import de.bumblebat.ballantion.entity.YearOverview;
import de.bumblebat.ballantion.stub.BallantionStub;
import java.io.Serializable;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author MaggieSaurusRex
 */
@ViewScoped
public class BallantionController implements Serializable{
    
    private static final Logger L = LoggerFactory.getLogger(BallantionController.class);
    
    @Inject
    private BallantionStub stub;
    
    private Person user;
    
    private List<Expenses> currentMonthExpenses = new ArrayList<>();
    
    private double currentMonthTotalExpenses;
    
    private List<Expenses> selectedMonthExpenses = new ArrayList<>();
    
    private List<Expenses> currentYearExpenses = new ArrayList<>();
    private Month selectedMonth;
    
    private YearOverview selectedYearOverview;
    private Year selectedYear;
    
    @PostConstruct
    public void init() {
        user = stub.getCurrentUser();
        
        currentMonthExpenses = new ArrayList<>(stub.findCurrenMonthExpenses());
        currentMonthTotalExpenses = currentMonthExpenses.stream().mapToDouble(e -> e.getPrice()).sum();
        
        currentYearExpenses = new ArrayList<>(stub.findCurrenYearExpenses());
    }
    
    public void findSelectedYearOverview(){
        selectedYearOverview = stub.findYearOverviewByYear(selectedYear);
    }
    public void findExpensesBySelectedMonth(){
        selectedMonthExpenses = new ArrayList<>(stub.findExpensesByMonth(selectedMonth));
    }
    
}
