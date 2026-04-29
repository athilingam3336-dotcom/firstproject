import java.awt.*;
import java.awt.event.*;
public class calculator
{


public static void main(String ar[])
{
Frame f=new Frame("CALCULATOR");
Label l1=new Label("FirstDigit");

l1.setBounds(50,50,70,30);
TextField t1=new TextField();
t1.setBounds(107,50,70,30);
Label l2=new Label("SecondDigit");
l2.setBounds(180,50,70,30);

TextField t2=new TextField();
t2.setBounds(250,50,70,30);
Label l3=new Label("RESULT");
l3.setBounds(320,50,70,30);
TextField t3=new TextField();
t3.setBounds(390,50,70,30);


Button b1=new Button("+");
b1.setBounds(50,100,50,30);

Button b2=new Button("-");
b2.setBounds(100,100,50,30);

Button b3=new Button("*");
b3.setBounds(150,100,50,30);

Button b4=new Button("/");
b4.setBounds(200,100,50,30);

Button b5=new Button("%");
b5.setBounds(250,100,50,30);
ActionListener action=e ->
{
 int a=Integer.parseInt(t1.getText());
   int b=Integer.parseInt(t2.getText());
   if(e.getSource()==b1)
   {
  int z=a+b;
	t3.setText(String.valueOf(z));
   }
   if(e.getSource()==b2)
   {
    int z1=a-b;
	t3.setText(String.valueOf(z1));


    }




   if(e.getSource()==b3)
   {
    int z2=a*b;
	t3.setText(String.valueOf(z2));


    }
   if(e.getSource()==b4)
   {
    int z3=a/b;
	t3.setText(String.valueOf(z3));

    }
   if(e.getSource()==b5)
    {
    float z4=a%b;
    t3.setText(String.valueOf(z4));

    }

};
b1.addActionListener(action);
b2.addActionListener(action);
b3.addActionListener(action);
b4.addActionListener(action);
b5.addActionListener(action);



f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);


f.add(t1);
f.add(t2);
f.add(l1);
f.add(l2);
f.add(l3);

f.add(t3);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);


	
	

}
}