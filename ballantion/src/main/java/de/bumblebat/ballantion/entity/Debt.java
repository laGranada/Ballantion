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
public class Debt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private Person debtor;
    
    @NotNull
    @ManyToOne
    private Person debtHolder;
    
    private double price;
    
    private String description;
    
    @NotNull
    @ManyToOne
    private Person person;
    
    @NotNull
    private LocalDateTime occurence;
    
    @NotNull
    @Enumerated(STRING)
    private ExpenseType type;
    
    private boolean open;
    

    public Debt() {
    }

    public Debt(Long id, Person debtor, Person debtHolder, double price, String description, Person person, LocalDateTime occurence, ExpenseType type) {
        this.id = id;
        this.debtor = debtor;
        this.debtHolder = debtHolder;
        this.price = price;
        this.description = description;
        this.person = person;
        this.occurence = occurence;
        this.type = type;
    }

    //<editor-fold defaultstate="collapsed" desc="getter/setter">
    public Long getId() {
        return id;
    }
    
    public Person getDebtor() {
        return debtor;
    }
    
    public void setDebtor(Person debtor) {
        this.debtor = debtor;
    }
    
    public Person getDebtHolder() {
        return debtHolder;
    }
    
    public void setDebtHolder(Person debtHolder) {
        this.debtHolder = debtHolder;
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
    
    public ExpenseType getType() {
        return type;
    }
    
    public void setType(ExpenseType type) {
        this.type = type;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="hashCode/equals">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Debt other = (Debt) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Debt{" + "id=" + id + ", debtor=" + debtor + ", debtHolder=" + debtHolder + ", price=" + price + ", description=" + description + ", person=" + person + ", occurence=" + occurence + ", type=" + type + '}';
    }
}
