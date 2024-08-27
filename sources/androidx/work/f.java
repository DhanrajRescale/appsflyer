package androidx.work;

import android.net.Uri;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2561b;

    public f(Uri uri, boolean z10) {
        this.f2560a = uri;
        this.f2561b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2561b == fVar.f2561b && this.f2560a.equals(fVar.f2560a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2560a.hashCode() * 31) + (this.f2561b ? 1 : 0);
    }
}
