import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.*;


public class Servidor1 {
    public static void main(String[] args) {
        ventanaServidor1 ventana2 = new ventanaServidor1();
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para que al cerrar la ventana no siga ejecutandose el programa
    }

}

class ventanaServidor1 extends JFrame implements Runnable{ //hereda de JFrame para crear la ventana
    public ventanaServidor1 () {  //Constructor
        setBounds(500,200,300,300); //define ubicacion en x, y , ancho, alto del cuadro
        JPanel lamina2 = new JPanel ();
        lamina2.setLayout(new BorderLayout());
        setTitle("Servidor");

        areatexto = new JTextArea();

        lamina2.add(areatexto,BorderLayout.CENTER); // se añade en la lamina el area de texto centrada
        add(lamina2);
        setVisible(true); //mostrar en pantalla

        //Crear el hilo
        Thread hilo1 = new Thread(this);
        hilo1.start();
        
    }
    