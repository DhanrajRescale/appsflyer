package mb;

import g1.l;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class b extends k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f27697b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f27698c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(3);
        this.f27699a = i10;
    }

    public final void a(c0.c item, n nVar, int i10) {
        l lVar = l.f16404b;
        switch (this.f27699a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, j.R(16, nVar)), nVar);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, j.R(16, nVar)), nVar);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f27699a) {
            case 0:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
