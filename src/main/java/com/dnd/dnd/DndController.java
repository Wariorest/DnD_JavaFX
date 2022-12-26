package com.dnd.dnd;

import com.dnd.Stats;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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
        model.setStats(null);
        lbStr.setText("STR");
        lbDex.setText("DEX");
        lbCon.setText("CON");
        lbInt.setText("INT");
        lbWis.setText("WIS");
        lbCha.setText("CHA");
    }
    @FXML
    private Label lbAlert;
    @FXML
    private TextField tfName;
    @FXML
    private ListView lvCharactersList;

    private int item = 0;
    private int charNum = 4;
    private String[] characterList = new String[charNum];

    @FXML
    private void generateCharacter(){
        if(model.getStats() != null && tfName.getText() != null){
            if(item < charNum){

                String name = tfName.getText();
                String charClass = cbClass.getSelectionModel().getSelectedItem();
                String charRace = cbRace.getSelectionModel().getSelectedItem();

                if (name != null && charClass != null && charRace != null) {
                    model.setCharacter(name,charClass,charRace);
                    model.getCharacter().setAttributes(
                            model.getStats()
                    );
                    model.getCharacter().addRaceBonuses();
                    model.addItem(
                            model.getCharacter()
                    );
                    model.getVisitor().visit(model.getCharacter());
                    lbAlert.setText(
                            "character: " + tfName.getText() + " created!!!"
                    );
                    characterList[item] = charRace + "-" + charClass + "-" + name;
                    ObservableList<String> charListItems = FXCollections.observableArrayList(characterList);
                    lvCharactersList.setItems(charListItems);

                    item++;
                }else {
                    lbAlert.setText("Input all fields!");
                }


            }else{

                lbAlert.setText("Cannot create character!");
            }
        }else{
            lbAlert.setText("Generate stats!");
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbClass.getItems().addAll(classArray);
        cbRace.getItems().addAll(racesArray);


    }


}