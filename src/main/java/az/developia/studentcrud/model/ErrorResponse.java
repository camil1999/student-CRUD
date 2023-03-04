package az.developia.studentcrud.model;

import lombok.Data;

@Data
public class ErrorResponse {
private String field;
private String message;
}
