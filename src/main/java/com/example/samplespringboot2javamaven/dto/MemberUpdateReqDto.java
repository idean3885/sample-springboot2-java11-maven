package com.example.samplespringboot2javamaven.dto;

import com.example.samplespringboot2javamaven.entity.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>Member Req Dto
 *
 * @author dongyoung.kim
 * @since 1.0
 */
@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberUpdateReqDto {

    private String email;

    public Member toEntity(Long id) {
        return Member.builder()
                     .id(id)
                     .email(email)
                     .build();
    }

}
