/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.entity;

import java.io.Serializable;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author MaggieSaurusRex
 */
@Entity
public class YearOverview implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Year year;
    
    private Map<ExpensesType, Double> expensesByType = new HashMap<>();

    public YearOverview() {
    }

    public YearOverview(Long id, Year year, Map<ExpensesType, Double> expensesByType) {
        this.id = id;
        this.year = year;
        this.expensesByType = expensesByType;
    }

    public YearOverview(Year year, Map<ExpensesType, Double> expensesByType) {
        this.year = year;
        this.expensesByType = expensesByType;
    }
    
    public void add(ExpensesType type, Double price){
        expensesByType.put(type, price);
    }
    

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public Long getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    public Map<ExpensesType, Double> getExpensesByType() {
        return expensesByType;
    }

    public void setExpensesByType(Map<ExpensesType, Double> expensesByType) {
        this.expensesByType = expensesByType;
    }

//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="hashCode/equals">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final YearOverview other = (YearOverview) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "YearOverview{" + "id=" + id + ", year=" + year + ", expensesByType=" + expensesByType + '}';
    }


}
