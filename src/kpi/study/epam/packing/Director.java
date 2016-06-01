package kpi.study.epam.packing;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Director { // Build Director
    private PackageBuilder builder;

    public void setBuilder(PackageBuilder pb) { builder = pb; }
    public Package getPackage() { return builder.getPack(); }

    public void constructPackage() {
        builder.createNewPackege();
        builder.buildShape();
        builder.buildSweets();
        builder.buildLabel();
    }

}
