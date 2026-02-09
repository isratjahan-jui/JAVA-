package learninginheritance.mobile;

public class Android extends Mobile {

    private String os;
    private String browser;

    public Android() {
    }

    public Android(String os, String browser) {
        this.os = os;
        this.browser = browser;
    }

    public Android(String os, String browser, String call, String message, String games, String camera, String gallary) {
        super(call, message, games, camera, gallary);
        this.os = os;
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Override
    
    public String toString() {
        System.out.println(super.toString());
        return "Android{" + "os=" + os + ", browser=" + browser + '}';
    }

}
