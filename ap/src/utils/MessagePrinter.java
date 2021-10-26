package utils;


import javax.swing.*;

public class MessagePrinter implements Messages{

    public MessagePrinter(){};

    @Override
    public String showMessage(String value, Boolean validation) {
        if(validation) {
            return JOptionPane.showInputDialog("Digite uma cadeia de caracteres");
        }
        System.out.print("Digite uma cadeia de caracteres: ");
        return null;
    }

    @Override
    public Integer showMessage(Integer value, Boolean validation) {
        if(validation) {
            return Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        }
        System.out.print("Digite um número inteiro: ");
        return null;
    }

    @Override
    public Double showMessage(Double value, Boolean validation) {
        if(validation) {
            return Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
        }
        System.out.print("Digite um número real: ");
        return null;
    }

    @Override
    public Float showMessage(Float value, Boolean validation) {
        if(validation) {
            return Float.parseFloat(JOptionPane.showInputDialog("Digite um número com ponto flutuante"));
        }
        System.out.print("Digite um número com ponto flutuante: ");
        return null;
    }

    @Override
    public Character showMessage(Character value, Boolean validation) {
        if(validation) {
            return JOptionPane.showInputDialog("Digite um caracter").charAt(0);
        }
        System.out.print("Digite um caracter: ");
        return null;
    }


}
