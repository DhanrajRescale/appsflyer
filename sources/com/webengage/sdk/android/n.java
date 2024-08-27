package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.DataType;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class n implements Serializable, com.webengage.sdk.android.utils.c {

    /* renamed from: b, reason: collision with root package name */
    String f12622b;

    /* renamed from: c, reason: collision with root package name */
    String f12623c;

    /* renamed from: a, reason: collision with root package name */
    Integer f12621a = -1;

    /* renamed from: d, reason: collision with root package name */
    String f12624d = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: e, reason: collision with root package name */
    String f12625e = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: f, reason: collision with root package name */
    String f12626f = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: g, reason: collision with root package name */
    String f12627g = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: h, reason: collision with root package name */
    String f12628h = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: i, reason: collision with root package name */
    Date f12629i = null;

    /* renamed from: j, reason: collision with root package name */
    Map<String, Object> f12630j = null;

    /* renamed from: k, reason: collision with root package name */
    Map<String, Object> f12631k = null;

    /* renamed from: l, reason: collision with root package name */
    Map<String, Object> f12632l = null;

    public String a() {
        return this.f12626f;
    }

    public String b() {
        return this.f12627g;
    }

    public Map<String, Object> c() {
        try {
            return (Map) DataType.cloneInternal(this.f12630j);
        } catch (Exception unused) {
            return null;
        }
    }

    public String d() {
        return this.f12628h;
    }

    public Date e() {
        try {
            return (Date) DataType.cloneInternal(this.f12629i);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return false;
    }

    public Map<String, Object> f() {
        try {
            return (Map) DataType.cloneInternal(this.f12632l);
        } catch (Exception unused) {
            return null;
        }
    }

    public Integer g() {
        return this.f12621a;
    }

    public String h() {
        return this.f12622b;
    }

    public int hashCode() {
        return (this.f12628h + this.f12624d + this.f12625e + this.f12626f + this.f12629i.toString()).hashCode();
    }

    public String i() {
        return this.f12624d;
    }

    public String j() {
        return this.f12623c;
    }

    public String k() {
        return this.f12625e;
    }

    public Map<String, Object> l() {
        try {
            return (Map) DataType.cloneInternal(this.f12631k);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.utils.c
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("license_code", this.f12623c);
        hashMap.put("interface_id", this.f12622b);
        hashMap.put("suid", this.f12625e);
        hashMap.put("luid", this.f12624d);
        hashMap.put("cuid", this.f12626f.isEmpty() ? null : this.f12626f);
        hashMap.put("category", this.f12627g);
        hashMap.put("event_name", this.f12628h);
        hashMap.put("event_time", e());
        hashMap.put("event_data", c());
        hashMap.put("system_data", l());
        return hashMap;
    }

    public String toString() {
        try {
            return DataType.convert(toMap(), DataType.STRING, true).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(Integer num) {
        this.f12621a = num;
    }

    public void b(String str) {
        this.f12627g = str;
    }

    public void c(String str) {
        this.f12628h = str;
    }

    public void d(String str) {
        this.f12622b = str;
    }

    public void e(String str) {
        this.f12624d = str;
    }

    public void f(String str) {
        this.f12623c = str;
    }

    public void g(String str) {
        this.f12625e = str;
    }

    public void a(String str) {
        this.f12626f = str;
    }

    public void b(Map<String, Object> map) {
        this.f12632l = map;
    }

    public void c(Map<String, Object> map) {
        this.f12631k = map;
    }

    public void a(Date date) {
        this.f12629i = date;
    }

    public void a(Map<String, Object> map) {
        this.f12630j = map;
    }
}
