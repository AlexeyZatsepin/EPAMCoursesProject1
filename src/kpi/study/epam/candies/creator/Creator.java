package kpi.study.epam.candies.creator;

import kpi.study.epam.candies.Sweetness;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Creator {
    /**
     * abstract creator, pattern factory
     * @return sweet
     */
    public abstract Sweetness create();
}

