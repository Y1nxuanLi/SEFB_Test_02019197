package Package2;

public class SubClass4 extends GeneralClass2{
    public SubClass4(){
        super("parameter1",4,4.0, null, "info from subClass4");
    }

    public void interfaceDisplay(){
        System.out.println("This is interface display for Package2.SubClass4");
        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
        System.out.println("Arrays Null: " + arrays);
        System.out.println();
    }

    public String getInfo(){
        return "SubClass4: " + user_info;
    }
}
