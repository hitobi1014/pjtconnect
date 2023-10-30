package com.ssafy.homes.domain.board.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoardType {
    //공지사항, 뉴스
    NOTICE("NOTICE"), NEWS("NEWS");

    @JsonValue
    private final String type;

}
