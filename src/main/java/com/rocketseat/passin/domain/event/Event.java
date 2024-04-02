package com.rocketseat.passin.domain.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @Column(nullable = false, name = "ev_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, name = "ev_title")
    private String title;

    @Column(nullable = false, name = "ev_details")
    private String details;

    @Column(nullable = false, unique = true, name = "ev_slug")
    private String slug;

    @Column(name = "ev_maxAttendees", nullable = false)
    private Integer maximumAttendees;
}
