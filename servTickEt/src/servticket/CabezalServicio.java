/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servticket;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "cabezalServicio", catalog = "reportesertec", schema = "")
@NamedQueries({
    @NamedQuery(name = "CabezalServicio.findAll", query = "SELECT c FROM CabezalServicio c"),
    @NamedQuery(name = "CabezalServicio.findByTerminal", query = "SELECT c FROM CabezalServicio c WHERE c.terminal = :terminal"),
    @NamedQuery(name = "CabezalServicio.findByNroReclamo", query = "SELECT c FROM CabezalServicio c WHERE c.nroReclamo = :nroReclamo"),
    @NamedQuery(name = "CabezalServicio.findByFechaReclamo", query = "SELECT c FROM CabezalServicio c WHERE c.fechaReclamo = :fechaReclamo"),
    @NamedQuery(name = "CabezalServicio.findByNroCliente", query = "SELECT c FROM CabezalServicio c WHERE c.nroCliente = :nroCliente"),
    @NamedQuery(name = "CabezalServicio.findByDesCliente", query = "SELECT c FROM CabezalServicio c WHERE c.desCliente = :desCliente"),
    @NamedQuery(name = "CabezalServicio.findByDireccion", query = "SELECT c FROM CabezalServicio c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "CabezalServicio.findByTelefono", query = "SELECT c FROM CabezalServicio c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "CabezalServicio.findBySeccion", query = "SELECT c FROM CabezalServicio c WHERE c.seccion = :seccion"),
    @NamedQuery(name = "CabezalServicio.findByHorario", query = "SELECT c FROM CabezalServicio c WHERE c.horario = :horario"),
    @NamedQuery(name = "CabezalServicio.findByMarca", query = "SELECT c FROM CabezalServicio c WHERE c.marca = :marca"),
    @NamedQuery(name = "CabezalServicio.findByModelo", query = "SELECT c FROM CabezalServicio c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "CabezalServicio.findByMatricula", query = "SELECT c FROM CabezalServicio c WHERE c.matricula = :matricula"),
    @NamedQuery(name = "CabezalServicio.findByCondicion", query = "SELECT c FROM CabezalServicio c WHERE c.condicion = :condicion"),
    @NamedQuery(name = "CabezalServicio.findByDefecto1", query = "SELECT c FROM CabezalServicio c WHERE c.defecto1 = :defecto1"),
    @NamedQuery(name = "CabezalServicio.findByDefecto2", query = "SELECT c FROM CabezalServicio c WHERE c.defecto2 = :defecto2"),
    @NamedQuery(name = "CabezalServicio.findByDefecto3", query = "SELECT c FROM CabezalServicio c WHERE c.defecto3 = :defecto3"),
    @NamedQuery(name = "CabezalServicio.findByTecnico", query = "SELECT c FROM CabezalServicio c WHERE c.tecnico = :tecnico"),
    @NamedQuery(name = "CabezalServicio.findByCopias", query = "SELECT c FROM CabezalServicio c WHERE c.copias = :copias"),
    @NamedQuery(name = "CabezalServicio.findByEmpresa", query = "SELECT c FROM CabezalServicio c WHERE c.empresa = :empresa")})
public class CabezalServicio implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "terminal")
    private String terminal;
    @Id
    @Basic(optional = false)
    @Column(name = "nroReclamo")
    private String nroReclamo;
    @Column(name = "fechaReclamo")
    private String fechaReclamo;
    @Column(name = "nroCliente")
    private String nroCliente;
    @Column(name = "desCliente")
    private String desCliente;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "seccion")
    private String seccion;
    @Column(name = "horario")
    private String horario;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "condicion")
    private String condicion;
    @Column(name = "defecto1")
    private String defecto1;
    @Column(name = "defecto2")
    private String defecto2;
    @Column(name = "defecto3")
    private String defecto3;
    @Basic(optional = false)
    @Column(name = "tecnico")
    private String tecnico;
    @Basic(optional = false)
    @Column(name = "copias")
    private String copias;
    @Column(name = "empresa")
    private String empresa;

    public CabezalServicio() {
    }

    public CabezalServicio(String nroReclamo) {
        this.nroReclamo = nroReclamo;
    }

    public CabezalServicio(String nroReclamo, String tecnico, String copias) {
        this.nroReclamo = nroReclamo;
        this.tecnico = tecnico;
        this.copias = copias;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        String oldTerminal = this.terminal;
        this.terminal = terminal;
        changeSupport.firePropertyChange("terminal", oldTerminal, terminal);
    }

    public String getNroReclamo() {
        return nroReclamo;
    }

    public void setNroReclamo(String nroReclamo) {
        String oldNroReclamo = this.nroReclamo;
        this.nroReclamo = nroReclamo;
        changeSupport.firePropertyChange("nroReclamo", oldNroReclamo, nroReclamo);
    }

    public String getFechaReclamo() {
        return fechaReclamo;
    }

    public void setFechaReclamo(String fechaReclamo) {
        String oldFechaReclamo = this.fechaReclamo;
        this.fechaReclamo = fechaReclamo;
        changeSupport.firePropertyChange("fechaReclamo", oldFechaReclamo, fechaReclamo);
    }

    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        String oldNroCliente = this.nroCliente;
        this.nroCliente = nroCliente;
        changeSupport.firePropertyChange("nroCliente", oldNroCliente, nroCliente);
    }

    public String getDesCliente() {
        return desCliente;
    }

    public void setDesCliente(String desCliente) {
        String oldDesCliente = this.desCliente;
        this.desCliente = desCliente;
        changeSupport.firePropertyChange("desCliente", oldDesCliente, desCliente);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        String oldSeccion = this.seccion;
        this.seccion = seccion;
        changeSupport.firePropertyChange("seccion", oldSeccion, seccion);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        String oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        String oldCondicion = this.condicion;
        this.condicion = condicion;
        changeSupport.firePropertyChange("condicion", oldCondicion, condicion);
    }

    public String getDefecto1() {
        return defecto1;
    }

    public void setDefecto1(String defecto1) {
        String oldDefecto1 = this.defecto1;
        this.defecto1 = defecto1;
        changeSupport.firePropertyChange("defecto1", oldDefecto1, defecto1);
    }

    public String getDefecto2() {
        return defecto2;
    }

    public void setDefecto2(String defecto2) {
        String oldDefecto2 = this.defecto2;
        this.defecto2 = defecto2;
        changeSupport.firePropertyChange("defecto2", oldDefecto2, defecto2);
    }

    public String getDefecto3() {
        return defecto3;
    }

    public void setDefecto3(String defecto3) {
        String oldDefecto3 = this.defecto3;
        this.defecto3 = defecto3;
        changeSupport.firePropertyChange("defecto3", oldDefecto3, defecto3);
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        String oldTecnico = this.tecnico;
        this.tecnico = tecnico;
        changeSupport.firePropertyChange("tecnico", oldTecnico, tecnico);
    }

    public String getCopias() {
        return copias;
    }

    public void setCopias(String copias) {
        String oldCopias = this.copias;
        this.copias = copias;
        changeSupport.firePropertyChange("copias", oldCopias, copias);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroReclamo != null ? nroReclamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabezalServicio)) {
            return false;
        }
        CabezalServicio other = (CabezalServicio) object;
        if ((this.nroReclamo == null && other.nroReclamo != null) || (this.nroReclamo != null && !this.nroReclamo.equals(other.nroReclamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servticket.CabezalServicio[nroReclamo=" + nroReclamo + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
