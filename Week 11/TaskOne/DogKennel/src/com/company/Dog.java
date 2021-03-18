package com.company;

public class Dog {
    private String name;
    private boolean isHungry;
    private Owner owner;
    private Dog[] offSpring;

    public Dog(String name, boolean isHungry){
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new Dog[2];
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOffSpring(Dog name){
        for (int i = offSpring.length-1; i >= 0; i--) {
            if (this.offSpring[i] == null){
                this.offSpring[i] = name;
                return;
            }
        }

    }

    public Dog[] getOffSpring() {
        return offSpring;
    }

    public String feedDog(){
        if (isHungry == true){
            System.out.println(name+" has been fed");
            isHungry = false;
        } else{
            System.out.println(name+ " is full");
        }
        return name + " "+isHungry;
    }
}
