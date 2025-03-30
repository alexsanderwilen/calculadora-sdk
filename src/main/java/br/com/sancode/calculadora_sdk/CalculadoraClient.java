package br.com.sancode.calculadora_sdk;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class CalculadoraClient {
    private final String baseUrl;
    private final RestTemplate restTemplate;

    public CalculadoraClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.restTemplate = new RestTemplate();
    }

    public double soma(double num1, double num2) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/soma")
                .queryParam("num1", num1)
                .queryParam("num2", num2)
                .toUriString();
        return restTemplate.getForObject(url, Double.class);
    }

    public double subtracao(double num1, double num2) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/subtracao")
                .queryParam("num1", num1)
                .queryParam("num2", num2)
                .toUriString();
        return restTemplate.getForObject(url, Double.class);
    }

    public double multiplicacao(double num1, double num2) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/multiplicacao")
                .queryParam("num1", num1)
                .queryParam("num2", num2)
                .toUriString();
        return restTemplate.getForObject(url, Double.class);
    }

    public double divisao(double num1, double num2) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/divisao")
                .queryParam("num1", num1)
                .queryParam("num2", num2)
                .toUriString();
        return restTemplate.getForObject(url, Double.class);
    }
}
