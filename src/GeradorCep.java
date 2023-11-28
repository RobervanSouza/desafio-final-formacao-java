import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorCep {
    public void salvaJson (Endereco endereco) throws IOException {
        Gson gson = new  GsonBuilder().setPrettyPrinting().create();
        FileWriter geracao = new FileWriter(endereco.cep() + ".json");
        geracao.write(gson.toJson(endereco));
        geracao.close();

    }
}
