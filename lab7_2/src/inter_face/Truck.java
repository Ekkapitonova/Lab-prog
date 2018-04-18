/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter_face;

/**
 *
 * @author Екатерина
 */
public class Truck implements CargoAuto{
    public void transportCargo() {
        System.out.println("Везу груз");
        }
    public static void main(String[] args){ 
       Truck ob= new Truck();
       ob.transportCargo();
    }
}

