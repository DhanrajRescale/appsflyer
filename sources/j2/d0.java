package j2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f20689a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f20690b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20692d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20694f;

    /* renamed from: g, reason: collision with root package name */
    public final w2.b f20695g;

    /* renamed from: h, reason: collision with root package name */
    public final w2.k f20696h;

    /* renamed from: i, reason: collision with root package name */
    public final o2.r f20697i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20698j;

    public d0(e eVar, g0 g0Var, List list, int i10, boolean z10, int i11, w2.b bVar, w2.k kVar, o2.r rVar, long j10) {
        this.f20689a = eVar;
        this.f20690b = g0Var;
        this.f20691c = list;
        this.f20692d = i10;
        this.f20693e = z10;
        this.f20694f = i11;
        this.f20695g = bVar;
        this.f20696h = kVar;
        this.f20697i = rVar;
        this.f20698j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (Intrinsics.a(this.f20689a, d0Var.f20689a) && Intrinsics.a(this.f20690b, d0Var.f20690b) && Intrinsics.a(this.f20691c, d0Var.f20691c) && this.f20692d == d0Var.f20692d && this.f20693e == d0Var.f20693e && kp.j.N(this.f20694f, d0Var.f20694f) && Intrinsics.a(this.f20695g, d0Var.f20695g) && this.f20696h == d0Var.f20696h && Intrinsics.a(this.f20697i, d0Var.f20697i) && w2.a.b(this.f20698j, d0Var.f20698j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20698j) + ((this.f20697i.hashCode() + ((this.f20696h.hashCode() + ((this.f20695g.hashCode() + da.e.f(this.f20694f, v.e.d(this.f20693e, (nn.d.e(this.f20691c, jr.h.f(this.f20690b, this.f20689a.hashCode() * 31, 31), 31) + this.f20692d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f20689a) + ", style=" + this.f20690b + ", placeholders=" + this.f20691c + ", maxLines=" + this.f20692d + ", softWrap=" + this.f20693e + ", overflow=" + ((Object) kp.j.e0(this.f20694f)) + ", density=" + this.f20695g + ", layoutDirection=" + this.f20696h + ", fontFamilyResolver=" + this.f20697i + ", constraints=" + ((Object) w2.a.k(this.f20698j)) + ')';
    }
}
