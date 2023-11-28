package Package1;

public class SubClass2 extends GeneralClass{
    public SubClass2(){
        super("parameter2",2,2.0, null);
    }

    public void Display(){
        System.out.println("This is abstract display for Package1.SubClass2");
        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
        System.out.println("Arrays Null: " + arrays);
        System.out.println();
    }

    public void interfaceDisplay(){
        System.out.println("interfaceDisplay for SubClass2");
    }


}
