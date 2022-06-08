package br.com.foodpets.exeptions;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExeptionResponse {

    private Date timestamp;
    private String error;
    private int status;
    private String message;
    private String path;
}
