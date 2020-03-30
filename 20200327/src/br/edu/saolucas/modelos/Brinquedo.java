package br.edu.saolucas.modelos;

	public class Brinquedo {
			String type;
			String description;
			String category;
	
	public String pegarType() {
		return type;
	}
	
	public void atribuirType(String type) {
		this.type = type;
	}
	
	public String pegarDescription() {
		return description;
	}
	
	public void atribuirDescription(String description) {
		this.description = description;
	}
	
	public String pegarCategory() {
		return category;
	}
	
	public void atribuircategory(String category) {
		this.category = category;
	}
	
	public String toString(){
		String texto;
		
		texto = "\nTipo: " + pegarCategory();
		texto += "\nDescrição: " + pegarDescription();
		texto += "\nCategoria:" + pegarCategory();
			
		return texto;
		
	}
	
	public boolean toCompare(Object objeto) {
		Brinquedo brinquedo = (Brinquedo) objeto;
		
		if(pegarCategory() == brinquedo.pegarCategory()) {
			return true;
			} else {
				return false;
			}
	}
}
