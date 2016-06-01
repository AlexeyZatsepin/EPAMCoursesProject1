package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Cake;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Parallelepiped;
import kpi.study.epam.ingredients.Chocolate;
import kpi.study.epam.ingredients.Dough;
import kpi.study.epam.ingredients.Ingridient;

import java.util.HashSet;
import java.util.Set;

public class CheeseCakeCreator extends Creator{
    @Override
    public Sweetness create() {
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Chocolate(300, Chocolate.Sort.MILK));
        ingridients.add(new Dough(200,"cheese"));
        return new Cake(new Parallelepiped(10,8,5),200,"CheeseCake", Sweetness.Manufacturer.ROSHEN,ingridients);
    }
}
