package Package1;

import Package2.Displayable;

import java.util.ArrayList;

public abstract class GeneralClass implements Displayable {
    String parameter1;
    int parameter2;
    double parameter3;
    ArrayList<Integer> arrays;
    public GeneralClass(String parameter1, int parameter2, double parameter3, ArrayList<Integer> arrays){
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
        this.arrays = arrays;
    }

//    public void Display(){
//        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
//    }

    public abstract void Display();
    public abstract void interfaceDisplay();
}
