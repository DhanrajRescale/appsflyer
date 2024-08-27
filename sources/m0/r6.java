package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r6 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(int i10, long j10, b0.h1 h1Var, Object obj) {
        super(2);
        this.f26741a = i10;
        this.f26742b = j10;
        this.f26743c = h1Var;
        this.f26744d = obj;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26741a;
        int i12 = 1;
        Object obj = this.f26744d;
        Object obj2 = this.f26743c;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                b0.i1 i1Var = m0.f26467a;
                f1 c10 = m0.c(this.f26742b, nVar, 5);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1915443430);
                a3.a.u(obj2);
                boolean j10 = rVar2.j(null);
                a3.a.u(obj2);
                Object Q = rVar2.Q();
                if (j10 || Q == t0.m.f35080a) {
                    Q = new g6(1);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                pp.b.l((Function0) Q, c10, b1.d.b(rVar2, -929149933, new q6((String) obj, 0)), rVar2, 382);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                al.d.o(this.f26742b, ((r0.o3) ((t0.r) nVar).m(r0.p3.f32672a)).f32661m, b1.d.b(nVar, 1327513942, new r0.c(i12, (b0.h1) obj2, (hu.c) obj)), nVar, 384);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26741a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
