package Examinations;

import java.time.LocalDate;

public class BP extends Examination {
    private LocalDate bp_exam_date;
    private String bp_duration;
    private int systolic;
    private int diastolic;
    public BP(LocalDate bp_exam_date, String bp_duration, int systolic, int diastolic){
        super(bp_exam_date);
        this.bp_duration = bp_duration;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public String get_BP_durationL(){
        return this.bp_duration;
    }

    public int get_BP_Systolic(){
        return this.systolic;
    }
    public int get_BP_Diastolic(){
        return this.diastolic;
    }

    public String getDisplayText(){
        System.out.println("BP: " + bp_duration + ", " + exam_date);
        String BP_text;
        BP_text = "Blood pressure " + systolic + " over " + diastolic;
        return BP_text;
    }

//    public static LocalDate bp_date(){
//        LocalDate bp_date = LocalDate.now();
//        return bp_date;
//    }



//    public void Display(){
//        System.out.println("This is abstract display for Package1.SubClass2");
//        System.out.println("parameter1: "+parameter1 + ", parameter2: "+parameter2 + ", parameter3: "+parameter3);
//        System.out.println("Arrays Null: " + arrays);
//        System.out.println();
//    }
//
//    public void interfaceDisplay(){
//        System.out.println("interfaceDisplay for SubClass2");
//    }


}
