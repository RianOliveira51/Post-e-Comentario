package com.example.postcomentario;

import com.example.postcomentario.entities.Comment;
import com.example.postcomentario.entities.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
// Instacie manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, conforme exemplo.

@SpringBootApplication
public class PostComentarioApplication {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       //montando mascara para receber a data
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

       Comment c1 = new Comment("Have a nice trip!");
       Comment c2 = new Comment("Wow that´s awesome!");
       Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand","I´m going to visit this wonderful country",12);
       p1.addComment(c1);
       p1.addComment(c2);
       System.out.println(p1);


       Comment c3 = new Comment("Good night");
       Comment c4 = new Comment("May the Forcer be with you");
       Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good nights guys","See you tomorrow", 5);
       p2.addComment(c3);
       p2.addComment(c4);
       System.out.println(p2);

    }

}
