package id.ac.polinema.intent.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name;
    private String age;
    private String username;

    public User() {

    }

    public User(String name, String age, String username) {
        this.name = name;
        this.age = age;
        this.username = username;
    }

    protected User(Parcel in) {
        name = in.readString();
        age = in.readString();
        username = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(age);
        parcel.writeString(username);
    }
}