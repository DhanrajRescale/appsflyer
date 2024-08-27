package o0;

import a2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f29342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(k kVar, int i10) {
        super(1);
        this.f29341a = i10;
        this.f29342b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f29341a;
        k kVar = this.f29342b;
        switch (i10) {
            case 0:
                u G = ((u) obj).G();
                Intrinsics.c(G);
                long q10 = G.q();
                long g10 = G.g(m1.c.f27233b);
                long j10 = hl.f.j(ku.c.b(m1.c.d(g10)), ku.c.b(m1.c.e(g10)));
                int i11 = w2.h.f38792c;
                int i12 = (int) (j10 >> 32);
                int i13 = (int) (j10 & 4294967295L);
                kVar.f29361o.setValue(new w2.i(i12, i13, ((int) (q10 >> 32)) + i12, ((int) (q10 & 4294967295L)) + i13));
                kVar.i();
                return Unit.f23355a;
            default:
                kVar.f29362p.setValue(new w2.j(((w2.j) obj).f38798a));
                kVar.i();
                return Unit.f23355a;
        }
    }
}
