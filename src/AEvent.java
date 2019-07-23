
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sanya
 */
public class AEvent extends Frame implements ActionListener{
    TextField textField;
    public AEvent() {
        textField = new TextField("I am a text");
        textField.setBounds(200, 200, 200, 30);
        Button button = new Button("CLick Me");
        button.setBounds(200, 330, 200, 30);
        button.addActionListener(this);
        
        Button button2 = new Button("Reset");
        button2.setBounds(200, 400, 200, 30);
         Button button3 = new Button("Exit");
         button3.setBounds(200, 480, 200, 30);
         button3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  //To change body of generated methods, choose Tools | Templates.
            }
             
         });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Thank you to subscribe");
               
            }
        });
        
        add(button);
        add(button2);
        add(button3);
        add(textField);
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Subscribe Chander Mohan Pundhir and Easyfreenotes");
        showDialog();
    }
    
    private void showDialog(){
        Dialog d = new Dialog(this,"Hey Subscribe to Easyfreenotes",true);
        d.setLayout(new FlowLayout());
        Label label = new Label("www.youtube.com/c/easyfreenotes"); 
        label.setBounds(300, 300, 300, 300);
        d.add(label);
        d.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                d.setVisible(false);
            }
            
        });
        d.setSize(300, 300);
        d.setVisible(true);
    }
    
}
