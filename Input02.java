package paki4;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Warning! Do not the cat. You've been warned!",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Wut's the wheather today?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Sahara Desert", "Great Victoria Desert", "Gibson Desert", "Carson Desert",
        		"Antarctic Desert", "Arctic Desert", "Arabian Deert"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "What's your favourite desert?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}