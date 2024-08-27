package va;

import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.jvm.internal.Intrinsics;
import qj.h;
import qj.i;
import qj.o0;

/* loaded from: classes.dex */
public final class b implements o0, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd.b f37818b;

    public /* synthetic */ b(gd.b bVar, int i10) {
        this.f37817a = i10;
        this.f37818b = bVar;
    }

    public void a(i option) {
        int i10 = this.f37817a;
        gd.b bVar = this.f37818b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(option, "option");
                ((LeagueDetailPostJoiningActivity) bVar).K().h(option);
                return;
            default:
                Intrinsics.checkNotNullParameter(option, "option");
                ((GroupDetailHostActivity) bVar).K().h(option);
                return;
        }
    }
}
