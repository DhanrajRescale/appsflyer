package pg;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f31045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f31047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(g1 g1Var, Context context, l3 l3Var, int i10) {
        super(2);
        this.f31044a = i10;
        this.f31045b = g1Var;
        this.f31046c = context;
        this.f31047d = l3Var;
    }

    public final void a(t0.n nVar, int i10) {
        to.e eVar = t0.m.f35080a;
        int i11 = this.f31044a;
        Context context = this.f31046c;
        l3 l3Var = this.f31047d;
        g1 g1Var = this.f31045b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(1074711025);
                Object Q = rVar2.Q();
                if (Q == eVar) {
                    Q = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 22, rVar2);
                }
                rVar2.s(false);
                y2.m.b((Function1) Q, null, new j(g1Var, context, l3Var, 0), rVar2, 6, 2);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(1074827473);
                Object Q2 = rVar4.Q();
                if (Q2 == eVar) {
                    Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 24, rVar4);
                }
                rVar4.s(false);
                y2.m.b((Function1) Q2, null, new j(g1Var, context, l3Var, 1), rVar4, 6, 2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f31044a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
