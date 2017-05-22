/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author Cravid Ekuikui
 */
public class Clientes {
    
   private int CodCliente;
   private String NomeCliente;
   private int NifCliente;
   private int Telefone;
   private String Casa;
   private String Rua;
   private String Bairro;
   private String Municipio;


    public int getCodCliente() {return CodCliente;}
    public void setCodCliente(int CodCliente) {this.CodCliente = CodCliente;}

    public String getNomeCliente() {return NomeCliente;}
    public void setNomeCliente(String NomeCliente) {this.NomeCliente = NomeCliente;}

    public int getNifCliente() {return NifCliente;}
    public void setNifCliente(int NifCliente) {this.NifCliente = NifCliente;}

    public int getTelefone() {return Telefone;}
    public void setTelefone(int Telefone) {this.Telefone = Telefone;}

    public String getCasa() {return Casa;}
    public void setCasa(String Casa) {this.Casa = Casa;}

    public String getRua() {return Rua;}
    public void setRua(String Rua) {this.Rua = Rua;}

    public String getBairro() {return Bairro;}
    public void setBairro(String Bairro) {this.Bairro = Bairro;}

    public String getMunicipio() {return Municipio;}
    public void setMunicipio(String Municipio) {this.Municipio = Municipio;}
    
    
   
   
   
    
}
