/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Utilidad.XAdESBESSignature;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian Leones
 */
public class XmlDaoImplements implements XmlInterface{

    @Override
    public void firmar(String xmlPath,String pathSignature,String passSignature,String pathOut,String nameFileOut ) {
        try {
            XAdESBESSignature.firmar(xmlPath, pathSignature, passSignature, pathOut, nameFileOut);
            String filePath = pathOut + "\\" + nameFileOut;
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            System.setProperty("javax.net.ssl.keyStore", "C:\\Program Files (x86)\\Java\\jre1.8.0_261\\lib\\security\\cacerts");
            System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
            
        } catch (CertificateException | IOException ex) {
            Logger.getLogger(XmlDaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @Override
    public void Autorizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Guardar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
