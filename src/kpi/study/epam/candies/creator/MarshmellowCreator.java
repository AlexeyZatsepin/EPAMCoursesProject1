package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Candy;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Globe;
import kpi.study.epam.ingredients.Ingridient;
import kpi.study.epam.ingredients.Jujube;

import java.util.HashSet;
import java.util.Set;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class MarshmellowCreator extends Creator {
    @Override
    public Sweetness create() {
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Jujube(50, Jujube.Color.RED));
        ingridients.add(new Jujube(50, Jujube.Color.ORANGE));
        return new Candy(new Globe(4),15,"Marshmellow", Sweetness.Manufacturer.LASUNKA,ingridients,true);
    }
}
