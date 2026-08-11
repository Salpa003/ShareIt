package org.salpa.shareit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime start;

    private LocalDateTime end;

    private Long item;
    private Long booker;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus status;

    public static enum BookingStatus {
        WAITING,
        APPROVED,
        REJECTED,
        CANCELED
    }
}
