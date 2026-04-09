package com.caiomelo.studymate_ai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatResponse {
    private String sessionId;
    private String response;
}
