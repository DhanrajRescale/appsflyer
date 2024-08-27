package a2;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f54b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f55c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f56d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f57e;

    public /* synthetic */ e0(n0 n0Var, i0 i0Var, int i10, n0 n0Var2, int i11) {
        this.f53a = i11;
        this.f55c = i0Var;
        this.f56d = i10;
        this.f57e = n0Var2;
        this.f54b = n0Var;
    }

    @Override // a2.n0
    public final int a() {
        int i10 = this.f53a;
        n0 n0Var = this.f54b;
        switch (i10) {
            case 0:
                return n0Var.a();
            default:
                return n0Var.a();
        }
    }

    @Override // a2.n0
    public final int b() {
        int i10 = this.f53a;
        n0 n0Var = this.f54b;
        switch (i10) {
            case 0:
                return n0Var.b();
            default:
                return n0Var.b();
        }
    }

    @Override // a2.n0
    public final Map c() {
        int i10 = this.f53a;
        n0 n0Var = this.f54b;
        switch (i10) {
            case 0:
                return n0Var.c();
            default:
                return n0Var.c();
        }
    }

    @Override // a2.n0
    public final void d() {
        int i10 = this.f53a;
        n0 n0Var = this.f57e;
        int i11 = this.f56d;
        i0 i0Var = this.f55c;
        switch (i10) {
            case 0:
                i0Var.f74e = i11;
                n0Var.d();
                Set entrySet = i0Var.f81l.entrySet();
                t.g0 predicate = new t.g0(i0Var, 27);
                Intrinsics.checkNotNullParameter(entrySet, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                vt.d0.o(entrySet, predicate, true);
                return;
            default:
                i0Var.f73d = i11;
                n0Var.d();
                i0Var.c(i0Var.f73d);
                return;
        }
    }

    @Override // a2.n0
    public final Function1 e() {
        int i10 = this.f53a;
        n0 n0Var = this.f54b;
        switch (i10) {
            case 0:
                return n0Var.e();
            default:
                return n0Var.e();
        }
    }
}
