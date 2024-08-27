package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.Gender;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o0 implements User {

    /* renamed from: a, reason: collision with root package name */
    Context f12637a;

    /* renamed from: b, reason: collision with root package name */
    Analytics f12638b;

    public o0(Context context, Analytics analytics) {
        this.f12637a = null;
        this.f12638b = null;
        this.f12637a = context.getApplicationContext();
        this.f12638b = analytics;
    }

    public void a() {
        String uuid = new UUID(System.currentTimeMillis(), UUID.randomUUID().getLeastSignificantBits()).toString();
        Logger.d("WebEngage", "New luid: " + uuid);
        this.f12638b.a().k(uuid);
        i.a(this.f12637a).onAnonymousIdChanged(this.f12637a, uuid);
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttribute(String str) {
        if (a(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, null);
            this.f12638b.a(l.b("user_delete_attributes", null, hashMap, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttributes(List<String> list) {
        if (list == null) {
            Logger.e("WebEngage", "Attribute list is Invalid");
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            if (a(str)) {
                hashMap.put(str, null);
            }
        }
        this.f12638b.a(l.b("user_delete_attributes", null, hashMap, null, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void loggedIn(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "ILLEGAL ARGUMENT : User Identifier");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cuid", WebEngageUtils.a(str, 100));
        this.f12638b.a(l.b("user_logged_in", null, null, hashMap, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void loggedOut() {
        this.f12638b.a(l.b("user_logged_out", null, null, null, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void login(String str) {
        loggedIn(str);
    }

    @Override // com.webengage.sdk.android.User
    public void logout() {
        loggedOut();
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Boolean bool) {
        if (a(str) && a(bool, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, bool);
            this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttributes(Map<String, ? extends Object> map) {
        if (map == null || map.size() == 0) {
            Logger.e("WebEngage", "ILLEGAL ARGUMENT : attributes");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (a(key) && a(value, key)) {
                hashMap.put(key, value);
            }
        }
        this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(Integer num, Integer num2, Integer num3) {
        q0 q0Var = q0.f12646e;
        if (a(num, q0Var.toString()) && a(num2, q0Var.toString()) && a(num3, q0Var.toString())) {
            try {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.clear();
                gregorianCalendar.set(num.intValue(), num2.intValue() - 1, num3.intValue());
                Date time = gregorianCalendar.getTime();
                HashMap hashMap = new HashMap();
                hashMap.put(q0Var.toString(), time);
                this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setCompany(String str) {
        q0 q0Var = q0.f12650i;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setDevicePushOptIn(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("opt_in_push", Boolean.valueOf(z10));
        this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void setEmail(String str) {
        q0 q0Var = q0.f12644c;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setFirstName(String str) {
        q0 q0Var = q0.f12642a;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setGender(Gender gender) {
        q0 q0Var = q0.f12647f;
        if (a(gender, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), gender.toString());
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedEmail(String str) {
        q0 q0Var = q0.f12645d;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedPhoneNumber(String str) {
        q0 q0Var = q0.f12649h;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setLastName(String str) {
        q0 q0Var = q0.f12643b;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setLocation(double d10, double d11) {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(d10));
        hashMap.put("longitude", Double.valueOf(d11));
        this.f12638b.a(l.b("user_update_geo_info", hashMap, null, null, this.f12637a));
    }

    @Override // com.webengage.sdk.android.User
    public void setOptIn(Channel channel, boolean z10) {
        if (a(channel, "Channel")) {
            HashMap hashMap = new HashMap();
            hashMap.put(channel.toString(), Boolean.valueOf(z10));
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setPhoneNumber(String str) {
        q0 q0Var = q0.f12648g;
        if (a(str, q0Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(q0Var.toString(), str);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setUserProfile(UserProfile userProfile) {
        if (userProfile == null) {
            return;
        }
        if (userProfile.b() != null && userProfile.b().size() > 0) {
            this.f12638b.a(l.b("user_update", userProfile.b(), null, null, this.f12637a));
        }
        if (userProfile.a() == null || userProfile.a().size() <= 1) {
            return;
        }
        setLocation(((Double) userProfile.a().get("latitude")).doubleValue(), ((Double) userProfile.a().get("longitude")).doubleValue());
    }

    private boolean a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        Logger.e("WebEngage", "Found user attribute value as null");
        Logger.e("WebEngage", "Rejecting user attribute : " + str);
        return false;
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Number number) {
        if (a(str) && a(number, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, number);
            this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(q0.f12646e.toString(), parse);
            this.f12638b.a(l.b("user_update", hashMap, null, null, this.f12637a));
        } catch (ParseException unused) {
        }
    }

    private boolean a(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Attribute name is Invalid");
            str2 = "Rejecting  user attribute : " + str;
        } else {
            if (!str.startsWith("we_")) {
                return true;
            }
            Logger.e("WebEngage", "Found prefix \"we_\" on custom attribute name : ".concat(str));
            str2 = "Rejecting user attribute : ".concat(str);
        }
        Logger.e("WebEngage", str2);
        return false;
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, String str2) {
        if (a(str) && a(str2, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Date date) {
        if (a(str) && a(date, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, date);
            this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, List<? extends Object> list) {
        if (a(str) && a(list, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, list);
            this.f12638b.a(l.b("user_update", null, hashMap, null, this.f12637a));
        }
    }
}
