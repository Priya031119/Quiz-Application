import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    Login(){
      getContentPane().setBackground(Color.white);
      setLayout(null);

      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
      JLabel image=new JLabel(i1);
      image.setBounds(0,0,600,500);
      add(image);

      JLabel heading= new JLabel("QUIZ");
      heading.setBounds(800,60,300,45);
      heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
      heading.setForeground(new Color(0,0,128));
      add(heading);

      JLabel name= new JLabel("Enter your name");
      name.setBounds(810,150,300,20);
      name.setFont(new Font("Open sans",Font.BOLD,20));
      name.setForeground(new Color(153,51,102));
      add(name);

      JTextField tframe=new JTextField();
      tframe.setBounds(735,200,300,25);
      tframe.setFont(new Font("Times New Roman",Font.BOLD,20));
      add(tframe);

      rules=new JButton("Rules");
      rules.setBounds(735,270,120,25);
      rules.setBackground(new Color(51,51,153));
      rules.setForeground(new Color(255,255,255));
      rules.addActionListener(this);
      add(rules);

     back=new JButton("Back");
      back.setBounds(915,270,120,25);
      back.setBackground(new Color(51,51,153));
      back.setForeground(new Color(255,255,255));
      back.addActionListener(this);
      add(back);

      setSize(1200,500);
      setLocation(200,150);
      setVisible(true);

    }
    public static void main(String[] args) {
        new Login(); //anonymous obj
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==rules){
         setVisible(false);
         new Rules();
       }else if(e.getSource()==back){
        setVisible(false);
       }
    }
}
