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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private String operando,valorx,valory;
    /**
     * @param args the command line arguments
     */
          
    public void primeiraTela(){
        
        String[] vet = new String[10];////Vector de Historico
        int LARGURA =200;
        //--------------------------------------------------
        for(int i=0;i<10;i++)
            vet[i] = "Historico:" + i;            
        
        for(int i=0;i<10;i++)
           System.out.println("id:"+vet[i]);
        //-----------------------------------------------------------
        labe = new JLabel("Nome:");
        jtxt = new JTextField();
        jtxt2 = new JTextField(); 
        btn1  = new JButton("ok");
        btn2  = new JButton("+"); btn3 = new JButton("-");btn4  = new JButton("*");  btn5  = new JButton("/");     
        btn6  = new JButton("S"); btn7 = new JButton("X");
        bt0  = new JButton("0");  bt1  = new JButton("1");
        bt2  = new JButton("2"); bt3  = new JButton("3");
        bt4  = new JButton("4");  bt5  = new JButton("5"); 
        bt6  = new JButton("6"); bt7  = new JButton("7");
        bt8  = new JButton("8"); bt9  = new JButton("9");
        bt10  = new JButton("=");
        jbox =new JComboBox(vet);///J Cuboo box
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
        btn2.setBounds(250,(LARGURA/3),80,30);
        btn3.setBounds(250,(LARGURA/2),80,30);
        btn4.setBounds(250,135,80,30);
        btn5.setBounds(250,170,80,30);
        btn6.setBounds(5,65,50,30);btn7.setBounds(5,100,50,30);///Botoes Binarios
        //-----------------------------------------------------------------------
        bt0.setBounds(80,65,45,30);bt1.setBounds(130,65,45,30);bt2.setBounds(180,65,45,30);
        bt3.setBounds(80,100,45,30);bt4.setBounds(130,100,45,30);bt5.setBounds(180,100,45,30);
        bt6.setBounds(80,135,45,30);bt7.setBounds(130,135,45,30);bt8.setBounds(180,135,45,30);
        bt9.setBounds(80,170,45,30);bt10.setBounds(130,170,45,30);
        
        cn.add(labe);
        cn.add(jtxt);
        cn.add(jtxt2);
        cn.add(jbox);
        cn.add(btn1);cn.add(btn2);cn.add(btn3);cn.add(btn4);cn.add(btn5);
        cn.add(btn6);cn.add(btn7);
        //-----------------------------------------------------------------------
        cn.add(bt0);cn.add(bt1);cn.add(bt2);cn.add(bt3);cn.add(bt4);cn.add(bt5);
        cn.add(bt6);cn.add(bt7);cn.add(bt8);cn.add(bt9);cn.add(bt10);
        
         jbox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Selecionado"+jbox.getSelectedItem());
                }
            }
             
         });
        
        
        
        
                  /* Eventos do botão*/ 
                       /*Botão ok*/
         btn1.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(btn1.getText()); 
               JOptionPane.showMessageDialog(btn1,"Calculo Efetuado ok");
               trataBotaoOk();
            }
    
            });
         
         
                           /*Limpar*/
         btn7.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(btn1.getText()); 
               JOptionPane.showConfirmDialog(cn, "Limpar Estorico");
               jtxt.setText(" ");
              
            }
    
            });
         
         
         
                           /* Stilo */
          btn6.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(btn6,"Mudando Estilo da Calculadora");
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
         
         
                          /*Operando*/
           btn2.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(btn2.getText());
             operando = btn2.getText();
              
           
            }
           });  
           
                               /*Operando*/
           btn3.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(btn3.getText());
             operando = btn3.getText();
              
            }
           });  
           btn4.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(btn4.getText());
             operando = btn4.getText();
          
            }
           });  
           
           btn5.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(btn5.getText());
             operando = btn5.getText();
            }
           });  
         
                          
                    
           bt1.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(bt1.getText());
             valory = bt1.getText();   
            }
           });
            
           bt2.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {
             System.out.println(bt2.getText());
             valorx = bt2.getText();
           
            }
           });  
                        
                             
   
                       /*Operador de (=) */
           bt10.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent ae) {   
             contaCalculadora(valorx,valory,operando);
             System.out.println(contaCalculadora(valorx,valory,operando));

            }
           });  
  
  
        
           jtxt.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
               jtxt.setText("0");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                 jtxt.setText("--------------------");
               
            }
           
           
       });
       
       
          jtxt2.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
               jtxt2.setText("0");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                jtxt2.setText("-----------------");
            }
           
           
       });
          
          
          
    jtxt.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent de) {
               System.out.println("Inserindo de Dados");
            
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                System.out.println("Remover Dados");
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                System.out.println("Atualisar Dados");
            }
  
       
    });
    
      }
    
    public void trataBotaoOk() 
    { 
        jtxt.setText("dados"); 
    }
 
    
    private float contaCalculadora(String operax,String operay,String operando){
        
       float opx = Float.parseFloat(operax);
       float opy = Float.parseFloat(operay);
        
       float x = 0f;     
       switch(operando){
           case "*":
           x =  opx * opy;
           break;
           
           case "/":
           x =  opx / opy; 
           break;
           
           case "+":
           x =  opx + opy;
           break;
           
           case "-":
           x =  opx - opy;
           break;
       } 
       
        return x;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Primeira tl = new Primeira();
        tl.primeiraTela();
      
    }
    
}
