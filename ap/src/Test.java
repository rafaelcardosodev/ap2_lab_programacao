import org.omg.PortableInterceptor.ObjectReferenceFactoryHolder;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        //DUPLA: RAFAEL CARDOSO DOS SANTOS / MELLANI MARIANO GARZON

        KeyboardReader kr = new KeyboardReader();

        String date = "09/12/2021";

        System.out.println("");
        System.out.println(" ---------- TESTE 1 - MENSAGENS ------------");
        kr.read(new String());
        kr.read(new String(), true);

        kr.read(new Integer(1));
        kr.read(new Integer(1), true);

        kr.read(new Double(1.00));
        kr.read(new Double(1.00), true);

        kr.read(new Float(1F));
        kr.read(new Float(1F), true);

        kr.read(new Character('T'));
        kr.read(new Character('T'), true);

        System.out.println("");
        System.out.println(" ---------- TESTE 2 - MENSAGENS COM PARAMETRO ------------");
        kr.readMessage("teste", false);
        kr.readMessage("teste", true);

        System.out.println("");
        System.out.println(" ---------- TESTE 3 - VALIDAÇÃO DE EMAIL (nome@dominio.sufixo ------------");
        System.out.println(kr.isEmailValid("rafael"));
        System.out.println(kr.isEmailValid("rafael@gmail"));
        System.out.println(kr.isEmailValid("rafael@gmail.com"));

        System.out.println("");
        System.out.println(" ---------- TESTE 4 - VALIDAÇÃO DE DATA (dd/MM/yyyy) ------------");
        System.out.println(kr.isDateValid(date));

        System.out.println("");
        System.out.println(" ---------- TESTE 5 - VALIDAÇÃO DO TELEFONE (DDD-XXXXXXXXX) ------------");
        System.out.println(kr.isPhoneValid("21 999275373"));
        System.out.println(kr.isPhoneValid("21 99927-5373"));
        System.out.println(kr.isPhoneValid("(21)-999275373"));
        System.out.println(kr.isPhoneValid("21-999275373"));
        System.out.println(kr.isPhoneValid("021 99927533"));
        System.out.println(kr.isPhoneValid("021 999275373"));
        System.out.println(kr.isPhoneValid("021-99927537"));
        System.out.println(kr.isPhoneValid("021-999275373"));

        System.out.println("");
        System.out.println(" ---------- TESTE 6 - CONVERSÃO DE DATA ------------");
        System.out.println(kr.convertDate(date));

        System.out.println("");
        System.out.println(" ---------- TESTE 7 - VERIFICANDO NÚMERO -----------");
        System.out.println(kr.isNumeric("412.23221"));
    }
}
