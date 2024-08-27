package pc;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.lifecycle.u0;
import b3.t;
import ba.j7;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import oc.j;
import oc.k;
import oc.n;
import vt.i0;
import yk.g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpc/f;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/asset/v2/myleagues/viewmodel/ArenaMyLeaguesViewModel;", "Lba/j7;", "Loc/d;", "Loc/e;", "Loc/c;", "Loc/k;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends m<ArenaMyLeaguesViewModel, j7> implements oc.d, oc.e, oc.c, k {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f30841j = 0;

    /* renamed from: g, reason: collision with root package name */
    public n f30842g;

    /* renamed from: h, reason: collision with root package name */
    public List f30843h = i0.f38321a;

    /* renamed from: i, reason: collision with root package name */
    public MainSharedViewModel f30844i;

    @Override // gd.m
    public final int C() {
        return R.layout.cell_arena_myleagues_recycler;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ArenaMyLeaguesViewModel) r()).f8951p.observe(this, new eb.c(12, new c(this, 0)));
        ((ArenaMyLeaguesViewModel) r()).f8952q.observe(this, new eb.c(12, d.f30839a));
        ((ArenaMyLeaguesViewModel) r()).f8956u.observe(this, new eb.c(12, new e(this)));
        ((ArenaMyLeaguesViewModel) r()).f9084g.observe(this, new eb.c(12, new c(this, 1)));
        MainSharedViewModel mainSharedViewModel = this.f30844i;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.C.observe(this, new eb.c(12, new c(this, 2)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("arg_asset_class");
        } else {
            str = null;
        }
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = (ArenaMyLeaguesViewModel) r();
        if (str == null) {
            str = "ALL";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        arenaMyLeaguesViewModel.f8954s = str;
        this.f30842g = new n(((ArenaMyLeaguesViewModel) r()).f8954s, this, this, this, this);
        j7 j7Var = (j7) q();
        n nVar = this.f30842g;
        if (nVar != null) {
            j7Var.f5114v.setAdapter(nVar);
            ((j7) q()).f5111s.setOnRefreshListener(new t(this, 27));
            return;
        }
        Intrinsics.k("arenaMyLeaguesMiddleLayerAdapter");
        throw null;
    }

    @Override // oc.d
    public final void g(ArenaGame arenaGame, int i10) {
        g0 parentFragment = getParentFragment();
        Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.asset.v2.myleagues.host.ArenaMyLeaguesHostFragment");
        ((j) parentFragment).g(arenaGame, i10);
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        fd.c cVar = ((ArenaMyLeaguesViewModel) r()).f8953r;
        if (cVar != null) {
            cVar.a();
        } else {
            Intrinsics.k("timer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = (ArenaMyLeaguesViewModel) r();
        arenaMyLeaguesViewModel.f9084g.postValue(Boolean.TRUE);
        fd.c cVar = arenaMyLeaguesViewModel.f8953r;
        if (cVar != null) {
            cVar.a();
            g.H(u0.f(arenaMyLeaguesViewModel), null, null, new qc.f(arenaMyLeaguesViewModel, null), 3);
        } else {
            Intrinsics.k("timer");
            throw null;
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.a();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        g.i(h10);
        this.f17287e = h10;
        this.f30844i = fragmentComponent.f();
    }
}
