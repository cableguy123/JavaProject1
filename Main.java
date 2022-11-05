import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;
// 1.GUI?? ???
// 2.GUI - "0" Label
// Button???,EventListener 
class Main_GUI extends JFrame implements ActionListener {
  // ??? ????????
  // size,set
  JFrame frame = new JFrame("Frame Text");
  JTextField textfield =new JTextField("ì¸óÕ");
  JLabel label = new JLabel("0");
  JLabel label2 = new JLabel("0");
  
  JButton btn1 = new JButton("í«â¡");
  JButton btn2  = new JButton("å∏è≠");
  JButton btn3 = new JButton("?");
  JButton btn4  = new JButton("â~");
  JButton btn5  = new JButton("clear");
  
  Main_GUI() {
    // super(title) ?????!
    frame.setSize(1000,90000);
    frame.setResizable(false);
    frame.getContentPane().setLayout(null); 
    frame.setLocationRelativeTo(null);
    
    // frame.getContentPane().add(frame_label());
    // frame.getContentPane().add(btn1);
    // frame.getContentPane().add(btn2);
    frame_label();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  };
  public void frame_label() {
    // label ??
    
    label.setHorizontalAlignment(JLabel.CENTER);
    textfield.setBounds(160,500,80,120);
    label.setBounds(160,20,80,120);
    label2.setBounds(160,40,80,120);
    
    btn1.setBounds(80,120,90,40);
    btn2.setBounds(210,120,90,40);
    btn3.setBounds(80,200,90,40);
    btn4.setBounds(210,200,90,40);
    btn5.setBounds(340,200,90,40); 



    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button1Method();
      }
      private void button1Method() {
        label.setText(textfield.getText());
      }
    });
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button2Method();
      }
      private void button2Method() {
        // 1? ?????
        int countMinus = Integer.parseInt(label.getText());
        countMinus -= 1;
        if(countMinus == 0) {
          // 0??? ??? ????????? 
          return;
        }
        label.setText(String.valueOf(countMinus));
        
      }
    });
    btn3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button3Method();
      }
      private void button3Method() {
        float count = Integer.parseInt(textfield.getText()); // getText , setText??
        float result = RateServlet.korea(count);
        label2.setText(String.valueOf(result));
      }
    });
    btn4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button4Method();
      }
      private void button4Method() {
        float count = Integer.parseInt(textfield.getText()); // getText , setText??
        float result = RateServlet.japen(count);
        label2.setText(String.valueOf(result));
      }
    });

    btn5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button5Method();
      }
      private void button5Method() {
        label.setText(String.valueOf(0));
        label2.setText(String.valueOf(0));
      }
    });
    frame.getContentPane().add(textfield);
    frame.getContentPane().add(label);
    frame.getContentPane().add(label2);
    frame.getContentPane().add(btn1);
    frame.getContentPane().add(btn2);
    frame.getContentPane().add(btn3);
    frame.getContentPane().add(btn4);
    frame.getContentPane().add(btn5);

    
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
  }
 
  
  // @Override
  // public void ActionPerFormed(ActionEvent e) {
  //   int count = Integer.parseInt(label.getText());
  //   count += 1;
  //   label.setText(String.valueOf(count));
  //   btn1.addActionListener();
  // }
 
  
  
}




public class Main {
  public static void main (String[] args) {
     new Main_GUI();
  
  }
}