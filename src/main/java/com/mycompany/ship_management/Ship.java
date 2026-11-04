/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ship_management;

/**
 *
 * @author colombo.jordan
 */
public class Ship {
    String ship_name;
    int health=100;
    int shield=50;
    Cannon current_gun=null;

    public Ship(String ship_name) {
        this.ship_name = ship_name;
    }
    boolean Fire(){
        if(current_gun.loaded==false){
            return false;
        }
        else if(current_gun.magazine==0){
            return false;
        }
        current_gun.magazine--;
        return true;
    }
    void Cannon_equip(Cannon c){
        current_gun=c;
        current_gun.loaded=true;
        
    }
     void Cannon_unequip(){
        current_gun=null;
        current_gun.loaded=false;
    }
     void TakeDamage(Ship s){
        if(shield-s.current_gun.damage>=0){
            shield-=s.current_gun.damage; 
         }
        else{
        health=health-(shield-s.current_gun.damage);     
        }    
     }
     
}
