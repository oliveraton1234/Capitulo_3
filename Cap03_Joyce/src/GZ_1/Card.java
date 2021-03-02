/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GZ_1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Card {
    private Suit suit;
    private Integer valor;

    public Card() {
        this.suit = Suit.CORAZONES;
        this.valor = 13;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    public void showCard(){
        switch(valor) {
            case 11:
                System.out.println(String.format("J de %s", this.suit));
                break;
                
            case 12:
                System.out.println(String.format("Q de %s", this.suit));
                break;
                
            case 13:
                System.out.println(String.format("K de %s", this.suit));
                break;
                
            default:
                System.out.println(String.format("%d de %s", this.valor, this.suit));
                break;
        }
    }
    
    public void randomSuit(){
        Suit[] tipos = Suit.values();
        Random rnd = new Random();
        
        this.setSuit(tipos[rnd.nextInt(tipos.length)]);
    }
    
    public void randomValue(){
        Random rand = new Random();
        int val = rand.nextInt(13) + 1;
        
        this.setValor(val);
    }
}
