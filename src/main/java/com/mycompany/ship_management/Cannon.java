/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ship_management;

/**
 *
 * @author colombo.jordan
 */
public class Cannon {
int damage;
int ammunition;
String cannon_name;
int mag_size;

    public Cannon(int damage, int ammunition, String cannon_name,int mag_size) {
        this.damage = damage;
        this.ammunition = ammunition;
        this.cannon_name = cannon_name;
        this.mag_size=mag_size;
    }
    public int Get_damage(){
    ammunition--;        
    return damage;
    }
    
}
