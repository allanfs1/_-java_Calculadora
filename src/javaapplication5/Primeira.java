/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Allan
 */
public class Primeira extends JFrame{
    

    private JLabel labe;
    private JTextField jtxt;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    private JTextField jtxt2;
    private JComboBox jbox;
    private Container cn;
    private JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;  
    private String  operador;
    private JLabel  label;
    private JPanel painelBorda; 
    private String aux = " ";
    private Double valorx,valory;
    private int i=0;  
    /**
     * @param args the command line arguments
     */
          
    public void primeiraTela(){
       
        
        String[] vet = new String[1];////Vector de Historico
        List<String> boxvt = new ArrayList<String>();
        int LARGURA =200;
        vet[0] = "NULL";
        //--------------------------------------------------
     
        //-----------------------------------------------------------
        labe = new JLabel("Nome:");
        jtxt = new JTextField();
        jtxt2 = new JTextField(); 
        btn1  = new JButton("Info");
        btn2  = new JButton("+"); btn3 = new JButton("-");btn4  = new JButton("*");  btn5  = new JButton("/");     
        btn6  = new JButton("S"); btn7 = new JButton("X");
        bt0  = new JButton("0");  bt1  = new JButton("1");
        bt2  = new JButton("2"); bt3  = new JButton("3");
        bt4  = new JButton("4");  bt5  = new JButton("5"); 
        bt6  = new JButton("6"); bt7  = new JButton("7");
        bt8  = new JButton("8"); bt9  = new JButton("9");
        bt10  = new JButton("=");
        jbox =new JComboBox(vet);///J Cuboo 
        label = new JLabel("OFF/ON");
        painelBorda = new JPanel();
        
        
        cn =  getContentPane();
        
        
        setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE); 
        this.setSize(350,300);
        this.setTitle("Calculadora");
        cn.setLayout(null);
        this.setVisible(true);
        
        
        labe.setBounds(10,10,100,25);
        jtxt.setBounds(50,10,80,30);
        jtxt2.setBounds(130,10,100,30);
        jbox.setBounds(230,10,100,30);
        
        ///Operadores
        btn1.setBounds(5,200,50,30);btn1.setBackground(Color.lightGray);///BTN ok
        btn2.setBounds(250,(LARGURA/3),50,30);
        btn3.setBounds(250,(LARGURA/2),50,30);
        btn4.setBounds(250,135,50,30);
        btn5.setBounds(250,170,50,30);
        btn6.setBounds(5,65,50,30);btn7.setBounds(5,100,50,30);///Botoes Binarios
        //-----------------------------------------------------------------------
        bt0.setBounds(80,65,45,30);bt1.setBounds(130,65,45,30);bt2.setBounds(180,65,45,30);
        bt3.setBounds(80,100,45,30);bt4.setBounds(130,100,45,30);bt5.setBounds(180,100,45,30);
        bt6.setBounds(80,135,45,30);bt7.setBounds(130,135,45,30);bt8.setBounds(180,135,45,30);
        bt9.setBounds(80,170,45,30);bt10.setBounds(130,170,45,30);
        label.setBounds(10,0,200,100);
        painelBorda.setBounds(60,45,180,190);
        painelBorda.setBorder(BorderFactory.createTitledBorder("Painel"));
      
        
    
        cn.add(labe);
        cn.add(jtxt);
        cn.add(jtxt2);
        cn.add(jbox);
        cn.add(btn1);cn.add(btn2);cn.add(btn3);cn.add(btn4);cn.add(btn5);
        cn.add(btn6);cn.add(btn7);
        //-----------------------------------------------------------------------
        cn.add(bt0);cn.add(bt1);cn.add(bt2);cn.add(bt3);cn.add(bt4);cn.add(bt5);
        cn.add(bt6);cn.add(bt7);cn.add(bt8);cn.add(bt9);cn.add(bt10);
        cn.add(label);
        cn.add(painelBorda);
        
