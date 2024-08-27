package m0;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class q7 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(int i10, int i11) {
        super(3);
        this.f26684a = i11;
        this.f26685b = i10;
    }

    public final void a(List list, t0.n nVar) {
        int i10 = 1;
        d2.s sVar = d2.s.f13613k;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f26684a;
        int i12 = this.f26685b;
        switch (i11) {
            case 0:
                p7.f26651a.b(t0.t.H(lVar, sVar, new q6((n7) list.get(i12), i10)), s0.g.f34069a, 0L, nVar, 3072, 6);
                return;
            case 1:
                p7.f26651a.b(t0.t.H(lVar, sVar, new q6((n7) list.get(i12), i10)), s0.g.f34069a, 0L, nVar, 3072, 6);
                return;
            default:
                r0.h3.f32434a.a(t0.t.H(lVar, sVar, new r0.g3((r0.e3) list.get(i12))), s0.g.f34069a, 0L, nVar, 3072, 6);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f26684a) {
            case 0:
                ((Number) obj3).intValue();
                a((List) obj, (t0.n) obj2);
                return Unit.f23355a;
            case 1:
                ((Number) obj3).intValue();
                a((List) obj, (t0.n) obj2);
                return Unit.f23355a;
            default:
                ((Number) obj3).intValue();
                a((List) obj, (t0.n) obj2);
                return Unit.f23355a;
        }
    }
}
