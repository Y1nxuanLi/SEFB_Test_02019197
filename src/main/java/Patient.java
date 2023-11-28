import Examinations.BP;
import Examinations.Examination;
import Examinations.ImageDisplayable;
import Examinations.MRI;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Patient implements ImageDisplayable {
    private  String name;
    private  int age;
    private  String patient_URL;

    private ArrayList<Examination> examinations = new ArrayList<Examination>();
    public Patient(String name, int age, String patient_URL){
        this.name = name;
        this.age = age;
        this.patient_URL = patient_URL;
    }

    public String getPatientName(){
        return this.name;
    }

    public int getPatientAge(){
        return this.age;
    }

    public String get_patient_URL(){
        return this.patient_URL;
    }

    public void addExamnimation(Examination exam){
        examinations.add(exam);
    }

    public void display_administrator(){
        System.out.print("Patient: " + getPatientName() + ": ");
        for(Examination exam:examinations){
            exam.getDisplayText();
        }
    }

    public JPanel display_doctor(){
        JPanel subPatientPanel = new JPanel();
        subPatientPanel.setSize(1000, 200);
        subPatientPanel.setLayout(new GridLayout(1, 4));

        JLabel patient1_label = new JLabel();
        ImageIcon patient1Image = this.imageDisplay(this.get_patient_URL());
        patient1_label.setIcon(patient1Image);
        subPatientPanel.add(patient1_label);


        JLabel PatientInfo = new JLabel("<html>" + "Name: "+ getPatientName() + "<br>" + "Age:" + getPatientAge() + "<br></html>");
        subPatientPanel.add(PatientInfo);

        for(Examination exam:examinations){
            if (exam instanceof MRI){
                ImageIcon MRIImage = exam.imageDisplay(((MRI) exam).get_MRI_URL());
                JLabel MRI_label = new JLabel();
                MRI_label.setIcon(MRIImage);
                subPatientPanel.add(MRI_label);
            }
            if (exam instanceof BP){
                JLabel BPInfo = new JLabel("<html>" + "Blood pressure<br>" + ((BP) exam).get_BP_Systolic() + " over " + ((BP) exam).get_BP_Diastolic() + "<br></html>");
                subPatientPanel.add(BPInfo);
            }
        }
        return subPatientPanel;
    }

    @Override
    public ImageIcon imageDisplay(String ppl_url){
        URL Patient_URL = null;
        try {
            Patient_URL = new URL(ppl_url);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon patientImage = new ImageIcon(Patient_URL);
        return patientImage;
    }

}
