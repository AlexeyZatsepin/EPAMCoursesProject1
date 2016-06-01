package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Candy;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Globe;
import kpi.study.epam.ingredients.Chocolate;
import kpi.study.epam.ingredients.Ingridient;

import java.util.HashSet;
import java.util.Set;

public class ChocolatePyramidCandyCreator extends Creator{
    @Override
    public Sweetness create() {
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Chocolate(200, Chocolate.Sort.MILK));
        return new Candy(new Globe(3),15,"Tiramisu",Sweetness.Manufacturer.ROSHEN,ingridients,true);
    }
}
