package ru.aneuro.skillbox.pluginapi.dto;


import ru.aneuro.skillbox.pluginapi.entity.Message;

public class MessageDto {
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

    public static MessageDto from(Message message) {
        MessageDto dto = new MessageDto();
        dto.setKurs(message.getKurs());
        dto.setModule(message.getModule());
        dto.setText(message.getText());
        dto.setTitle(message.getTitle());
        return dto;
    }

    public Message to() {
        Message message = new Message();
        message.setKurs(getKurs());
        message.setModule(getModule());
        message.setText(getText());
        message.setTitle(getTitle());
        return message;
    }
}

