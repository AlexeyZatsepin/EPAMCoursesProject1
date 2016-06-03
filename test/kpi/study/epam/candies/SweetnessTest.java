package kpi.study.epam.candies;

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
public class SweetnessTest {
    @Test
    public void testTotalWeight(){
        Set<Ingridient> ingridients = new HashSet<>();
        int expectedWeight = 100;
        ingridients.add(new Sugar(100, Sugar.Kind.White));
        Sweetness sweet = new Cake(new Globe(2),10,"test cake", Sweetness.Manufacturer.ROSHEN,ingridients);
        assert expectedWeight == sweet.getWeight();

    }

}