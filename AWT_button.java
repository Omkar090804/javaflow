import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener                       //extend class from main class and implement interface ie actionlistener
{
    int count=0;
    Label l;
    Button b;
    
    public MyFrame()
    {
        super("Button Demo");                                     //caling superclass
        
        l=new Label("    "+count);
        b=new Button("Click");
        b.addActionListener(this);
        
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
        
        
    }

    public void actionPerformed(ActionEvent e)                           // overridded method because of actionlistener
    {
        count++;
        l.setText("  "+count);
    }
}


public class ButtonDemo 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
}
