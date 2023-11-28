package Examinations;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public abstract class Examination {
    LocalDate exam_date;
    public Examination(LocalDate exam_date){
        this.exam_date = exam_date;
    }

    public void set_exam_date(LocalDate date){
        this.exam_date = date;
    }

    public LocalDate get_exam_date(){
        return exam_date;
    }

    public abstract String getDisplayText();

    public ImageIcon imageDisplay(String mri_url){
        JLabel label = new JLabel();
        URL EXAM_URL = null;
        try {
            EXAM_URL = new URL(mri_url);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon examImage = new ImageIcon(EXAM_URL);
        return examImage;
    }

}
