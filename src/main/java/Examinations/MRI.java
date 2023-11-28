package Examinations;

import java.time.LocalDate;

public class MRI extends Examination {
    private String mri_URL;
    private int field_strength;
    public MRI(LocalDate MRI_exam_date, String mri_URL, int field_strength){
        super(MRI_exam_date);
        this.mri_URL = mri_URL;
        this.field_strength = field_strength;
    }

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

    public void getDisplayText(){
        System.out.print("MRI: " + get_MRI_Field() + " Tesla, " + get_exam_date() + ": " );
    }
}
