package fr.solutec.imc.service;
import fr.solutec.imc.dao.ImcDAO;
import fr.solutec.imc.entities.Imc;

import javax.servlet.ServletException;
import javax.ws.rs.BadRequestException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImcService {


    public void ajoute(Imc imc){
        ImcDAO imcDAO = new ImcDAO();
        Imc NewImc = new Imc() ;
        double poids = imc.getPoids();
        double taille = imc.getTaille();
        if (poids != 0){;
            double indice = poids/(Math.pow(taille, 2));
            NewImc.setPoids(poids);
            NewImc.setTaille(taille);
            NewImc.setIndice(indice);
            imcDAO.ajoute(NewImc);
        }

    }

    public Set<Imc> recupere(){
        ImcDAO imcDAO = new ImcDAO();
        return imcDAO.recupere();



    }

}
