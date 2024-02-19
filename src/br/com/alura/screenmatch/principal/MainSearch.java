package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) throws IOException, InterruptedException {
        String key = "f8834d4b";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual filme você busca?");
        var search = scanner.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + search + "&apikey=" + key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

        System.out.println(meuTituloOmdb);

        Titulo meuTitulo=new Titulo(meuTituloOmdb);
        System.out.println("Titulo ja convertido:");
        System.out.println(meuTitulo);

    }
}