                        /*Jcubo box*/
         jbox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == ItemEvent.SELECTED){
                    jtxt2.setText(String.valueOf(jbox.getSelectedItem()));
                }
            }
             
         });
     
                       /* Eventos do botão*/ 
                           /*Botão ok*/
         btn1.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(btn1.getText()); 
               trataBotaoOk();
            }
    
            });
         
         
                           /*Limpar*/
         btn7.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(btn1.getText()); 
               JOptionPane.showConfirmDialog(cn,"Limpar");
               jtxt.setText(" ");
               jtxt2.setText(" ");
               
      
           }
    
            });
         
         
                             /*Stilo*/
          btn6.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(btn6,"Mudando o Estilo da Calculadora");
               btn1.setBackground(Color.gray);
               btn2.setBackground(Color.gray);
               btn3.setBackground(Color.gray);
               btn4.setBackground(Color.gray);
               btn5.setBackground(Color.gray);
               btn6.setBackground(Color.gray);
               btn7.setBackground(Color.gray);
               bt0.setBackground(Color.gray);
               bt1.setBackground(Color.gray);
               bt2.setBackground(Color.gray);
               bt3.setBackground(Color.gray);
               bt4.setBackground(Color.gray);
               bt5.setBackground(Color.gray);
               bt6.setBackground(Color.gray);
               bt7.setBackground(Color.gray);
               bt8.setBackground(Color.gray);
               bt9.setBackground(Color.gray);
               bt10.setBackground(Color.gray);
            }
    
            });
         
         
                          /*Operando + */
           btn2.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             operador = btn2.getText();
             valorx = Double.parseDouble(jtxt.getText());
             jtxt.setText(" ");
            }
           });  
           
           
           
                         /*Operando - */
           btn3.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
              operador = btn3.getText();
              valorx = Double.parseDouble(jtxt.getText());
              jtxt.setText(" ");
            }
           });
           
                          /*Operando (*) */
           btn4.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             operador = btn4.getText();
             valorx = Double.parseDouble(jtxt.getText());
             jtxt.setText(" ");
            }
           });  
                            /*Operando (/)*/
           btn5.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             operador = btn5.getText();
             valorx = Double.parseDouble(jtxt.getText());
             jtxt.setText(" ");
            }
           });  
         
           
                         /*Operador de (=) */
           bt10.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae){ 
             valory = Double.parseDouble(jtxt.getText());
             jtxt.setText(String.valueOf(contaCalculadora(valorx,valory)));
             boxvt.add(jtxt.getText());
             jbox.addItem(boxvt.get(i++));
            
            }
           });  
                 
                         //Teclas//             
           bt0.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt0.getText());
            }
           });
                  
           bt1.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt1.getText());
            }
           });
           
            
           bt2.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt2.getText());
             
            }
           });  

           bt3.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt3.getText());
             
            }
           });             
              
           bt4.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt4.getText());
             
            }
           });  
           
           bt5.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt5.getText());
             
            }
           });
           
           bt6.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt6.getText());
             
            }
           });  
           
           bt7.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt7.getText());
             
            }
           });  
           
           bt8.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt8.getText());
             
            }
           });
           
           bt9.addActionListener(new ActionListener(){  
           @Override
            public void actionPerformed(ActionEvent ae) {
             jtxt.setText(jtxt.getText()+bt9.getText());
             
            }
           });
           
 //-------------------------------------------------------------------------------------------
           jtxt.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
              jtxt.setText("OFF");
            }

            @Override
            public void focusLost(FocusEvent fe) {
              jtxt.setText("on");
               
            }
           
           
       });
       
       
          jtxt2.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
               jtxt2.setText("OFF");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                jtxt2.setText("on");
            }
           
           
       });
          
          
          
    jtxt.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent de) {
              // System.out.println("Inserindo de Dados");
            
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
               // System.out.println("Remover Dados");
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
               // System.out.println("Atualisar Dados");
            }
  
       
    });
    
      }
    
    public void trataBotaoOk() 
    { 
      JOptionPane.showMessageDialog(btn1,"Calculadora vs 1.0");  
    }
 
    
    private double contaCalculadora(double valorx,double valory){
    double conta = 0;
    
    switch(operador){
     case "+":
     conta = valorx+valory;    
     break;
     
     case "-":
     conta = valorx-valory;      
     break;
           
     
     case "*":
     conta = valorx*valory;      
     break;
           
     case "/":
     conta = valorx/valory;      
     break;
           
     
     default:
      JOptionPane.showConfirmDialog(cn, "Erro de Operador!");       
     } 
       
       return conta;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Primeira tl = new Primeira();
        tl.primeiraTela();
      
    }
    
}
