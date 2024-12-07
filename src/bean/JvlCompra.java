package bean;
// Generated 07/12/2024 15:09:50 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JvlCompra generated by hbm2java
 */
@Entity
@Table(name="jvl_compra"
    ,catalog="db_joao_almeida"
)
public class JvlCompra  implements java.io.Serializable {


     private Integer jvlIdCompra;
     private EmdCliente emdCliente;
     private JvlFornecedor jvlFornecedor;
     private Date jvlDataCompra;
     private BigDecimal jvlValorTotal;
     private String jvlStatusPagamento;
     private Set jvlCompraProdutos = new HashSet(0);

    public JvlCompra() {
    }

	
    public JvlCompra(EmdCliente emdCliente, JvlFornecedor jvlFornecedor, Date jvlDataCompra, BigDecimal jvlValorTotal, String jvlStatusPagamento) {
        this.emdCliente = emdCliente;
        this.jvlFornecedor = jvlFornecedor;
        this.jvlDataCompra = jvlDataCompra;
        this.jvlValorTotal = jvlValorTotal;
        this.jvlStatusPagamento = jvlStatusPagamento;
    }
    public JvlCompra(EmdCliente emdCliente, JvlFornecedor jvlFornecedor, Date jvlDataCompra, BigDecimal jvlValorTotal, String jvlStatusPagamento, Set jvlCompraProdutos) {
       this.emdCliente = emdCliente;
       this.jvlFornecedor = jvlFornecedor;
       this.jvlDataCompra = jvlDataCompra;
       this.jvlValorTotal = jvlValorTotal;
       this.jvlStatusPagamento = jvlStatusPagamento;
       this.jvlCompraProdutos = jvlCompraProdutos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="jvl_id_compra", unique=true, nullable=false)
    public Integer getJvlIdCompra() {
        return this.jvlIdCompra;
    }
    
    public void setJvlIdCompra(Integer jvlIdCompra) {
        this.jvlIdCompra = jvlIdCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente_emd_id_cliente", nullable=false)
    public EmdCliente getEmdCliente() {
        return this.emdCliente;
    }
    
    public void setEmdCliente(EmdCliente emdCliente) {
        this.emdCliente = emdCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="jvl_fornecedor_jvl_id_fornecedor", nullable=false)
    public JvlFornecedor getJvlFornecedor() {
        return this.jvlFornecedor;
    }
    
    public void setJvlFornecedor(JvlFornecedor jvlFornecedor) {
        this.jvlFornecedor = jvlFornecedor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jvl_data_compra", nullable=false, length=10)
    public Date getJvlDataCompra() {
        return this.jvlDataCompra;
    }
    
    public void setJvlDataCompra(Date jvlDataCompra) {
        this.jvlDataCompra = jvlDataCompra;
    }

    
    @Column(name="jvl_valor_total", nullable=false, precision=10)
    public BigDecimal getJvlValorTotal() {
        return this.jvlValorTotal;
    }
    
    public void setJvlValorTotal(BigDecimal jvlValorTotal) {
        this.jvlValorTotal = jvlValorTotal;
    }

    
    @Column(name="jvl_status_pagamento", nullable=false, length=20)
    public String getJvlStatusPagamento() {
        return this.jvlStatusPagamento;
    }
    
    public void setJvlStatusPagamento(String jvlStatusPagamento) {
        this.jvlStatusPagamento = jvlStatusPagamento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="jvlCompra")
    public Set getJvlCompraProdutos() {
        return this.jvlCompraProdutos;
    }
    
    public void setJvlCompraProdutos(Set jvlCompraProdutos) {
        this.jvlCompraProdutos = jvlCompraProdutos;
    }




}


