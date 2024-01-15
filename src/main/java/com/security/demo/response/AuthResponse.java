package com.security.demo.response;

import ch.qos.logback.classic.spi.LoggingEventVO;
import lombok.*;
import org.aspectj.weaver.ast.Var;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
}
