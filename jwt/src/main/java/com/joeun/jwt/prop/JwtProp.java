package com.joeun.jwt.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("com.joeun.jwt")   // 하위 경로의 속성들의 지정하여 클래스로 사용할 수 있게 해줌
public class JwtProp {
    
    // ✅com.joeun.jwt.secret-key -> secretKey : { 인코딩된 시크릿 키 }
    private String secretKey;
}
