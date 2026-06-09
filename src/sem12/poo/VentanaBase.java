/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem12.poo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UCC20411
 */
public class VentanaBase extends JFrame{
    private JLabel titulo;
    private JTextField caja;
    private JButton ver;
    
    public VentanaBase(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setLayout(null);
        setTitle ("GUI");
        iniciar_controles();
        
        }
    public void iniciar_controles()
    {
    titulo = new JLabel();
    titulo.setBounds(110,50,180,25);
    titulo.setText("MENSAJE");
    add(titulo);
    
    caja = new JTextField();
    caja.setBounds(110,70,180,25);
    caja.setText("");
    add(caja);
    
    ver = new JButton();
    ver.setBounds(110,100,180,25);
    ver.setText("VER");
    add(ver);
    }
}


