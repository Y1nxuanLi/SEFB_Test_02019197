import Examinations.BP;
import Examinations.MRI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate MRI_Time_1 = LocalDate.of(2023,9,14);
        String MRI_URL_1 = "https://martinh.netfirms.com/BIOE60010/mri1.jpg";
        LocalDate MRI_Time_2 = LocalDate.of(2023,11,19);
        String MRI_URL_2 = "https://martinh.netfirms.com/BIOE60010/mri2.jpg";

        LocalDate BP_Time_1 = LocalDate.of(2023,9,15);
        LocalDate BP_Time_2 = LocalDate.of(2023,1,23);

        MRI mri1 = new MRI(MRI_Time_1, MRI_URL_1, 2);
        MRI mri2 = new MRI(MRI_Time_2, MRI_URL_2, 4);
        BP bp1 = new BP(BP_Time_1, "ST", 130, 70);
        BP bp2 = new BP(BP_Time_2, "VST", 150, 80);

        String pat_URL_1 = "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg";
        Patient patient1 = new Patient("Daphne Von Oram", 62, pat_URL_1);
        patient1.addExamnimation(mri1);
        patient1.addExamnimation(bp1);

        String pat_URL_2 = "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg";
        Patient patient2 = new Patient("Sebastian Compton", 31, pat_URL_2);
        patient2.addExamnimation(mri2);
        patient2.addExamnimation(bp2);

        System.out.println("Administrator View");
        patient1.display_administrator();
        patient2.display_administrator();

        JPanel patientPanel1 = patient1.display_doctor();
        JPanel patientPanel2 = patient2.display_doctor();

        JFrame f=new JFrame("Doctor View");
        f.setSize(1000, 400);
        f.setLayout(new GridLayout(2, 1));

        f.add(patientPanel1);
        f.add(patientPanel2);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
