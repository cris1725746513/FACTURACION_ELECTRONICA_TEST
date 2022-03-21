/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Cristian Leones
 */
public interface XmlInterface {
    void firmar(String xmlPath,String pathSignature,String passSignature,String pathOut,String nameFileOut);
    void Autorizar();
    void Guardar();
    
}
