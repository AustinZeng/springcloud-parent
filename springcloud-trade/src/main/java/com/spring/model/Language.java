package com.spring.model;

public class Language {
    private String id;

    private String lanEnglish;

    private String lanChinese;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLanEnglish() {
        return lanEnglish;
    }

    public void setLanEnglish(String lanEnglish) {
        this.lanEnglish = lanEnglish == null ? null : lanEnglish.trim();
    }

    public String getLanChinese() {
        return lanChinese;
    }

    public void setLanChinese(String lanChinese) {
        this.lanChinese = lanChinese == null ? null : lanChinese.trim();
    }
}