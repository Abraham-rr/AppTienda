/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;


public interface subject {
    
    void notifyObserver(Observer observer);
    void removeObserver();
    void registerObserver(Observer observer);
}
