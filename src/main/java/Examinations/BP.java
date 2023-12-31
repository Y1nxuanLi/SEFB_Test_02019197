package Examinations;

import java.time.LocalDate;

public class BP extends Examination {
    private String bp_duration;
    private int systolic;
    private int diastolic;
    public BP(LocalDate bp_exam_date, String bp_duration, int systolic, int diastolic){
        super(bp_exam_date);
        this.bp_duration = bp_duration;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public String get_BP_duration(){
        return this.bp_duration;
    }

    public int get_BP_Systolic(){
        return this.systolic;
    }
    public int get_BP_Diastolic(){
        return this.diastolic;
    }

    public void display_text(){
        System.out.println("BP: " + get_BP_duration() + ", " + get_exam_date());
    }

}
