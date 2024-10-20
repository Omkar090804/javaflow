//checkbox and radiobutton(only one can be selected)

import java.awt.*;
import java.awt.event.*;

 class checkboxDemo extends Frame implements ItemListener {
    Label label;
    Checkbox javaCheckbox, pythonCheckbox, cCheckbox;
   CheckboxGroup cbg;            //radio button is checkboxgroup

    public checkboxDemo() {
        
        setLayout(new FlowLayout());
        setTitle("Checkbox Demo");

        javaCheckbox = new Checkbox("Java",false,cbg);                 
        pythonCheckbox = new Checkbox("Python",false,cbg);
        Checkbox = new Checkbox("C",false,cbg);               

        label = new Label("None selected");

        javaCheckbox.addItemListener(this);
        pythonCheckbox.addItemListener(this);
        cCheckbox.addItemListener(this);

        add(javaCheckbox);
        add(pythonCheckbox);
        add(cCheckbox);
        add(label);
     
    }

    public void itemStateChanged(ItemEvent e) {               //overrided method of itemlistener
        int selectedCount = 0;
        String selectedItems = "";

        if (javaCheckbox.getState()) {
            selectedItems += "Java ";
            selectedCount++;
        }
        if (pythonCheckbox.getState()) {
            selectedItems += "Python ";
            selectedCount++;
        }
        if (cCheckbox.getState()) {
            selectedItems += "C ";
            selectedCount++;
        }

        if (selectedCount == 0) {
            label.setText("None selected");
        } else {
            label.setText("Selected: " + selectedItems.trim());
        }
    }

    public static void main(String[] args) {
         checkboxDemo f = new checkboxDemo();
        f.setSize(400, 400);
        f.setVisible(true);
       
    }
}


