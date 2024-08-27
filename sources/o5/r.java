package o5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f29676a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29677b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29678c;

    public r(String str, boolean z10, boolean z11) {
        this.f29676a = str;
        this.f29677b = z10;
        this.f29678c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != r.class) {
            return false;
        }
        r rVar = (r) obj;
        if (TextUtils.equals(this.f29676a, rVar.f29676a) && this.f29677b == rVar.f29677b && this.f29678c == rVar.f29678c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = jr.h.g(this.f29676a, 31, 31);
        int i11 = 1237;
        if (this.f29677b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f29678c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
