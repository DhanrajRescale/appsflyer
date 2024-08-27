package c0;

import android.graphics.Typeface;
import com.assetgro.stockgro.data.model.GroupInfoInviteItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.s0;
import o2.t0;

/* loaded from: classes.dex */
public final class i extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i10) {
        super(4);
        this.f7504a = i10;
        this.f7505b = obj;
    }

    public final void a(c items, int i10, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14 = this.f7504a;
        Object obj = this.f7505b;
        switch (i14) {
            case 0:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(items)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 |= i12;
                }
                if ((i11 & 131) == 130) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                ((hu.c) obj).b(items, nVar, Integer.valueOf(i11 & 14));
                return;
            default:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 112) == 0) {
                    if (((t0.r) nVar).f(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                if ((i11 & 721) == 144) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                GroupInfoInviteItem groupInfoInviteItem = (GroupInfoInviteItem) ((h7.b) obj).a(i10);
                if (groupInfoInviteItem != null) {
                    kp.j.m(groupInfoInviteItem, nVar, 0);
                    return;
                }
                return;
        }
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f7504a) {
            case 0:
                a((c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 1:
                int i10 = ((o2.z) obj3).f29542a;
                int i11 = ((o2.a0) obj4).f29453a;
                r2.c cVar = (r2.c) this.f7505b;
                t0 b10 = ((o2.t) cVar.f33030e).b((o2.s) obj, (o2.d0) obj2, i10, i11);
                if (!(b10 instanceof s0)) {
                    h.c cVar2 = new h.c(b10, cVar.f33035j);
                    cVar.f33035j = cVar2;
                    Object obj5 = cVar2.f17585d;
                    Intrinsics.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                Object value = b10.getValue();
                Intrinsics.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            default:
                a((c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
