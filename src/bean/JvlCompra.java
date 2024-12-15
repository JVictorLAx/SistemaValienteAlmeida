package bean;
// Generated 15/12/2024 20:30:31 by Hibernate Tools 4.3.1


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
 * JvlCompra generated by hbm2java
 */
@Entity
@Table(name="jvl_compra"
    ,catalog="db_joao_almeida"
)
public class JvlCompra  implements java.io.Serializable {


     private int jvlIdCompra;
     private JvlFornecedor jvlFornecedor;
     private JvlUsuarios jvlUsuarios;
     private Date jvlDataCompra;
     private double jvlValorTotal;

    public JvlCompra() {
    }

	
    public JvlCompra(int jvlIdCompra, JvlFornecedor jvlFornecedor, JvlUsuarios jvlUsuarios, double jvlValorTotal) {
        this.jvlIdCompra = jvlIdCompra;
        this.jvlFornecedor = jvlFornecedor;
        this.jvlUsuarios = jvlUsuarios;
        this.jvlValorTotal = jvlValorTotal;
    }
    public JvlCompra(int jvlIdCompra, JvlFornecedor jvlFornecedor, JvlUsuarios jvlUsuarios, Date jvlDataCompra, double jvlValorTotal) {
       this.jvlIdCompra = jvlIdCompra;
       this.jvlFornecedor = jvlFornecedor;
       this.jvlUsuarios = jvlUsuarios;
       this.jvlDataCompra = jvlDataCompra;
       this.jvlValorTotal = jvlValorTotal;
    }
   
     @Id 

    
    @Column(name="jvl_id_compra", unique=true, nullable=false)
    public int getJvlIdCompra() {
        return this.jvlIdCompra;
    }
    
    public void setJvlIdCompra(int jvlIdCompra) {
        this.jvlIdCompra = jvlIdCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_fornecedor", nullable=false)
    public JvlFornecedor getJvlFornecedor() {
        return this.jvlFornecedor;
    }
    
    public void setJvlFornecedor(JvlFornecedor jvlFornecedor) {
        this.jvlFornecedor = jvlFornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_usuarios", nullable=false)
    public JvlUsuarios getJvlUsuarios() {
        return this.jvlUsuarios;
    }
    
    public void setJvlUsuarios(JvlUsuarios jvlUsuarios) {
        this.jvlUsuarios = jvlUsuarios;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jvl_data_compra", length=10)
    public Date getJvlDataCompra() {
        return this.jvlDataCompra;
    }
    
    public void setJvlDataCompra(Date jvlDataCompra) {
        this.jvlDataCompra = jvlDataCompra;
    }

    
    @Column(name="jvl_valor_total", nullable=false, precision=10)
    public double getJvlValorTotal() {
        return this.jvlValorTotal;
    }
    
    public void setJvlValorTotal(double jvlValorTotal) {
        this.jvlValorTotal = jvlValorTotal;
    }



}


