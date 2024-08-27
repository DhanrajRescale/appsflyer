package r5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lp.j1;

/* loaded from: classes.dex */
public final class d1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final g5.i f33123h;

    /* renamed from: i, reason: collision with root package name */
    public final g5.e f33124i;

    /* renamed from: j, reason: collision with root package name */
    public final b5.v f33125j;

    /* renamed from: k, reason: collision with root package name */
    public final long f33126k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final kq.e f33127l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f33128m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f33129n;

    /* renamed from: o, reason: collision with root package name */
    public final b5.k0 f33130o;

    /* renamed from: p, reason: collision with root package name */
    public g5.u f33131p;

    /* JADX WARN: Type inference failed for: r5v2, types: [b5.z, b5.a0] */
    public d1(String str, b5.j0 j0Var, g5.e eVar, kq.e eVar2, boolean z10, Object obj) {
        boolean z11;
        b5.f0 f0Var;
        this.f33124i = eVar;
        this.f33127l = eVar2;
        this.f33128m = z10;
        b5.y yVar = new b5.y();
        b5.b0 b0Var = new b5.b0();
        List emptyList = Collections.emptyList();
        j1 j1Var = j1.f24998e;
        b5.g0 g0Var = b5.g0.f3304c;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f3366a.toString();
        uri2.getClass();
        lp.o0 q10 = lp.o0.q(lp.o0.v(j0Var));
        if (b0Var.f3217b != null && b0Var.f3216a == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        yk.j.H0(z11);
        if (uri != null) {
            f0Var = new b5.f0(uri, null, b0Var.f3216a != null ? new b5.c0(b0Var) : null, null, emptyList, null, q10, obj);
        } else {
            f0Var = null;
        }
        b5.k0 k0Var = new b5.k0(uri2, new b5.z(yVar), f0Var, new b5.e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), b5.n0.I, g0Var);
        this.f33130o = k0Var;
        b5.u uVar = new b5.u();
        uVar.f3600k = (String) pn.e.h(j0Var.f3367b, "text/x-unknown");
        uVar.f3592c = j0Var.f3368c;
        uVar.f3593d = j0Var.f3369d;
        uVar.f3594e = j0Var.f3370e;
        uVar.f3591b = j0Var.f3371f;
        String str2 = j0Var.f3372g;
        uVar.f3590a = str2 == null ? str : str2;
        this.f33125j = new b5.v(uVar);
        Map emptyMap = Collections.emptyMap();
        Uri uri3 = j0Var.f3366a;
        yk.j.J0(uri3, "The uri must be set.");
        this.f33123h = new g5.i(uri3, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f33129n = new z0(-9223372036854775807L, true, false, k0Var);
    }

    @Override // r5.a
    public final u b(w wVar, v5.e eVar, long j10) {
        return new c1(this.f33123h, this.f33124i, this.f33131p, this.f33125j, this.f33126k, this.f33127l, a(wVar), this.f33128m);
    }

    @Override // r5.a
    public final b5.k0 h() {
        return this.f33130o;
    }

    @Override // r5.a
    public final void j() {
    }

    @Override // r5.a
    public final void l(g5.u uVar) {
        this.f33131p = uVar;
        m(this.f33129n);
    }

    @Override // r5.a
    public final void n(u uVar) {
        ((c1) uVar).f33110i.d(null);
    }

    @Override // r5.a
    public final void p() {
    }
}
