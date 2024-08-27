package yc;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioViewModel f41518b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(LeaguePortfolioViewModel leaguePortfolioViewModel, int i10) {
        super(1);
        this.f41517a = i10;
        this.f41518b = leaguePortfolioViewModel;
    }

    public final Boolean a(UnifiedPortfolio unifiedPortfolio) {
        String str;
        boolean a10;
        boolean z10;
        int i10;
        ArenaGame arenaGame;
        f fVar;
        int i11 = this.f41517a;
        LeaguePortfolioViewModel leaguePortfolioViewModel = this.f41518b;
        switch (i11) {
            case 2:
                ArenaGame arenaGame2 = (ArenaGame) leaguePortfolioViewModel.f9000o.getValue();
                if (arenaGame2 != null) {
                    str = arenaGame2.getStatus();
                } else {
                    str = null;
                }
                if (Intrinsics.a(str, "C")) {
                    a10 = true;
                } else {
                    a10 = Intrinsics.a(str, "W");
                }
                return Boolean.valueOf(!a10);
            default:
                ij.h hVar = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getRealizedPNL()) == 0.0d && ij.h.c(unifiedPortfolio.getPortfolioValue().getUnrealizedPNL()) == 0.0d && ij.h.c(unifiedPortfolio.getPortfolioValue().getPendingOrderAmount()) == 0.0d) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                LeagueStatus leagueStatus = leaguePortfolioViewModel.C;
                if (leagueStatus == null) {
                    i10 = -1;
                } else {
                    i10 = l.f41519a[leagueStatus.ordinal()];
                }
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    boolean z11 = !unifiedPortfolio.isPortfolioEmpty();
                    e0 e0Var = leaguePortfolioViewModel.f9008w;
                    if (z11) {
                        e0Var.postValue(f.f41504a);
                    } else if (!z11 && (arenaGame = (ArenaGame) leaguePortfolioViewModel.f9000o.getValue()) != null) {
                        String assetClass = arenaGame.getAssetClass();
                        if (Intrinsics.a(assetClass, "EQUITY")) {
                            fVar = f.f41505b;
                        } else if (Intrinsics.a(assetClass, "OPTIONS")) {
                            fVar = f.f41506c;
                        } else {
                            fVar = f.f41505b;
                        }
                        e0Var.postValue(fVar);
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i10 = this.f41517a;
        LeaguePortfolioViewModel leaguePortfolioViewModel = this.f41518b;
        switch (i10) {
            case 0:
                ArenaGame arenaGame = (ArenaGame) leaguePortfolioViewModel.f9000o.getValue();
                if (arenaGame != null) {
                    str = arenaGame.getStatus();
                } else {
                    str = null;
                }
                if (!Intrinsics.a(str, "C")) {
                    Intrinsics.a(str, "W");
                }
                return Integer.valueOf(R.string.total_turnover);
            case 1:
                leaguePortfolioViewModel.h();
                return Unit.f23355a;
            case 2:
                return a((UnifiedPortfolio) obj);
            default:
                return a((UnifiedPortfolio) obj);
        }
    }
}
