package h2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f17817c = new f(new nu.c());

    /* renamed from: a, reason: collision with root package name */
    public final nu.d f17818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17819b = 0;

    public f(nu.c cVar) {
        this.f17818a = cVar;
        if (!Float.isNaN(s0.g.f34069a)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final nu.d a() {
        return this.f17818a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        if (Intrinsics.a(this.f17818a, fVar.f17818a) && this.f17819b == fVar.f17819b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17818a.hashCode() + (Float.hashCode(s0.g.f34069a) * 31)) * 31) + this.f17819b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=0.0, range=");
        sb2.append(this.f17818a);
        sb2.append(", steps=");
        return a3.a.i(sb2, this.f17819b, ')');
    }
}
