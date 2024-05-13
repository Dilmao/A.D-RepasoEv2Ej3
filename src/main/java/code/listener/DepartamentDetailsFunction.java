package code.listener;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.HashMap;
import java.util.Map;

public class DepartamentDetailsFunction implements RequestHandler<Map<String, String>, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent handleRequest(final Map<String, String> input, final Context context) {
        // Configuro el header para la respuesta tipo json.
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");

        // Cargo en un HashMap el contenido del input y extraigo el idProject.
        String nombreDepartamento = input.get("nombre");

        // Inicializo la variable con la que voy a responder con el header.
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent().withHeaders(headers);

        // Almaceno en un String el Json con la información a enviar.
        final String bodyContent = "nombre del departamento" + nombreDepartamento;

        // Y lo añado al formato fijado.
        String output = String.format("{ \"message\": \"Nombre Departamento\", \"nombre\": \"%s\" }", bodyContent);

        // Devuelvo la variable APIGatewayProxyResponseEvent.
        return response
                .withStatusCode(200) // Si va bien devuelvo el código de OK 200
                .withBody(output); // Y en el body el json con la información requerida en el formato acordado.
    }
}
