package lecture9.writer.bytestream;

import java.io.*;

public class ObjectOutputStreamEx {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("/home/kiemnx/project/plus/plusplus/phim.txt"));
            // create phim
            Phim student = new Phim("End Game", "https://phimmoi.net/sss", "https://avatar.com");
            // write phim
            oos.writeObject(student);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }

       /* ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("/home/kiemnx/project/plus/plusplus/phim.txt"));
            // read phim
            Phim student = (Phim) ois.readObject();
            // show phim
            System.out.println(student.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }*/
    }
}


class Phim implements Serializable {
    private String name;
    private String link;
    private String avatar;

    public Phim(String name, String link, String avatar) {
        this.name = name;
        this.link = link;
        this.avatar = avatar;
    }

    public Phim() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Phim{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}