package kpi.study.epam.ingredients;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Ingridient {
    private double proteinsCapacity;
    private double fatsCapacity;
    private double carbohydratesCapacity;
    private Type type;

    public Ingridient(double proteinsCapacity, double fatsCapacity, double carbohydratesCapacity, Type type) {
        this.proteinsCapacity = proteinsCapacity;
        this.fatsCapacity = fatsCapacity;
        this.carbohydratesCapacity = carbohydratesCapacity;
        this.type = type;
    }

    public double getWeight() {
        return proteinsCapacity+fatsCapacity+carbohydratesCapacity;
    }


    public double getProteinsCapacity() {
        return proteinsCapacity;
    }

    public void setProteinsCapacity(double proteinsCapacity) {
        this.proteinsCapacity = proteinsCapacity;
    }

    public double getFatsCapacity() {
        return fatsCapacity;
    }

    public void setFatsCapacity(double fatsCapacity) {
        this.fatsCapacity = fatsCapacity;
    }

    public double getCarbohydratesCapacity() {
        return carbohydratesCapacity;
    }

    public void setCarbohydratesCapacity(double carbohydratesCapacity) {
        this.carbohydratesCapacity = carbohydratesCapacity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public enum Type{
        sweet,
        salty,
        sour,
        acute,
    }
}
