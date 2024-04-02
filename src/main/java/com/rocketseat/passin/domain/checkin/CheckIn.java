package com.rocketseat.passin.domain.checkin;

import com.rocketseat.passin.domain.attendee.Attendee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity()
@Table(name = "check_ins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckIn {

    @Id
    @Column(name = "ch_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "att_id", nullable = false)
    private Attendee attendee;

    @Column(name = "ch_createdAt", nullable = false)
    private LocalDateTime createdAt;
}
