package com.andylai.mvc;

import android.content.Context;

class MVCController {
    MVCModel model = MVCModel.getInstance();

    public MVCController(Context context) {

    }

    void addUser(String name, String email, boolean isVIP) {
        model.setName(name);
        model.setEmail(email);
        model.setIsVip(isVIP);
    }

    boolean checkAccountInfo(String name, String email, int retryCount) {
        int count = model.getRetryCount();
        if (retryCount > 5) return false;
        else {
            if (name.equals(model.getName()) && email.equals(model.getEmail())) {
                model.setRetryCount(0);
                return true;
            } else {
                count++;
                model.setRetryCount(count);
                return false;
            }
        }
    }
}