package com.sit.hrpmis.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CommonResponse {
    @JsonProperty("msg_code")
    private String responseMsgCode;
    @JsonProperty("msg")
    private String responseMsg;

    @JsonProperty("msg_in_detail")  //for exception etc..
    private String messageInDetails;

    @JsonProperty("ack_time_stamp")
    private String acknowledgementTime;

    @JsonProperty("secure_token")
    String secureToken;
}