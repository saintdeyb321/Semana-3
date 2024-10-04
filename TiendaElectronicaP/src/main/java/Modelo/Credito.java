/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER 17
 */
public class Credito extends Venta {
    private int x;     // Cantidad de productos
    private int letras; // Cantidad de cuotas

    // Constructor
    public Credito(int cantidad, String cliente, String fecha, String hora, String producto, String ruc, double precio, int x, int letras) {
        super(cantidad, cliente, fecha, hora, producto, ruc, precio);
        this.x = x;
        this.letras = letras;
    }

    // Método para obtener la cantidad de productos
    public int getX() {
        return x;
    }

    // Método para asignar la cantidad de productos
    public void setX(int x) {
        this.x = x;
    }

    // Método para obtener la cantidad de cuotas
    public int getLetras() {
        return letras;
    }

    // Método para asignar la cantidad de cuotas
    public void setLetras(int letras) {
        this.letras = letras;
    }

    // Método para calcular el monto mensual del crédito
    public double calculaMontoMensual(double subtotal) {
        double descuento;
        if (subtotal < 1000) {
            descuento = 0.03; // 3% de descuento
        } else if (subtotal <= 3000) {
            descuento = 0.05; // 5% de descuento
        } else {
            descuento = 0.08; // 8% de descuento
        }
        double totalConDescuento = subtotal - (subtotal * descuento);
        return totalConDescuento / letras; // Monto mensual
    }
}