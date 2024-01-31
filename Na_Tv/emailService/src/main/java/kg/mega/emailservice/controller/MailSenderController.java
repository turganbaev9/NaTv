package kg.mega.emailservice.controller;

import kg.mega.emailservice.service.MailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mail")
@RequiredArgsConstructor
public class MailSenderController {
    private final MailSenderService mailSender;

    @PostMapping("sendMail")
    public void setMail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        mailSender.sendSimpleMessage(to, subject, text);

    }
}