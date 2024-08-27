package a2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f42c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f43d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f44e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f45f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f46g;

    public c0(int i10, int i11, Map map, d0 d0Var, i0 i0Var, Function1 function1) {
        this.f40a = i10;
        this.f41b = i11;
        this.f42c = map;
        this.f44e = d0Var;
        this.f45f = i0Var;
        this.f46g = function1;
    }

    @Override // a2.n0
    public final int a() {
        return this.f41b;
    }

    @Override // a2.n0
    public final int b() {
        return this.f40a;
    }

    @Override // a2.n0
    public final Map c() {
        return this.f42c;
    }

    @Override // a2.n0
    public final void d() {
        c2.v0 v0Var;
        boolean a02 = this.f44e.a0();
        Function1 function1 = this.f46g;
        i0 i0Var = this.f45f;
        if (a02 && (v0Var = i0Var.f70a.f1422w.f7655b.J) != null) {
            function1.invoke(v0Var.f7853h);
        } else {
            function1.invoke(i0Var.f70a.f1422w.f7655b.f7853h);
        }
    }

    @Override // a2.n0
    public final Function1 e() {
        return this.f43d;
    }
}
