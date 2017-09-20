package facilito.codigo.com.example.isaias.myappgui.data.entities;

/**
 * Created by isaia on 9/20/2017.
 */

public class Friend {
    private String title;
    private String name;
    private String lastName;
    private String url;

    public Friend(String title, String name, String lastName, String url) {
        this.title = title;
        this.name = name;
        this.lastName = lastName;
        this.url = url;
    }

    public Friend() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
