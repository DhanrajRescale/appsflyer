package hc;

import c2.p0;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeFragment;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.r;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeFragment f18271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MissionsHomeFragment missionsHomeFragment, int i10) {
        super(2);
        this.f18270a = i10;
        this.f18271b = missionsHomeFragment;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f18270a;
        MissionsHomeFragment missionsHomeFragment = this.f18271b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.Z(g1.l.f16404b, (MissionsHomeViewModel) missionsHomeFragment.r(), new p0(missionsHomeFragment, 29), nVar, 70, 0);
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                dp.b.b0((MissionsHomeViewModel) missionsHomeFragment.r(), new g(missionsHomeFragment, 8), nVar, 8);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18270a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
