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
public class MainFormController {
    
    @FXML
    private TableColumn<?, ?> partidTxt;

    @FXML
    private TableColumn<?, ?> partnameTxt;

    @FXML
    private TableColumn<?, ?> partinventorylevelTxt;

    @FXML
    private TableColumn<?, ?> partpriceTxt;

    @FXML
    private TextField searchpartTxt;

    @FXML
    private TableColumn<?, ?> productidTxt;

    @FXML
    private TableColumn<?, ?> productnameTxt;

    @FXML
    private TableColumn<?, ?> productinventorylevelTxt;

    @FXML
    private TableColumn<?, ?> productpriceTxt;
    
}
