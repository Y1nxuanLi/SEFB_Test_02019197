package Package1;

import java.util.ArrayList;

public class SubClass1 extends GeneralClass{
    private String parameter4;
    private String parameter5;
    public SubClass1(){
        super("parameter1",1,1.0, arrays());
    }
    public static ArrayList<Integer> arrays(){
        ArrayList<Integer> arrays = new ArrayList<Integer>(2);
        // initialCapacity is a hint for ArraySize. It still dynamically resize itself when go beyond.
        arrays.add(1);
        arrays.add(3);
        arrays.add(5);
        return arrays;
    }
    public String constructSubClass1Parameter4(){
        parameter4 = "Special parameter4 for Package1.SubClass1";
        System.out.println(parameter4);
        return parameter4;
    }

    public String setSubClass1Parameter5(String string_parameter5){
        this.parameter5 = string_parameter5;
        System.out.println("Special parameter5 for Package1.SubClass1: " + string_parameter5);
        return this.parameter5;
    }

    public void Display(){
        System.out.println("This is abstract display for Package1.SubClass1");
        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
        System.out.println("Arrays: " + arrays);
        System.out.println("Also has parameter4: "+ parameter4 + ", parameter5: "+ parameter5);
        System.out.println();
    }
    public void interfaceDisplay(){
        System.out.println("interfaceDisplay for SubClass1");
    }

    public ArrayList<Integer> getArray(){
        return arrays;
    }
    public void setArray(){
        ArrayList<Integer> new_Array = new ArrayList<Integer>();
        new_Array.add(0);
        new_Array.add(10);
        new_Array.add(100);
        new_Array.add(1000);
        arrays = new_Array;
    }
}
