package Examinations;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public abstract class Examination implements ImageDisplayable {
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

    public abstract void display_text();

    @Override
    public ImageIcon imageDisplay(String exam_url){
        URL EXAM_URL = null;
        try {
            EXAM_URL = new URL(exam_url);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon examImage = new ImageIcon(EXAM_URL);
        return examImage;
    }

}
