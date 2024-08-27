package yb;

import j2.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f41434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.j f41435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f41437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f41438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f41439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e0 e0Var, w2.j jVar, int i10, g1 g1Var, String str, g1 g1Var2, yt.a aVar) {
        super(2, aVar);
        this.f41434a = e0Var;
        this.f41435b = jVar;
        this.f41436c = i10;
        this.f41437d = g1Var;
        this.f41438e = str;
        this.f41439f = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f41434a, this.f41435b, this.f41436c, this.f41437d, this.f41438e, this.f41439f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        w2.j jVar;
        m1.c cVar;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        e0 e0Var = this.f41434a;
        if (e0Var != null && (jVar = this.f41435b) != null) {
            int i10 = this.f41436c;
            int i11 = i10 - 1;
            if (i10 == e0Var.f20704b.f20735f && e0Var.p(i11)) {
                boolean z10 = true;
                int e10 = e0Var.e(i11, true) + 1;
                do {
                    e10--;
                } while (e0Var.c(e10).f27239a > ((int) (e0Var.f20705c >> 32)) - ((int) (jVar.f38798a >> 32)));
                m1.d c10 = e0Var.c(e10);
                float f10 = (int) (jVar.f38798a >> 32);
                float f11 = c10.f27241c;
                if (f10 + f11 > ((int) (e0Var.f20705c >> 32))) {
                    z10 = false;
                }
                float f12 = c10.f27242d;
                if (z10) {
                    cVar = new m1.c(t0.t.g(f11, f12 - ((int) (r4 & 4294967295L))));
                } else {
                    cVar = new m1.c(t0.t.g(s0.g.f34069a, f12));
                }
                this.f41437d.setValue(cVar);
                String substring = this.f41438e.substring(0, e10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                this.f41439f.setValue(substring);
            }
        }
        return Unit.f23355a;
    }
}
