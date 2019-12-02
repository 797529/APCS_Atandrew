package pixLab.classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroBlue();
    Walter.explore();
  }
  public static void testReddify()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.redmodePic();
    Walter.explore();
  }
  public static void testGreenify()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.greenPic();
    Walter.explore();
  }
  public static void testBlueify()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.bluePic();
    Walter.explore();
  }
  public static void testVoidify()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.voidify();
    Walter.explore();
  }
  public static void testAntiVoidify()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.antivoidify();
    Walter.explore();
  }
  public static void testNegative()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.negativeImg();
    Walter.explore();
  }
  public static void testZeroGreen()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroGreen();
    Walter.explore();
  }
  public static void testFlipper()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.flippyVoid();
    Walter.explore();
  }
  public static void testBlackLines()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.flippyBlack();
    Walter.explore();
  }
  public static void testBlack()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.floppyBlack();
    Walter.explore();
}
  public static void testZeroRed()
  
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroRed();
    Walter.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroRed();
    Walter.zeroGreen();
    Walter.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroBlue();
    Walter.zeroGreen();
    Walter.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.zeroRed();
    Walter.zeroBlue();
    Walter.explore();
  }
  public static void testGrayscale()
  {
    Picture Walter = new Picture("beach.jpg");
    Walter.explore();
    Walter.makeGrey();
    Walter.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("beach.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("beach.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("beach.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testZeroRed();
    //testZeroGreen();
    //testKeepOnlyBlue();
    testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(0);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}