package ka;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu.z f22824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f22825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f22829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22830h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(iu.z zVar, qu.f0 f0Var, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, int i10) {
        super(1);
        this.f22823a = i10;
        this.f22824b = zVar;
        this.f22825c = f0Var;
        this.f22826d = g1Var;
        this.f22827e = g1Var2;
        this.f22828f = g1Var3;
        this.f22829g = g1Var4;
        this.f22830h = g1Var5;
    }

    public final t0.n0 a(t0.o0 DisposableEffect) {
        qu.f0 f0Var = this.f22825c;
        int i10 = this.f22823a;
        iu.z zVar = this.f22824b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var != null) {
                    o1Var.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new j(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(0, zVar);
            case 1:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var2 = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var2 != null) {
                    o1Var2.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new m(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(1, zVar);
            case 2:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var3 = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var3 != null) {
                    o1Var3.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new v(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(2, zVar);
            case 3:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var4 = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var4 != null) {
                    o1Var4.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new w(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(3, zVar);
            case 4:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var5 = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var5 != null) {
                    o1Var5.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new x(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(4, zVar);
            default:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var6 = (o1) ((g1) zVar.f20560a).getValue();
                if (o1Var6 != null) {
                    o1Var6.a(null);
                }
                ((g1) zVar.f20560a).setValue(yk.g.H(f0Var, null, null, new y(this.f22826d, this.f22827e, this.f22828f, this.f22829g, this.f22830h, null), 3));
                return new k(5, zVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f22823a) {
            case 0:
                return a((t0.o0) obj);
            case 1:
                return a((t0.o0) obj);
            case 2:
                return a((t0.o0) obj);
            case 3:
                return a((t0.o0) obj);
            case 4:
                return a((t0.o0) obj);
            default:
                return a((t0.o0) obj);
        }
    }
}
