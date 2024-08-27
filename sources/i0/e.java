package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final e f18834b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f18835c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f18836d = new e(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(3);
        this.f18837a = i10;
    }

    public final void a(Function2 function2, t0.n nVar, int i10) {
        int i11 = 2;
        switch (this.f18837a) {
            case 1:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(function2)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                function2.invoke(nVar, Integer.valueOf(i10 & 14));
                return;
            case 2:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(function2)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                function2.invoke(nVar, Integer.valueOf(i10 & 14));
                return;
            case 3:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(function2)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                function2.invoke(nVar, Integer.valueOf(i10 & 14));
                return;
            case 4:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(function2)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                function2.invoke(nVar, Integer.valueOf(i10 & 14));
                return;
            default:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).j(function2)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                function2.invoke(nVar, Integer.valueOf(i10 & 14));
                return;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f18837a) {
            case 0:
                g1.o oVar = (g1.o) obj;
                ((Number) obj3).intValue();
                t0.r rVar = (t0.r) ((t0.n) obj2);
                rVar.b0(-2126899193);
                long j10 = ((l0.b1) rVar.m(l0.c1.f23727a)).f23717a;
                g1.l lVar = g1.l.f16404b;
                rVar.b0(-216256930);
                boolean g10 = rVar.g(j10);
                Object Q = rVar.Q();
                int i10 = 0;
                if (g10 || Q == t0.m.f35080a) {
                    Q = new d(i10, j10);
                    rVar.k0(Q);
                }
                rVar.s(false);
                g1.o g11 = oVar.g(androidx.compose.ui.draw.a.e(lVar, (Function1) Q));
                rVar.s(false);
                return g11;
            case 1:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 4:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((Function2) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
