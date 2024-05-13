package code.speaker;

import code.DTOs.ProjectDTO;
import com.google.gson.Gson;

import java.util.ArrayList;

public class SegundaFuncion {
    public static String getProjectsList() {    //TODO cambiar nombre y código
        String projectsList = "";
        ArrayList<ProjectDTO> projectsListArray = new ArrayList<ProjectDTO>();
        // Creamos un arrayList de proyectos de prueba, que deberían salir de la consulta.

        ProjectDTO pr1 = new ProjectDTO("p1", "description1", "manager1");
        ProjectDTO pr2 = new ProjectDTO("p2", "description2", "manager2");
        ProjectDTO pr3 = new ProjectDTO("p3", "description3", "manager3");

        projectsListArray.add(pr1);
        projectsListArray.add(pr2);
        projectsListArray.add(pr3);

        Gson gson = new Gson();
        projectsList = gson.toJson(projectsListArray);

        return projectsList;
    }
}
