package kpi.study.epam.packing;

import kpi.study.epam.candies.Cake;
import kpi.study.epam.candies.Candy;
import kpi.study.epam.candies.NotPackableExeption;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Globe;
import kpi.study.epam.ingredients.Ingridient;
import kpi.study.epam.ingredients.Sugar;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class PackageTest {
    @Test(expected = NotPackableExeption.class)
    public void testAddSweet() throws NotPackableExeption, PackageOutOfBoundsExeption {
        Package pack = new Package();
        pack.setShape(new Globe(10));
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Sugar(100, Sugar.Kind.White));
        pack.addSweet(new Cake(new Globe(2),10,"test cake", Sweetness.Manufacturer.ROSHEN,ingridients));
    }

    @Test(expected = PackageOutOfBoundsExeption.class)
    public void testPackageSize() throws NotPackableExeption, PackageOutOfBoundsExeption {
        Package pack = new Package();
        pack.setShape(new Globe(1));
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Sugar(100, Sugar.Kind.White));
        pack.addSweet(new Candy(new Globe(20000),10,"test cake", Sweetness.Manufacturer.ROSHEN,ingridients,true));
    }
    @Test
    public void testTotalPrice() throws NotPackableExeption, PackageOutOfBoundsExeption {
        Package pack = new Package();
        pack.setShape(new Globe(1000));
        int expectedResult = 100;
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Sugar(100, Sugar.Kind.White));
        pack.addSweet(new Candy(new Globe(200),100,"test cake", Sweetness.Manufacturer.ROSHEN,ingridients,true));
        assert pack.getTotalPrice() == expectedResult;
    }

}