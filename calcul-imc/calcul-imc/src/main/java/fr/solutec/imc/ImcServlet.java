package fr.solutec.imc;

import fr.solutec.imc.entities.Imc;
import fr.solutec.imc.service.ImcService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Double.parseDouble;

public class ImcServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ImcService imcService = new ImcService();

        String forwardTo = "/pages/test.jsp";
        request.setAttribute("Imcs", imcService.recupere());
        this.getServletContext().getRequestDispatcher("/pages/test.jsp")
                .forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String taille = request.getParameter("taille");
        String poids = request.getParameter("poids");
        Imc imc = new Imc();
        double newtaille = Double.parseDouble(taille);
        double newpoids = Double.parseDouble(poids);
        imc.setTaille(newtaille);
        imc.setPoids(newpoids);
        ImcService imcService = new ImcService();
        imcService.ajoute(imc);

    }
}


