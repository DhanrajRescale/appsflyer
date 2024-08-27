package xj;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final kq.e f40300e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f40301a;

    /* renamed from: b, reason: collision with root package name */
    public final i f40302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40303c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f40304d;

    public j(String str, Object obj, i iVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f40303c = str;
            this.f40301a = obj;
            this.f40302b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static j a(Object obj, String str) {
        return new j(str, obj, f40300e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f40303c.equals(((j) obj).f40303c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40303c.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("Option{key='"), this.f40303c, "'}");
    }
}
