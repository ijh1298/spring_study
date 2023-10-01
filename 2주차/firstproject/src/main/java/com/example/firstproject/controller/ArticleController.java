package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해놓은 리퍼지터리 객체 주입(DI, 의존성 주입)
    private ArticleRepository articleRepository;
    // 스프링 부트에서는 객체를 만들지 않아도 된다.
    // new ArticlerPositoryImpl() 하지 않아도 된다. 대신 @Autowired 어노테이션
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("articles/create")
    // new.mustache에서 action="/articles/create"로 작성했으므로
    public String createArticle(ArticleForm form){ // dto package에 정의된 ArticleForm class
        System.out.println(form.toString()); // 메서드 생성 및 반환값 작성
        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());
        // 2. 리퍼지토리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article); // article 엔티티를 저장해 saved 객체에 반환
        System.out.println(saved.toString());
        return "";
    }
}
