package tj;

import g1.l;
import hu.d;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends k implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36130b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f36131c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f36132d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f36133e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f36134f = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36135a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(4);
        this.f36135a = i10;
    }

    public final void a(c0.c items, int i10, n nVar, int i11) {
        switch (this.f36135a) {
            case 0:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 641) == 128) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.h0(nVar, 0);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 641) == 128) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                dp.b.g0(nVar, 0);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 641) == 128) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                dp.b.g0(nVar, 0);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 641) == 128) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                al.d.y(null, nVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(l.f16404b, 8), nVar);
                return;
            default:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 641) == 128) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                dp.b.g0(nVar, 0);
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f36135a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 3:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
