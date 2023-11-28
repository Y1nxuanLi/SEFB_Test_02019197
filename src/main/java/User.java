import Package1.SubClass1;
import Package2.SubClass3;
import Package2.SubClass4;

import java.util.ArrayList;

public class User {
    String user_name;
    private SubClass1 sub1;
    private SubClass3 sub3;
    private SubClass4 sub4;
    public User(String user_name){
        this.user_name = user_name;
        sub1 = new SubClass1();
        sub3 = new SubClass3();
        sub4 = new SubClass4();
    }

    public String displayAllMethod(){
        // This is a method to get info from SubClass3,4
        // And array from SubClass1,3
        String total = user_name+"<br>";
        total += "is getting <b>info from SubClass3: " + sub3.getInfo() + "</b><br>";
        total += "is getting <b>info from SubClass4: " + sub4.getInfo() + "</b><br>";
        total += "<i>Array</i> from SubClass1" + sub1.getArray() + "<br>";
        total += "<i>Array</i> from SubClass3" + sub3.getArray() + "<br>";

        return total;
    }

    public void changeInfo(String new_Info) {
        sub3.setInfo(new_Info);
    }

    public void changeArray(){
        sub1.setArray();
        sub3.setArray();
    }



}
