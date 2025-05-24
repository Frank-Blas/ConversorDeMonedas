package Servicio;

import Modelo.Convertidor;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApp {
    private static final String apikey = "ecccd2324868ead2845fe1db";
    private static final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public Convertidor convertirMOneda(String baseCode, String targetCode, double cantidad) throws IOException, InterruptedException {
        String direccion = baseUrl + apikey + "/pair/" + baseCode + "/" + targetCode + "/" + cantidad;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200){
            throw new IOException("Error en la repuesta de la API. Código: " + response.statusCode());
        }

        return new Gson().fromJson(response.body(), Convertidor.class);
    }
}
