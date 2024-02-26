package view;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import model.CRIANCA;

public class controller_jan_C_informações {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lab_nome;

    @FXML
    private Label lab_nascimento;

    @FXML
    private Button but_voltar;

    @FXML
    private Label lab_nome1;

    @FXML
    private Label lab_cpf;

    @FXML
    private Label lab_genero;

    @FXML
    private Label lab_pai;

    @FXML
    private Label lab_mae;

    @FXML
    private Label lab_numero;

    @FXML
    private Label lab_resp_nome;

    @FXML
    private Label lab_resp_nascimento;

    @FXML
    private Label lab_resp_cpf;

    @FXML
    private Label lab_resp_genero;

    @FXML
    private Label lab_resp_pai;

    @FXML
    private Label lab_resp_mae;

    @FXML
    private Label lab_resp_numero;

    @FXML
    private Button but_teste;

    @FXML
    void to_jan_C_pesquisar(ActionEvent event) {
    	Main.trocar_janela(3);
    }
    
    
    @FXML
    public void carregar_conteudos() {
    	
    	
    	if (Main.informacao_crianca != null) {
    		CRIANCA crianca= Main.informacao_crianca;
    		
    		lab_resp_nome.setText(crianca.getName(true));
    		lab_resp_nascimento.setText(crianca.getBirth());
    		lab_resp_cpf.setText(crianca.getCpf());
    		lab_resp_genero.setText(crianca.getGender());
    		lab_resp_pai.setText(crianca.getFather(true));
    		lab_resp_mae.setText(crianca.getMother(true));
    		lab_resp_numero.setText(crianca.getContact_number());
    	}
    	
    }
    
    @FXML
    private void deletar() {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("AVISO");
		alert.setContentText("A crianca " + Main.informacao_crianca.getName(true) + " foi deletada do sistema com sucesso!!!");
    	alert.show();
    	
    	model.model.getCrianca_list().remove(Main.informacao_crianca);
    }
    
    @FXML
    void initialize() {
        assert lab_nome != null : "fx:id=\"lab_nome\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_nascimento != null : "fx:id=\"lab_nascimento\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_nome1 != null : "fx:id=\"lab_nome1\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_cpf != null : "fx:id=\"lab_cpf\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_genero != null : "fx:id=\"lab_genero\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_pai != null : "fx:id=\"lab_pai\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_mae != null : "fx:id=\"lab_mae\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_numero != null : "fx:id=\"lab_numero\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_nome != null : "fx:id=\"lab_resp_nome\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_nascimento != null : "fx:id=\"lab_resp_nascimento\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_cpf != null : "fx:id=\"lab_resp_cpf\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_genero != null : "fx:id=\"lab_resp_genero\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_pai != null : "fx:id=\"lab_resp_pai\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_mae != null : "fx:id=\"lab_resp_mae\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert lab_resp_numero != null : "fx:id=\"lab_resp_numero\" was not injected: check your FXML file 'jan_C_informações.fxml'.";
        assert but_teste != null : "fx:id=\"but_teste\" was not injected: check your FXML file 'jan_C_informações.fxml'.";

        if (Main.informacao_crianca != null) {
            carregar_conteudos();
        }
    }

    
    
    
    
}
