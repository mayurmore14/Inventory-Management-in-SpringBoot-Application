package com.igc.iteminventory.responses;

import lombok.Data;
import org.springframework.http.HttpStatusCode;


@Data
public class Responses{

    private String message;

    private HttpStatusCode code;

    private Object object;

    public Responses(String message) {
        this.message = message;
    }

    public Responses(String message, HttpStatusCode code) {
        this.message = message;
        this.code = code;
    }

    public Responses(String message, HttpStatusCode code, Object object) {
        this.message = message;
        this.code = code;
        this.object = object;
    }
}
