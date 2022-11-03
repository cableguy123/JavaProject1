import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
// 1.GUI구현 클래스
// 2.GUI - "0" Label
// Button클래스,EventListener 
class Main_GUI extends JFrame implements ActionListener {
  // 여기서 구현해야될거는?
  // size,set
  JFrame frame = new JFrame("Frame Text");
  JLabel label = new JLabel("0");
  JButton btn1 = new JButton("추가");
  JButton btn2  = new JButton("감소");
  Main_GUI() {
    // super(title) 필요없어요!
    frame.setSize(400,300);
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
    // label 구현
    
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(160,20,80,120); 
    
    btn1.setBounds(80,100,90,40);
    
    btn2.setBounds(210,100,90,40);
    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button1Method();
      }
      private void button1Method() {
        int count = Integer.parseInt(label.getText()); // getText , setText공부
        count += 1;
        label.setText(String.valueOf(count));
      }
    });
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button2Method();
      }
      private void button2Method() {
        // 1씩 감소시키자
        int countMinus = Integer.parseInt(label.getText());
        countMinus -= 1;
        if(countMinus == 0) {
          // 0이되면 더이상 감소시킬곳이없기에 
          return;
        }
        label.setText(String.valueOf(countMinus));
        
      }
    });

    frame.getContentPane().add(label);
    frame.getContentPane().add(btn1);
    frame.getContentPane().add(btn2);

    
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