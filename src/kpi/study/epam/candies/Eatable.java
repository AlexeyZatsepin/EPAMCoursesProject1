package kpi.study.epam.candies;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/2/16, with IntelliJ IDEA
 *
 * @author Alex
 */

/**
 * something you can eat
 */
public interface Eatable {
    default void eatIt(){
        System.out.println("mmm "+ getClass().getSimpleName());
    }
}
