package com.jojoldu.book.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponeseDtoTest {
    @Test
    public void lokboktest(){

        String name="wow";
        int amount=1000;

        //값을 전달
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //비교
        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getName()).isEqualTo(name);
        //assertThat
        //assertj라는 테스트 검증 라이브러리의 검증메소드
        //검증하고 싶은 대상을 메소드 인자로 받는다.
        //메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 있다.

        //isEqualTo
        //assertj의 동등 비교 메소드이다.
        //assertThat에 있는 값을 비교해서 같을 때만 성공.
    }
}
