package am;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import w.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f760a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f761b;

    /* renamed from: c, reason: collision with root package name */
    public final Exception f762c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f763d;

    public d(int i10, Object obj, Exception exc) {
        this.f760a = i10;
        this.f761b = obj;
        this.f762c = exc;
    }

    public static d a(Exception exc) {
        return new d(2, null, exc);
    }

    public static d b() {
        return new d(3, null, null);
    }

    public static d c(Object obj) {
        return new d(1, obj, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f760a == dVar.f760a) {
            Object obj2 = dVar.f761b;
            Object obj3 = this.f761b;
            if (obj3 != null ? obj3.equals(obj2) : obj2 == null) {
                Exception exc = dVar.f762c;
                Exception exc2 = this.f762c;
                if (exc2 == null) {
                    if (exc == null) {
                        return true;
                    }
                } else if (exc2.equals(exc)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e10 = k.e(this.f760a) * 31;
        int i10 = 0;
        Object obj = this.f761b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (e10 + hashCode) * 31;
        Exception exc = this.f762c;
        if (exc != null) {
            i10 = exc.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "Resource{mState=" + a3.a.y(this.f760a) + ", mValue=" + this.f761b + ", mException=" + this.f762c + UrlTreeKt.componentParamSuffixChar;
    }
}
