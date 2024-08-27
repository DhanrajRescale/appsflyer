package xe;

import com.assetgro.stockgro.data.model.ChampionDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        ChampionDto oldItem = (ChampionDto) obj;
        ChampionDto newItem = (ChampionDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getUuid(), newItem.getUuid()) && Intrinsics.a(oldItem.getDisplayName(), newItem.getDisplayName()) && Intrinsics.a(oldItem.getDisplayPicture(), newItem.getDisplayPicture()) && Intrinsics.a(oldItem.getPoints(), newItem.getPoints()) && Intrinsics.a(oldItem.getGameStats(), newItem.getGameStats()) && Intrinsics.a(oldItem.getProfits(), newItem.getProfits())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        ChampionDto oldItem = (ChampionDto) obj;
        ChampionDto newItem = (ChampionDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUuid(), newItem.getUuid());
    }
}
