
/**
 * Write a description of class TurtleRunner here.
 *
 * @author (Thomas Andrew)
 * @version (82919)
 */
import java.awt.Color;
public class Triangle{
    private static int y = 0;
    public static void main(){
        Turtle   t = new Turtle(Turtle.NO_DEFAULT_WINDOW);//  create a Turtle object;
        TurtleDrawingWindow win = new TurtleDrawingWindow();//  create a TurtleDrawingWindow object;
        int      size, turn;
      
        t.jumpTo(-100, 0);
        t.hide();
        win.add(t);// add the turtle object to ayour window object
        win.setVisible(true);
        size     = 150;    //logical units
        turn     = 178;    //in degrees
        t.penSize(5);
        t.penColor(Color.red); //import java.awt.Color to make this work
        //+++++++++++++++++++++++++++++
        int r = 1;
        int g = 1;
        int b = 1;
        int rc = 5;
        int gc = 10;
        int bc = 15;
        int ga = 0;
        int ba = 0;
        int ra = 0;
        while(y != 980){
            Color col = new Color(r,g,b);
            t.penColor(col);
            t.draw(size);
            t.turn(turn);
            y++;
            r+=5;
            if (ga == 1){
                g+=5;
            }
            if (ba == 1){
                b+=5;
            }
            if (r >= 255){
                r = 1;
                ga = 1;
            }
            if (b >= 255){
                b = 1;
                bc = 15;
            }
            if (g >= 255){
                g = 1;
                ba = 1;
            }
        }
        }
        }
