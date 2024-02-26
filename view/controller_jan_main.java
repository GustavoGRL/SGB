package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controller_jan_main {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_crianca;

    @FXML
    private Button but_Brinquedo;

    @FXML
    private Label lab_faser;
    
    @FXML
    private void to_jan_C_inicio() {
    	Main.trocar_janela(2);
    }
    
    @FXML
    private void to_jan_B_inicio() {
    	Main.trocar_janela(6);
    }
    

    @FXML
    void initialize() {
        assert but_crianca != null : "fx:id=\"but_crianca\" was not injected: check your FXML file 'FXML-inicio.fxml'.";
        assert but_Brinquedo != null : "fx:id=\"but_Brinquedo\" was not injected: check your FXML file 'FXML-inicio.fxml'.";
        assert lab_faser != null : "fx:id=\"lab_faser\" was not injected: check your FXML file 'FXML-inicio.fxml'.";

    }
}
