package gemini;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        
        // 1. A sua chave que está no print
        String apiKey = "AQ.Ab8RN6JrjBLMkdAD0M20U4FuN6x2QSrnX"; 

        // Usamos o modelo padrão estável atualizado
        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=" + apiKey;

        // Montamos o corpo da requisição no formato exato (JSON) que a Google exige
        String jsonPayload = "{"
                + "\"contents\": [{"
                + "  \"parts\": [{"
                + "    \"text\": \"Olá, Gemini! Diga-me se a conexão foi feita com sucesso em apenas uma frase.\""
                + "  }]"
                + "}]"
                + "}";

        System.out.println("Conectando diretamente à API do Gemini...");

        try {
            // Criamos o cliente HTTP nativo do Java
            HttpClient client = HttpClient.newHttpClient();

            // Construímos a requisição POST com o cabeçalho correto
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
                    .build();

            System.out.println("Enviando pergunta via HTTP...");

            // Enviamos e aguardamos a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n--- Resposta Bruta do Gemini (JSON) ---");
            System.out.println(response.body());

        } catch (Exception e) {
            System.err.println("Ocorreu um erro na comunicação direta: " + e.getMessage());
            e.printStackTrace();
        }
    }
}