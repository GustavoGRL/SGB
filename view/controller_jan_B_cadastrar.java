package view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class controller_jan_B_cadastrar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lab_cadastro;

    @FXML
    private TextField tex_nome;

    @FXML
    private Label lab_nome;

    @FXML
    private TextField tex_marca;

    @FXML
    private TextField tex_tipo;

    @FXML
    private Label lab_marca;

    @FXML
    private Label lab_tipo;

    @FXML
    private Label lab_faixa_etaria;

    @FXML
    private ChoiceBox<String> cho_estado;

    @FXML
    private Label lab_data;

    @FXML
    private Label lab_estado;

    @FXML
    private ChoiceBox<String> cho_etaria;

    @FXML
    private DatePicker dat_data;

    @FXML
    private Button but_cadastrar;

    @FXML
    private Button but_voltar;

    @FXML
    private TextArea tex_descricao;

    @FXML
    private Label lab_descricao;
    
    @FXML
    private void to_jan_B_inicio() {
    	Main.trocar_janela(6);
    }
    
    @FXML
    private int cadastrar_brinaquedo() {
    	
    	Alert alert= new Alert(AlertType.ERROR);
    	alert.setHeaderText("Error");
    	
    	
    	String nome= tex_nome.getText();
    	String marca= tex_marca.getText();
    	String tipo= tex_tipo.getText();
    	String estado= cho_estado.getValue();
    	String descricao= tex_descricao.getText();
    	String faixa_etaria= cho_etaria.getValue();
    	LocalDate data= dat_data.getValue();

    	if(nome.equals("") || marca.equals("") || tipo.equals("") || estado.equals("") ||
    	descricao.equals("") || faixa_etaria == null || data == null) {
    		alert.setContentText("preencha todas as campos");
    	   	alert.show();
    	   	return 0;
    	}else {
    		model.model.Registrar_Brinquedo(nome, marca, faixa_etaria, 
    		descricao, tipo, estado, data, 0);
    		
    		Alert cadastrado = new Alert(AlertType.CONFIRMATION);
    		cadastrado.setHeaderText("Parabens!!!");
    		cadastrado.setContentText("Brinquedo cadastrado com sucesso.");
    	   	cadastrado.show();
    	   	reset();
    	}
    	return 0;
    }

    @FXML
    void initialize() {
    	
    	//criando um show list das faixas etarias.
    	ObservableList<String> obs_etaria= FXCollections.observableArrayList("L", "10+", "12+", "14+", "16+");
    	cho_etaria.setItems(obs_etaria);
    	
    	//criando um show list das faixas etarias.
    	ObservableList<String> obs_estado= FXCollections.observableArrayList("Novos ou Seminovos", "Usados em Bom Estado", "Reparados", "Aguardando Reparo", "Descartados", "Em Manutenção");
    	cho_estado.setItems(obs_estado);
    	
    	 assert lab_cadastro != null : "fx:id=\"lab_cadastro\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert tex_nome != null : "fx:id=\"tex_nome\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_nome != null : "fx:id=\"lab_nome\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert tex_marca != null : "fx:id=\"tex_marca\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert tex_tipo != null : "fx:id=\"tex_tipo\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_marca != null : "fx:id=\"lab_marca\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_tipo != null : "fx:id=\"lab_tipo\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_faixa_etaria != null : "fx:id=\"lab_faixa_etaria\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_data != null : "fx:id=\"lab_data\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_estado != null : "fx:id=\"lab_estado\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert dat_data != null : "fx:id=\"dat_data\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert but_cadastrar != null : "fx:id=\"but_cadastrar\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert tex_descricao != null : "fx:id=\"tex_descricao\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert lab_descricao != null : "fx:id=\"lab_descricao\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert cho_etaria != null : "fx:id=\"cho_etaria\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";
         assert cho_estado != null : "fx:id=\"cho_estado\" was not injected: check your FXML file 'jan_B_cadastrar.fxml'.";

    }
    
    //função para retirar os dados inseridos.
    private void reset() {
    	tex_descricao.clear();
    	tex_marca.clear();
    	tex_nome.clear();
    	tex_tipo.clear();
    	dat_data.setValue(null);
    	cho_estado.setValue(null);
    	cho_etaria.setValue(null);
    }
}
