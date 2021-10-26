import utils.MessagePrinter;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyboardReader {

    private Scanner sc;
    private MessagePrinter msg;

    public Object read(Object value) {
        Locale.setDefault(Locale.ENGLISH);
        sc = new Scanner(System.in);
        msg = new MessagePrinter();

        if (value instanceof String) {
            msg.showMessage((String) value, false);
            return sc.next();
        }

        if (value instanceof Character) {
            msg.showMessage((Character) value, false);
            return sc.next().charAt(0);
        }

        if (value instanceof Integer) {
            msg.showMessage((Integer) value, false);
            return sc.nextInt();
        }

        if (value instanceof Double) {
            msg.showMessage((Double) value, false);
            return sc.nextDouble();
        }

        if (value instanceof Float) {
            msg.showMessage((Float) value, false);
            return sc.nextFloat();
        }
        return null;
    }

    public Object read(Object value, Boolean validation) {
        sc = new Scanner(System.in);
        msg = new MessagePrinter();
        Object content = null;

        if (value instanceof String) {
            content = msg.showMessage((String) value, validation);
            if(content == null) {
                return sc.next();
            }
            return content;
        }

        if (value instanceof Character) {
            content = msg.showMessage((Character) value, validation);
            if(content == null) {
                return sc.next().charAt(0);
            }
            return content;
        }

        if (value instanceof Integer) {
            content = msg.showMessage((Integer) value, validation);
            if(content == null) {
                return sc.nextInt();
            }
            return content;
        }

        if (value instanceof Double) {
            content = msg.showMessage((Double) value, validation);
            if(content == null) {
                return sc.nextDouble();
            }
            return content;
        }

        if (value instanceof Float) {
            content = msg.showMessage((Float) value, validation);
            if(content == null) {
                return sc.nextFloat();
            }
            return content;
        }
        return null;
    }


    public String readMessage(String value, Boolean validation) {
        sc = new Scanner(System.in);
        msg = new MessagePrinter();
        if (validation) {
            return JOptionPane.showInputDialog(value);
        } else {
            System.out.println(value);
            return sc.next();
        }
    }

    public String isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return email;
        }
        return null;
    }

    public String isPhoneValid(String phone) {
        String expression = "^\\d{3}\\-\\d{9}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            return phone;
        }
        return null;
    }

    public String isDateValid(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.setLenient(false);
            sdf.parse(date);
            return date;
        } catch (ParseException e) {
            return null;
        }
    }

    public String convertDate(String date) {
        if(isDateValid(date) != null) {
            String[] arrayDate = date.split("/");
            String day = arrayDate[0];
            String month = arrayDate[1];
            String year = arrayDate[2];
            String formattedDate = month + "/" + day + "/" + year;
            return formattedDate;
        }
        return null;
    }

    public Object isNumeric(Object value) {
        if (value instanceof Integer || value instanceof Double || value instanceof Float) {
            return true;
        }
        return false;
    }
}
