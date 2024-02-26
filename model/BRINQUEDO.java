package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BRINQUEDO {
	private String name, brand, age_range;
	private String description;
	private String type;
	private String conservation;
	private LocalDate acquisition;
	private int id;
	
	
	public BRINQUEDO(String nome, String marca, String faixa_etaria, String descricao,
		String tipo, String concervacao, LocalDate data_aquisicao, int id) {
		
		this.name = nome;
		this.brand = marca;
		this.age_range = faixa_etaria;
		this.description = descricao;
		this.type = tipo;
		this.conservation = concervacao;
		this.acquisition = data_aquisicao;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getAge_range() {
		return age_range;
	}


	public void setAge_range(String age_range) {
		this.age_range = age_range;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getConservation() {
		return conservation;
	}


	public void setConservation(String conservation) {
		this.conservation = conservation;
	}


	public LocalDate getAcquisition() {
		return acquisition;
	}
	
	public String getAcquisition_string() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return acquisition.format(formatter);
	}


	public void setAcquisition(LocalDate acquisition) {
		this.acquisition = acquisition;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
}