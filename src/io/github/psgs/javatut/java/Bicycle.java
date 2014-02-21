package io.github.psgs.javatut.java;

    /*
    * In the real world, you'll often find many individual objects all of the same kind.
    * There may be thousands of other bicycles in existence, all of the same make and model.
    * Each bicycle was built from the same set of blueprints and therefore contains the same components.
    * In object-oriented terms, we say that your bicycle is an instance of the class of objects known as bicycles.
    * A class is the blueprint from which individual objects are created.
    * The following Bicycle class is one possible implementation of a bicycle:
     */

public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    /*
    *  At the top of the class, the fields cadence, speed and gear are defined.
    *  changeCadence, changeGear, speedUp, applyBrakes and printStates are all methods.
    *  When called, these methods perform functions.
    *  What the method does when called, is defined between the curly braces after the method name.
    *
    *  For example:
    *  With the printStates() method:
    */

    void printStates2() {
        // What the method does when called is defined here.
    }

    /*
    * The syntax of the Java programming language will look new to you, but the design of this class is based on the previous discussion of bicycle objects.
    * The fields cadence, speed, and gear represent the object's state, and the methods (changeCadence, changeGear, speedUp etc.) define its interaction with the outside world.
     */

}

