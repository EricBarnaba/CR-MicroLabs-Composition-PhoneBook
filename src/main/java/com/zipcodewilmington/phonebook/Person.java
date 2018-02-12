package com.zipcodewilmington.phonebook;
import java.util.ArrayList;


public class Person {
    private String name;
    private ArrayList<String> numbersList;

    public Person(String name, String number){
        this.name = name;
        this.numbersList = new ArrayList();
        numbersList.add(number);
    }

    public void addNumber (String newNumber){
        numbersList.add(newNumber);
    }

    public String printName(){
        return name;
    }

    public String printNumbers(){
        StringBuilder builder = new StringBuilder();
        for (String number : numbersList){
            builder.append(number + "\n");
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        Person eric = new Person("Coder Cat", "867-5309");
        eric.addNumber("117-2490");

        System.out.println(eric.printName());
        System.out.println(eric.printNumbers());


    }

}