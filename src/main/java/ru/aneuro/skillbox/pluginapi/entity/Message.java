package ru.aneuro.skillbox.pluginapi.entity;

import javax.persistence.Entity;

@Entity
public class Message extends AbstractEntity {
    private String title;
    private String kurs;
    private String module;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", kurs='" + kurs + '\'' +
                ", module='" + module + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
