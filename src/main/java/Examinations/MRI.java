package Examinations;

import java.time.LocalDate;

public class MRI extends Examination {
    private LocalDate MRI_exam_date;
    private String mri_URL;
    private int field_strength;
    public MRI(LocalDate MRI_exam_date, String mri_URL, int field_strength){
        super(MRI_exam_date);
        this.mri_URL = mri_URL;
        this.field_strength = field_strength;
    }

//    public static LocalDate MRI_exam_date(){
//        LocalDate ld = LocalDate.now();
//        return ld;
//    }

    public void set_MRI_URL(String mri_URL){
        this.mri_URL = mri_URL;
    }

    public String get_MRI_URL(){
        return this.mri_URL;
    }

    public void set_MRI_Field(int field_strength){
        this.field_strength = field_strength;
    }
    public int get_MRI_Field(){
        return this.field_strength;
    }

    public String getDisplayText(){
        System.out.print("MRI: " + field_strength + " Tesla, " + exam_date + ": " );
        return mri_URL;
    }
//    public void Display(){
//        System.out.println("This is abstract display for Package1.SubClass1");
//        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
//        System.out.println("Arrays: " + arrays);
//        System.out.println("Also has parameter4: "+ parameter4 + ", parameter5: "+ parameter5);
//        System.out.println();
//    }
//    public void interfaceDisplay(){
//        System.out.println("interfaceDisplay for SubClass1");
//    }
//
//    public ArrayList<Integer> getArray(){
//        return arrays;
//    }
//    public void setArray(){
//        ArrayList<Integer> new_Array = new ArrayList<Integer>();
//        new_Array.add(0);
//        new_Array.add(10);
//        new_Array.add(100);
//        new_Array.add(1000);
//        arrays = new_Array;
//    }

}
