package com.ssafy.homes.domain.member.domain;

import com.ssafy.homes.global.common.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 20, nullable = false)
    private String memberId;

    @Column(length = 20, nullable = false)
    private String password;
    @Column(length = 11, nullable = false)
    private String mobile;
    private String email;
    private String img; // 경로활용? 찾아보기

    @Builder
    public Member(String memberId, String password, String mobile, String email, String img) {
        this.memberId = memberId;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
        this.img = img;
    }
}
