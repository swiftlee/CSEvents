package com.phaseos.csevents.game;

import java.util.Set;
import java.util.UUID;

public interface GameEvent {
    /**
     * Logic for starting and stopping an event will be implemented differently dependent on the event type.
     */
    void stop();

    /**
     * @return Whether or not the event instance is active.
     */
    boolean isActive();

    /**
     *
     * @return the time left in an event.
     */
    int getTimeLeft();

    /**
     *
     * @return the total duration of an event.
     */
    long getDuration();

    /**
     *
     * @return the name of the event.
     */
    String getEventName();

    /**
     *
     * @return the player who is hosting the event.
     */
    UUID getHost();

    /**
     *
     * @return the players participating in the event.
     */
    Set<UUID> getParticipants();

    /**
     *
     * @return the winners of the event.
     */
    Set<UUID> getWinners();

    /**
     *
     * @param active boolean status of the event.
     */
    void setActive(boolean active);

    /**
     *
     * @param duration the configured duration for the event type.
     */
    void setDuration(long duration);

    /**
     *
     * @param name the configured name for the event type.
     */
    void setEventName(String name);

    /**
     *
     * @param host the player who is hosting the event.
     */
    void setHost(UUID host);

    /**
     *
     * @param uuid a player who is participating in the event.
     */
    void addParticipant(UUID uuid);

    /**
     *
     * @param winners the winners of an event.
     */
    void setWinners(Set<UUID> winners);

    /**
     *
     * @param uuid the player to remove from the event.
     */
    void removeParticipant(UUID uuid);
}
