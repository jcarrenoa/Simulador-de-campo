package geoesxpofisica;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarModificado extends JScrollBar{
    
    public ScrollBarModificado() {
        setUI(new ScrollBarModernoUI());
        setPreferredSize(new Dimension(11, 11));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}
