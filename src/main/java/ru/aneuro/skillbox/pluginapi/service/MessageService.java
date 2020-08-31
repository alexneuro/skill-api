package ru.aneuro.skillbox.pluginapi.service;

import org.springframework.stereotype.Service;
import ru.aneuro.skillbox.pluginapi.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import ru.aneuro.skillbox.pluginapi.entity.Message;
import ru.aneuro.skillbox.pluginapi.repo.MessageRepo;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepo repo;

    public List<Message> getMessagesByKursAndModule(String kurs, String module) {
        return repo.findByKursAndModule(kurs, module);
    }

    public Message add(Message message) {
        return repo.save(message);
    }

    public List<Message> getAll() {
        return repo.findAll();
    }

    public void delete(Message message) {
        repo.delete(message);
    }

    public Message findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
