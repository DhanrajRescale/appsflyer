package rc;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import java.util.ArrayList;
import java.util.List;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: b, reason: collision with root package name */
    public final List f33584b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33585c;

    public b(ArrayList oldGames, ArrayList newGames) {
        Intrinsics.checkNotNullParameter(oldGames, "oldGames");
        Intrinsics.checkNotNullParameter(newGames, "newGames");
        this.f33584b = oldGames;
        this.f33585c = newGames;
    }

    @Override // k7.w
    public final boolean a(int i10, int i11) {
        return Intrinsics.a(this.f33584b.get(i10), this.f33585c.get(i10));
    }

    @Override // k7.w
    public final boolean c(int i10, int i11) {
        return Intrinsics.a(((ArenaGame) this.f33584b.get(i10)).getGameId(), ((ArenaGame) this.f33585c.get(i11)).getGameId());
    }

    @Override // k7.w
    public final int g() {
        return this.f33585c.size();
    }

    @Override // k7.w
    public final int h() {
        return this.f33584b.size();
    }
}
