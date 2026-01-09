package br.com.oracle.sentiment_api.service;

import br.com.oracle.sentiment_api.dto.SentimentRequest;
import br.com.oracle.sentiment_api.dto.SentimentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class SentimentService {
    @Value("${sentiment.url}")
    private String sentimentUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    // quando rodar localmente


    public SentimentResponse analyze(SentimentRequest request) {

        Map<String, String> payload = Map.of(
                "text", request.text()
        );

        return restTemplate.postForObject(
                sentimentUrl,
                payload,
                SentimentResponse.class
        );
    }
}

