import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Quiz extends JFrame implements ActionListener{

    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String useranswers[][]=new String[10][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,submit;
    int count=0;
    public static int score=0;

    Quiz(){
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1440,392);
        add(image);

       qno=new JLabel();
       qno.setBounds(100,450,50,30);
       qno.setFont(new Font("Open sans",Font.PLAIN,24));
       add(qno);

       question=new JLabel();
       question.setBounds(150,450,900,30);
       question.setFont(new Font("Open sans",Font.PLAIN,24));
       add(question);

       questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";	
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1=new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Open Sans",Font.PLAIN,20));
        add(opt1);

        opt2=new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Open Sans",Font.PLAIN,20));
        add(opt2);

        opt3=new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Open Sans",Font.PLAIN,20));
        add(opt3);

        opt4=new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Open Sans",Font.PLAIN,20));
        add(opt4);

        groupoptions=new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next=new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Open sans",Font.PLAIN,22));
        next.setBackground(new Color(51,51,153));
        next.setForeground(new Color(255,255,255));
        next.addActionListener(this);
        add(next);

        submit=new JButton("Submit");
        submit.setBounds(1100,630,200,40);
        submit.setFont(new Font("Open sans",Font.PLAIN,22));
        submit.setBackground(new Color(51,51,153));
        submit.setForeground(new Color(255,255,255));
        submit.addActionListener(this);
        add(submit);
        submit.setEnabled(false);

        start(count);

       setVisible(true);
    }
    public void start(int count){
        qno.setText(""+(count+1)+".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }
    public static void main(String[] args) {
        new Quiz();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(e.getSource()==submit){
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
                setVisible(false);
                new Score(score);
            }
        }
       
    }
}
