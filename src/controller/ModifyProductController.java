/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 *
 * @author tamic
 */
public class ModifyProductController {
    
    @FXML
    private TextField modifyidTxt;

    @FXML
    private TextField modifynameTxt;

    @FXML
    private TextField modifyinventoryTxt;

    @FXML
    private TextField modifypriceTxt;

    @FXML
    private TextField modifymaxTxt;

    @FXML
    private TextField modifyminTxt;

    @FXML
    private TableColumn<?, ?> partidCol;

    @FXML
    private TableColumn<?, ?> partnameCol;

    @FXML
    private TableColumn<?, ?> inventorylevelCol;

    @FXML
    private TableColumn<?, ?> partpriceCol;
    
}
