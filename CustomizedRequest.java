package in.abc.customization;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CustomizedRequest extends HttpServletRequestWrapper {

	public CustomizedRequest(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String word) {
		// TODO Auto-generated method stub
		String word1 = super.getParameter(word);
		System.out.println(word1);
		if(word1.equalsIgnoreCase("JAVA") || word1.equalsIgnoreCase("JEE") || word1.equalsIgnoreCase("SpringBoot"))
			return "ABC";
		else
			return word1;
	}

	

}
