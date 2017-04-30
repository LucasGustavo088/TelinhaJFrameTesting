import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelinhaDoMal extends JFrame implements ActionListener{
//atributos e variaveis
   //labels
   private JLabel lOriginal;
   private JLabel lCopia;
   //campos do texto
   private JTextField tOriginal, tCopia, tResultado;
   //botãos
   private JButton bLimpar, bCopiaCola, bSair, bSoma;
   
   public TelinhaDoMal(){
      super("Para de ser vagabundo e vai se buscar trabalhar");
      
      lOriginal   = new JLabel("Original");
      lCopia      = new JLabel("Copia");
      tOriginal   = new JTextField(10);
      tCopia      = new JTextField(10);
      tResultado  = new JTextField(10);
      bLimpar     = new JButton("L");
      bCopiaCola  = new JButton("CC");
      bSair       = new JButton("S");
      bSoma       = new JButton("Somar");
      //organizar os componentes
      Container container = getContentPane();
      container.setLayout(new FlowLayout());
      
      container.add(lOriginal);
      container.add(lCopia);
      container.add(tOriginal);
      container.add(tCopia);
      container.add(tResultado);
      container.add(bLimpar);
      container.add(bCopiaCola);
      container.add(bSair);
      container.add(bSoma);
      
      bLimpar.addActionListener(this);
      bCopiaCola.addActionListener(this);
      bSair.addActionListener(this);
      bSoma.addActionListener(this);
      //seta o tamanho e botao de sair para finalizar programa
      setSize(150,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      
       
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == bLimpar){
         tOriginal.setText("");
         tCopia.setText("");
      }
      else if(e.getSource() == bCopiaCola){
         tCopia.setText(tOriginal.getText());
      }
      else if(e.getSource() == bSoma){
         int val1 = Integer.parseInt(tOriginal.getText());
         int val2 = Integer.parseInt(tCopia.getText());
         String resultado = val1 + val2 + "";
         
         tResultado.setText(resultado);
      }
   }
  
} 