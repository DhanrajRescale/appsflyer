package pc;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ba.j7;
import com.assetgro.stockgro.data.model.arenaV2.ArenaAllData;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oc.n;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i10) {
        super(1);
        this.f30837a = i10;
        this.f30838b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f30837a;
        f fVar = this.f30838b;
        switch (i10) {
            case 0:
                ArenaAllData arenaAllData = (ArenaAllData) obj;
                ((j7) fVar.q()).f5111s.setRefreshing(false);
                List<ArenaSection> arenaSections = arenaAllData.getArenaSections();
                Intrinsics.checkNotNullParameter(arenaSections, "<set-?>");
                fVar.f30843h = arenaSections;
                if (arenaAllData.getArenaSections().isEmpty()) {
                    LinearLayout noMyLeagueContainer = ((j7) fVar.q()).f5112t;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer, "noMyLeagueContainer");
                    zq.f.m0(noMyLeagueContainer);
                } else {
                    LinearLayout noMyLeagueContainer2 = ((j7) fVar.q()).f5112t;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer2, "noMyLeagueContainer");
                    zq.f.M(noMyLeagueContainer2);
                    n nVar = fVar.f30842g;
                    if (nVar != null) {
                        List<ArenaSection> arenaSections2 = arenaAllData.getArenaSections();
                        Intrinsics.d(arenaSections2, "null cannot be cast to non-null type java.util.ArrayList<com.assetgro.stockgro.data.model.arenaV2.ArenaSection>{ kotlin.collections.TypeAliasesKt.ArrayList<com.assetgro.stockgro.data.model.arenaV2.ArenaSection> }");
                        nVar.u((ArrayList) arenaSections2);
                    } else {
                        Intrinsics.k("arenaMyLeaguesMiddleLayerAdapter");
                        throw null;
                    }
                }
                return Unit.f23355a;
            case 1:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ProgressBar progressBar = ((j7) fVar.q()).f5113u;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    zq.f.m0(progressBar);
                } else {
                    ProgressBar progressBar2 = ((j7) fVar.q()).f5113u;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    zq.f.M(progressBar2);
                }
                return Unit.f23355a;
            default:
                ((j7) fVar.q()).f5114v.l0(0);
                return Unit.f23355a;
        }
    }
}
