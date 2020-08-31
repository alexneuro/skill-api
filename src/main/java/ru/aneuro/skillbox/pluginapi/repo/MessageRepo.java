package ru.aneuro.skillbox.pluginapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aneuro.skillbox.pluginapi.entity.Message;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {
    List<Message> findByKursAndModule(String kurs, String module);

}
