package bq;

import b3.t;
import b5.i0;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7238a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7239b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f7240c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7242e;

    /* renamed from: f, reason: collision with root package name */
    public final d f7243f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f7244g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f7238a = str;
        this.f7239b = Collections.unmodifiableSet(set);
        this.f7240c = Collections.unmodifiableSet(set2);
        this.f7241d = i10;
        this.f7242e = i11;
        this.f7243f = dVar;
        this.f7244g = Collections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                hashSet.add(p.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new t(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f7239b.toArray()) + ">{" + this.f7241d + ", type=" + this.f7242e + ", deps=" + Arrays.toString(this.f7240c.toArray()) + UrlTreeKt.componentParamSuffix;
    }
}
