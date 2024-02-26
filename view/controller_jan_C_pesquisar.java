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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.CRIANCA;

public class controller_jan_C_pesquisar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listv_crancas;

    private ObservableList<String> obs_criancas;

    private List<String> list_criancas = new ArrayList<>();

    @FXML
    private Button but_voltar;

    @FXML
    private TextField tex_digitar;

    // pesquisar crianças com base no nome e colocar na lista.
    @FXML
    private void pesquisar_crianca() {

        // esvaziando a lista
        list_criancas.clear();

        String conteudo = "Nome   /   CPF / DATA DE NASCIMENTO  / GENERO";
        list_criancas.add(conteudo);

        // adicionando as informações da pesquisa.
        for (CRIANCA crianca : model.model.pesquisar_criancas_nome(tex_digitar.getText())) {
            conteudo = crianca.getName(true) + " / " + crianca.getCpf() + " / " + crianca.getBirth() + " / "
                    + crianca.getGender();
            list_criancas.add(conteudo);
        }

        obs_criancas = FXCollections.observableArrayList(list_criancas);
        listv_crancas.setItems(obs_criancas);
    }

    // funções de troca de janela.
    @FXML
    private void to_jan_C_inicio() {
        Main.trocar_janela(2);
    }

    @FXML
    private void to_jan_C_informacoes() {
    	Alert alerte= new Alert(AlertType.ERROR);
	    alerte.setHeaderText("Error");
	   	alerte.setContentText("para avançar selecione um aluno da lista.");
    	if (listv_crancas.getSelectionModel().getSelectedItem() == null) {
	    	alerte.show();
	    	
    	}else if(listv_crancas.getSelectionModel().getSelectedItem().equals("Nome   /   CPF / DATA DE NASCIMENTO  / GENERO")){
    		alerte.show();
    	}else {
    		String conteudo = listv_crancas.getSelectionModel().getSelectedItem();
	        Main.informacao_crianca= model.model.pesquisar_criancas_cpf(conteudo);

	        Main.trocar_janela(4);
	        
    	}
    }
    
    

    @FXML
    void initialize() {
        

        // colocando as informações em uma lista para exibir na tela.
        pesquisar_crianca();

        // Adiciona o evento ao TextField no método initialize
        tex_digitar.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                pesquisar_crianca();
            }
        });
        assert listv_crancas != null : "fx:id=\"listv_crancas\" was not injected: check your FXML file 'jan_C_pesquisar.fxml'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_C_pesquisar.fxml'.";
        assert tex_digitar != null : "fx:id=\"tex_digitar\" was not injected: check your FXML file 'jan_C_pesquisar.fxml'.";
    }
}
