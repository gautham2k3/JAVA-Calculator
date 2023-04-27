import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField tD;
    private JButton ACButton;
    private JButton xButton;
    private JButton a7Button;
    private JButton bMnus;
    private JButton a4Button;
    private JButton bBackspace;
    private JButton bPlus;
    private JButton a1Button;
    private JButton bDivide;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button13;
    private JButton a0Button;
    private JButton bEqual;
    private JButton a9Button;
    private JButton bve;
    private JButton a6Button;
    private JButton a3Button;
    private JButton bDot;
    private JButton bpercntage;
    private JButton square;
    private JButton button4;
    private JButton button1;

    double a,b,result;
    int xx=0;
    String op;

    public Calculator() {

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a7Button.getText());
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a4Button.getText());
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tD.setText(tD.getText()+a0Button.getText());
            }
        });
        bve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tD.getText().contains("."))
                {
                    double pm=Double.parseDouble(tD.getText());
                    pm=pm*-1;
                    tD.setText(String.valueOf(pm));
                }
                else
                {
                    long PM=Long.parseLong(tD.getText());
                    PM=PM*-1;
                    tD.setText(String.valueOf(PM));
                }
            }
        });
        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tD.getText().contains("."))
                {
                    tD.setText(tD.getText()+bDot.getText());
                }
            }
        });
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              a=Double.parseDouble(tD.getText());
              op="+";
              tD.setText("");
            }
        });
        bMnus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(tD.getText());
                op="-";
                tD.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(tD.getText());
                op="*";
                tD.setText("");
            }
        });
        bDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(tD.getText());
                op="/";
                tD.setText("");
            }
        });
        bBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;
                StringBuilder sb=new StringBuilder(tD.getText());
                sb.deleteCharAt(tD.getText().length()-1);
                backspace=String.valueOf(sb);
                tD.setText(backspace);
            }
        });
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op!="^2") {
                    b=Double.parseDouble(tD.getText());
                }
                if(op=="+")
                {
                    result=a+b;
                    tD.setText(String.valueOf(result));
                }
                else if(op=="-")
                {
                    result=a-b;
                    tD.setText(String.valueOf(result));
                }
                else if(op=="*")
                {
                    result=a*b;
                    tD.setText(String.valueOf(result));
                }
                else if(op=="/")
                {
                    result=a/b;
                    tD.setText(String.valueOf(result));
                }
                else if(op=="%")
                {
                    result=a*0.01*b;
                    tD.setText(String.valueOf(result));
                }
                else if(op=="^2")
                {
                    b=1;
                    result=a*a*b;
                    tD.setText(String.valueOf(result));
                }
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xx++;
                if(xx==1)
                    tD.setText("Dev. \"gαυтнαм\"   ");
                else if(xx==2)
                    tD.setText("<< Version 1.0 >> ");
                else if(xx==3)
                    tD.setText("  Git repo info  ");
                else if(xx==4)
                {
                    xx=0;
                    tD.setText("");
                }
            }
        });

        bpercntage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(tD.getText());
                op="%";
                tD.setText("");
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(tD.getText());
                op="^2";
                tD.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
