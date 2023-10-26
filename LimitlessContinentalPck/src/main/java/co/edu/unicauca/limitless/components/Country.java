package co.edu.unicauca.limitless.components;

import co.edu.unicauca.limitless.interfaz.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harmo
 */
public class Country implements Component {

    private String name;
    private List<Component> children = new ArrayList<>();

    public Country(String name) {
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
        StringBuilder info = new StringBuilder("Pais: " + name + "\n");
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
