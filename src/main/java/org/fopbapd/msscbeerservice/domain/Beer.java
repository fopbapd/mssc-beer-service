package org.fopbapd.msscbeerservice.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Beer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    UUID id;

    String beerName;
    String beerStyle;

    @Column(unique = true)
    Long upc;
    BigDecimal price;

    Integer minOnHand;
    Integer quantityToBrew;

    @Version
    Long version;

    @CreationTimestamp
    @Column(updatable = false)
    Timestamp createdDate;
    @UpdateTimestamp
    Timestamp lastModifiedDate;
}
