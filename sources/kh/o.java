package kh;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.mp;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.UnfollowBottomSheetViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkh/o;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/profile/statistics/UnfollowBottomSheetViewModel;", "Lba/mp;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends gd.h<UnfollowBottomSheetViewModel, mp> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f23162j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f23163i = ut.h.a(new ag.b(this, 16));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        ea.f0 f0Var = (ea.f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(iu.a0.a(UnfollowBottomSheetViewModel.class), new ea.b0(schedulerProvider, compositeDisposable, 0));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, UnfollowBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UnfollowBottomSheetViewModel.class, "<this>", UnfollowBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UnfollowBottomSheetViewModel unfollowBottomSheetViewModel = (UnfollowBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(unfollowBottomSheetViewModel);
            this.f17270b = unfollowBottomSheetViewModel;
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
        return R.layout.fragment_unfollow_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        mp mpVar = (mp) r();
        final int i10 = 0;
        mpVar.f5492s.setOnClickListener(new View.OnClickListener(this) { // from class: kh.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f23161b;

            {
                this.f23161b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                o this$0 = this.f23161b;
                switch (i11) {
                    case 0:
                        int i12 = o.f23162j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = o.f23162j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) this$0.f23163i.getValue();
                        String uuid = ((UserStatisticsViewModel) this$0.f23163i.getValue()).f10054q;
                        userStatisticsViewModel.getClass();
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            userStatisticsViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                        } else {
                            userStatisticsViewModel.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(userStatisticsViewModel), null, null, new g0(userStatisticsViewModel, uuid, null), 3);
                        }
                        this$0.dismiss();
                        return;
                }
            }
        });
        mp mpVar2 = (mp) r();
        String string = getString(R.string.unfollow_with_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i11 = 1;
        Object[] objArr = new Object[1];
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("USER_NAME");
        } else {
            str = null;
        }
        objArr[0] = str;
        String format = String.format(string, Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        mpVar2.f5494u.setText(format);
        mp mpVar3 = (mp) r();
        mpVar3.f5493t.setOnClickListener(new View.OnClickListener(this) { // from class: kh.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f23161b;

            {
                this.f23161b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                o this$0 = this.f23161b;
                switch (i112) {
                    case 0:
                        int i12 = o.f23162j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = o.f23162j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) this$0.f23163i.getValue();
                        String uuid = ((UserStatisticsViewModel) this$0.f23163i.getValue()).f10054q;
                        userStatisticsViewModel.getClass();
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            userStatisticsViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                        } else {
                            userStatisticsViewModel.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(userStatisticsViewModel), null, null, new g0(userStatisticsViewModel, uuid, null), 3);
                        }
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
