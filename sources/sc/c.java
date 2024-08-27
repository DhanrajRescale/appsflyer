package sc;

import android.util.Log;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba.sf;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import g7.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rc.l;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f34550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i iVar, int i10) {
        super(1);
        this.f34549a = i10;
        this.f34550b = iVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f34549a;
        i iVar = this.f34550b;
        switch (i10) {
            case 0:
                sf sfVar = (sf) iVar.q();
                Intrinsics.c(bool);
                sfVar.f6081x.setRefreshing(bool.booleanValue());
                return;
            case 1:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    if (!kj.a.f23207b) {
                        PrepZoneWhatsNewWidget whatsNewPrepzone = ((sf) iVar.q()).f6082y;
                        Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone, "whatsNewPrepzone");
                        zq.f.m0(whatsNewPrepzone);
                    }
                    LinearLayout noMyLeagueContainer = ((sf) iVar.q()).f6078u;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer, "noMyLeagueContainer");
                    zq.f.m0(noMyLeagueContainer);
                    RecyclerView rvArenaUpcomingRecycler = ((sf) iVar.q()).f6079v;
                    Intrinsics.checkNotNullExpressionValue(rvArenaUpcomingRecycler, "rvArenaUpcomingRecycler");
                    zq.f.M(rvArenaUpcomingRecycler);
                } else {
                    PrepZoneWhatsNewWidget whatsNewPrepzone2 = ((sf) iVar.q()).f6082y;
                    Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone2, "whatsNewPrepzone");
                    zq.f.M(whatsNewPrepzone2);
                    LinearLayout noMyLeagueContainer2 = ((sf) iVar.q()).f6078u;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer2, "noMyLeagueContainer");
                    zq.f.M(noMyLeagueContainer2);
                    RecyclerView rvArenaUpcomingRecycler2 = ((sf) iVar.q()).f6079v;
                    Intrinsics.checkNotNullExpressionValue(rvArenaUpcomingRecycler2, "rvArenaUpcomingRecycler");
                    zq.f.m0(rvArenaUpcomingRecycler2);
                }
                ((ArenaUpcomingViewModel) iVar.r()).f9084g.postValue(Boolean.FALSE);
                return;
            default:
                l lVar = iVar.f34564g;
                if (lVar != null) {
                    g7.i iVar2 = lVar.f16767e.f16903f;
                    iVar2.getClass();
                    if (Log.isLoggable("Paging", 3)) {
                        Intrinsics.checkNotNullParameter("Refresh signal received", "message");
                        Log.d("Paging", "Refresh signal received", null);
                    }
                    t4 t4Var = iVar2.f16983c;
                    if (t4Var != null) {
                        t4Var.k();
                        return;
                    }
                    return;
                }
                Intrinsics.k("arenaUpcomingMiddleLayerAdapter");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f34549a;
        i iVar = this.f34550b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                ((ArenaUpcomingViewModel) iVar.r()).h();
                return Unit.f23355a;
            default:
                ((sf) iVar.q()).f6079v.l0(0);
                return Unit.f23355a;
        }
    }
}
