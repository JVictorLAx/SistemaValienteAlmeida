package bean;
// Generated 09/12/2024 16:12:03 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmdVenda generated by hbm2java
 */
@Entity
@Table(name="emd_venda"
    ,catalog="db_joao_almeida"
)
public class EmdVenda  implements java.io.Serializable {


     private int emdIdVenda;
     private JvlAvaliacaoProduto jvlAvaliacaoProduto;
     private JvlUsuario jvlUsuario;
     private Date emdDataVenda;
     private long emdPreco;
     private String emdCorCarro;
     private String emdFormaPagamento;
     private String emdModelo;
     private String emdMarca;

    public EmdVenda() {
    }

	
    public EmdVenda(int emdIdVenda, JvlAvaliacaoProduto jvlAvaliacaoProduto, JvlUsuario jvlUsuario, Date emdDataVenda, long emdPreco, String emdCorCarro, String emdFormaPagamento, String emdModelo, String emdMarca) {
        this.emdIdVenda = emdIdVenda;
        this.jvlAvaliacaoProduto = jvlAvaliacaoProduto;
        this.jvlUsuario = jvlUsuario;
        this.emdDataVenda = emdDataVenda;
        this.emdPreco = emdPreco;
        this.emdCorCarro = emdCorCarro;
        this.emdFormaPagamento = emdFormaPagamento;
        this.emdModelo = emdModelo;
        this.emdMarca = emdMarca;
    }
   
   
     @Id 

    
    @Column(name="emd_id_venda", unique=true, nullable=false)
    public int getEmdIdVenda() {
        return this.emdIdVenda;
    }
    
    public void setEmdIdVenda(int emdIdVenda) {
        this.emdIdVenda = emdIdVenda;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="jvl_avaliacao_produto_jvl_id_avaliacao_produto", nullable=false)
    public JvlAvaliacaoProduto getJvlAvaliacaoProduto() {
        return this.jvlAvaliacaoProduto;
    }
    
    public void setJvlAvaliacaoProduto(JvlAvaliacaoProduto jvlAvaliacaoProduto) {
        this.jvlAvaliacaoProduto = jvlAvaliacaoProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_jvl_id_usuario", nullable=false)
    public JvlUsuario getJvlUsuario() {
        return this.jvlUsuario;
    }
    
    public void setJvlUsuario(JvlUsuario jvlUsuario) {
        this.jvlUsuario = jvlUsuario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="emd_data_venda", nullable=false, length=10)
    public Date getEmdDataVenda() {
        return this.emdDataVenda;
    }
    
    public void setEmdDataVenda(Date emdDataVenda) {
        this.emdDataVenda = emdDataVenda;
    }

    
    @Column(name="emd_preco", nullable=false, precision=10, scale=0)
    public long getEmdPreco() {
        return this.emdPreco;
    }
    
    public void setEmdPreco(long emdPreco) {
        this.emdPreco = emdPreco;
    }

    
    @Column(name="emd_cor_carro", nullable=false, length=30)
    public String getEmdCorCarro() {
        return this.emdCorCarro;
    }
    
    public void setEmdCorCarro(String emdCorCarro) {
        this.emdCorCarro = emdCorCarro;
    }

    
    @Column(name="emd_forma_pagamento", nullable=false, length=20)
    public String getEmdFormaPagamento() {
        return this.emdFormaPagamento;
    }
    
    public void setEmdFormaPagamento(String emdFormaPagamento) {
        this.emdFormaPagamento = emdFormaPagamento;
    }

    
    @Column(name="emd_modelo", nullable=false, length=45)
    public String getEmdModelo() {
        return this.emdModelo;
    }
    
    public void setEmdModelo(String emdModelo) {
        this.emdModelo = emdModelo;
    }

    
    @Column(name="emd_marca", nullable=false, length=45)
    public String getEmdMarca() {
        return this.emdMarca;
    }
    
    public void setEmdMarca(String emdMarca) {
        this.emdMarca = emdMarca;
    }





}


