package fr.solutec.imc.dao;


import fr.solutec.imc.entities.Imc;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ImcDAO {

    /*private JdbcTemplate jdbcTemplate;

    public ImcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    public void  ajoute(Imc imc){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.update(
                "INSERT INTO IMC (taille, poids, indice) VALUES(?,?,?)",
                imc.getTaille(),
                imc.getPoids(),
                imc.getIndice()


        );

    }

    public Set<Imc> recupere(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        List<Imc> Imcs = new ArrayList<>();
        String query = "SELECT * FROM IMC";
        List<Map<String,Object>> items = jdbcTemplate.queryForList(query);
        for (Map<String, Object> item: items) {
            Imc imc = new Imc();
            imc.setId((int)item.get("id"));
            imc.setTaille((Double)item.get("taille"));
            imc.setPoids((Double)item.get("poids"));
            imc.setIndice((Double)item.get("indice"));

            Imcs.add(imc);
        }

        return Set.copyOf(Imcs);
    }

}
