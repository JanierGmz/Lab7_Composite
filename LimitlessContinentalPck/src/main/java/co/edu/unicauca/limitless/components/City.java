package co.edu.unicauca.limitless.components;

import co.edu.unicauca.limitless.interfaz.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harmo
 */
public class City implements Component, Cloneable {

    private String name;
    private String arrivalFligth;
    private String hotel;
    private String mealPlan;
    private String checkIn;
    private String checkOut;
    private List<Component> children = new ArrayList<>();

    public City() {
    }

    ;
    
    public City(String name, String arrivalFligth, String hotel, String mealPlan, String checkIn, String checkOut) {
        this.name = name;
        this.arrivalFligth = arrivalFligth;
        this.hotel = hotel;
        this.mealPlan = mealPlan;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void delete(Component component) {
        children.remove(component);
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder("Ciudad: " + name + "\n");
        info.append("Vuelo de llegada: " + arrivalFligth + "\n");
        info.append("Hotel: " + hotel + "\n");
        info.append("Plan de Alimentación: " + mealPlan + "\n");
        info.append("Check-in: " + checkIn + "\n");
        info.append("Check-out: " + checkOut + "\n");
        info.append("-------------------------------------------------------\n");

        for (Component component : children) {
            info.append(component.showInfo());
        }

        return info.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }

    @Override
    public Component clone(Component city) {
        Component newCity = new City(name, arrivalFligth, hotel, mealPlan, checkIn, checkOut);
        return newCity;
    }
}
