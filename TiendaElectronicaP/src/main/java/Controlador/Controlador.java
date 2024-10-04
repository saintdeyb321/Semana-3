/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Contado;
import Modelo.Credito;
import Modelo.Venta;
import Modelo.VentaArray;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER 17
 */
public class Controlador {

     private VentaArray ventasArray;

    // Constructor para inicializar el Controlador sin parámetros
    public Controlador() {
        this.ventasArray = new VentaArray(); // Crear una nueva instancia de VentaArray
    }

    // Constructor opcional si necesitas inicializar con una lista existente
    public Controlador(VentaArray ventasArray) {
        this.ventasArray = ventasArray;
    }

    // Lógica para agregar una venta al array de ventas
    public void agregarVenta(Venta venta) {
        ventasArray.agregarVenta(venta);
    }

    // Lógica para eliminar una venta del array según el índice
    public void eliminarVenta(int index) {
        ventasArray.eliminarVenta(index);
    }

    // Lógica para obtener una venta según el índice
    public Venta obtenerVenta(int index) {
        return ventasArray.obtenerVenta(index);
    }

    // Lógica para obtener todas las ventas
    public ArrayList<Venta> obtenerTodasLasVentas() {
        return ventasArray.obtenerTodasLasVentas();
    }

    // Lógica para calcular el subtotal de una venta
    public double calcularSubtotalVenta(int index) {
        Venta venta = ventasArray.obtenerVenta(index);
        return venta.calculaSubtotal();
    }

    // Lógica para calcular el descuento en ventas al contado
    public double calcularDescuentoContado(int index) {
        Venta venta = ventasArray.obtenerVenta(index);
        if (venta instanceof Contado) {
            Contado contado = (Contado) venta;
            return contado.calculaDescuento(contado.calculaSubtotal());
        }
        return 0.0;
    }

    // Lógica para calcular el monto mensual en ventas a crédito
    public double calcularMontoMensualCredito(int index) {
        Venta venta = ventasArray.obtenerVenta(index);
        if (venta instanceof Credito) {
            Credito credito = (Credito) venta;
            return credito.calculaMontoMensual(credito.calculaSubtotal());
        }
        return 0.0;
    }
    
    public void agregarVentaCredito(String cliente, String ruc, String producto, int cantidad, String fecha, String hora) {
    Credito nuevaVentaCredito = new Credito(cantidad, cliente, fecha, hora, producto, ruc, 0.0, cantidad, 0);
    double precio = nuevaVentaCredito.asignaPrecio(producto);
    nuevaVentaCredito.setPrecio(precio);
    agregarVenta(nuevaVentaCredito);  // Método que maneja la lista de ventas
}

public double calcularResumen(int letras, JTable tblResumen) {
    double totalMontoPagar = 0;
    DefaultTableModel model = (DefaultTableModel) tblResumen.getModel();
    model.setRowCount(0);  // Limpiar la tabla

    for (Venta venta : obtenerTodasLasVentas()) {
        if (venta instanceof Credito) {
            Credito credito = (Credito) venta;
            double subtotal = credito.calculaSubtotal();
            totalMontoPagar += subtotal;
        }
    }

    double montoMensual = totalMontoPagar / letras;
    for (int i = 1; i <= letras; i++) {
        model.addRow(new Object[]{i, montoMensual});
    }

    return totalMontoPagar;
}




}
