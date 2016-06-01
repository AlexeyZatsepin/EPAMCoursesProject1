package kpi.study.epam;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class View {
    public static final String MENU = "New Year present!\n" + "1.Assemble by size?\n"
            + "2.Assemble by manufacturer?\n" + "3.Assemble by price?\n";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String INPUT_INT_DATA = "Input INT value = ";

    public void printMessage(String message){
        System.out.println(message);
    }
}
