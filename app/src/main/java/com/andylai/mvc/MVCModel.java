package com.andylai.mvc;

final class MVCModel {

    private static MVCModel INSTANCE = new MVCModel();

    private MVCModel() {
    }

    static MVCModel getInstance() {
        return INSTANCE;
    }

    private String mName;
    private String mEmail;
    private boolean mIsVIP;
    private int mRetryCount = 0;

    public void setName(String name) {
        mName = name;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public void setIsVip(boolean isVip) {
        mIsVIP = isVip;
    }

    public void setRetryCount(int retryCount) {
        mRetryCount = retryCount;
    }

    public String getName() {
        return mName;
    }

    public String getEmail() {
        return mEmail;
    }

    public boolean getIsVIP() {
        return mIsVIP;
    }

    public int getRetryCount() {
        return mRetryCount;
    }

}