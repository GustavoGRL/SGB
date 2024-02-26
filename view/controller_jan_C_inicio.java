package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.CRIANCA;

public class controller_jan_C_inicio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_adicionar;

    @FXML
    private Button but_pesquisar;

    @FXML
    private Button but_voltar;
    
    
    //funções de troca de janela.
    @FXML
    private void to_jan_main() {
    	Main.trocar_janela(1);
    }
    
    @FXML
    private void to_jan_C_pesquisar() {
    	Main.trocar_janela(3);
    }
    @FXML
    private void to_jan_C_cadastrar() {
    	Main.trocar_janela(5);
    }


    @FXML
    void initialize() {
        assert but_adicionar != null : "fx:id=\"but_adicionar\" was not injected: check your FXML file 'jan_C_inicio.fxml'.";
        assert but_pesquisar != null : "fx:id=\"but_pesquisar\" was not injected: check your FXML file 'jan_C_inicio.fxml'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_C_inicio.fxml'.";

    }
    
    
    

}
