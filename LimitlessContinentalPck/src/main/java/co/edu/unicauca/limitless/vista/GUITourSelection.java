package co.edu.unicauca.limitless.vista;

import co.edu.unicauca.limitless.components.City;
import co.edu.unicauca.limitless.components.CityTour;
import co.edu.unicauca.limitless.components.Continent;
import co.edu.unicauca.limitless.components.Country;
import co.edu.unicauca.limitless.interfaz.Component;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author harmo
 */
public class GUITourSelection extends javax.swing.JFrame {

    List<Continent> continents = new ArrayList<>();
    Component tempCity = new City();
    Component newCity;
    Component tempTour = new CityTour();

    Component selectedContinent;

    int endConstructorFlag = 0;
    int continentReadyFlag = 0;

    /**
     * Creates new form GUIContinentSelection
     *
     * @param continents Receive the list of continents
     */
    public GUITourSelection(List<Continent> continents) {

        initComponents();
        this.setLocationRelativeTo(null);

        this.continents = continents;

        for (Continent continent : continents) {
            cbxContinent.addItem(continent.getName());
        }

        cbxContinent.setSelectedItem(null);
        cbxCountry.setSelectedItem(null);
        cbxCity.setSelectedItem(null);
        cbxTour.setSelectedItem(null);
        btnSummary.setEnabled(false);
        endConstructorFlag = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        cbxContinent = new javax.swing.JComboBox<>();
        cbxCountry = new javax.swing.JComboBox<>();
        cbxCity = new javax.swing.JComboBox<>();
        cbxTour = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        cbxContinent.setBackground(new java.awt.Color(250, 250, 250));
        cbxContinent.setFocusable(false);
        cbxContinent.setName("cbxContinent"); // NOI18N
        cbxContinent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxContinentItemStateChanged(evt);
            }
        });

        cbxCountry.setBackground(new java.awt.Color(250, 250, 250));
        cbxCountry.setFocusable(false);
        cbxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCountryItemStateChanged(evt);
            }
        });

        cbxCity.setBackground(new java.awt.Color(250, 250, 250));
        cbxCity.setFocusable(false);
        cbxCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCityItemStateChanged(evt);
            }
        });

        cbxTour.setBackground(new java.awt.Color(250, 250, 250));
        cbxTour.setFocusable(false);
        cbxTour.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTourItemStateChanged(evt);
            }
        });

        jLabel1.setText("Continente");

        jLabel2.setText("Pais");

        jLabel3.setText("Ciudad");

        jLabel4.setText("Tour");

        btnAdd.setBackground(new java.awt.Color(250, 250, 250));
        btnAdd.setForeground(new java.awt.Color(96, 189, 3));
        btnAdd.setText("Agregar tour");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSummary.setBackground(new java.awt.Color(250, 250, 250));
        btnSummary.setText("Resumen del paquete");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(250, 250, 250));
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Eliminar tour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar TODO el paquete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(130, 170, 210));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agencia de viajes");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Limitless");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(516, 516, 516))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel3)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel4))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(cbxContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cbxTour, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxContinent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (selectedContinent != null) {
            deleteTour(cbxTour.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, cbxTour.getSelectedItem().toString() + " fue eliminado");
        } else {
            showMessageEmptyPck();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        if (selectedContinent != null) {
            GUITourSummary instance = new GUITourSummary(this, true, selectedContinent);
            instance.setVisible(true);
        } else {
            showMessageEmptyPck();
        }
    }//GEN-LAST:event_btnSummaryActionPerformed

    private void cbxContinentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxContinentItemStateChanged

        checkCbs();

        cbxCountry.removeAllItems();

        if (evt.getStateChange() == ItemEvent.SELECTED && endConstructorFlag != 0) {
            Object item = evt.getItem();
            for (Continent continent : continents) {
                if (continent.getName().equals(String.valueOf(item))) {
                    for (Component country : continent.getChildren()) {
                        cbxCountry.addItem(country.getName());
                    }
                }
            }
        }
        cbxCountry.setSelectedItem(null);

    }//GEN-LAST:event_cbxContinentItemStateChanged

    private void cbxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCountryItemStateChanged
        int i = 0;

        checkCbs();

        cbxCity.removeAllItems();

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            for (Component country : continents.get(i).getChildren()) {
                if (country.getName().equals(String.valueOf(item))) {
                    for (Component city : country.getChildren()) {
                        cbxCity.addItem(city.getName());
                    }
                }
                i++;
            }
        }

        cbxCity.setSelectedItem(null);
    }//GEN-LAST:event_cbxCountryItemStateChanged

    private void cbxCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCityItemStateChanged
        int i = 0;

        checkCbs();

        Object selectedCount = cbxCountry.getSelectedItem();
        cbxTour.removeAllItems();

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            for (Component country : continents.get(i).getChildren()) {
                if (country.getName().equals(String.valueOf(selectedCount))) {
                    for (Component city : country.getChildren()) {
                        if (city.getName().equals(String.valueOf(item))) {
                            for (Component cityTour : city.getChildren()) {
                                cbxTour.addItem(cityTour.getName());
                            }
                        }
                    }
                    i++;
                }
            }
        }
        cbxTour.setSelectedItem(null);
    }//GEN-LAST:event_cbxCityItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (cbxContinent.getSelectedItem() != null && cbxCountry.getSelectedItem() != null && cbxCity.getSelectedItem() != null && cbxTour.getSelectedItem() != null) {

            int matches = 0;

            String continentName = cbxContinent.getSelectedItem().toString();
            String countryName = cbxCountry.getSelectedItem().toString();
            String cityName = cbxCity.getSelectedItem().toString();
            String tourName = cbxTour.getSelectedItem().toString();

            //Continent
            if (continentReadyFlag != 1) {
                selectedContinent = new Continent(continentName);
            }

            //Countries
            if (!selectedContinent.getChildren().isEmpty()) {
                for (Component country : selectedContinent.getChildren()) {
                    if (country.getName().equals(countryName)) {
                        matches = 1;
                    }
                }
                if (matches == 0) {
                    createCountry(countryName);
                }
            } else {
                createCountry(countryName);
            }

            matches = 0;

            //Cities
            for (Component country : selectedContinent.getChildren()) {
                if (!country.getChildren().isEmpty()) {
                    if (country.getName().equals(countryName)) {
                        for (Component city : country.getChildren()) {
                            if (!city.getChildren().isEmpty() && city.getName().equals(cityName)) {
                                matches = 1;
                            }
                        }
                        if (matches == 0) {
                            tempCity = findCity(cityName);
                            newCity = tempCity.clone(tempCity);
                            newCity.getChildren().clear();
                            createCity(countryName, newCity);
                        }
                    }
                } else {
                    tempCity = findCity(cityName);
                    newCity = tempCity.clone(tempCity);
                    newCity.getChildren().clear();
                    createCity(countryName, newCity);
                }

            }

            matches = 0;

            //Tours
            for (Component country : selectedContinent.getChildren()) {
                if (country.getName().equals(countryName) && !country.getChildren().isEmpty()) {
                    for (Component city : country.getChildren()) {
                        if (city.getName().equals(cityName)) {
                            if (!city.getChildren().isEmpty()) {
                                for (Component tour : city.getChildren()) {
                                    if (tour.getName().equals(tourName)) {
                                        matches = 1;
                                    }
                                }
                                if (matches == 0) {
                                    tempTour = findTour(tourName);
                                    createTour(countryName, cityName, tempTour);
                                    JOptionPane.showMessageDialog(null, tempTour.getName() + " fue agregado");
                                }
                            } else {
                                tempTour = findTour(tourName);
                                createTour(countryName, cityName, tempTour);
                                JOptionPane.showMessageDialog(null, tempTour.getName() + " fue agregado");
                            }
                        }

                    }
                }
            }
            if (selectedContinent != null) {
                continentReadyFlag = 1;
                cbxContinent.setEnabled(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada campo");
        }

        checkCbs();
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbxTourItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTourItemStateChanged
        checkCbs();
    }//GEN-LAST:event_cbxTourItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (selectedContinent != null) {
            selectedContinent = null;
            JOptionPane.showMessageDialog(null, "Paquete continental eliminado");
            continentReadyFlag = 0;
            cbxContinent.setEnabled(true);
            cbxContinent.setSelectedItem(null);
            cbxCountry.setSelectedItem(null);
            cbxCity.setSelectedItem(null);
            cbxTour.setSelectedItem(null);
        } else {
            showMessageEmptyPck();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkCbs() {
        Object selectedI1 = cbxContinent.getSelectedItem();
        Object selectedI2 = cbxCountry.getSelectedItem();
        Object selectedI3 = cbxCity.getSelectedItem();
        Object selectedI4 = cbxTour.getSelectedItem();

        if (selectedI1 != null && selectedI2 != null && selectedI3 != null && selectedI4 != null && selectedContinent != null) {
            btnSummary.setEnabled(true);
        } else {
            btnSummary.setEnabled(false);
        }
    }

    private void createCountry(String name) {
        Country country = new Country(name);
        selectedContinent.add(country);
    }

    private void createCity(String countryName, Component city) {
        for (Component country : selectedContinent.getChildren()) {
            if (country.getName().equals(countryName)) {
                country.add(city);
            }
        }
    }

    private void createTour(String countryName, String cityName, Component tour) {
        for (Component country : selectedContinent.getChildren()) {
            if (country.getName().equals(countryName)) {
                for (Component city : country.getChildren()) {
                    if (city.getName().equals(cityName)) {
                        city.add(tour);
                    }
                }
            }
        }
    }

    private Component findCity(String cityName) {
        for (Continent continent : continents) {
            for (Component country : continent.getChildren()) {
                for (Component city : country.getChildren()) {
                    if (city.getName().equals(cityName)) {
                        return city;
                    }
                }
            }
        }
        return null;
    }

    private Component findTour(String tourName) {
        for (Continent continent : continents) {
            for (Component country : continent.getChildren()) {
                for (Component city : country.getChildren()) {
                    for (Component tour : city.getChildren()) {
                        if (tour.getName().equals(tourName)) {
                            return tour;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void deleteTour(String tourName) {
        for (Component country : selectedContinent.getChildren()) {
            for (Component city : country.getChildren()) {
                for (Component tour : city.getChildren()) {
                    if (tour.getName().equals(tourName)) {
                        city.delete(tour);
                        break;
                    }
                }
                if (city.getChildren().isEmpty()) {
                    country.delete(city);
                    break;
                }
            }
            if (country.getChildren().isEmpty()) {
                selectedContinent = null;
                continentReadyFlag = 0;
                break;
            }
        }
    }

    private void showMessageEmptyPck() {
        JOptionPane.showMessageDialog(null, "El paquete esta vacio, debe agregar al menos un tour");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSummary;
    private javax.swing.JComboBox<String> cbxCity;
    private javax.swing.JComboBox<String> cbxContinent;
    private javax.swing.JComboBox<String> cbxCountry;
    private javax.swing.JComboBox<String> cbxTour;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
