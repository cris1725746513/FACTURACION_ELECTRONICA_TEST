/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Cristian Leones
 */
public class XmlDetalles {

    private String codigoprincipal;
    private String codigoauxiliar;
    private String descripcion;
    private String cantidad;
    private String preciounitario;
    private String descuento;
    private String preciototalsinimpuesto;
    //impuestos
    //impuesto
    private String codigo;
    private String codigoporcentaje;
    private String tarifa;
    private String baseimponible;
    private String valor;

    public String getCodigoprincipal() {
        return codigoprincipal;
    }

    public void setCodigoprincipal(String codigoprincipal) {
        this.codigoprincipal = codigoprincipal;
    }

    public String getCodigoauxiliar() {
        return codigoauxiliar;
    }

    public void setCodigoauxiliar(String codigoauxiliar) {
        this.codigoauxiliar = codigoauxiliar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(String preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getPreciototalsinimpuesto() {
        return preciototalsinimpuesto;
    }

    public void setPreciototalsinimpuesto(String preciototalsinimpuesto) {
        this.preciototalsinimpuesto = preciototalsinimpuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoporcentaje() {
        return codigoporcentaje;
    }

    public void setCodigoporcentaje(String codigoporcentaje) {
        this.codigoporcentaje = codigoporcentaje;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getBaseimponible() {
        return baseimponible;
    }

    public void setBaseimponible(String baseimponible) {
        this.baseimponible = baseimponible;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public XmlDetalles(String codigoprincipal, String codigoauxiliar, String descripcion, String cantidad, String preciounitario, String descuento, String preciototalsinimpuesto, String codigo, String codigoporcentaje, String tarifa, String baseimponible, String valor) {
        this.codigoprincipal = codigoprincipal;
        this.codigoauxiliar = codigoauxiliar;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.descuento = descuento;
        this.preciototalsinimpuesto = preciototalsinimpuesto;
        this.codigo = codigo;
        this.codigoporcentaje = codigoporcentaje;
        this.tarifa = tarifa;
        this.baseimponible = baseimponible;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "XmlDetalles{" + "codigoprincipal=" + codigoprincipal + ", codigoauxiliar=" + codigoauxiliar + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", preciounitario=" + preciounitario + ", descuento=" + descuento + ", preciototalsinimpuesto=" + preciototalsinimpuesto + ", codigo=" + codigo + ", codigoporcentaje=" + codigoporcentaje + ", tarifa=" + tarifa + ", baseimponible=" + baseimponible + ", valor=" + valor + '}';
    }
    
    
}
