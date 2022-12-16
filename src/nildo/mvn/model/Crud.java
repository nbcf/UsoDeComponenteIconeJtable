

package nildo.mvn.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "crud", catalog = "teste_tabela_png", schema = "")
@NamedQueries({
    @NamedQuery(name = "Crud.findAll", query = "SELECT c FROM Crud c")
    , @NamedQuery(name = "Crud.findByCrudId", query = "SELECT c FROM Crud c WHERE c.crudId = :crudId")
    , @NamedQuery(name = "Crud.findByNome", query = "SELECT c FROM Crud c WHERE c.nome = :nome")
    , @NamedQuery(name = "Crud.findByDescricao", query = "SELECT c FROM Crud c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Crud.findByValor", query = "SELECT c FROM Crud c WHERE c.valor = :valor")
    , @NamedQuery(name = "Crud.findByStatus", query = "SELECT c FROM Crud c WHERE c.status = :status")})



public class Crud implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CRUD_ID")
    private Integer crudId;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "STATUS")
    private String status;

    public Crud() {
    }

    public Crud(Integer crudId) {
        this.crudId = crudId;
    }

    public Integer getCrudId() {
        return crudId;
    }

    public void setCrudId(Integer crudId) {
        Integer oldCrudId = this.crudId;
        this.crudId = crudId;
        changeSupport.firePropertyChange("crudId", oldCrudId, crudId);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        String oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crudId != null ? crudId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crud)) {
            return false;
        }
        Crud other = (Crud) object;
        if ((this.crudId == null && other.crudId != null) || (this.crudId != null && !this.crudId.equals(other.crudId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nildo.mvn.model.Crud[ crudId=" + crudId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
