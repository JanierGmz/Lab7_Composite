package co.edu.unicauca.limitless.main;

import co.edu.unicauca.limitless.components.Continent;
import co.edu.unicauca.limitless.components.CityTour;
import co.edu.unicauca.limitless.vista.GUITourSelection;
import co.edu.unicauca.limitless.interfaz.Component;
import co.edu.unicauca.limitless.components.City;
import co.edu.unicauca.limitless.components.Country;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harmo
 */
public class Main {

    public static void main(String[] args) {
        // Crear ciudades con city tours
        City madrid = new City("Madrid", "Vuelo Iberia IB567", "Hotel Centro Madrid", "Desayuno incluido, Cena en restaurante de tapas", "10/08/2023", "14/08/2023");
        madrid.add(new CityTour("1", "Tour histórico Madrid", "Visita lugares históricos", "Use protector solar", 2));
        madrid.add(new CityTour("2", "Tour cultural Madrid", "Descubre la cultura local", "Lleve una cámara", 3));

        City barcelona = new City("Barcelona", "Vuelo Iberia IB789", "Hotel Beach View", "Desayuno y almuerzo en el hotel", "25/05/2023", "29/05/2023");
        barcelona.add(new CityTour("3", "Tour histórico  Barcelona", "Visita lugares históricos", "Use protector solar", 2));
        barcelona.add(new CityTour("4", "Tour cultural Barcelona", "Descubre la cultura local", "Lleve una cámara", 3));

        City paris = new City("París", "Vuelo Air France AF123", "Hotel Eiffel View", "Desayuno incluido, Cena en restaurante local", "15/05/2023", "19/05/2023");
        paris.add(new CityTour("5", "Tour historico París", "Descubre los monumentos icónicos de París", "Lleva calzado cómodo y cámara.", 3));
        paris.add(new CityTour("6", "Tour cultural París", "Explora los lugares más emblemáticos de la ciudad del amor", "Lleva calzado cómodo y cámara.", 4));

        City niza = new City("Niza", "Vuelo Lufthansa LH456", "Hotel Beachfront", "Desayuno y cena en el hotel", "20/05/2023", "24/05/2023");
        niza.add(new CityTour("7", "Tour historico Niza", "Descubre los monumentos icónicos de Niza", "Lleva calzado cómodo y cámara.", 3));
        niza.add(new CityTour("8", "Tour cultural Niza", "Descubre la belleza de la Costa Azul", "Use protector solar", 2));

        // Crear países
        Country españa = new Country("Espan_a");
        Country francia = new Country("Francia");
        Country estadosU = new Country("Estados Unidos");
        Country canada = new Country("Canada");
        Country arabiaS = new Country("Arabia Saudita");
        Country qatar = new Country("Qatar");
        Country australia = new Country("Australia");
        Country fiyi = new Country("Fiyi");
        españa.add(madrid);
        españa.add(barcelona);
        francia.add(paris);
        francia.add(niza);

        // Crear continentes
        Continent europa = new Continent("Europa");
        Continent norteAmerica = new Continent("Norte America");
        Continent orienteMedio = new Continent("Oriente Medio");
        Continent oceania = new Continent("Oceania");
        europa.add(españa);
        europa.add(francia);
        norteAmerica.add(estadosU);
        norteAmerica.add(canada);
        orienteMedio.add(arabiaS);
        orienteMedio.add(qatar);
        oceania.add(australia);
        oceania.add(fiyi);

        List<Continent> continents = new ArrayList<>();
        continents.add(europa);
        continents.add(norteAmerica);
        continents.add(orienteMedio);
        continents.add(oceania);

        GUITourSelection instance = new GUITourSelection(continents);
        instance.setVisible(true);
    }
}
