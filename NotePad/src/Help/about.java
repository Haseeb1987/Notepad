package Help;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
 
/**
 *
 * @author Burhan
 */
public class about{
    static JFrame window = new JFrame("About Notepad");
    notepad samp;
    JButton btn;
 
    public about(notepad ref)
    {
        samp  = ref;
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
 
        String about = "" + "" + "Created By..." + "Burhan Uddin" + "Registration No: 2005331070" + "Computer Science & Engineering" + "SUST" +"Contact: 01913370776" 
        +"E-Mail: burhan.bd@gmail.com" + "Web: http://www.dburhan.2ya.com" + "Version: 2.00" + "Built Date: May 10, 2008" +"" +"";
 
        ImageIcon icon = new ImageIcon("author.jpg");
        JLabel l = new JLabel("", icon, SwingConstants.LEFT);
        l.setText(about);
        l.setVerticalTextPosition(SwingConstants.TOP);
        l.setIconTextGap(20);
        c.add(l);
 
        int w = 340;
        int h = 250;
        window.setSize(w,h);
        // set window position
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        window.setLocation(center.x-w/2, center.y-h/2+25);
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.setVisible(false);
 
    }
}