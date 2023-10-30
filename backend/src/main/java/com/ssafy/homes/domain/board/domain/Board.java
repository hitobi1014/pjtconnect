package com.ssafy.homes.domain.board.domain;

import com.ssafy.homes.global.common.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private BoardType type;
    private String title;
    private String content;

    @OneToMany(mappedBy ="board", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Board(BoardType type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }

}
