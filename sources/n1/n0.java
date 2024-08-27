package n1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final m1.e f28157a;

    /* renamed from: b, reason: collision with root package name */
    public final h f28158b;

    public n0(m1.e eVar) {
        boolean z10;
        h hVar;
        this.f28157a = eVar;
        long j10 = eVar.f27250h;
        float b10 = m1.a.b(j10);
        long j11 = eVar.f27249g;
        float b11 = m1.a.b(j11);
        boolean z11 = false;
        long j12 = eVar.f27247e;
        long j13 = eVar.f27248f;
        if (b10 == b11 && m1.a.b(j11) == m1.a.b(j13) && m1.a.b(j13) == m1.a.b(j12)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m1.a.c(j10) == m1.a.c(j11) && m1.a.c(j11) == m1.a.c(j13) && m1.a.c(j13) == m1.a.c(j12)) {
            z11 = true;
        }
        if (z10 && z11) {
            hVar = null;
        } else {
            h h10 = androidx.compose.ui.graphics.a.h();
            p0.b(h10, eVar);
            hVar = h10;
        }
        this.f28158b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        if (Intrinsics.a(this.f28157a, ((n0) obj).f28157a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28157a.hashCode();
    }
}
