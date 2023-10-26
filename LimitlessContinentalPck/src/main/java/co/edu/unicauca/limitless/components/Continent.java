package co.edu.unicauca.limitless.components;

import java.util.List;
import java.util.ArrayList;
import co.edu.unicauca.limitless.interfaz.Component;

/**
 *
 * @author harmo
 */
public class Continent implements Component {

    private String name;
    private List<Component> children = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
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
        StringBuilder info = new StringBuilder("Continente: " + name + "\n");
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
    public Component clone(Component c) {
        return null;
    }
}
