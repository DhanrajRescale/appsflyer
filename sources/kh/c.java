package kh;

import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(0);
        this.f23115a = i10;
        this.f23116b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f23115a;
        d dVar = this.f23116b;
        switch (i10) {
            case 0:
                androidx.fragment.app.g0 parentFragment = dVar.getParentFragment();
                Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.statistics.LeagueStatisticsFragment");
                return (UserStatisticsViewModel) ((g) parentFragment).r();
            default:
                dVar.dismiss();
                return Unit.f23355a;
        }
    }
}
