package com.rocketseat.passin.domain.attendee;

import com.rocketseat.passin.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity()
@Table(name = "attendees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {
    @Id
    @Column(name = "att_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, name = "att_name")
    private String name;

    @Column(nullable = false, name = "att_email", unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "ev_id", nullable = false)
    private Event event;

    @Column(name = "att_createdAt")
    private LocalDateTime createdAt;
}
