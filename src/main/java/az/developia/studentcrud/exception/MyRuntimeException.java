package az.developia.studentcrud.exception;

import org.springframework.validation.BindingResult;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
public class MyRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	@Getter
	@Setter
	private BindingResult result;
}
