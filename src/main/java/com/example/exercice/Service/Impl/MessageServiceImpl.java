package com.example.exercice.Service.Impl;


import com.example.exercice.Entity.Message;

import com.example.exercice.Repository.MessageRepository;

import com.example.exercice.Service.MessageService;
import com.example.exercice.exception.RessourceNotFoundException;

@Service
public class MessageServiceImpl implements MessageService {


        private MessageRepository messageRepository;

        public MessageServiceImpl(MessageRepository messageRepository) {
            this.messageRepository = messageRepository;
        }

        @Override
        public Message creerMessage(Message message){

            return messageRepository.save(message);
        }

        @Override
        public Message updateMessage(Message message,long id) {
            //checking if the message exist in DB or not
            Message existingMessage = messageRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Message","id",id));

            existingMessage.setcontenu(message.getcontenu());
            existingMessage.setdate_envoi(message.getdate_envoi());

            //saving
            messageRepository.save(existingMessage);
            return existingMessage;
        }
    }
}
