import java.awt.*;

public class AWT                                             
{
    static  int count=0;

    public static void main(String[] args)           
    {
        Frame f=new Frame();
        f.setTitle("My First Window App");
        Button b=new Button("Click Me");
        f.add(b);
        TextField tf=new TextField(20);
        f.add(tf);

        b.addActionListener((e)->tf.setText("Clicked "+count++));

        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setVisible(true);

    }

}


//like this 
import java.awt.*;

public class FirstApp extends Frame             // we can create our own class FirstApp which extends frame and declare label,button,textfeild there            
{
    Label l;
    TextField tf;
    Button b;
    
    public FirstApp()                   //then in its construcor we give them values and then in main methods we ca add size and visiblity using object
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    }  
    public static void main(String[] args) 
    {
        FirstApp f=new FirstApp();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}
