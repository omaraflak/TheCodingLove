package me.aflak.thecodinglove.ui.main.presenter;

import android.os.Bundle;

public interface MainPresenter {
    void onCreate(Bundle bundle);
    void onSaveInstance(Bundle bundle);
    void previousPost();
    void nextPost();
}
