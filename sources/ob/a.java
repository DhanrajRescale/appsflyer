package ob;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29878b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f29879c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f29880a = i10;
    }

    public final void a(c0.c item, n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f29880a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(32, nVar)), nVar);
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
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(66, nVar)), nVar);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f29880a) {
            case 0:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
