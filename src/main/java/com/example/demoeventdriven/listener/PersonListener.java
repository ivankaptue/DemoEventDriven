package com.example.demoeventdriven.listener;

import com.example.demoeventdriven.error.PersonUpdateError;
import com.example.demoeventdriven.event.PersonPostUpdateEvent;
import com.example.demoeventdriven.event.PersonPreUpdateEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author Ivan Kaptue
 */
@Log4j2
@RequiredArgsConstructor
@Component
public class PersonListener {

    @EventListener
    public void preUpdateEvent(PersonPreUpdateEvent event) {
        log.info("preUpdateEvent({})", event);
        var person = event.getPerson();
        if (!"admin".equalsIgnoreCase(person.getUsername())) {
            event.setCanUpdate(true);
            String profileUrl = String.format(
                "%s-%s",
                person.getUsername().toLowerCase(Locale.ROOT).replaceAll(" ", "-"),
                person.getName().toLowerCase(Locale.ROOT).replaceAll(" ", "-")
            );
            person.setProfileUrl(profileUrl);
        } else {
            throw new PersonUpdateError("Admin cannot been update");
        }
    }

    @EventListener
    public void postUpdateEvent(PersonPostUpdateEvent event) {
        log.info("postUpdateEvent({})", event);
    }

}
