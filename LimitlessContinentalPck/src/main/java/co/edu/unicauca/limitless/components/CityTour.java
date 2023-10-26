package co.edu.unicauca.limitless.components;

import co.edu.unicauca.limitless.interfaz.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harmo
 */
public class CityTour implements Component {

    private String id;
    private String name;
    private String description;
    private String recomendations;
    private int duration;

    public CityTour() {
    }

    ;
    
    public CityTour(String id, String name, String description, String recomendations, int duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.recomendations = recomendations;
        this.duration = duration;
    }

    @Override
    public void add(Component component) {
        //Al ser una hoja, este método no se implementa
    }

    @Override
    public void delete(Component component) {
        //Al ser una hoja, este método no se implementa
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder("Id: " + id + "\n");
        info.append("Nombre: " + name + "\n");
        info.append("Descripcion: " + description + "\n");
        info.append("Recomendaciones: " + recomendations + "\n");
        info.append("Duracion: " + duration + "\n");
        info.append("-------------------------------------------------------\n");

        return info.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Component> getChildren() {
        //Al ser una hoja, este método no se implementa
        return null;
    }

    @Override
    public Component clone(Component c) {
        return null;
    }
}
