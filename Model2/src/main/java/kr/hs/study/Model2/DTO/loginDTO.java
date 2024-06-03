package kr.hs.study.Model2.DTO;

import jakarta.websocket.server.ServerEndpoint;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class loginDTO {
    private String uid;
    private String upass;
}
