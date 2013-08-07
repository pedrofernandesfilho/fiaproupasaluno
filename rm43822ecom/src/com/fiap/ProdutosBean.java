package com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="p")
public class ProdutosBean {

	private int codProduto;
	private String descricao;
	private String foto;
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String btnPesquisar() {
		
		if (getCodProduto() == 1){
			setDescricao("Calça");
			setFoto("Calca.jpg");
		} else {
			setDescricao("Blusa");
			setFoto("Blusa.jpg");
		}
		
		return "";
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
