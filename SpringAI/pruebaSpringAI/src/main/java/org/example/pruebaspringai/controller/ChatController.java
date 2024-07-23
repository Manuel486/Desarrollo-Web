package org.example.pruebaspringai.controller;

import org.example.pruebaspringai.model.Movie;
import org.example.pruebaspringai.model.Request;
import org.json.JSONObject;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.vertexai.palm2.VertexAiPaLm2ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class ChatController {

    private final VertexAiPaLm2ChatModel chatModel;

    @Autowired
    public ChatController(VertexAiPaLm2ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/ai/generate")
    public JSONObject generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        String generation = chatModel.call(message);
        
        return chatModel.call(message);
    }


    @GetMapping("/ai/generateStream")
    public Flux<ChatResponse> generateStream(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        Prompt prompt = new Prompt(new UserMessage(message));
        return chatModel.stream(prompt);
    }
}