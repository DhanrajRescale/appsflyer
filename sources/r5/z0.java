package r5;

import android.net.Uri;
import b5.g1;
import b5.h1;
import b5.i1;
import java.util.Collections;
import java.util.List;
import lp.j1;

/* loaded from: classes.dex */
public final class z0 extends i1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f33340g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f33341b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33342c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33343d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.k0 f33344e;

    /* renamed from: f, reason: collision with root package name */
    public final b5.e0 f33345f;

    static {
        boolean z10;
        b5.c0 c0Var;
        b5.y yVar = new b5.y();
        b5.b0 b0Var = new b5.b0();
        List emptyList = Collections.emptyList();
        j1 j1Var = j1.f24998e;
        b5.g0 g0Var = b5.g0.f3304c;
        Uri uri = Uri.EMPTY;
        if (b0Var.f3217b != null && b0Var.f3216a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.H0(z10);
        if (uri != null) {
            if (b0Var.f3216a != null) {
                c0Var = new b5.c0(b0Var);
            } else {
                c0Var = null;
            }
            new b5.f0(uri, null, c0Var, null, emptyList, null, j1Var, null);
        }
        yVar.a();
        b5.n0 n0Var = b5.n0.I;
    }

    public z0(long j10, boolean z10, boolean z11, b5.k0 k0Var) {
        b5.e0 e0Var;
        if (z11) {
            e0Var = k0Var.f3391c;
        } else {
            e0Var = null;
        }
        this.f33341b = j10;
        this.f33342c = j10;
        this.f33343d = z10;
        k0Var.getClass();
        this.f33344e = k0Var;
        this.f33345f = e0Var;
    }

    @Override // b5.i1
    public final int b(Object obj) {
        if (f33340g.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // b5.i1
    public final g1 g(int i10, g1 g1Var, boolean z10) {
        Object obj;
        yk.j.G0(i10, 1);
        if (z10) {
            obj = f33340g;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        long j10 = this.f33341b;
        g1Var.getClass();
        g1Var.j(null, obj2, 0, j10, 0L, b5.b.f3203g, false);
        return g1Var;
    }

    @Override // b5.i1
    public final int i() {
        return 1;
    }

    @Override // b5.i1
    public final Object m(int i10) {
        yk.j.G0(i10, 1);
        return f33340g;
    }

    @Override // b5.i1
    public final h1 n(int i10, h1 h1Var, long j10) {
        yk.j.G0(i10, 1);
        h1Var.b(h1.f3323r, this.f33344e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f33343d, false, this.f33345f, 0L, this.f33342c, 0, 0, 0L);
        return h1Var;
    }

    @Override // b5.i1
    public final int p() {
        return 1;
    }
}
