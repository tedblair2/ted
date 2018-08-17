package com.thuo.nexthome;

import android.widget.Button;

/**
 * Created by emobilis on 8/13/18.
 */

public class Custom {
    int image;
    String jina,location,phonenumber;

    public Custom(int image, String jina, String location, String phonenumber) {
        this.image = image;
        this.jina = jina;
        this.location = location;
        this.phonenumber = phonenumber;
    }

    public int getImage() {        return image;
    }

    public String getJina() {
        return jina;
    }

    public String getLocation() {
        return location;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
