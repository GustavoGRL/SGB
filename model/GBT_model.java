package model;

import java.time.LocalDate;
import java.util.List;

public class GBT_model{
	public static void main(String[] args) {
		
		model.carregar_brinquedo();
		
		for(BRINQUEDO aux : model.getBrinquedo_list()) {
			System.out.println(aux.getName());
		}
		
		model.salvar_brinquedo();
		
	}
}