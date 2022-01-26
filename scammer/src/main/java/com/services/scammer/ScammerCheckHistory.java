package com.services.scammer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ScammerCheckHistory {
    @Id
    @SequenceGenerator(
            name = "scammer_id_sequence",
            sequenceName = "scammer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "scammer_id_sequence"
    )
    private Integer Id;
    private Integer customerId;
    private Boolean isScammer;
    private LocalDateTime creationDate;
}
