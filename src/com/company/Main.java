package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("Nimesil", "Laboratorios Menarini S.A.",
                10.99,30, 1, 3, "2017/11/12");
        ArrayList <Pharmacy> dataBase = new ArrayList<>();
        dataBase.add(first);
        for (Pharmacy s: dataBase) {
            System.out.println(s);
        }
    }
}