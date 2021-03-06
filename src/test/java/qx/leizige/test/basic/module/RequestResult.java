package qx.leizige.test.basic.module;

/**
 * εεΊη»ζ
 */
public class RequestResult {

	private boolean success;

	private String message;

	public RequestResult(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	boolean isSuccess() {
		return success;
	}

	void setSuccess(boolean success) {
		this.success = success;
	}

	String getMessage() {
		return message;
	}

	void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RequestResult{" +
				"success=" + success +
				", message='" + message + '\'' +
				'}';
	}
}
