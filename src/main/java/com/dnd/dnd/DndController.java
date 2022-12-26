package com.dnd.dnd;

import com.dnd.Stats;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DndController implements Initializable {
    @FXML
    private ChoiceBox<String> cbClass;
    private String[] classArray = {"Barbarian","Bard"};

    @FXML
    private ChoiceBox<String> cbRace;
    private String[] racesArray = {"Human","Dwarf"};

    private static Model model = Model.getInst();

    @FXML
    private Label lbStr;
    @FXML
    private Label lbDex;
    @FXML
    private Label lbCon;
    @FXML
    private Label lbInt;
    @FXML
    private Label lbWis;
    @FXML
    private Label lbCha;
    @FXML
    public void generateStats(){
        model.setStats(Stats.generate());
        lbStr.setText(
                "STR: " +
                model.getStats().getStats().get("Strength").toString());
        lbDex.setText(
                "DEX: " +
                model.getStats().getStats().get("Dexterity").toString());
        lbCon.setText(
                "CON: " +
                model.getStats().getStats().get("Constitution").toString());
        lbInt.setText(
                "INT: " +
                model.getStats().getStats().get("Intelligence").toString());
        lbWis.setText(
                "WIS: " +
                model.getStats().getStats().get("Wisdom").toString());
        lbCha.setText(
                "CHA: " +
                model.getStats().getStats().get("Charisma").toString());
    }
    @FXML
    private void retAttributes(){

        lbStr.setText("STR");
        lbDex.setText("DEX");
        lbCon.setText("CON");
        lbInt.setText("INT");
        lbWis.setText("WIS");
        lbCha.setText("CHA");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbClass.getItems().addAll(classArray);
        cbRace.getItems().addAll(racesArray);


    }


}