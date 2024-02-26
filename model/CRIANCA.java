package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CRIANCA {
	private String name, gender, cpf, address, illnesses;
	private LocalDate birth;
	private String contact_number,  mother, father;
	
	
	

	//contrutor para novo objeto.
	public CRIANCA(String nome, String genero, String cpf, String endereco, 
		String doencas, LocalDate data_nascimento, String numero_contato,
		String mae, String pai) {
		this.name = nome;
		this.mother = mae;
		this.father = pai;
		this.birth = data_nascimento;
		this.contact_number = numero_contato;
		this.cpf = cpf;
		this.gender= genero;
	}



	public String getName(boolean maiusculo) {
		
		if (maiusculo == true) {
			//retornando o nome completo e garantindo que as primeiras letras das palavras 
			//sejam maiusculas
			String[] palavras;
			
			palavras= this.name.split(" ");
			
			String result= "";
			
			for(String aux: palavras) {
				if (!aux.isEmpty()) {
					char primeiraLetra = Character.toUpperCase(aux.charAt(0));
		            result= result+ primeiraLetra + aux.substring(1) + " ";
		            
				}
			}
			return result;
		}
		return this.name;


		
		
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMother(boolean maiusculo) {
		if (maiusculo == true) {
			//retornando o nome completo e garantindo que as primeiras letras das palavras 
			//sejam maiusculas
			String[] palavras;
			
			palavras= this.mother.split(" ");
			
			String result= "";
			
			for(String aux: palavras) {
				if (!aux.isEmpty()) {
					char primeiraLetra = Character.toUpperCase(aux.charAt(0));
		            result= result+ primeiraLetra + aux.substring(1) + " ";
		            
				}
			}
			return result;
		}
		
		
		return this.mother;
	}



	public void setMother(String mother) {
		this.mother = mother;
	}



	public String getFather(boolean maiusculo) {
		if (maiusculo == true) {
			//retornando o nome completo e garantindo que as primeiras letras das palavras 
			//sejam maiusculas
			String[] palavras;
			
			palavras= this.father.split(" ");
			
			String result= "";
			
			for(String aux: palavras) {
				if (!aux.isEmpty()) {
					char primeiraLetra = Character.toUpperCase(aux.charAt(0));
		            result= result+ primeiraLetra + aux.substring(1) + " ";
		            
				}
			}
			
			return result;
		}
		return this.father;
		
	}



	public void setFather(String father) {
		this.father = father;
	}



	public String getGender() {
		if (gender == null) {
			return "não informado";
		}
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getIllnesses() {
		
		return illnesses;
	}



	public void setIllnesses(String illnesses) {
		this.illnesses = illnesses;
	}



	 public String getBirth() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 return birth.format(formatter);
	 }



	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}



	public String getContact_number() {
		return contact_number + "";
	}



	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}



	


	