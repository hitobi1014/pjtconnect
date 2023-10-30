package com.ssafy.homes.domain.board.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {
    @Id
    @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Board.class)
    @JoinColumn(name = "board_id", updatable = false)
    private Board board;

    private String content;
}
