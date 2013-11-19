package test.cukes;

public class SystemSettings {
	private String successfull_credential = "default-test-buyer@ariba.com";
	private String unsuccessfull_credential = successfull_credential + "1";
	private String dev_env = "svcdev2";
	private String buyer_aw = "/Buyer.aw";
	private String supplyer_aw = "/Supplyer.aw";
	private String ws_url = "https://" + dev_env + ".ariba.com" + buyer_aw;
	private String successfull_test = "The test is finished successfully!";
	private String unsuccessfull_test = "The test is failed!";
	private String error_message = "The username and password pair you entered was not found or the account is locked.";
	private String home_element = "_$bno2d";;

	public String getSuccessfull_credential() {
		return successfull_credential;
	}
	public void setSuccessfull_credential(String successfull_credential) {
		this.successfull_credential = successfull_credential;
	}
	public String getUnsuccessfull_credential() {
		return unsuccessfull_credential;
	}
	public void setUnsuccessfull_credential(String unsuccessfull_credential) {
		this.unsuccessfull_credential = unsuccessfull_credential;
	}
	public String getDev_env() {
		return dev_env;
	}
	public void setDev_env(String dev_env) {
		this.dev_env = dev_env;
	}
	public String getBuyer_aw() {
		return buyer_aw;
	}
	public void setBuyer_aw(String buyer_aw) {
		this.buyer_aw = buyer_aw;
	}
	public String getSupplyer_aw() {
		return supplyer_aw;
	}
	public void setSupplyer_aw(String supplyer_aw) {
		this.supplyer_aw = supplyer_aw;
	}
	public String getWs_url() {
		return ws_url;
	}
	public void setWs_url(String ws_url) {
		this.ws_url = ws_url;
	}
	public String getSuccessfull_test() {
		return successfull_test;
	}
	public void setSuccessfull_test(String successfull_test) {
		this.successfull_test = successfull_test;
	}
	public String getUnsuccessfull_test() {
		return unsuccessfull_test;
	}
	public void setUnsuccessfull_test(String unsuccessfull_test) {
		this.unsuccessfull_test = unsuccessfull_test;
	}
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public String getHome_element() {
		return home_element;
	}
	public void setHome_element(String home_element) {
		this.home_element = home_element;
	}


}
