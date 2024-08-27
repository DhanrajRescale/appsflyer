package sc;

import androidx.fragment.app.g0;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f34568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f34567a = i10;
        this.f34568b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f34567a;
        k kVar = this.f34568b;
        switch (i10) {
            case 0:
                g0 parentFragment = kVar.getParentFragment();
                Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.asset.v2.upcoming.host.ArenaUpcomingHostFragment");
                return (ArenaUpcomingViewModel) ((i) parentFragment).r();
            default:
                kVar.dismiss();
                return Unit.f23355a;
        }
    }
}
