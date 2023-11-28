package Package2;

import java.util.ArrayList;

public class SubClass3 extends GeneralClass2{
    private String parameter4;
    private String parameter5;
    public SubClass3(){
        super("parameter1",3,3.0, arrays(), "info from subClass3");
    }
    public static ArrayList<Integer> arrays(){
        ArrayList<Integer> arrays = new ArrayList<Integer>(2);
        // initialCapacity is a hint for ArraySize. It still dynamically resize itself when go beyond.
        arrays.add(10);
        arrays.add(20);
        arrays.add(50);
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

    public void interfaceDisplay(){
        System.out.println("This is interface display for Package2.SubClass3");
        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
        System.out.println("Arrays: " + arrays);
        System.out.println("Also has parameter4: "+ parameter4 + ", parameter5: "+ parameter5);
        System.out.println();
    }

    public String getInfo(){
        return "SubClass3: " + user_info;
    }

    public void setInfo(String new_Info){
        user_info = new_Info;
    }


    public ArrayList<Integer> getArray(){
        return arrays;
    }

    public void setArray(){
        ArrayList<Integer> new_Array = new ArrayList<Integer>();
        new_Array.add(0);
        new_Array.add(20);
        new_Array.add(200);
        new_Array.add(2000);
        arrays = new_Array;
    }

}

;
