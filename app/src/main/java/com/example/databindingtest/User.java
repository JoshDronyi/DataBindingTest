package com.example.databindingtest;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.library.baseAdapters.BR;


public class User extends BaseObservable {
    private String firstName;
    private ObservableField<String> lastName = new ObservableField<>();

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName.set(lastName);
    }


    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }

    public void setLastName(ObservableField<String> lastName) {
        this.lastName = lastName;
    }
}
