package bean;
// Generated 07/12/2024 15:09:50 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JvlFornecedor generated by hbm2java
 */
@Entity
@Table(name="jvl_fornecedor"
    ,catalog="db_joao_almeida"
)
public class JvlFornecedor  implements java.io.Serializable {


     private Integer jvlIdFornecedor;
     private String jvlRazaoSocial;
     private String jvlCnpj;
     private String jvlEmail;
     private String jvlTelefone;
     private String jvlEndereco;
     private String jvlCidade;
     private String jvlEstado;
     private String jvlCep;
     private String jvlPais;
     private Date jvlDataCadastro;
     private String jvlCategoria;
     private String jvlDescricao;
     private String jvlProdutoServicos;
     private String jvlNome;
     private Set jvlCompras = new HashSet(0);

    public JvlFornecedor() {
    }

	
    public JvlFornecedor(String jvlRazaoSocial, String jvlCnpj, String jvlEmail, String jvlTelefone, String jvlEndereco, String jvlCidade, String jvlEstado, String jvlCep, String jvlPais, String jvlCategoria, String jvlDescricao, String jvlProdutoServicos, String jvlNome) {
        this.jvlRazaoSocial = jvlRazaoSocial;
        this.jvlCnpj = jvlCnpj;
        this.jvlEmail = jvlEmail;
        this.jvlTelefone = jvlTelefone;
        this.jvlEndereco = jvlEndereco;
        this.jvlCidade = jvlCidade;
        this.jvlEstado = jvlEstado;
        this.jvlCep = jvlCep;
        this.jvlPais = jvlPais;
        this.jvlCategoria = jvlCategoria;
        this.jvlDescricao = jvlDescricao;
        this.jvlProdutoServicos = jvlProdutoServicos;
        this.jvlNome = jvlNome;
    }
    public JvlFornecedor(String jvlRazaoSocial, String jvlCnpj, String jvlEmail, String jvlTelefone, String jvlEndereco, String jvlCidade, String jvlEstado, String jvlCep, String jvlPais, Date jvlDataCadastro, String jvlCategoria, String jvlDescricao, String jvlProdutoServicos, String jvlNome, Set jvlCompras) {
       this.jvlRazaoSocial = jvlRazaoSocial;
       this.jvlCnpj = jvlCnpj;
       this.jvlEmail = jvlEmail;
       this.jvlTelefone = jvlTelefone;
       this.jvlEndereco = jvlEndereco;
       this.jvlCidade = jvlCidade;
       this.jvlEstado = jvlEstado;
       this.jvlCep = jvlCep;
       this.jvlPais = jvlPais;
       this.jvlDataCadastro = jvlDataCadastro;
       this.jvlCategoria = jvlCategoria;
       this.jvlDescricao = jvlDescricao;
       this.jvlProdutoServicos = jvlProdutoServicos;
       this.jvlNome = jvlNome;
       this.jvlCompras = jvlCompras;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="jvl_id_fornecedor", unique=true, nullable=false)
    public Integer getJvlIdFornecedor() {
        return this.jvlIdFornecedor;
    }
    
    public void setJvlIdFornecedor(Integer jvlIdFornecedor) {
        this.jvlIdFornecedor = jvlIdFornecedor;
    }

    
    @Column(name="jvl_razao_social", nullable=false, length=100)
    public String getJvlRazaoSocial() {
        return this.jvlRazaoSocial;
    }
    
    public void setJvlRazaoSocial(String jvlRazaoSocial) {
        this.jvlRazaoSocial = jvlRazaoSocial;
    }

    
    @Column(name="jvl_cnpj", nullable=false, length=18)
    public String getJvlCnpj() {
        return this.jvlCnpj;
    }
    
    public void setJvlCnpj(String jvlCnpj) {
        this.jvlCnpj = jvlCnpj;
    }

    
    @Column(name="jvl_email", nullable=false, length=100)
    public String getJvlEmail() {
        return this.jvlEmail;
    }
    
    public void setJvlEmail(String jvlEmail) {
        this.jvlEmail = jvlEmail;
    }

    
    @Column(name="jvl_telefone", nullable=false, length=20)
    public String getJvlTelefone() {
        return this.jvlTelefone;
    }
    
    public void setJvlTelefone(String jvlTelefone) {
        this.jvlTelefone = jvlTelefone;
    }

    
    @Column(name="jvl_endereco", nullable=false, length=100)
    public String getJvlEndereco() {
        return this.jvlEndereco;
    }
    
    public void setJvlEndereco(String jvlEndereco) {
        this.jvlEndereco = jvlEndereco;
    }

    
    @Column(name="jvl_cidade", nullable=false, length=50)
    public String getJvlCidade() {
        return this.jvlCidade;
    }
    
    public void setJvlCidade(String jvlCidade) {
        this.jvlCidade = jvlCidade;
    }

    
    @Column(name="jvl_estado", nullable=false, length=2)
    public String getJvlEstado() {
        return this.jvlEstado;
    }
    
    public void setJvlEstado(String jvlEstado) {
        this.jvlEstado = jvlEstado;
    }

    
    @Column(name="jvl_cep", nullable=false, length=10)
    public String getJvlCep() {
        return this.jvlCep;
    }
    
    public void setJvlCep(String jvlCep) {
        this.jvlCep = jvlCep;
    }

    
    @Column(name="jvl_pais", nullable=false, length=30)
    public String getJvlPais() {
        return this.jvlPais;
    }
    
    public void setJvlPais(String jvlPais) {
        this.jvlPais = jvlPais;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jvl_data_cadastro", length=10)
    public Date getJvlDataCadastro() {
        return this.jvlDataCadastro;
    }
    
    public void setJvlDataCadastro(Date jvlDataCadastro) {
        this.jvlDataCadastro = jvlDataCadastro;
    }

    
    @Column(name="jvl_categoria", nullable=false, length=50)
    public String getJvlCategoria() {
        return this.jvlCategoria;
    }
    
    public void setJvlCategoria(String jvlCategoria) {
        this.jvlCategoria = jvlCategoria;
    }

    
    @Column(name="jvl_descricao", nullable=false)
    public String getJvlDescricao() {
        return this.jvlDescricao;
    }
    
    public void setJvlDescricao(String jvlDescricao) {
        this.jvlDescricao = jvlDescricao;
    }

    
    @Column(name="jvl_produto_servicos", nullable=false, length=16777215)
    public String getJvlProdutoServicos() {
        return this.jvlProdutoServicos;
    }
    
    public void setJvlProdutoServicos(String jvlProdutoServicos) {
        this.jvlProdutoServicos = jvlProdutoServicos;
    }

    
    @Column(name="jvl_nome", nullable=false, length=50)
    public String getJvlNome() {
        return this.jvlNome;
    }
    
    public void setJvlNome(String jvlNome) {
        this.jvlNome = jvlNome;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="jvlFornecedor")
    public Set getJvlCompras() {
        return this.jvlCompras;
    }
    
    public void setJvlCompras(Set jvlCompras) {
        this.jvlCompras = jvlCompras;
    }




}


