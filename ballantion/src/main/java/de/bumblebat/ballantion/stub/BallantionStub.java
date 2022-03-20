/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.stub;

import de.bumblebat.ballantion.entity.Expenses;
import de.bumblebat.ballantion.entity.Person;
import de.bumblebat.ballantion.entity.YearOverview;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author MaggieSaurusRex
 */
@Stateless
public class BallantionStub {
    
    
    public Person getCurrentUser(){
        return null;
    }
    
    public List<Expenses> findCurrenMonthExpenses(){
        return new ArrayList<>();
    }
    public List<Expenses> findExpensesByMonth(Month selectedMonth){
        return new ArrayList<>();
    }
    
    public List<Expenses> findCurrenYearExpenses(){
        return new ArrayList<>();
    }
    public YearOverview findYearOverviewByYear(Year selectedYear){
        return null;
    }
}
