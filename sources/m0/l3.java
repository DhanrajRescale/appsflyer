package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(long j10, Function2 function2, int i10) {
        super(2);
        this.f26446a = i10;
        this.f26447b = j10;
        this.f26448c = function2;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = 2;
        switch (this.f26446a) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.p(d1.f26028a.b(Float.valueOf(n1.t.e(this.f26447b))), b1.d.b(nVar, 1867794295, new g0(this.f26448c, i11)), nVar, 48);
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                m8.b(this.f26447b, null, null, this.f26448c, nVar, 0, 6);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                m8.b(this.f26447b, null, null, this.f26448c, nVar, 0, 6);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26446a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
