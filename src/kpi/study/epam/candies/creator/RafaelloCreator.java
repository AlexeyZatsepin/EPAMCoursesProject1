package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Candy;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Globe;
import kpi.study.epam.ingredients.Chocolate;
import kpi.study.epam.ingredients.Dough;
import kpi.study.epam.ingredients.Ingridient;

import java.util.HashSet;
import java.util.Set;

public class RafaelloCreator extends Creator{
    @Override
    public Sweetness create() {
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Chocolate(100, Chocolate.Sort.WHITE));
        ingridients.add(new Dough(40,"sandy"));
        return new Candy(new Globe(3),21,"Rafaello", Sweetness.Manufacturer.ROSHEN,ingridients,true);
    }
}
