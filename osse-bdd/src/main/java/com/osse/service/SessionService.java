package com.osse.service;

import com.osse.domain.Session;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SessionService {

    private List<Session> sessions = new ArrayList<>();

    public Session createSession(String name, String type, LocalDate start, LocalDate end) {

        if (end.isBefore(start)) {
            return null;
        }

        for (Session s : sessions) {
            if (s.getName().equals(name)
                    && s.getStartDate().equals(start)
                    && s.getEndDate().equals(end)) {
                return null;
            }
        }

        Session session = new Session(name, type, start, end);
        sessions.add(session);

        return session;
    }
}