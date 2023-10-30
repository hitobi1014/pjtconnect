package com.ssafy.homes.domain.member.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberStatus {
    ACTIVE("ACTIVE"), DEACTIVTED("DEACTIVTED");

    @JsonValue
    private final String status;


}
