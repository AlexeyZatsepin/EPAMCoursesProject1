package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Candy;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Cylinder;
import kpi.study.epam.ingredients.Ingridient;
import kpi.study.epam.ingredients.Jujube;

import java.util.HashSet;
import java.util.Set;

public class HariboCreator extends Creator{
    @Override
    public Sweetness create() {
        Set<Ingridient> ingridients = new HashSet<>();
        ingridients.add(new Jujube(130, Jujube.Color.RED));
        return new Candy(new Cylinder(1,2),12,"Haribo bear", Sweetness.Manufacturer.AVK,ingridients,false);
    }
}
