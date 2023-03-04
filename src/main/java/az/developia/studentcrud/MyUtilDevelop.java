package az.developia.studentcrud;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "develop")
public class MyUtilDevelop implements MyUtil {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

}
