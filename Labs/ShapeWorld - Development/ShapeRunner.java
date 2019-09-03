
/**
 * Write a description of class ShapeRunner here.
 *
 * @author (Thomas Andrew)
 * @version (82619)
 */
public class ShapeRunner{
    public ShapeRunner(){
    }
    public static void main(){
       ShapeWorld shapeWorld = new ShapeWorld(800,800);
       APCSColor WHITE = new APCSColor(1,1,1);
       APCSColor BLACK = new APCSColor(0,0,0);
       APCSColor YELLOW = new APCSColor(1,1,0);
       APCSColor PURPLE = new APCSColor(1,0,1);
       APCSColor RED = new APCSColor(1,0,0);
       APCSCircle cric = new APCSCircle(400,400,100, YELLOW);
       APCSCircle eat = new APCSCircle(600,400,25, BLACK);
       APCSRectangle rec = new APCSRectangle(0,0,800,800, PURPLE);
       APCSTriangle trianglemode = new APCSTriangle(650,500,400,400,650,300, PURPLE);
       APCSCircle eat2 = new APCSCircle(700,400,25, BLACK);
       shapeWorld.addRectangle(rec);
       shapeWorld.addCircle(cric);
       shapeWorld.addTriangle(trianglemode);
       shapeWorld.addCircle(eat);
       shapeWorld.addCircle(eat2);
    }
}
