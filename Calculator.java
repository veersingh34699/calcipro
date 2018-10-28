import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
Frame f;
String s1,s2="",s3;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
TextField tf;
 Calculator()
{
f=new Frame("awt : Calculator");
f.setLayout(null);
f.setBackground(Color.red);
tf=new TextField("0");
tf.setBounds(20,50,240,40);
f.add(tf);
b1=new Button("back");
b1.setBounds(20,100,40,30);
f.add(b1);

b2=new Button("CE");
b2.setBounds(70,100,40,30);
f.add(b2);
b3=new Button("C");
b3.setBounds(120,100,40,30);
f.add(b3);
b4=new Button("+-");
b4.setBounds(170,100,40,30);
f.add(b4);
b5=new Button("ROOT");
b5.setBounds(220,100,40,30);
f.add(b5);
b6=new Button("7");
b6.setBounds(20,140,40,30);
f.add(b6);
b7=new Button("8");
b7.setBounds(70,140,40,30);
f.add(b7);

b8=new Button("9");
b8.setBounds(120,140,40,30);
f.add(b8);
b9=new Button("/");
b9.setBounds(170,140,40,30);
f.add(b9);
b10=new Button("%");
b10.setBounds(220,140,40,30);
f.add(b10);
b11=new Button("4");
b11.setBounds(20,180,40,30);
f.add(b11);
b12=new Button("5");
b12.setBounds(70,180,40,30);
f.add(b12);
b13=new Button("6");
b13.setBounds(120,180,40,30);
f.add(b13);
b14=new Button("*");
b14.setBounds(170,180,40,30);
f.add(b14);
b15=new Button("1/x");
b15.setBounds(220,180,40,30);
f.add(b15);
b16=new Button("1");
b16.setBounds(20,220,40,30);
f.add(b16);
b17=new Button("2");
b17.setBounds(70,220,40,30);
f.add(b17);
b18=new Button("3");
b18.setBounds(120,220,40,30);
f.add(b18);
b19=new Button("-");
b19.setBounds(170,220,40,30);
f.add(b19);
b20=new Button("=");
b20.setBounds(220,220,40,70);
f.add(b20);
b21=new Button("0");
b21.setBounds(20,260,90,30);
f.add(b21);
b22=new Button(".");
b22.setBounds(120,260,40,30);
f.add(b22);
b23=new Button("+");
b23.setBounds(170,260,40,30);
f.add(b23);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);

f.setSize(300,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b21)
{
s2=s2+"0";
tf.setText(s2);
}
else 
if(ae.getSource()==b16)
{
s2=s2+"1";
tf.setText(s2);
}
else 
if(ae.getSource()==b17)
{
s2=s2+"2";
tf.setText(s2);
}
else 
if(ae.getSource()==b18)
{
s2=s2+"3";
tf.setText(s2);
}
else 
if(ae.getSource()==b13)
{
s2=s2+"6";
tf.setText(s2);
}
else 
if(ae.getSource()==b12)
{
s2=s2+"5";
tf.setText(s2);
}
else 
if(ae.getSource()==b11)
{
s2=s2+"4";
tf.setText(s2);
}
else 
if(ae.getSource()==b8)
{
s2=s2+"9";
tf.setText(s2);
}
else 
if(ae.getSource()==b7)
{
s2=s2+"8";
tf.setText(s2);
}
else 
if(ae.getSource()==b6)
{
s2=s2+"7";
tf.setText(s2);
}
else 
if(ae.getSource()==b23)
{
s1=s2;
s2="";
s3="+";
tf.setText(s2);
}
else 
if(ae.getSource()==b19)
{
s1=s2;
s2="";
s3="-";
tf.setText(s2);
}
else 
if(ae.getSource()==b14)
{
s1=s2;
s2="";
s3="*";
tf.setText(s2);
}
else 
if(ae.getSource()==b9)
{
s1=s2;
s2="";
s3="/";
tf.setText(s2);
}
else 
if(ae.getSource()==b5)
{
s1=s2;
//s2="";
s3="ROOT";
tf.setText("root of "+s1);
}
else 
if(ae.getSource()==b4)
{
s1=s2;
s2="";
s3="+-";
tf.setText(s2);
}
else 
if(ae.getSource()==b3)
{
s1=s2;
s2="";
s3="c";
tf.setText(s2);
}
else 
if(ae.getSource()==b2)
{
s1=s2;
s2="";
s3="CE";
tf.setText(s2);
}
else 
if(ae.getSource()==b1)
{
s1=s2;
s2="";
s3="back";
tf.setText(s2);
}
else 
if(ae.getSource()==b10)
{
s1=s2;
s2="";
s3="%";
tf.setText(s2);
}
else 
if(ae.getSource()==b15)
{
s1=s2;
//s2="";
s3="1/x";
tf.setText("value=");
}
else 
if(ae.getSource()==b22)
{
s1=s2;
s2=s1+".";
s3=".";
tf.setText(s2);
}
else 
if(ae.getSource()==b23)
{
s1=s2;
s2="";
tf.setText(s2);
}

else 
if(ae.getSource()==b20)
{
double a,b,r;
a=Double.parseDouble(s1);
b=Double.parseDouble(s2);
switch(s3)
{
case"-":

r=a-b;
tf.setText(String.valueOf(r));
break;
case"+":

r=a+b;
tf.setText(String.valueOf(r));
break;
case"*":

r=a*b;
tf.setText(String.valueOf(r));
break;
case"/":

r=a/b;
tf.setText(String.valueOf(r));
break;

case"ROOT":

r=Math.sqrt(a);
tf.setText(String.valueOf(r));
break;
case"%":

r=(a/b)*100;
tf.setText(String.valueOf(r));
break;

case"1/x":

r=1/a;
tf.setText(String.valueOf(r));
break;



default:System.out.println("this one is default");

}

}

}
public static  void main(String[] args)
{
 new Calculator();
}
}