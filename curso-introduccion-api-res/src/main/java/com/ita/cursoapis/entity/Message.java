package com.ita.cursoapis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //crea los getter and setter
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
public class Message {
    private int id;
    private String contenido;
}
