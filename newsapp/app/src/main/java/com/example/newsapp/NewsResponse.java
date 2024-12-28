package com.example.newsapp;

import java.util.List;

public class NewsResponse {
    private String status;
    private int totalResults;
    private List<Article> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public static class Article {
        private String title;
        private String description;
        private String urlToImage;
        private String url;

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public String getUrl() {
            return url;
        }
    }
}
