package kpi.study.epam;

import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.candies.creator.*;
import kpi.study.epam.figures.Cylinder;
import kpi.study.epam.figures.Globe;
import kpi.study.epam.figures.Parallelepiped;
import kpi.study.epam.figures.Pyramid;
import kpi.study.epam.packing.*;
import kpi.study.epam.packing.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.MENU);
        int i = inputIntValueWithScanner(sc);
        while (i>3){
            i = inputIntValueWithScanner(sc);
        }
        List<Sweetness> products = createSweetnesses();
        Package pack = createPachage(products,i);
        view.printMessage(pack.toString());

    }

    public List<Sweetness> createSweetnesses(){
        Creator[] creators = {new CheeseCakeCreator(), new ChocolateGlobeCandyCreator(),
                new ChocolatePyramidCandyCreator(),new HariboCreator(),new RafaelloCreator()};
        List<Sweetness> products = new ArrayList<>();
        for (Creator creator: creators) {
            products.add(creator.create());
        }
        return products;
    }

    public Package createPachage(List<Sweetness> products , int menu_id){
        Director director = new Director();
        PackageBuilder pb;
        switch (menu_id){
            case 1:
                pb = new SizePackBuilder(new Pyramid(30,10,8,6),products);
                break;
            case 2:
                pb = new ManufacturerPackBuilder(new Parallelepiped(12,5,4),products, Sweetness.Manufacturer.ROSHEN);
                break;
            case 3:
                pb = new CostPackBuilder(new Cylinder(4,5),products,400);
                break;
            default:
                pb = new SizePackBuilder(new Globe(5),products);
        }
        director.setBuilder(pb);
        director.constructPackage();
        return director.getPackage();
    }


    public int inputIntValueWithScanner(Scanner sc) {
        while(! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();

        }
        return sc.nextInt();
    }


}
