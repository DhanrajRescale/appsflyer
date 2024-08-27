package sc;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.mn;
import com.assetgro.stockgro.data.model.arenaV2.Option;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.host.SortByBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import y.q0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lsc/k;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/arena/asset/v2/upcoming/host/SortByBottomSheetViewModel;", "Lba/mn;", "<init>", "()V", "sb/b", "Lcom/assetgro/stockgro/data/model/arenaV2/Option;", "selectedChoice", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends gd.h<SortByBottomSheetViewModel, mn> {

    /* renamed from: j, reason: collision with root package name */
    public static String f34569j = "Start Time";

    /* renamed from: k, reason: collision with root package name */
    public static String f34570k = "Start Time";

    /* renamed from: l, reason: collision with root package name */
    public static Option f34571l;

    /* renamed from: m, reason: collision with root package name */
    public static Option f34572m;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f34573i = ut.h.a(new j(this, 0));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(SortByBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 16));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, SortByBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SortByBottomSheetViewModel.class, "<this>", SortByBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SortByBottomSheetViewModel sortByBottomSheetViewModel = (SortByBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(sortByBottomSheetViewModel);
            this.f17270b = sortByBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_sort_by_bottom_sheet_dialog;
    }

    @Override // gd.h
    public final void z(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("ASSET_CLASS_TYPE");
        } else {
            str = null;
        }
        mn mnVar = (mn) r();
        q0 q0Var = new q0(18, this, str);
        Object obj = b1.d.f3079a;
        mnVar.f5488s.setContent(new b1.c(q0Var, true, -764555567));
    }
}
