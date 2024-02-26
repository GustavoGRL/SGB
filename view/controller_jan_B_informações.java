package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import model.BRINQUEDO;

public class controller_jan_B_informações {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lab_nome;

    @FXML
    private Label lab_id;

    @FXML
    private Label lab_marca;

    @FXML
    private Label lab_tipo;

    @FXML
    private Label lab_faixa;

    @FXML
    private Label lab_estado;

    @FXML
    private Label lab_data;

    @FXML
    private Label resp_nome;

    @FXML
    private Label resp_id;

    @FXML
    private Label resp_marca;

    @FXML
    private Label resp_tipo;

    @FXML
    private Label resp_faixa;

    @FXML
    private Label estado;

    @FXML
    private Label resp_data;

    @FXML
    private Label lab_descricao;

    @FXML
    private TextArea resp_descricao;
    
    @FXML
    private Button but_voltar;

    @FXML
    private Button but_deletar;
    
    @FXML
    private Button but_aperte;
    
    @FXML
    private void to_janela_B_inicio() {
    	Main.trocar_janela(6);
    }
    
    @FXML
    private void carregar() {
    	
    	if (Main.informacao_brinquedo != null) {
    		BRINQUEDO brinquedo= Main.informacao_brinquedo;
	    	resp_nome.setText(brinquedo.getName());
	    	resp_id.setText(brinquedo.getId() + "");
	    	resp_faixa.setText(brinquedo.getAge_range());
	    	resp_marca.setText(brinquedo.getBrand());
	    	resp_tipo.setText(brinquedo.getType());
	    	resp_descricao.setText(brinquedo.getDescription());
	    	resp_data.setText(brinquedo.getAcquisition_string());
    	}
    	
    }
    
    @FXML
    private void deletar() {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("AVISO");
		alert.setContentText("A Brinquedo " + Main.informacao_brinquedo.getName() + " foi deletada do sistema com sucesso!!!");
    	alert.show();
    	
    	model.model.getBrinquedo_list().remove(Main.informacao_brinquedo);
    }

    @FXML
    void initialize() {
    	
    	//fasendo com que o text_area não possa ser mudado peli usuario.
    	resp_descricao.setEditable(false); 
    	resp_descricao.setWrapText(true); 
    	
    	assert lab_nome != null : "fx:id=\"lab_nome\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_id != null : "fx:id=\"lab_id\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_marca != null : "fx:id=\"lab_marca\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_tipo != null : "fx:id=\"lab_tipo\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_faixa != null : "fx:id=\"lab_faixa\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_estado != null : "fx:id=\"lab_estado\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_data != null : "fx:id=\"lab_data\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_nome != null : "fx:id=\"resp_nome\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_id != null : "fx:id=\"resp_id\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_marca != null : "fx:id=\"resp_marca\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_tipo != null : "fx:id=\"resp_tipo\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_faixa != null : "fx:id=\"resp_faixa\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert estado != null : "fx:id=\"estado\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_data != null : "fx:id=\"resp_data\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert lab_descricao != null : "fx:id=\"lab_descricao\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert resp_descricao != null : "fx:id=\"resp_descricao\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert but_deletar != null : "fx:id=\"but_deletar\" was not injected: check your FXML file 'jan_B_informações.fxml'.";
        assert but_aperte != null : "fx:id=\"but_aperte\" was not injected: check your FXML file 'jan_B_informações.fxml'.";

    }
}
