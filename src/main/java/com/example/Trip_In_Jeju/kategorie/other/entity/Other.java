package com.example.Trip_In_Jeju.kategorie.other.entity;

import com.example.Trip_In_Jeju.calendar.entity.Calendar;
import com.example.Trip_In_Jeju.location.entity.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Other {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String title;
    private String content;
    private int category;
    private Long hit;
    private String place; // 장소를 나타내는 단순 문자열 필드
    private String thumbnail;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifyDate;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne
    private Calendar calendar; // Calendar 엔티티를 참조

    private String thumbnailImg;

    private String phoneNumber;
    private String websiteUrl;
    private String hashtags;

    private int likes;

    private double averageRating;  // 평균 별점 추가

    private String subCategory;
}