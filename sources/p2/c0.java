package p2;

import d2.w0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f30522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30523b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.f0 f30524c;

    static {
        d1.r rVar = d1.s.f13291a;
    }

    public c0(String str, long j10, int i10) {
        this(new j2.e((i10 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, null, 6), (i10 & 2) != 0 ? j2.f0.f20710b : j10, (j2.f0) null);
    }

    public static c0 a(c0 c0Var, j2.e eVar, long j10, int i10) {
        j2.f0 f0Var;
        if ((i10 & 1) != 0) {
            eVar = c0Var.f30522a;
        }
        if ((i10 & 2) != 0) {
            j10 = c0Var.f30523b;
        }
        if ((i10 & 4) != 0) {
            f0Var = c0Var.f30524c;
        } else {
            f0Var = null;
        }
        c0Var.getClass();
        return new c0(eVar, j10, f0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (j2.f0.a(this.f30523b, c0Var.f30523b) && Intrinsics.a(this.f30524c, c0Var.f30524c) && Intrinsics.a(this.f30522a, c0Var.f30522a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f30522a.hashCode() * 31;
        int i11 = j2.f0.f20711c;
        int c10 = v.e.c(this.f30523b, hashCode, 31);
        j2.f0 f0Var = this.f30524c;
        if (f0Var != null) {
            i10 = Long.hashCode(f0Var.f20712a);
        } else {
            i10 = 0;
        }
        return c10 + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f30522a) + "', selection=" + ((Object) j2.f0.g(this.f30523b)) + ", composition=" + this.f30524c + ')';
    }

    public c0(j2.e eVar, long j10, j2.f0 f0Var) {
        j2.f0 f0Var2;
        this.f30522a = eVar;
        int length = eVar.f20699a.length();
        int i10 = j2.f0.f20711c;
        int i11 = (int) (j10 >> 32);
        int f10 = kotlin.ranges.d.f(i11, 0, length);
        int i12 = (int) (j10 & 4294967295L);
        int f11 = kotlin.ranges.d.f(i12, 0, length);
        this.f30523b = (f10 == i11 && f11 == i12) ? j10 : w0.b(f10, f11);
        if (f0Var != null) {
            int length2 = eVar.f20699a.length();
            long j11 = f0Var.f20712a;
            int i13 = (int) (j11 >> 32);
            int f12 = kotlin.ranges.d.f(i13, 0, length2);
            int i14 = (int) (j11 & 4294967295L);
            int f13 = kotlin.ranges.d.f(i14, 0, length2);
            f0Var2 = new j2.f0((f12 == i13 && f13 == i14) ? j11 : w0.b(f12, f13));
        } else {
            f0Var2 = null;
        }
        this.f30524c = f0Var2;
    }
}
