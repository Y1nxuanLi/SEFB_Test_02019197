package Package2;

import java.util.ArrayList;

public abstract class GeneralClass2 implements Displayable {
    String parameter1;
    int parameter2;
    double parameter3;
    String user_info;
    ArrayList<Integer> arrays;
    public GeneralClass2(String parameter1, int parameter2, double parameter3, ArrayList<Integer> arrays, String user_info){
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
        this.arrays = arrays;
        this.user_info = user_info;
    }

//    public void Display(){
//        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
//    }

    public abstract void interfaceDisplay();
    public abstract String getInfo();
}
