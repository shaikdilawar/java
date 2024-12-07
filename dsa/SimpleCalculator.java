import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Set7.class" height=600 width=600>
</applet> */

public class Set7 extends Applet implements ActionListener{

String s1,s2,s4;
char s3;
TextField t1;
Button b[]=new Button[10];
Button add,sub,mul,div,clear,mod,E,dot,minus;
double c;

public void init(){
	t1=new TextField();
	GridLayout gl=new GridLayout(4,5);
	setLayout(gl);
	for(int i=0;i<10;i++)
	{
		b[i]=new Button(""+i);
	}
	
	add=new Button("add");
	sub=new Button("sub");
	mul=new Button("mul");
	div=new Button("div");
	mod=new Button("mod");
	dot=new Button(".");
	clear=new Button("clear");
	E=new Button("E");
	minus=new Button("-");
	t1.addActionListener(this);
	add(t1);
	for(int i=0;i<10;i++)
	{
		add(b[i]);
	}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(mod);
	add(clear);
	add(E);
	add(dot);
	add(minus);
	for(int i=0;i<10;i++)
	{
		b[i].addActionListener(this);
	}
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	mod.addActionListener(this);
	clear.addActionListener(this);
	E.addActionListener(this);
	dot.addActionListener(this);
	minus.addActionListener(this);
}

public void actionPerformed(ActionEvent e){

String s=e.getActionCommand();
	if((s.charAt(0) >= '0' && s.charAt(0)<= '9' ) || s.charAt(0) == '.' || s.charAt(0)=='-'){

s1=t1.getText()+s;
t1.setText(s1);
}
if(s.equals("add")){
s2=t1.getText();
t1.setText("");
s3='+';
}
if(s.equals("sub")){
s2=t1.getText();
t1.setText("");
s3='-';
}
if(s.equals("mul")){
s2=t1.getText();
t1.setText("");
s3='*';
}
if(s.equals("div")){
s2=t1.getText();
t1.setText("");
s3='/';
}
if(s.equals("mod")){
s2=t1.getText();
t1.setText("");
s3='%';
}
if(s.equals("E")){
s4=t1.getText();
if(s3=='+')
c=Double.parseDouble(s2)+Double.parseDouble(s4);
if(s3=='-')
c=Double.parseDouble(s2)-Double.parseDouble(s4);
if(s3=='*')
c=Double.parseDouble(s2)*Double.parseDouble(s4);
if(s3=='/')
c=Double.parseDouble(s2)/Double.parseDouble(s4);
if(s3=='%')
c=Double.parseDouble(s2)%Double.parseDouble(s4);
t1.setText(String.valueOf(c));
}
if(s.equals("clear"))
{
t1.setText("");	
}
}



}

