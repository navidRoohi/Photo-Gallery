package com.gigarchitecture.app.photogallery;

import android.support.v4.app.Fragment;


public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
