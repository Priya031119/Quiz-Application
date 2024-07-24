import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
    
    JButton start,back;
    Rules(){
      JLabel heading= new JLabel("QUIZ RULES");
      heading.setBounds(50,20,700,50);
      heading.setFont(new Font("Google sans",Font.BOLD,50));
      heading.setForeground(new Color(0,0,128));
      add(heading);

      JLabel rules=new JLabel();
      rules.setBounds(20,90,700,350);
      rules.setFont(new Font("Open sans",Font.PLAIN,16));
      rules.setText(
         "<html>"+ "1.Review quiz rules for allowed materials and time limits."+"<br><br>"+
         "2.Find a quiet, well-lit space with a stable internet connection."+"<br><br>"+
         "3. Don't cheat by copying answers or using unauthorized help."+"<br><br>"+
         "4.Manage your time to avoid getting stuck on any question."+"<br><br>"+
         " 5.Read each question carefully to understand the wording and details."+"<br><br>"+
         "6. Proofread your answers before submitting the quiz."+"<br><br>"+
         "7.Be prepared for technical difficulties and contact your instructor if needed."+"<br><br>"+
         "8.Take the quiz honestly to assess your knowledge and improve."+"<br><br>"+
         "</html>"
      );
      add(rules);

      back=new JButton("Back");
      back.setBounds(250,500,100,30);
      back.setBackground(new Color(51,51,153));
      back.setForeground(new Color(255,255,255));
      back.addActionListener(this);
      add(back);

      start=new JButton("Start");
      start.setBounds(400,500,100,30);
      start.setBackground(new Color(51,51,153));
      start.setForeground(new Color(255,255,255));
      start.addActionListener(this);
      add(start);

       getContentPane().setBackground(Color.white);
       setLayout(null);
       setSize(800,650);
       setLocation(300,100);
       setVisible(true);
    }

    public static void main(String[] args) {
       new Rules();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            setVisible(false);
            new Quiz();
        }else{
            setVisible(false);
            new Login();
        }
    }
}
