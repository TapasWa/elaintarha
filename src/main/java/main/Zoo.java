package main;

import java.util.ArrayList;

public class Zoo{
    ArrayList<Animal> animals = new ArrayList<>();
    private String elainmesta;
    public void zooNimi(String elainmesta){
        this.elainmesta=elainmesta;
    }
public void newAnimal(Animal animal){
    animals.add(animal);
}
public void listAnimals(){
    System.out.println(elainmesta+" pitää sisällään seuraavat eläimet:");
    for (Animal animal : animals){
        animal.tulostaTiedot();
    }
}

}
    

