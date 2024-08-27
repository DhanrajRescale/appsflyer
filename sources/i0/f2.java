package i0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f18874a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.v0 f18875b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.c0 f18876c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18877d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18878e;

    /* renamed from: f, reason: collision with root package name */
    public final l0.a1 f18879f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.v f18880g;

    /* renamed from: h, reason: collision with root package name */
    public final b3 f18881h;

    /* renamed from: i, reason: collision with root package name */
    public final w0 f18882i;

    /* renamed from: j, reason: collision with root package name */
    public final h1 f18883j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f18884k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18885l;

    public f2(q1 q1Var, l0.v0 v0Var, p2.c0 c0Var, boolean z10, boolean z11, l0.a1 a1Var, p2.v vVar, b3 b3Var, w0 w0Var, Function1 function1, int i10) {
        k1 k1Var = l1.f19040a;
        this.f18874a = q1Var;
        this.f18875b = v0Var;
        this.f18876c = c0Var;
        this.f18877d = z10;
        this.f18878e = z11;
        this.f18879f = a1Var;
        this.f18880g = vVar;
        this.f18881h = b3Var;
        this.f18882i = w0Var;
        this.f18883j = k1Var;
        this.f18884k = function1;
        this.f18885l = i10;
    }

    public final void a(List list) {
        p2.j jVar = this.f18874a.f19137d;
        ArrayList S = vt.g0.S(list);
        S.add(0, new Object());
        this.f18884k.invoke(jVar.a(S));
    }
}
