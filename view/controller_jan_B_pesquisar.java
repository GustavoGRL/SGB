package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import model.BRINQUEDO;

public class controller_jan_B_pesquisar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listv_brinquedos;
    
    private ObservableList<String> obs_brinquedos;


    @FXML
    private Button but_avancar;

    @FXML
    private Button but_voltar;

    @FXML
    private TextField tex_digitar;
    
    @FXML
    private void to_jan_B_inicio() {
    	Main.trocar_janela(6);
    }
    
    @FXML
    private void pesquisar_brinquedo() {
    	String teste= tex_digitar.getText();
    	List<String> list_aux= new ArrayList<String>();
    	
    	List<BRINQUEDO> brinquedo_list= model.model.pesquisar_brinquedo(teste);
    	
    	list_aux.add("Nome / Id");
    	
    	//adicionando os esultados da pesquisa em uma lista
    	for(BRINQUEDO brinquedo : brinquedo_list) {
    		String aux= brinquedo.getName() + " / " + brinquedo.getId();
    		list_aux.add(aux);
    	}
    	//colocando os resultados na tela
    	obs_brinquedos = FXCollections.observableArrayList(list_aux);
    	listv_brinquedos.setItems(obs_brinquedos);
    	
    }
    
    @FXML
    private void to_jan_B_informacoes() {

    	Alert alerte= new Alert(AlertType.ERROR);
	    alerte.setHeaderText("Erro");
	   	alerte.setContentText("para avançar selecione um Brinquedo da lista.");
	   	
    	if (listv_brinquedos.getSelectionModel().getSelectedItem() == null) {
	    	alerte.show();
	    	
    	}else if(listv_brinquedos.getSelectionModel().getSelectedItem().equals("Nome / Id")){
    		alerte.show();
    	}else {
    		
    		Main.informacao_brinquedo= return_brinquedo();
    		Main.trocar_janela(9);
	        
    	}
    }
    
    
    

    @FXML
    void initialize() {
    	

    	
    	pesquisar_brinquedo();
    	
    	tex_digitar.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                pesquisar_brinquedo();
            }
        });
    	
        assert listv_brinquedos != null : "fx:id=\"listv_brinquedos\" was not injected: check your FXML file 'jan_B_pesquisar.fxml'.";
        assert but_avancar != null : "fx:id=\"but_avancar\" was not injected: check your FXML file 'jan_B_pesquisar.fxml'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_B_pesquisar.fxml'.";
        assert tex_digitar != null : "fx:id=\"tex_digitar\" was not injected: check your FXML file 'jan_B_pesquisar.fxml'.";

    }
    
    private BRINQUEDO return_brinquedo() {
    	String [] aux= listv_brinquedos.getSelectionModel().getSelectedItem().split(" / ");
    	
    	List<BRINQUEDO> objeto =  model.model.pesquisar_brinquedo(aux[1]);
    	
    	return objeto.get(0);
    }
    
    
}
