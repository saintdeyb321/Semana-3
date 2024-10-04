/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaelectronicap;

import Controlador.Controlador;
import Modelo.VentaArray;
import Vista.IInicio;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author USER 17
 */
public class TiendaElectronicaP {

    public static void main(String[] args) {
        try {
            // Establecer el Look and Feel antes de crear el JFrame
            UIManager.setLookAndFeel(new HiFiLookAndFeel()); // Cambia el Look and Feel según prefieras
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear una instancia de Controlador
        Controlador controlador = new Controlador();

        // Iniciar el JFrame después de haber establecido el Look and Feel
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IInicio inicio = new IInicio(controlador);
                inicio.setVisible(true); // Hacer visible el JFrame
                inicio.setLocationRelativeTo(null); // Centrar en la pantalla
            }
        });
    }
}