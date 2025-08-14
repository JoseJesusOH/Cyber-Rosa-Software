package ejecucion;

import GUIs.InicioSesion;

public class Ejecucion {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesion.getInstance().setVisible(true);
            }
        });
    }
}
