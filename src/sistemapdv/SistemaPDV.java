/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapdv;

import entidade.Estado;
import persistencia.HibernateUtil;

/**
 *
 * @author jaimedias
 */
public class SistemaPDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estado est = new Estado();
        est.setNome("Paraná");
        est.setSigla("PR");

        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().persist(est);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();

    }

}
