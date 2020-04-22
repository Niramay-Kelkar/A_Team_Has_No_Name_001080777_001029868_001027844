/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author verle
 */
public class EmailValidation extends InputVerifier{

 
    @Override
    public boolean verify(JComponent input) {
        
        String text = ((JTextField) input).getText();
        String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
        Pattern email = Pattern.compile(pattern);
        Matcher matcher = email.matcher(text);
        if (text.length() > 0) {
            if (!matcher.matches()) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Enter Valid Email Address", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }
            else 
            {
                input.setBackground(Color.white);
                return true;  
            }
        }
            else
            {
                input.setBackground(Color.white);
                return true;
            }
    }
}
