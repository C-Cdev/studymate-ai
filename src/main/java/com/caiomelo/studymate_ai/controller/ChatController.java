package com.caiomelo.studymate_ai.controller;

import com.caiomelo.studymate_ai.dto.ChatRequest;
import com.caiomelo.studymate_ai.dto.ChatResponse;
import com.caiomelo.studymate_ai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatResponse chat(@Valid @RequestBody ChatRequest request) {
        String response = chatService.chat(
                request.getSessionId(),
                request.getMessage()
        );
        return new ChatResponse(request.getSessionId(), response);
    }
}
