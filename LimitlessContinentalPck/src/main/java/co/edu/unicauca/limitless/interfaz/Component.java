package co.edu.unicauca.limitless.interfaz;

import java.util.List;

/**
 *
 * @author harmo
 */
public interface Component{

    void add(Component componente);

    void delete(Component componente);

    String showInfo();

    String getName();

    List<Component> getChildren();
    
    Component clone(Component component);
    
}
