/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Cristian Leones
 */
public class Xml {
    //<infoTributaria> 

    private String ambiente
    private String tipoEmision;
    private String razonSocial;
    private String nombreComercial;
    private String ruc;
    private String claveAcceso;
    private String codDoc;
    private String estab;
    private String ptoEmi;
    private String secuencial;
    private String dirMatriz;

    //</infoTributaria>         
    //<infoFactura>
    private String fechaEmision;
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String tipoIdentificacionComprador;
    private String razonSocialComprador;
    private String identificacionComprador;
    private String direccionComprador;
    private String totalSinImpuestos;
    private String totalDescuento;
    //              totalDescuento
    //totalImpuesto
    private String codigo;
    private String codigoPorcentaje;
    private String baseImponible;
    private String valor;
    //</totalImpuesto >

    @Override
    public String toString() {
        return "Xml{" + "ambiente=" + ambiente + ", tipoEmision=" + tipoEmision + ", razonSocial=" + razonSocial + ", nombreComercial=" + nombreComercial + ", ruc=" + ruc + ", claveAcceso=" + claveAcceso + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmi=" + ptoEmi + ", secuencial=" + secuencial + ", dirMatriz=" + dirMatriz + ", fechaEmision=" + fechaEmision + ", dirEstablecimiento=" + dirEstablecimiento + ", contribuyenteEspecial=" + contribuyenteEspecial + ", obligadoContabilidad=" + obligadoContabilidad + ", tipoIdentificacionComprador=" + tipoIdentificacionComprador + ", razonSocialComprador=" + razonSocialComprador + ", identificacionComprador=" + identificacionComprador + ", direccionComprador=" + direccionComprador + ", totalSinImpuestos=" + totalSinImpuestos + ", totalDescuento=" + totalDescuento + ", codigo=" + codigo + ", codigoPorcentaje=" + codigoPorcentaje + ", baseImponible=" + baseImponible + ", valor=" + valor + '}';
    }

    public Xml(String ambiente, String tipoEmision, String razonSocial, String nombreComercial, String ruc, String claveAcceso, String codDoc, String estab, String ptoEmi, String secuencial, String dirMatriz, String fechaEmision, String dirEstablecimiento, String contribuyenteEspecial, String obligadoContabilidad, String tipoIdentificacionComprador, String razonSocialComprador, String identificacionComprador, String direccionComprador, String totalSinImpuestos, String totalDescuento, String codigo, String codigoPorcentaje, String baseImponible, String valor) {
        this.ambiente = ambiente;
        this.tipoEmision = tipoEmision;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.claveAcceso = claveAcceso;
        this.codDoc = codDoc;
        this.estab = estab;
        this.ptoEmi = ptoEmi;
        this.secuencial = secuencial;
        this.dirMatriz = dirMatriz;
        this.fechaEmision = fechaEmision;
        this.dirEstablecimiento = dirEstablecimiento;
        this.contribuyenteEspecial = contribuyenteEspecial;
        this.obligadoContabilidad = obligadoContabilidad;
        this.tipoIdentificacionComprador = tipoIdentificacionComprador;
        this.razonSocialComprador = razonSocialComprador;
        this.identificacionComprador = identificacionComprador;
        this.direccionComprador = direccionComprador;
        this.totalSinImpuestos = totalSinImpuestos;
        this.totalDescuento = totalDescuento;
        this.codigo = codigo;
        this.codigoPorcentaje = codigoPorcentaje;
        this.baseImponible = baseImponible;
        this.valor = valor;
    }

    // </infoFactura>

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(String tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getEstab() {
        return estab;
    }

    public void setEstab(String estab) {
        this.estab = estab;
    }

    public String getPtoEmi() {
        return ptoEmi;
    }

    public void setPtoEmi(String ptoEmi) {
        this.ptoEmi = ptoEmi;
    }

    public String getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(String secuencial) {
        this.secuencial = secuencial;
    }

    public String getDirMatriz() {
        return dirMatriz;
    }

    public void setDirMatriz(String dirMatriz) {
        this.dirMatriz = dirMatriz;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDirEstablecimiento() {
        return dirEstablecimiento;
    }

    public void setDirEstablecimiento(String dirEstablecimiento) {
        this.dirEstablecimiento = dirEstablecimiento;
    }

    public String getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(String contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public String getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(String obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public String getTipoIdentificacionComprador() {
        return tipoIdentificacionComprador;
    }

    public void setTipoIdentificacionComprador(String tipoIdentificacionComprador) {
        this.tipoIdentificacionComprador = tipoIdentificacionComprador;
    }

    public String getRazonSocialComprador() {
        return razonSocialComprador;
    }

    public void setRazonSocialComprador(String razonSocialComprador) {
        this.razonSocialComprador = razonSocialComprador;
    }

    public String getIdentificacionComprador() {
        return identificacionComprador;
    }

    public void setIdentificacionComprador(String identificacionComprador) {
        this.identificacionComprador = identificacionComprador;
    }

    public String getDireccionComprador() {
        return direccionComprador;
    }

    public void setDireccionComprador(String direccionComprador) {
        this.direccionComprador = direccionComprador;
    }

    public String getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    public void setTotalSinImpuestos(String totalSinImpuestos) {
        this.totalSinImpuestos = totalSinImpuestos;
    }

    public String getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(String totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPorcentaje() {
        return codigoPorcentaje;
    }

    public void setCodigoPorcentaje(String codigoPorcentaje) {
        this.codigoPorcentaje = codigoPorcentaje;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
