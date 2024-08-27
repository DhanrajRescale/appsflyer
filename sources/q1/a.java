package q1;

import hl.f;
import kotlin.jvm.internal.Intrinsics;
import n1.e;
import n1.h0;
import n1.s0;
import n1.u;
import w2.h;
import w2.j;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final h0 f31563e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31564f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31565g;

    /* renamed from: h, reason: collision with root package name */
    public int f31566h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final long f31567i;

    /* renamed from: j, reason: collision with root package name */
    public float f31568j;

    /* renamed from: k, reason: collision with root package name */
    public u f31569k;

    public a(h0 h0Var, long j10, long j11) {
        int i10;
        int i11;
        this.f31563e = h0Var;
        this.f31564f = j10;
        this.f31565g = j11;
        int i12 = h.f38792c;
        if (((int) (j10 >> 32)) >= 0 && ((int) (j10 & 4294967295L)) >= 0 && (i10 = (int) (j11 >> 32)) >= 0 && (i11 = (int) (j11 & 4294967295L)) >= 0) {
            e eVar = (e) h0Var;
            if (i10 <= eVar.f28128a.getWidth() && i11 <= eVar.f28128a.getHeight()) {
                this.f31567i = j11;
                this.f31568j = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // q1.b
    public final void c(float f10) {
        this.f31568j = f10;
    }

    @Override // q1.b
    public final void e(u uVar) {
        this.f31569k = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.a(this.f31563e, aVar.f31563e) && h.a(this.f31564f, aVar.f31564f) && j.a(this.f31565g, aVar.f31565g) && s0.d(this.f31566h, aVar.f31566h)) {
            return true;
        }
        return false;
    }

    @Override // q1.b
    public final long h() {
        return f.i1(this.f31567i);
    }

    public final int hashCode() {
        int hashCode = this.f31563e.hashCode() * 31;
        int i10 = h.f38792c;
        return Integer.hashCode(this.f31566h) + v.e.c(this.f31565g, v.e.c(this.f31564f, hashCode, 31), 31);
    }

    @Override // q1.b
    public final void i(p1.h hVar) {
        p1.h.z0(hVar, this.f31563e, this.f31564f, this.f31565g, 0L, f.k(Math.round(m1.f.e(hVar.d())), Math.round(m1.f.c(hVar.d()))), this.f31568j, this.f31569k, this.f31566h, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f31563e);
        sb2.append(", srcOffset=");
        sb2.append((Object) h.b(this.f31564f));
        sb2.append(", srcSize=");
        sb2.append((Object) j.b(this.f31565g));
        sb2.append(", filterQuality=");
        int i10 = this.f31566h;
        if (s0.d(i10, 0)) {
            str = "None";
        } else if (s0.d(i10, 1)) {
            str = "Low";
        } else if (s0.d(i10, 2)) {
            str = "Medium";
        } else if (s0.d(i10, 3)) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
