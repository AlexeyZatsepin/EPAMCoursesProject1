package kpi.study.epam;

import java.util.Scanner;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class View {
    public static final String MENU = "New Year present!\n" + "1.Assemble by size?(default)\n"
            + "2.Assemble by manufacturer?\n" + "3.Assemble by price?\n" + "4.Exit\n";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String SUCCESS = "\nSuccess\n";
    public static final String SUB_MENU_FIGURE = "Select figure:\n1.Cylinder\n2.Globe\n3.Parallelepiped\n4.Pyramid\n";
    private Scanner sc = new Scanner(System.in);

    public void printMessage(String message){
        System.out.println(message);
    }

    public Scanner getScanner(){
        return sc;
    }
    public void close(){
        sc.close();
    }
}
