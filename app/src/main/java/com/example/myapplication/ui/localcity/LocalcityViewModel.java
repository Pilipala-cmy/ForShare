package com.example.myapplication.ui.localcity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalcityViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public LocalcityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is localcity fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}