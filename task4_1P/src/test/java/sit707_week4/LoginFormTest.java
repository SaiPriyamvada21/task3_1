package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "s223411761";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "sai priyamvada";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
    

	    @Test
	    public void testFailEmptyUsernameEmptyPasswordWrongValidationCode() {
	        LoginStatus status = LoginForm.login(null, null);
	        boolean isValidCode = LoginForm.validateCode("W");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	    @Test
	    public void testFailEmptyUsernameEmptyPasswordCorrectValidationCode() {
	        LoginStatus status = LoginForm.login(null, null);
	        boolean isValidCode = LoginForm.validateCode("C");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	    @Test
	    public void testFailEmptyUsernameWrongPasswordEmptyValidationCode() {
	        LoginStatus status = LoginForm.login(null, "W");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailEmptyUsernameCorrectPasswordEmptyValidationCode() {
	        LoginStatus status = LoginForm.login(null, "C");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailEmptyUsernameWrongPasswordWrongValidationCode() {
	        LoginStatus status = LoginForm.login(null, "W");
	        boolean isValidCode = LoginForm.validateCode("W");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	    @Test
	    public void testFailEmptyUsernameCorrectPasswordWrongValidationCode() {
	        LoginStatus status = LoginForm.login(null, "C");
	        boolean isValidCode = LoginForm.validateCode("W");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	    @Test
	    public void testFailEmptyUsernameWrongPasswordCorrectValidationCode() {
	        LoginStatus status = LoginForm.login(null, "W");
	        boolean isValidCode = LoginForm.validateCode("C");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	    @Test
	    public void testFailEmptyUsernameCorrectPasswordCorrectValidationCode() {
	        LoginStatus status = LoginForm.login(null, "C");
	        boolean isValidCode = LoginForm.validateCode("C");
	        Assert.assertFalse(status.isLoginSuccess() && isValidCode);
	    }

	   
	}


	

