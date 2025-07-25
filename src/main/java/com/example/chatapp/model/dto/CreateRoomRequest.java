package com.example.chatapp.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateRoomRequest {
    @NotBlank(message = "Назва кімнати не може бути порожньою")
    private String name;
}
