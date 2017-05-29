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
public class Tarefa {
    
    Usuario user = new Usuario();
    Clientes cli = new Clientes();
    
    private int CodTarefa;
    private String Descricao;
    private String DataInicial;
    private String DataFinal;
    private String Estado;
    private String Observacoes;
    int usuario = user.getCodUser();
    int cliente = cli.getCodCliente();
    String clientenome = cli.getNomeCliente();
    String usernome = user.getNomeUser();
    

    public Usuario getUser() {return user;}
    public void setUser(Usuario user) {this.user = user;}

    public Clientes getCli() {return cli;}
    public void setCli(Clientes cli) {this.cli = cli;}

    public int getCodTarefa() {return CodTarefa;}
    public void setCodTarefa(int CodTarefa) {this.CodTarefa = CodTarefa; }

    public String getDescricao() {return Descricao;}
    public void setDescricao(String Descricao) { this.Descricao = Descricao;  }

    public String getDataInicial() { return DataInicial;}
    public void setDataInicial(String DataInicial) {this.DataInicial = DataInicial;}

    public String getDataFinal() {return DataFinal; }
    public void setDataFinal(String DataFinal) {this.DataFinal = DataFinal; }

    public String getEstado() {return Estado;}
    public void setEstado(String Estado) {this.Estado = Estado;  }

    public String getObservacoes() {return Observacoes; }
    public void setObservacoes(String Observacoes) { this.Observacoes = Observacoes;}

    public int getUsuario() {return usuario; }
    public void setUsuario(int usuario) { this.usuario = usuario; }

    public int getCliente() { return cliente;}
    public void setCliente(int cliente) { this.cliente = cliente;}

    public String getClientenome() {return clientenome;}
    public void setClientenome(String clientenome) {this.clientenome = clientenome;}

    public String getUsernome() {return usernome;}
    public void setUsernome(String usernome) {this.usernome = usernome;}
    
    

    @Override
    public String toString() {
        return getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
