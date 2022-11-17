import javax.swing.*;
import java.awt.*;

public class Q9 extends JFrame
{

    public void paint(Graphics g)
    {
        int row;
        int col;
        int x;
        int y;

        for ( row = 0;  row < 9;  row++ )
        {
            for ( col = 0;  col < 8;  col++)
            {
                x = col * 23;
                y = row * 25;
                if ( (row % 2) == (col % 2) )
                    g.setColor(Color.WHITE);
                else
                    g.setColor(Color.BLACK);

                g.fillRect(x, y, 22, 22);
            }
        }
    }

    public static void main(String args[]) {
        Q9 check = new Q9();
        check.setTitle("CheckerBoard");
        check.setSize(220, 240);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}