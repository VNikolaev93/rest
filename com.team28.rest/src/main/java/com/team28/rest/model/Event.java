package com.team28.rest.model;

import java.util.Date;
import java.util.List;

public class Event {

    private final long creatorId;
    private final long eventId;
    private final String name;
    private final Date date;
    private final String description;
    private final List<Long> categories;

    public Event(long creatorId, long eventId, String name, Date date, String description, List<Long> categories) {
        this.creatorId = creatorId;
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.description = description;
        this.categories = categories;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public long getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getCategories() {
        return categories;
    }
}
