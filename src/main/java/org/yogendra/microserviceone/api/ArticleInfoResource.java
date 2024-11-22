package org.yogendra.microserviceone.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yogendra.microserviceone.dto.ArticleInfoRequest;
import org.yogendra.microserviceone.entity.ArticleInfo;
import org.yogendra.microserviceone.service.ArticleService;

@RestController
public class ArticleInfoResource {

    ArticleService articleService;

    public ArticleInfoResource( ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/artileinfo")
    public ArticleInfo getArticleInfo(@RequestBody ArticleInfoRequest articleInfoRequest) {

        return articleService.getArticleInfo(articleInfoRequest);
    }
}
