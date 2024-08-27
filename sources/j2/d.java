package j2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20687c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20688d;

    public d(String str, int i10, int i11, Object obj) {
        this.f20685a = obj;
        this.f20686b = i10;
        this.f20687c = i11;
        this.f20688d = str;
        if (i10 > i11) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f20685a, dVar.f20685a) && this.f20686b == dVar.f20686b && this.f20687c == dVar.f20687c && Intrinsics.a(this.f20688d, dVar.f20688d);
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f20685a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f20688d.hashCode() + da.e.f(this.f20687c, da.e.f(this.f20686b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f20685a);
        sb2.append(", start=");
        sb2.append(this.f20686b);
        sb2.append(", end=");
        sb2.append(this.f20687c);
        sb2.append(", tag=");
        return nn.d.n(sb2, this.f20688d, ')');
    }

    public d(int i10, int i11, Object obj) {
        this(HttpUrl.FRAGMENT_ENCODE_SET, i10, i11, obj);
    }
}
