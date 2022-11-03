import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
// 누를때마다 hi 출력해주는btn생성해라
import javax.swing.JLabel;
class Button implements ActionListener {
    JButton btn1 = new JButton();
    JLabel label = new JLabel();
    Button() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionListener actionHandler = new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                
            }
        };
        btn1.add((Component)actionHandler);
    }
    
    
}
public class Today {
    public static void main(String[] args) {
        
    }
}