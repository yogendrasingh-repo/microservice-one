package org.yogendra.microserviceone.service;

import org.springframework.stereotype.Service;
import org.yogendra.microserviceone.dto.ArticleInfoRequest;
import org.yogendra.microserviceone.entity.ArticleInfo;

@Service
public class ArticleService {

    public ArticleInfo getArticleInfo(ArticleInfoRequest articleInfoRequest) {

        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setId(articleInfoRequest.getId());
        articleInfo.setArticleDesc(articleInfoRequest.getArticleDesc());
        articleInfo.setArticleNo(articleInfoRequest.getArticleNo());
        articleInfo.setModel(articleInfoRequest.getModel());
        articleInfo.setSerialNo(articleInfoRequest.getSerialNo());
        return articleInfo;
    }
}
