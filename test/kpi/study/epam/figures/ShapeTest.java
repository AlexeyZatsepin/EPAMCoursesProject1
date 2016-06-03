package kpi.study.epam.figures;

import org.junit.Test;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class ShapeTest {
    @Test
    public void testVolumeCylinder(){
        double expectedResult= 64*Math.PI;
        Shape shape =new Cylinder(4,4);
        assert expectedResult==shape.volume();
    }

    @Test
    public void testVolumePyramid(){
        double expectedResult= 10;
        Shape shape =new Pyramid(5,4,3,5);
        assert expectedResult == shape.volume();
    }

    @Test
    public void testVolumeGlobe(){
        double expectedResult=8*Math.PI;
        Shape shape = new Globe(6);
        assert expectedResult==shape.volume();
    }

    @Test
    public void testVolumeParallelepiped(){
        double expectedResult = 1000;
        Shape shape = new Parallelepiped(10,10,10);
        assert expectedResult == shape.volume();
    }
}