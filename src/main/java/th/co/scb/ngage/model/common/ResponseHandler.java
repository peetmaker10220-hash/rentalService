package th.co.scb.ngage.model.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static final  String STATUS_SUCCESS = "00";
    public static final String STATUS_ERROR = "99";

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj, String responseCode) {
        Map<String, Object> map = new HashMap<>();
        LocalDateTime timestamp = LocalDateTime.now();
        map.put("timeStamp", timestamp);
        map.put("message", message);
        map.put("responseCode",responseCode);
        map.put("data", responseObj);

        return new ResponseEntity<>(map,status);
    }

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status,String responseCode) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("responseCode",responseCode);

        return new ResponseEntity<>(map,status);
    }

    public static ResponseEntity<Object> generateResponseExternal(boolean success, String message,Object body, HttpStatus status) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", success);
        map.put("message",message);
        map.put("body",body);

        return new ResponseEntity<>(map,status);
    }
}
