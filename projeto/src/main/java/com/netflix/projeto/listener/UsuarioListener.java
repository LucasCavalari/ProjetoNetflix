package com.netflix.projeto.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class UsuarioListener {

    @RabbitListener(queues = {"{$queue.name}"})
    public void receive(@Payload String json) throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CatalogoTO catalogo = mapper.readValue(json, CatalogoTO.class);
        System.out.println(catalogo);
    }
}
