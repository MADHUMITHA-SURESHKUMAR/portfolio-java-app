package com.example.controller;
import com.example.model.ContactMessage;
import com.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public String saveMessage(@RequestBody ContactMessage message) {
        contactRepository.save(message);
        return "Message saved successfully!";
    }

    @GetMapping
    public List<ContactMessage> getAllMessages() {
        return contactRepository.findAll();
    }
}
