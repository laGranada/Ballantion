/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bumblebat.ballantion.entity;

/**
 *
 * @author MaggieSaurusRex
 */
public enum ExpenseType {
    
    FOOD("FD", "Food", "Essen"),
    KEYBOARD("KBD", "Keyboards", "Tastaturen"),
    MAGIC("MTG", "Magic", "Magic"),
    GAME("GME", "Games", "Spiele"),
    COSMETIC("", "Cosmetics", "Kosmetik"),
    CLOTHING("", "Clothing", "Kleidung"),
    FLAT("FLT", "Flat", "Wohnung"),
    NFT("NFT", "REALLY!?", "you're a real spendthrift!");
    
    
    private String shortCut;
    
    private String nameENG;
    private String nameGER;

    private ExpenseType(String shortCut, String nameENG, String nameGER) {
        this.shortCut = shortCut;
        this.nameENG = nameENG;
        this.nameGER = nameGER;
    }
    
    
}
