package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Adoptor adoptor1 = new Adoptor();
        adoptor1.nume = "Anca";
        adoptor1.varsta = 30;
        adoptor1.baniDisponibili = 1000;
        System.out.println("Numele primului adoptor este " + adoptor1.nume + " ," + " are vasrta de " + adoptor1.varsta + " si un buget de " + adoptor1.baniDisponibili + " euro");


       Animal animal1 = new Animal();
       animal1.nume = "Zara";
       animal1.tipDeAnimal = "Pisica";
       animal1.varsta = 3;
       animal1.activitatePreferata = "Somnul";
        animal1.fericire = 10;
        animal1.sanatate= 10;
        System.out.println("Numele primului animalut este " + animal1.nume + " si este detinut/a de " + adoptor1.nume);
        System.out.println(animal1.nume + " are varsta de " + animal1.varsta + " ani " );
        System.out.println("Sanatatea de " + animal1.sanatate);
        System.out.println("Fericirea de " + animal1.fericire);


        Veterinar veterinar = new Veterinar();
        veterinar.nume = "Bogdan";
        veterinar.varsta = 30;
        veterinar.specializare = "Chirurg";
        veterinar.salariu = 10000;
        System.out.println("Numele veterinariului este " + veterinar.nume + " ,are varsta de " + veterinar.varsta + " si specializarea " + veterinar.specializare + " ,cu un salariu de " + veterinar.salariu + " euro");

        Mancare mancare = new Mancare();
        mancare.nume = "Papito";
        mancare.tip = "Boabe";
        mancare.cantitate = 10;
        mancare.data = 11.21;
        mancare.pret = 20;
        System.out.println("Numele firmei de mancare este " + mancare.nume + " este de tipul" + mancare.tip + " ,se vinde la o punga de " + mancare.cantitate + " KG" + " ,costa " + mancare.pret + " euro, avand un termen de valabilitate pana la " + mancare.data);



        Consultatie consultatie1 = new Consultatie();
        consultatie1.tipulConsutatiei = "la inima";
        consultatie1.durata = "60 de minute";
        consultatie1.pret = "200";




    }
}
