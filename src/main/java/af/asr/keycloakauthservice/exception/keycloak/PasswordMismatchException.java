package af.asr.keycloakauthservice.exception.keycloak;


import af.asr.keycloakauthservice.exception.common.BaseUncheckedException;

public class PasswordMismatchException extends BaseUncheckedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4849582696173207678L;
	
	/**
	 * 
	 */

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	

	/**
	 * Constructor the initialize Handler exception
	 * 
	 * @param errorCode    The error code for this exception
	 * @param errorMessage The error message for this exception
	 */
	public PasswordMismatchException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
	}

}
