package lc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.h1;
import ba.t5;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.request.LeagueExitRequestDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.LeagueExitBottomSheetViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import gd.h;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import w.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llc/c;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/arena/LeagueExitBottomSheetViewModel;", "Lba/t5;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends h<LeagueExitBottomSheetViewModel, t5> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24519j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f24520i = ut.h.a(new b(this, 0));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(LeagueExitBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 10));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, LeagueExitBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueExitBottomSheetViewModel.class, "<this>", LeagueExitBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueExitBottomSheetViewModel leagueExitBottomSheetViewModel = (LeagueExitBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(leagueExitBottomSheetViewModel);
            this.f17270b = leagueExitBottomSheetViewModel;
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
        return R.layout.bottom_sheet_league_exit;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t5 t5Var = (t5) r();
        final int i10 = 0;
        t5Var.f6155s.setOnClickListener(new View.OnClickListener(this) { // from class: lc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f24516b;

            {
                this.f24516b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String gameId;
                int i11 = i10;
                c this$0 = this.f24516b;
                switch (i11) {
                    case 0:
                        int i12 = c.f24519j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = c.f24519j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        String text = this$0.getString(R.string.prep_zone_exit_success_toast);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        int length = text.length();
                        String str = null;
                        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (length != 0) {
                            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = context.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        }
                        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = (LeagueDetailPostJoiningViewModel) this$0.f24520i.getValue();
                        String exitReason = ((t5) this$0.r()).f6157u.getText().toString();
                        leagueDetailPostJoiningViewModel.getClass();
                        Intrinsics.checkNotNullParameter(exitReason, "exitReason");
                        if (leagueDetailPostJoiningViewModel.f8988p != null) {
                            leagueDetailPostJoiningViewModel.f9084g.setValue(Boolean.TRUE);
                            ArenaGame arenaGame = leagueDetailPostJoiningViewModel.f8988p;
                            if (arenaGame != null && (gameId = arenaGame.getGameId()) != null) {
                                str2 = gameId;
                            }
                            ArenaGame arenaGame2 = leagueDetailPostJoiningViewModel.f8988p;
                            if (arenaGame2 != null) {
                                str = arenaGame2.getAssetClass();
                            }
                            nt.h c10 = leagueDetailPostJoiningViewModel.f8986n.exitLeague(new LeagueExitRequestDto(str2, exitReason, str)).c(((kq.e) leagueDetailPostJoiningViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(16, new yc.c(leagueDetailPostJoiningViewModel, 0)), new za.e(17, new yc.c(leagueDetailPostJoiningViewModel, 1)));
                            c10.a(dVar);
                            leagueDetailPostJoiningViewModel.f9080c.c(dVar);
                        }
                        this$0.dismiss();
                        return;
                }
            }
        });
        t5 t5Var2 = (t5) r();
        final int i11 = 1;
        t5Var2.f6156t.setOnClickListener(new View.OnClickListener(this) { // from class: lc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f24516b;

            {
                this.f24516b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String gameId;
                int i112 = i11;
                c this$0 = this.f24516b;
                switch (i112) {
                    case 0:
                        int i12 = c.f24519j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = c.f24519j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        String text = this$0.getString(R.string.prep_zone_exit_success_toast);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        int length = text.length();
                        String str = null;
                        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (length != 0) {
                            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = context.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        }
                        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = (LeagueDetailPostJoiningViewModel) this$0.f24520i.getValue();
                        String exitReason = ((t5) this$0.r()).f6157u.getText().toString();
                        leagueDetailPostJoiningViewModel.getClass();
                        Intrinsics.checkNotNullParameter(exitReason, "exitReason");
                        if (leagueDetailPostJoiningViewModel.f8988p != null) {
                            leagueDetailPostJoiningViewModel.f9084g.setValue(Boolean.TRUE);
                            ArenaGame arenaGame = leagueDetailPostJoiningViewModel.f8988p;
                            if (arenaGame != null && (gameId = arenaGame.getGameId()) != null) {
                                str2 = gameId;
                            }
                            ArenaGame arenaGame2 = leagueDetailPostJoiningViewModel.f8988p;
                            if (arenaGame2 != null) {
                                str = arenaGame2.getAssetClass();
                            }
                            nt.h c10 = leagueDetailPostJoiningViewModel.f8986n.exitLeague(new LeagueExitRequestDto(str2, exitReason, str)).c(((kq.e) leagueDetailPostJoiningViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(16, new yc.c(leagueDetailPostJoiningViewModel, 0)), new za.e(17, new yc.c(leagueDetailPostJoiningViewModel, 1)));
                            c10.a(dVar);
                            leagueDetailPostJoiningViewModel.f9080c.c(dVar);
                        }
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
