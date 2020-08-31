package ru.aneuro.skillbox.pluginapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aneuro.skillbox.pluginapi.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import ru.aneuro.skillbox.pluginapi.entity.Message;
import ru.aneuro.skillbox.pluginapi.service.MessageService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/messages")
public class MessageRestController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<List<MessageDto>> get(@RequestParam(value = "kurs", required = true) String kurs, @RequestParam(value = "module", required = true) String module) {
        List<Message> messages = messageService.getMessagesByKursAndModule(kurs, module);
        return new ResponseEntity<>(messages.stream().map(MessageDto::from).collect(Collectors.toList()), HttpStatus.OK);
    }

    @PutMapping
    private ResponseEntity<MessageDto> create(@RequestBody MessageDto messageDto) {
        Message message = messageDto.to();
        messageService.add(message);
        return new ResponseEntity<>(MessageDto.from(message), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable(name = "id") Long id) {
        Message message = messageService.findById(id);
        if (message != null)
            messageService.delete(message);
    }

}
