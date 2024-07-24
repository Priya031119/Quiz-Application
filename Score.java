import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
    JButton submit;
    Score(int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading=new JLabel("Thank you for taking the quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Open sans",Font.PLAIN,26));
        add(heading);

        JLabel LScore=new JLabel("Your Score is "+score);
        LScore.setBounds(300,200,300,30);
        LScore.setFont(new Font("Google sans",Font.PLAIN,26));
        add(LScore);

        submit=new JButton("END");
        submit.setBounds(380,270,120,30);
        submit.setFont(new Font("Open sans",Font.PLAIN,22));
        submit.setBackground(new Color(51,51,153));
        submit.setForeground(new Color(255,255,255));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Score(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            setVisible(false);
        }
    }
}
