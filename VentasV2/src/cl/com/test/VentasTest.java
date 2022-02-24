/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.com.test;

import cl.com.ventas.Orden;
import cl.com.ventas.Producto;

/**
 *
 * @author Fernando Davila
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("correa", 25000);
        Producto p2 = new Producto("aaa", 5000);

        Orden o1 = new Orden();

        o1.agregarProducto(p1);
        o1.agregarProducto(p2);

        o1.mostrarOrden();
    }
}
