package com.phaseos.csevents.game;

import java.util.Set;
import java.util.UUID;

public class LuckyWoolEvent implements StartableEvent, GameEvent {
    @Override
    public void stop() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public int getTimeLeft() {
        return 0;
    }

    @Override
    public long getDuration() {
        return 0;
    }

    @Override
    public String getEventName() {
        return null;
    }

    @Override
    public UUID getHost() {
        return null;
    }

    @Override
    public Set<UUID> getParticipants() {
        return null;
    }

    @Override
    public Set<UUID> getWinners() {
        return null;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public void setDuration(long duration) {

    }

    @Override
    public void setEventName(String name) {

    }

    @Override
    public void setHost(UUID host) {

    }

    @Override
    public void addParticipant(UUID uuid) {

    }

    @Override
    public void setWinners(Set<UUID> winners) {

    }

    @Override
    public void removeParticipant(UUID uuid) {

    }

    @Override
    public void start() {

    }
}
