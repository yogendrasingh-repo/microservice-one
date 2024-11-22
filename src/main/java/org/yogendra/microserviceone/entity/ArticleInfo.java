package org.yogendra.microserviceone.entity;


public class ArticleInfo {

    private Long id;
    private String articleNo;
    private String articleDesc;
    private String model;
    private String serialNo;

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }


}
