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
public class AddProductController {
    
    @FXML
    private TextField productidTxt;

    @FXML
    private TextField productnameTxt;

    @FXML
    private TextField producdtinventoryTxt;

    @FXML
    private TextField productpriceTxt;

    @FXML
    private TextField productmaxTxt;

    @FXML
    private TextField productminTxt;

    @FXML
    private TableColumn<?, ?> partidCol;

    @FXML
    private TableColumn<?, ?> productnameCol;

    @FXML
    private TableColumn<?, ?> inventorylevelCol;

    @FXML
    private TableColumn<?, ?> productpriceCol;
    
}
