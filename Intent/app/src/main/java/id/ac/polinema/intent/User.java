package model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import id.ac.polinema.intent.ProfileBundleActivity;

public class User implements Parcelable {

    private String username;
    private String name;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Parcel in) {
        username = in.readString();
        name = in.readString();
        age = in.readInt();
    }

    public User(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }
//    User user =new User(username,name,age);


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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(name);
        parcel.writeInt(age);
    }




}