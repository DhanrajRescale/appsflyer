package pd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f30902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(g1.o oVar, String str, int i10) {
        super(3);
        this.f30901a = i10;
        this.f30902b = oVar;
        this.f30903c = str;
    }

    public final void a(c0.c item, t0.n nVar, int i10) {
        int i11 = this.f30901a;
        String str = this.f30903c;
        g1.o oVar = this.f30902b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                yk.j.r(oVar, str, nVar, 0, 0);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                yk.j.r(oVar, str, nVar, 0, 0);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f30901a) {
            case 0:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
