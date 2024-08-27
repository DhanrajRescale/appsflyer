package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f2292b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f2293c;

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f2295e;

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f2297g;

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f2299i;

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f2300j;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2303a;

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f2294d = new m0(4);

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f2296f = new m0(6);

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f2298h = new m0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f2301k = new m0(10);

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f2302l = new m0(9);

    static {
        int i10 = 0;
        f2292b = new m0(5, i10);
        f2293c = new m0(8, i10);
        f2295e = new m0(7, i10);
        f2297g = new m0(3, i10);
        f2299i = new m0(1, i10);
        f2300j = new m0(i10);
    }

    public s0(boolean z10) {
        this.f2303a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String value, Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        return c(value);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
