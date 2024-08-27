package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f20772a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20773b;

    public x(w wVar, v vVar) {
        this.f20772a = wVar;
        this.f20773b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Intrinsics.a(this.f20773b, xVar.f20773b) && Intrinsics.a(this.f20772a, xVar.f20772a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        w wVar = this.f20772a;
        if (wVar != null) {
            i10 = wVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        v vVar = this.f20773b;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f20772a + ", paragraphSyle=" + this.f20773b + ')';
    }

    public x() {
        this(null, new v());
    }
}
