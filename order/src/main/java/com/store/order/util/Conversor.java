package com.store.order.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Conversor {
    public static Map<String, Object> convertToObject(String jsonS){
        try{
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = mapper.readValue(jsonS, Map.class);
            return map;
        }catch(JsonProcessingException e){
            return null;
        }
    }
}
