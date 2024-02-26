package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class model {
	
	private static List<BRINQUEDO> brinquedo_list= new ArrayList<BRINQUEDO>();
	private static List<CRIANCA> crianca_list= new ArrayList<CRIANCA>();
	
	static int num_BRINQUEDO= 0;
	
	//registrar criança
	public static boolean Registrar_Crianca( String nome, String genero, String cpf, String endereco, 
			String doencas, LocalDate data_nascimento, String numero_contato,
			String mae, String pai) {
		
		
		StringBuilder teste_cpf= new StringBuilder();
		StringBuilder teste_numero= new StringBuilder();
		
		nome= nome.toLowerCase();
		
		for (char c : nome.toCharArray()) {
	        if (Character.isDigit(c)) {
	            return false;
	        }
	    }
		
		//testando se o cpf é valido.
		
		// Remover caracteres não numéricos do CPF
	    for (char c : cpf.toCharArray()) {
	        if (Character.isDigit(c)) {
	            teste_cpf.append(c);
	        }
	    }
		
		if (teste_cpf.toString().length() != 11) {
			return false;
		}
		
		
		//testando se o numero é valido.
		for (char c : numero_contato.toCharArray()) {
			if (Character.isDigit(c)) {
				teste_numero.append(c);
				
			}
		}
		
		if (teste_numero.toString().length() != 11) {
			return false;
		}
		
		
		
		
		//adicionando crianca no sistema.
		CRIANCA actual= new CRIANCA(nome, genero, cpf, endereco, doencas, data_nascimento, 
		numero_contato, mae, pai);
		crianca_list.add(actual);
		
		if (!doencas.equals("")) {
			actual.setIllnesses(doencas);
		}
		
		if (!endereco.equals("")) {
			actual.setAddress(endereco);
		}
		return true;
		
		
		
		
	}
	
	//registrando brinquedo.
	public static void Registrar_Brinquedo(String nome, String marca, String faixa_etaria, 
	String descricao, String tipo, String concervacao, LocalDate data_aquisicao, int id) {
		
		
		
		//caso o brinquedo ja esteja salvo no sistema usasse o id ja existente.
		if (id == 0){
			BRINQUEDO actual= new BRINQUEDO(nome, marca, faixa_etaria, descricao, 
			tipo, concervacao, data_aquisicao, id_generation_Brinquedo());
			
			brinquedo_list.add(actual);
		}else{
			BRINQUEDO actual= new BRINQUEDO(nome, marca, faixa_etaria, descricao, 
			tipo, concervacao, data_aquisicao, id);
			
			brinquedo_list.add(actual);
		}
		
	
		
	}
	
	
	//salvar as informações das crianças em um arquivo txt.
	public static void salvar_criancas() {
		try {
			File arquivo= new File("C:\\Eclipce\\Gerenciador de Brinquedoteca\\src\\Crianças.txt");
		
			FileWriter escritor= new FileWriter(arquivo);
			BufferedWriter buff = new BufferedWriter(escritor);
			
			for(CRIANCA crianca: crianca_list) {
				
				
				
				//criando uma linha com todas as informações de cada criança.
				String conteudo= crianca.getName(false).toLowerCase() + ", " + crianca.getGender() + ", " + crianca.getCpf()
				 + ", " + crianca.getAddress() + ", " + crianca.getIllnesses()
				 + ", " + crianca.getBirth() + ", " + crianca.getContact_number()
				 + ", " + crianca.getMother(false) + ", " + crianca.getFather(false);
				
				buff.write(conteudo);
				buff.newLine();
			}
			

			buff.close();
			escritor.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//salvando todas as informações de cada brinquedo em um arquivo txt.
	public static void salvar_brinquedo() {
		try {
			File arquivo= new File("C:\\Eclipce\\Gerenciador de Brinquedoteca\\src\\Brinquedos.txt");
			
			FileWriter escritor= new FileWriter(arquivo);
			BufferedWriter buff = new BufferedWriter(escritor);
			
			for(BRINQUEDO brinquedo: brinquedo_list) {
				
				//criando uma linha com todas as informações de cada criança.
				String conteudo=brinquedo.getName().toLowerCase() + ", " + brinquedo.getBrand() 
				+ ", " + brinquedo.getAge_range()+ ", " + brinquedo.getDescription() + ", " 
				+ brinquedo.getType() + ", " + brinquedo.getConservation()
				 + ", " + brinquedo.getAcquisition() + ", " + brinquedo.getId();
				
				

				buff.write(conteudo);
				buff.newLine();
			}
			
			
			
			buff.close();
			escritor.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//carregar as informaçoes das crianças que foram salvas no arquivo txt
	public static void carregar_criancas() {
		try {
			File arquivo= new File("C:\\Eclipce\\Gerenciador de Brinquedoteca\\src\\Crianças.txt");
		
			FileReader escritor= new FileReader(arquivo);
			BufferedReader buff = new BufferedReader(escritor);
			
			String linha;
			String[] informacoes;
			 

			
			while((linha= buff.readLine()) != null) {
				if (linha.isEmpty()) {
					break;
				}

				informacoes= linha.split(", ");

				// Define o formato da data como "yyyy-MM-dd"
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	            
	            // Transforma a string de data em um objeto LocalDate
	            LocalDate dataLocalDate = LocalDate.parse(informacoes[5], formatter);
	            

	    		CRIANCA actual= new CRIANCA(informacoes[0], informacoes[1], informacoes[2], informacoes[3], informacoes[4], dataLocalDate, informacoes[6], informacoes[7], informacoes[8]);
	    		crianca_list.add(actual);
			}
		buff.close();
		escritor.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	//carregar as informaçoes dos brinquedos que foram salvas no arquivo txt
	public static void carregar_brinquedo() {
		try {
			File arquivo= new File("C:\\Eclipce\\Gerenciador de Brinquedoteca\\src\\Brinquedos.txt");
			
			FileReader escritor= new FileReader(arquivo);
			BufferedReader buff = new BufferedReader(escritor);
			
			String linha;
			String[] informacoes;
			
			
			
			while((linha= buff.readLine()) != null) {
				informacoes= linha.split(", ");
				
				
				
				
				
				// Define o formato da data como "yyyy-MM-dd"
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				
				
				// Transforma a string de data em um objeto LocalDate
				LocalDate dataLocalDate = LocalDate.parse(informacoes[6], formatter);
				
				int id_actual= Integer.parseInt(informacoes[7]);
				
				Registrar_Brinquedo(informacoes[0], informacoes[1], informacoes[2], informacoes[3], informacoes[4], informacoes[5], dataLocalDate, id_actual);
				
				
				
				if (num_BRINQUEDO < id_actual){
					num_BRINQUEDO= id_actual;
				}
			}
			buff.close();
			escritor.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//buscar crianças com base no nome.
	public static List<CRIANCA> pesquisar_criancas_nome(String nome){
		
		List<CRIANCA> list_aux= new ArrayList<CRIANCA>();
		
		for (CRIANCA crianca: crianca_list) {
			if (crianca.getName(false).contains(nome.toLowerCase())) {
				list_aux.add(crianca);
				
			}
		}
		
		
		return list_aux;
	}
	
	
	public static CRIANCA pesquisar_criancas_cpf(String cpf) {
		
		String [] list_aux= cpf.split(" / ");
		
		
		
		for (CRIANCA crianca: crianca_list) {
			if (crianca.getCpf().equals(list_aux[1].trim())){
				return crianca;
			}
		}
		return null;
		
		
	}
	
	//pesquisa os brinquedos com base no nome ou id e retorna uma lista de brinquedos.
	public static List<BRINQUEDO> pesquisar_brinquedo(String argum) {
		
		boolean id= true;
		
		//garantindo que no inicio do programa não de erro.
		if (argum.equals("")) {
			id= false;
		}else {
//			verificando se é um id.
			for( char aux : argum.toCharArray()) {
				if (!Character.isDigit(aux)) {
					id= false ;
				}
			}
		}
		

		
		
		
		
		//caso queira pesquisar por id 
		if (id == true) {
			
			List<BRINQUEDO> list_resp= new ArrayList<BRINQUEDO>();
			
			for (BRINQUEDO brinquedo: brinquedo_list) {
				if (brinquedo.getId() == Integer. parseInt(argum)) {
					list_resp.add(brinquedo);
					
				}
			}
			return list_resp;
			
		//caso queira pesquisar por nome
		}else {
			
			List<BRINQUEDO> list_resp= new ArrayList<BRINQUEDO>();
			
			for (BRINQUEDO brinquedo: brinquedo_list) {
				if (brinquedo.getName().contains(argum.toLowerCase())) {
					list_resp.add(brinquedo);
					
				}
			}
			return list_resp;
		}
	
	}
	
	
	//get para lista de brinquedos.
	public static List<BRINQUEDO> getBrinquedo_list() {
		return brinquedo_list;
	}
	//get para lista de crianças.
	public static List<CRIANCA> getCrianca_list() {
		return crianca_list;
	}

	//criar um id unico para brinquedos.
	private static int id_generation_Brinquedo() {
		num_BRINQUEDO+=1;
		return num_BRINQUEDO;
	}
	
	

	
}
