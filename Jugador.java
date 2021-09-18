
import javax.swing.*;  //importar interfaz grafica 
import java.awt.*;
import java.awt.event.*;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*; 


public class Jugador implements Runnable{
    //Se declaran las variables para la conexion y comunicacion
    private Socket jugador;
    private DataOutputStream out;
    private DataInputStream in;
    private String host = "localhost";
}

//Variables del Frame
private String mensaje;
private Main frame;
private JButton [] [] botones;
private ActionListener ac;



class ventanajugador extends JFrame {  //La clase hereda de JFrame para poder crear cuadros(ventanas)
    public ventanajugador(){ //constructor
        setBounds(500,200,600,300); //define ubicacion en x, y , ancho, alto del cuadro
        setResizable(false); //Evita que se puede redimencionar la ventana 
        setTitle("Cliente"); //Colocar un titulo en la ventana 
        Lamina lamina1 = new Lamina(); //Se crea un objeto
        add(lamina1); 
        setVisible(true); //metodo para poder mostrar la ventana
    }
}

class Lamina expends JPanel implements Runnable{
    JLabel datos = new JLabel(" "); // instancia para agregar una etiqueta de texto
        add(datos); // se añade el texto a la lamina

}