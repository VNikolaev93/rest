package com.team28.rest.controller;

import com.team28.rest.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class EventController {

    @RequestMapping("/event")
    public Event eventRequest(@RequestParam(value = "eventId") long eventId) {
        // Fetch db for Event
        return fetchDB(eventId);
    }

    public static Event fetchDB(long eventId) {
        List<Long> categories = new ArrayList<Long>();
        categories.add(1L);
        categories.add(10L);
        categories.add(100L);
        return new Event(2L, eventId,
                    "Some event", new Date(),
                "Some description", categories);
    }
}
