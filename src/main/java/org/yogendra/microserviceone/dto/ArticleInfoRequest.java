package org.yogendra.microserviceone.dto;

public class ArticleInfoRequest {

    private Long id;
    private String articleNo;
    private String articleDesc;
    private String model;
    private String serialNo;

    public ArticleInfoRequest(Long id, String articleNo, String articleDesc, String model, String serialNo) {
        this.id = id;
        this.articleNo = articleNo;
        this.articleDesc = articleDesc;
        this.model = model;
        this.serialNo = serialNo;
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

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
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

    @Override
    public String toString() {
        return "ArticleInfoRequest{" +
                "id='" +  id + '\'' +
                "articleNo='" + articleNo + '\'' +
                ", articleDesc='" + articleDesc + '\'' +
                ", model='" + model + '\'' +
                ", serialNo='" + serialNo + '\'' +
                '}';
    }
}
