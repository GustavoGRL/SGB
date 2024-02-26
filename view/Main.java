package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.BRINQUEDO;
import model.CRIANCA;

public class Main extends Application {

	private static Stage stage;
	
	
	
	private static Scene scene_jan_main; 
	
	private static Scene scene_jan_C_inicio, scene_jan_C_pesquisar,
	scene_jan_C_informacoes, scene_jan_C_cadastrar;
	
	private static Scene scene_jan_B_inicio, scene_jan_B_cadastrar, scene_jan_B_pesquisar, scene_jan_B_informacoes;
	
	FXMLLoader jan_main= new FXMLLoader(getClass().getResource("jan_main.fxml"));
	
	FXMLLoader jan_C_inicio= new FXMLLoader(getClass().getResource("jan_C_inicio.fxml"));
	FXMLLoader jan_C_pesquisar= new FXMLLoader(getClass().getResource("jan_C_pesquisar.fxml"));
	FXMLLoader jan_C_informacoes= new FXMLLoader(getClass().getResource("jan_C_informações.fxml"));
	FXMLLoader jan_C_cadastrar= new FXMLLoader(getClass().getResource("jan_C_cadastrar.fxml"));
	
	FXMLLoader jan_B_inicio= new FXMLLoader(getClass().getResource("jan_B_inicio.fxml"));
	FXMLLoader jan_B_cadastrar= new FXMLLoader(getClass().getResource("jan_B_cadastrar.fxml"));
	FXMLLoader jan_B_pesquisar= new FXMLLoader(getClass().getResource("jan_B_pesquisar.fxml"));
	FXMLLoader jan_B_informacoes= new FXMLLoader(getClass().getResource("jan_B_informações.fxml"));
	
	
	public static CRIANCA informacao_crianca;
	public static BRINQUEDO informacao_brinquedo;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		//carregando os dados salvos para o sistema.
		model.model.carregar_brinquedo();
		model.model.carregar_criancas();
		
		stage= primaryStage;
		
		stage.setTitle("SGB");
		
		
		Parent parent_jan_main= jan_main.load();
		
		Parent parent_jan_C_inicio= jan_C_inicio.load();
		Parent parent_jan_C_pesquisar= jan_C_pesquisar.load();
		Parent parent_jan_C_informacoes= jan_C_informacoes.load();
		Parent parent_jan_C_cadastrar= jan_C_cadastrar.load();
		
		Parent parent_jan_B_inicio= jan_B_inicio.load();
		Parent parent_jan_B_cadastrar= jan_B_cadastrar.load();
		Parent parent_jan_B_pesquisar= jan_B_pesquisar.load();
		Parent parent_jan_B_informacoes= jan_B_informacoes.load();

		
		
		stage.setOnCloseRequest(event -> {
            model.model.salvar_criancas();
            model.model.salvar_brinquedo();
            
        });
		
		
		scene_jan_main= new Scene(parent_jan_main, 600, 400);
		
		scene_jan_C_inicio= new Scene(parent_jan_C_inicio, 600, 400);
		scene_jan_C_pesquisar=new Scene(parent_jan_C_pesquisar, 600, 400);
		scene_jan_C_informacoes=new Scene(parent_jan_C_informacoes, 600, 400);
		scene_jan_C_cadastrar=new Scene(parent_jan_C_cadastrar, 600, 400);
		
		scene_jan_B_inicio= new Scene(parent_jan_B_inicio, 600, 400);
		scene_jan_B_cadastrar= new Scene(parent_jan_B_cadastrar, 600, 400);
		scene_jan_B_pesquisar= new Scene(parent_jan_B_pesquisar, 600, 400);
		scene_jan_B_informacoes= new Scene(parent_jan_B_informacoes, 600, 400);

		stage.setScene(scene_jan_main);
		stage.show();
		
	}
	
	//função para faser a troca de janelas no sistema.
	public static void trocar_janela(int value) {
		switch (value) {
		case 1:
			stage.setScene(scene_jan_main);
			break;

		case 2:
			stage.setScene(scene_jan_C_inicio);
			
			break;
			
		case 3:
			stage.setScene(scene_jan_C_pesquisar);
			
			break;
		case 4:
			stage.setScene(scene_jan_C_informacoes);
			
			break;
			
		case 5:
			stage.setScene(scene_jan_C_cadastrar);
			
			break;
			
		case 6:
			stage.setScene(scene_jan_B_inicio);
			
			break;
			
		case 7:
			stage.setScene(scene_jan_B_cadastrar);
			
			break;
			
		case 8:
			stage.setScene(scene_jan_B_pesquisar);
			
			break;
			
		case 9:
			stage.setScene(scene_jan_B_informacoes);
			
			break;
			
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}