package sg.edu.rp.c346.id18015938.demoandroidlist;

public class AndroidVersion {

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return
                name +
                ": " + version ;
    }
}
