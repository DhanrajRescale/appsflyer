package com.webengage.sdk.android.utils.htmlspanner.n;

import com.webengage.sdk.android.Logger;
import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Integer f12918a;

    /* renamed from: b, reason: collision with root package name */
    private Float f12919b;

    /* renamed from: c, reason: collision with root package name */
    private a f12920c;

    /* loaded from: classes2.dex */
    public enum a {
        PX,
        EM,
        PERCENTAGE,
        PT
    }

    public c(float f10, a aVar) {
        this.f12919b = Float.valueOf(f10);
        this.f12920c = aVar;
    }

    public float a() {
        return this.f12919b.floatValue();
    }

    public int b() {
        return this.f12918a.intValue();
    }

    public a c() {
        return this.f12920c;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        if (this.f12918a != null) {
            sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
            obj = this.f12918a;
        } else {
            sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
            obj = this.f12919b;
        }
        sb2.append(obj);
        sb2.append(this.f12920c);
        return sb2.toString();
    }

    public c(int i10) {
        this.f12920c = a.PX;
        this.f12918a = Integer.valueOf(i10);
    }

    public static c a(String str) {
        String concat;
        if (str.equals("0")) {
            return new c(g.f34069a, a.EM);
        }
        String replaceAll = str.replaceAll("\\s+", HttpUrl.FRAGMENT_ENCODE_SET);
        try {
            if (replaceAll.endsWith("px")) {
                return new c(Integer.parseInt(replaceAll.substring(0, replaceAll.length() - 2)));
            }
            if (replaceAll.endsWith("pt")) {
                return new c(Integer.parseInt(replaceAll.substring(0, replaceAll.length() - 2)), a.PT);
            }
            if (!replaceAll.endsWith("%")) {
                if (replaceAll.endsWith("em")) {
                    return new c(Float.valueOf(Float.parseFloat(replaceAll.substring(0, replaceAll.length() - 2))).floatValue(), a.EM);
                }
                return null;
            }
            try {
                return new c(Integer.parseInt(replaceAll.substring(0, replaceAll.length() - 1)) / 100.0f, a.PERCENTAGE);
            } catch (NumberFormatException unused) {
                concat = "Can't parse font-size: ".concat(replaceAll);
                Logger.e("WebEngage", concat);
                return null;
            }
        } catch (NumberFormatException unused2) {
            concat = "Can't parse value: ".concat(replaceAll);
        }
    }

    public c(int i10, a aVar) {
        this.f12920c = aVar;
        this.f12918a = Integer.valueOf(i10);
    }

    public void a(Integer num) {
        this.f12918a = num;
    }
}
