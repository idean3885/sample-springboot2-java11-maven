package com.example.samplespringboot2javamaven.dto;

import com.example.samplespringboot2javamaven.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>Member Response Dto
 *
 * @author dongyoung.kim
 * @since 1.0
 */
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRspDto {

    private Long id;
    private String email;

    public MemberRspDto(Member member) {
        this.id = member.getId();
        this.email = member.getEmail();
    }

}
