/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ship_management;


public class Cannon {
int damage;
int ammunition=20;
String cannon_name;
int mag_size=5;
int magazine= mag_size;
boolean loaded=false;

    public Cannon(int damage, int ammunition, String cannon_name,int mag_size) {
        this.damage = damage;
        this.ammunition = ammunition;
        this.cannon_name = cannon_name;
        this.mag_size=mag_size;
    }
    boolean Cannon_ready(){
        if(magazine==0)
        {
           return false;
        }
        else if(loaded==false){
            return false;
        }
       
        return true;
    }
    boolean Reload(){
        if(ammunition==0){
            return false;
        }     
           ammunition-=mag_size;
        magazine=mag_size;
        return true;
        
       
    }
    
}
