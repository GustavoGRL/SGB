package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller_jan_B_inicio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_voltar;

    @FXML
    private Button but_pesquisar;

    @FXML
    private Button but_adicionar;

    @FXML
    private Button but_emprestar;
    
    @FXML
    private void to_jan_main() {
    	Main.trocar_janela(1);
    }
    
    @FXML
    private void to_jan_B_cadastrar() {
    	Main.trocar_janela(7);
    }
    @FXML
    private void to_jan_B_pesquisar() {
    	Main.trocar_janela(8);
    }

    @FXML
    void initialize() {
    	
    	
    	
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_B_inicio.fxml'.";
        assert but_pesquisar != null : "fx:id=\"but_pesquisar\" was not injected: check your FXML file 'jan_B_inicio.fxml'.";
        assert but_adicionar != null : "fx:id=\"but_adicionar\" was not injected: check your FXML file 'jan_B_inicio.fxml'.";
        assert but_emprestar != null : "fx:id=\"but_emprestar\" was not injected: check your FXML file 'jan_B_inicio.fxml'.";

    }
}
