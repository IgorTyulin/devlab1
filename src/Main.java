// Copyright 2021 Tyulin Igor

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        System.out.print("Full name and birth day(**/**/****): ");
        String lastname = args[0];
        String name = args[1];
        String patronymic = args[2];
        String Bday = args[3];

        String mof; // Identify male or female
        if (lastname.substring(lastname.length() - 1).equals("а")) {
            mof = "Женский";
        } else {
            mof = "Мужской";
        }

        SimpleDateFormat bod_form = new SimpleDateFormat("dd/MM/yyyy"); // Determine how many years have passed
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

        System.out.printf("FULL NAME: %s %c.%c.\nSEX: %s\nAGE: %d", lastname, inN, inP, mof, age);
    }
}