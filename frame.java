import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class frame extends JFrame {
    //4 cyl
    public int delay_min = 3;
    public int delay_max = 29;
    public int delay_init = 29;
    JSlider slider = new JSlider(JSlider.VERTICAL,delay_min,delay_max,delay_init);

    public dot cyl1dot = new dot(Color.WHITE);public dot cyl2dot = new dot(Color.WHITE);
    public dot cyl3dot = new dot(Color.WHITE);public dot cyl4dot = new dot(Color.WHITE);

    public JLabel l1 = new JLabel();public JLabel l2 = new JLabel();
    public JLabel l3 = new JLabel();public JLabel l4 = new JLabel();

    public JPanel center = new JPanel(new FlowLayout());
    public JPanel right = new JPanel(new GridLayout(4,1));

    public JLabel rpm_label = new JLabel();

    public void main(){
        setTitle("Engine controller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,180);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.DARK_GRAY);
        fourCylLayout();
        refreshData(0);

    }

    void fourCylLayout(){

        slider.setForeground(Color.DARK_GRAY);
        slider.setBackground(Color.BLACK);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Inl_4.firing_delay = slider.getValue();
            }
        });

        // cylinder dots
        center.setBackground(Color.DARK_GRAY);

        //top label text
        JLabel top_Label = new JLabel();
        top_Label.setText("Inline 4 engine simulation");
        top_Label.setFont(new Font("Serif",Font.BOLD,30));
        top_Label.setForeground(Color.WHITE);
        top_Label.setHorizontalAlignment(JLabel.CENTER);

        rpm_label.setFont(new Font("Serif", Font.BOLD,30));
        rpm_label.setForeground(Color.WHITE);
        rpm_label.setHorizontalAlignment(JLabel.CENTER);
        //add random 0-1000 to this

        add(top_Label,BorderLayout.PAGE_START);
        add(center,BorderLayout.CENTER);
        add(right,BorderLayout.LINE_END);
        add(slider,BorderLayout.LINE_END);
        add(rpm_label,BorderLayout.PAGE_END);
    }








    void selectFire(int cylNumber,boolean isON){
        Color givencolor = Color.BLACK;
        if(isON){
             givencolor = Color.YELLOW;
        }else if(!isON) {
            givencolor = Color.BLACK;
        }


        if(cylNumber==1){
            cyl1dot = new dot(givencolor);
            l1.setIcon(cyl1dot);
            center.remove(l1);center.remove(l2);center.remove(l3);center.remove(l4);
            center.add(l1);center.add(l2);center.add(l3);center.add(l4);
        }else if(cylNumber==2){
            cyl2dot = new dot(givencolor);
            l2.setIcon(cyl2dot);
            center.remove(l1);center.remove(l2);center.remove(l3);center.remove(l4);
            center.add(l1);center.add(l2);center.add(l3);center.add(l4);
        }else if(cylNumber==3){
            cyl3dot = new dot(givencolor);
            l3.setIcon(cyl3dot);
            center.remove(l1);center.remove(l2);center.remove(l3);center.remove(l4);
            center.add(l1);center.add(l2);center.add(l3);center.add(l4);
        }else if(cylNumber==4){
            cyl4dot = new dot(givencolor);
            l4.setIcon(cyl4dot);
            center.remove(l1);center.remove(l2);center.remove(l3);center.remove(l4);
            center.add(l1);center.add(l2);center.add(l3);center.add(l4);
        }

        repaint();
        revalidate();
        doLayout();

    }

    void refreshData(int data){
        rpm_label.setText("RPM : "+data);
        repaint();
        revalidate();
        doLayout();
    }

}

