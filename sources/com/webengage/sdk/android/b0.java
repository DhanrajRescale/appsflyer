package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.Gender;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes2.dex */
class b0 implements User {

    /* renamed from: a, reason: collision with root package name */
    Queue<i0> f12532a;

    public b0(Queue<i0> queue) {
        this.f12532a = queue;
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttribute(String str) {
        this.f12532a.add(new r0(19, str));
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttributes(List<String> list) {
        this.f12532a.add(new r0(20, list));
    }

    @Override // com.webengage.sdk.android.User
    public void loggedIn(String str) {
        login(str);
    }

    @Override // com.webengage.sdk.android.User
    public void loggedOut() {
        logout();
    }

    @Override // com.webengage.sdk.android.User
    public void login(String str) {
        this.f12532a.add(new r0(21, str));
    }

    @Override // com.webengage.sdk.android.User
    public void logout() {
        this.f12532a.add(new r0(22, new Object[0]));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Boolean bool) {
        this.f12532a.add(new r0(17, str, bool));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttributes(Map<String, ? extends Object> map) {
        this.f12532a.add(new r0(15, map));
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(Integer num, Integer num2, Integer num3) {
        this.f12532a.add(new r0(3, num, num2, num3));
    }

    @Override // com.webengage.sdk.android.User
    public void setCompany(String str) {
        this.f12532a.add(new r0(10, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setDevicePushOptIn(boolean z10) {
        this.f12532a.add(new r0(26, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.User
    public void setEmail(String str) {
        this.f12532a.add(new r0(1, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setFirstName(String str) {
        this.f12532a.add(new r0(7, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setGender(Gender gender) {
        this.f12532a.add(new r0(9, gender));
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedEmail(String str) {
        this.f12532a.add(new r0(2, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedPhoneNumber(String str) {
        this.f12532a.add(new r0(6, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setLastName(String str) {
        this.f12532a.add(new r0(8, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setLocation(double d10, double d11) {
        this.f12532a.add(new r0(24, Double.valueOf(d10), Double.valueOf(d11)));
    }

    @Override // com.webengage.sdk.android.User
    public void setOptIn(Channel channel, boolean z10) {
        this.f12532a.add(new r0(23, channel, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.User
    public void setPhoneNumber(String str) {
        this.f12532a.add(new r0(5, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setUserProfile(UserProfile userProfile) {
        this.f12532a.add(new r0(0, userProfile));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Number number) {
        this.f12532a.add(new r0(25, str, number));
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(String str) {
        this.f12532a.add(new r0(4, str));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, String str2) {
        this.f12532a.add(new r0(16, str, str2));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Date date) {
        this.f12532a.add(new r0(13, str, date));
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, List<? extends Object> list) {
        this.f12532a.add(new r0(14, str, list));
    }
}
