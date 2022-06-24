package com.example.exercice.Controller;


import com.example.exercice.Entity.Message;

import com.example.exercice.Service.MessageService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    private MessageService messageService;

        public MessageController(MessageService messageService) {
            this.messageService = messageService;
        }
        //build create message REST API
        @PostMapping

        public ResponseEntity<Message> creeMessage(@RequestBody Message message){
            return new ResponseEntity<Message>(messageService.creerMessage(message), HttpStatus.CREATED);
        }

        //build update message REST API
        //http://localhost:8181/api/message/1
        @PutMapping("{id}")
        public ResponseEntity<Message> updateMessage(@RequestBody Message message,@PathVariable("id") long messageid){
            return new ResponseEntity<Message> (MessageService.updateMessage(message,messageid),HttpStatus.OK);

        }
}
