package cd;

import com.assetgro.stockgro.data.model.PrizeDistributionDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i f8116b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f8117c = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f8118a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8118a) {
            case 0:
                ArenaGame arenaGame = (ArenaGame) obj;
                if (arenaGame.getPriceModel() != null) {
                    boolean winCash = arenaGame.getWinCash();
                    Iterator<T> it = arenaGame.getPriceModel().iterator();
                    while (it.hasNext()) {
                        ((PrizeDistributionDto) it.next()).setWinCash(Boolean.valueOf(winCash));
                    }
                    return arenaGame.getPriceModel();
                }
                return new ArrayList();
            default:
                List<String> leagueRules = ((ArenaGame) obj).getLeagueRules();
                if (leagueRules == null) {
                    return new ArrayList();
                }
                return leagueRules;
        }
    }
}
