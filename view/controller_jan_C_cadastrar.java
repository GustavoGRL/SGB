package view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class controller_jan_C_cadastrar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ScrollPane scroll;

    @FXML
    private HBox hbox;

    @FXML
    private VBox xbo_1;
    
    @FXML
    private VBox vbo_2;
    
    @FXML
    private VBox vbo_3;
    
    
    
    @FXML
    private Label lab_nome;

    @FXML
    private TextField tex_nome;

    @FXML
    private Label lab_mae;

    @FXML
    private TextField tex_mae;

    @FXML
    private Label lab_gender;

    @FXML
    private ChoiceBox<String> cho_gender;
    

    @FXML
    private Button but_cadastrar;

    @FXML
    private Button but_voltar;

    @FXML
    private Label lab_cpf;

    @FXML
    private TextField tex_cpf;

    @FXML
    private Label lab_pai;

    @FXML
    private TextField tex_pai;

    @FXML
    private Label lab_doencas;

    @FXML
    private TextArea tex_doencas;

    @FXML
    private Label lab_data_nascimento;

    @FXML
    private DatePicker dat_data_nascimento;

    @FXML
    private Label lab_numero_contato;

    @FXML
    private TextField tex_numero_contato;

    @FXML
    private Label label_endereco;

    @FXML
    private TextArea tex_endereco;
    
    //funçao para trocar de janela
    @FXML
    private void to_scene_jan_C_inicio() {
    	
    	Main.trocar_janela(2);
    }
    
    //cadastrar criança.
    @FXML
    private int cadastrar_crianca() {
    	
    	Alert alert= new Alert(AlertType.ERROR);
    	alert.setHeaderText("Error");
	   	
    	
    	String nome= tex_nome.getText();
    	String cpf= tex_cpf.getText();
    	String mae= tex_mae.getText();
    	String pai= tex_pai.getText();
    	String doencas= tex_doencas.getText();
    	String endereco= tex_endereco.getText();
    	LocalDate data_nascimento= dat_data_nascimento.getValue();
    	String numero_contato= tex_numero_contato.getText();
    	String genero= cho_gender.getValue();
    	
    	
    	//verificando se todas as informações foram preenchidas.
    	if (nome.equals("") || cpf.equals("") || mae.equals("") || pai.equals("")
        	|| data_nascimento == null ||
        	numero_contato.equals("") || genero == null) {
    	   	alert.setContentText("preencha todos as campos");
    	   	alert.show();
    	   	return 0;
    	}
    	
    	//registrando crianca no sistema.
    	boolean cadastro=model.model.Registrar_Crianca(nome, genero, cpf, endereco, 
    			doencas, data_nascimento, numero_contato,
    		    mae, pai);
    	
    	//salvando crianca nosarquivos.
    	if (cadastro == true) {
    		Alert cadastrado = new Alert(AlertType.CONFIRMATION);
    		cadastrado.setHeaderText("Parabens!!!");
    		cadastrado.setContentText("Criança cadastrada com sucesso.");
    	   	cadastrado.show();
    		reset();
    	}else {
    		alert.setContentText("Informações não preenchidas corretamente");
    	   	alert.show();
    	}
    	return 0;
    	
    }


    @FXML
    void initialize() {
    	//criando um show list dos generos.
    	ObservableList<String> obs_gender= FXCollections.observableArrayList("Masculino", "Feminino", "outro");
    	cho_gender.setItems(obs_gender);
    	
    	
    	
        assert scroll != null : "fx:id=\"scroll\" was not injected: check your FXML file 'Untitled'.";
        assert hbox != null : "fx:id=\"hbox\" was not injected: check your FXML file 'Untitled'.";
        assert xbo_1 != null : "fx:id=\"xbo_1\" was not injected: check your FXML file 'Untitled'.";
        assert lab_nome != null : "fx:id=\"lab_nome\" was not injected: check your FXML file 'Untitled'.";
        assert tex_nome != null : "fx:id=\"tex_nome\" was not injected: check your FXML file 'Untitled'.";
        assert lab_mae != null : "fx:id=\"lab_mae\" was not injected: check your FXML file 'Untitled'.";
        assert tex_mae != null : "fx:id=\"tex_mae\" was not injected: check your FXML file 'Untitled'.";
        assert lab_gender != null : "fx:id=\"lab_gender\" was not injected: check your FXML file 'Untitled'.";
        assert cho_gender != null : "fx:id=\"cho_gender\" was not injected: check your FXML file 'Untitled'.";
        assert but_cadastrar != null : "fx:id=\"but_cadastrar\" was not injected: check your FXML file 'Untitled'.";
        assert but_voltar != null : "fx:id=\"but_voltar\" was not injected: check your FXML file 'Untitled'.";
        assert vbo_2 != null : "fx:id=\"vbo_2\" was not injected: check your FXML file 'Untitled'.";
        assert lab_cpf != null : "fx:id=\"lab_cpf\" was not injected: check your FXML file 'Untitled'.";
        assert tex_cpf != null : "fx:id=\"tex_cpf\" was not injected: check your FXML file 'Untitled'.";
        assert lab_pai != null : "fx:id=\"lab_pai\" was not injected: check your FXML file 'Untitled'.";
        assert tex_pai != null : "fx:id=\"tex_pai\" was not injected: check your FXML file 'Untitled'.";
        assert lab_doencas != null : "fx:id=\"lab_doencas\" was not injected: check your FXML file 'Untitled'.";
        assert tex_doencas != null : "fx:id=\"tex_doencas\" was not injected: check your FXML file 'Untitled'.";
        assert vbo_3 != null : "fx:id=\"vbo_3\" was not injected: check your FXML file 'Untitled'.";
        assert lab_data_nascimento != null : "fx:id=\"lab_data_nascimento\" was not injected: check your FXML file 'Untitled'.";
        assert dat_data_nascimento != null : "fx:id=\"dat_data_nascimento\" was not injected: check your FXML file 'Untitled'.";
        assert lab_numero_contato != null : "fx:id=\"lab_numero_contato\" was not injected: check your FXML file 'Untitled'.";
        assert tex_numero_contato != null : "fx:id=\"tex_numero_contato\" was not injected: check your FXML file 'Untitled'.";
        assert label_endereco != null : "fx:id=\"label_endereco\" was not injected: check your FXML file 'Untitled'.";
        assert tex_endereco != null : "fx:id=\"tex_endereco\" was not injected: check your FXML file 'Untitled'.";

        tex_cpf.setOnKeyTyped(event -> {
            atualizando_cpf();
        });
        
        tex_numero_contato.setOnKeyTyped(event -> {
        	atualizando_numero();
        });
    }
    
    //adicionando as caracteristicas do cpf.
    private void atualizando_cpf() {
    	
    	StringBuilder builder= new StringBuilder();
    	String aux_cpf= tex_cpf.getText();
    	
    	int caretPosition = tex_cpf.getCaretPosition();
    	
    	builder.append(aux_cpf);
    	
    	if (aux_cpf.length() == 3) {
    		
    		builder.insert(aux_cpf.length() , ".");
    		
    		tex_cpf.setText(builder.toString());
    		tex_cpf.positionCaret(caretPosition + 1);
    		
    	}
    	
    	if (aux_cpf.length() == 7) {
    		builder.insert(aux_cpf.length() , ".");
    		
    		tex_cpf.setText(builder.toString());
    		tex_cpf.positionCaret(caretPosition + 1);
    		
    	}
    	if (aux_cpf.length() == 11) {
    		builder.insert(aux_cpf.length() , "-");
    		
    		tex_cpf.setText(builder.toString());
    		tex_cpf.positionCaret(caretPosition + 1);
    		
    	}
    	
    	
    }
    
    private void atualizando_numero() {
    	StringBuilder builder= new StringBuilder();
    	String aux_numero= tex_numero_contato.getText();
    	
    	
    	builder.append(aux_numero);
 
    	if (aux_numero.length() == 2) {
    		builder.insert(builder.length(), ")  ");
    		builder.insert(0, "(");
    		tex_numero_contato.setText(builder.toString());
    		tex_numero_contato.positionCaret(builder.length() + 3);
    	}
    	
    	if (aux_numero.length() == 11) {
    		builder.insert(builder.length(), "-");
    		tex_numero_contato.setText(builder.toString());
    		tex_numero_contato.positionCaret(builder.length() + 3);
    	}
    }
    
    private void reset() {
    	tex_nome.clear();
		tex_cpf.clear();
		tex_mae.clear();
		tex_pai.clear();
		tex_doencas.clear();
		tex_endereco.clear();
		tex_numero_contato.clear();
		cho_gender.setValue(null);
		dat_data_nascimento.setValue(null);
    }
}
