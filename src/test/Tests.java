package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tests {

    @Test
    public void test1(){
        String lastname = "Человеков";
        String name = "Максим";
        String patronymic = "Григорьевич";
        String Bday = "18/06/2000";
        String result = "FIO: Человеков М.Г.\n" +
                "Пол: Мужской\n" +
                "Полных лет: 21";
        String mof;
        if (lastname.substring(lastname.length() - 1).equals("а")) {
            mof = "Женский";
        } else {
            mof = "Мужской";
        }

        SimpleDateFormat bod_form = new SimpleDateFormat("dd/MM/yyyy");
        Date bod = null;
        try {
            bod = bod_form.parse(Bday);
        }
        catch (ParseException ignored) {}
        double times = new Date().getTime() - bod.getTime();
        double time_del = 24L * 60 * 60 * 1000 * 365;
        int age = (int) (times / time_del);

        char inN, inP;
        inN = name.charAt(0);
        inP = patronymic.charAt(0);
        String end = "FIO: " + lastname+ " " + inN+"."+inP+".\n"+"Пол: "+mof+"\n"+"Полных лет: "+age;
        assertEquals(result, end);
    }

    @Test
    public void test2() {
        String lastname = "Чичикова";
        String name = "Ольга";
        String patronymic = "Евгеньевна";
        String Bday = "27/10/2005";
        String result = "FIO: Чичикова О.Е.\n" +
                "Пол: Женский\n" +
                "Полных лет: 15";
        String mof;
        if (lastname.substring(lastname.length() - 1).equals("а")) {
            mof = "Женский";
        } else {
            mof = "Мужской";
        }

        SimpleDateFormat bod_form = new SimpleDateFormat("dd/MM/yyyy");
        Date bod = null;
        try {
            bod = bod_form.parse(Bday);
        }
        catch (ParseException ignored) {}
        double times = new Date().getTime() - bod.getTime();
        double time_del = 24L * 60 * 60 * 1000 * 365;
        int age = (int) (times / time_del);

        char inN, inP;
        inN = name.charAt(0);
        inP = patronymic.charAt(0);
        String end = "FIO: " + lastname+ " " + inN+"."+inP+".\n"+"Пол: "+mof+"\n"+"Полных лет: "+age;
        assertEquals(result, end);
    }

    @Test
    public void test3() {
        String lastname = "Соломонова";
        String name = "Марина";
        String patronymic = "Максимовна";
        String Bday = "01/01/2020";
        String result = "FIO: Соломонова М.М.\n" +
                "Пол: Женский\n" +
                "Полных лет: 1";
        String mof;
        if (lastname.substring(lastname.length() - 1).equals("а")) {
            mof = "Женский";
        } else {
            mof = "Мужской";
        }

        SimpleDateFormat bod_form = new SimpleDateFormat("dd/MM/yyyy");
        Date bod = null;
        try {
            bod = bod_form.parse(Bday);
        }
        catch (ParseException ignored) {}
        double times = new Date().getTime() - bod.getTime();
        double time_del = 24L * 60 * 60 * 1000 * 365;
        int age = (int) (times / time_del);

        char inN, inP;
        inN = name.charAt(0);
        inP = patronymic.charAt(0);
        String end = "FIO: " + lastname+ " " + inN+"."+inP+".\n"+"Пол: "+mof+"\n"+"Полных лет: "+age;
        assertEquals(result, end);
    }
}