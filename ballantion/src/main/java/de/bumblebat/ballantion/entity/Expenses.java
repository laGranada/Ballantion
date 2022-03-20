/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import static javax.persistence.EnumType.STRING;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MaggieSaurusRex
 */
@Entity
public class Expenses implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private double price;
    
    private String description;
    
    @NotNull
    @ManyToOne
    private Person person;
    
    @NotNull
    private LocalDateTime occurence;
    
    @NotNull
    @Enumerated(STRING)
    private ExpensesType type;
    
    @NotNull
    private boolean monthly;
    
    //TODO Steuerformular
    

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public Long getId() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public LocalDateTime getOccurence() {
        return occurence;
    }
    
    public void setOccurence(LocalDateTime occurence) {
        this.occurence = occurence;
    }
    
    public ExpensesType getType() {
        return type;
    }
    
    public void setType(ExpensesType type) {
        this.type = type;
    }
    
    public boolean isMonthly() {
        return monthly;
    }
    
    public void setMonthly(boolean monthly) {
        this.monthly = monthly;
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
        final Expenses other = (Expenses) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Expenses{" + "id=" + id + ", price=" + price + ", description=" + description + ", person=" + person + ", occurence=" + occurence + ", type=" + type + ", monthly=" + monthly + '}';
    }
   
}
