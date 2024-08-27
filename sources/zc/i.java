package zc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.ij;
import ba.l9;
import ba.yr;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.WinnersDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzc/i;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/LeagueLeaderBoardViewModel;", "Lba/ij;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends gd.m<LeagueLeaderBoardViewModel, ij> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f42383n = 0;

    /* renamed from: g, reason: collision with root package name */
    public yr f42384g;

    /* renamed from: h, reason: collision with root package name */
    public l9 f42385h;

    /* renamed from: i, reason: collision with root package name */
    public a f42386i;

    /* renamed from: j, reason: collision with root package name */
    public a f42387j;

    /* renamed from: k, reason: collision with root package name */
    public ad.a f42388k;

    /* renamed from: l, reason: collision with root package name */
    public MediaPlayer f42389l;

    /* renamed from: m, reason: collision with root package name */
    public LeagueSharedViewModel f42390m;

    public static final int H(i iVar, int i10) {
        iVar.getClass();
        if (i10 != 1) {
            if (i10 != 2) {
                return R.drawable.ic_third;
            }
            return R.drawable.ic_second;
        }
        return R.drawable.ic_first;
    }

    public static final void I(i iVar, ImageView imageView, String str) {
        iVar.getClass();
        nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(ak.p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
        Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
        ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.c(iVar.getContext()).e(iVar).m(str).w((nk.e) p10).i()).l(R.drawable.ic_placeholder_user)).z(imageView);
    }

    public static final void J(i iVar, WinnersDto winnersDto) {
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) iVar.r();
        String userId = winnersDto.getUserId();
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (!Intrinsics.a(userId, leagueLeaderBoardViewModel.f9081d.getCurrentUserId())) {
            Intent intent = new Intent(iVar.requireContext(), (Class<?>) UserProfileActivity.class);
            intent.putExtra("USER_IDENTIFIER", winnersDto.getUserId());
            intent.putExtra("USER_NAME", winnersDto.getDisplayName());
            iVar.startActivity(intent);
            return;
        }
        iVar.startActivity(new Intent(iVar.requireContext(), (Class<?>) MyProfileActivity.class));
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_leagues_leader_board;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        int i10 = 16;
        ((LeagueLeaderBoardViewModel) r()).f9084g.observe(this, new eb.c(16, new e(this, 8)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel.E.observe(this, new eb.c(16, new e(this, 17)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel2 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel2.C.observe(this, new eb.c(16, new e(this, 18)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel3 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel3.D.observe(this, new eb.c(16, new e(this, 19)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel4 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel4.F.observe(this, new eb.c(16, new e(this, 20)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel5 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel5.G.observe(this, new eb.c(16, new e(this, 21)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel6 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel6.H.observe(this, new eb.c(16, new e(this, 22)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel7 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel7.I.observe(this, new eb.c(16, new e(this, 23)));
        ((LeagueLeaderBoardViewModel) r()).f9023t.observe(this, new eb.c(16, new e(this, 24)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel8 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel8.L.observe(this, new eb.c(16, new e(this, 0)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel9 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel9.J.observe(this, new eb.c(16, new e(this, 1)));
        ((LeagueLeaderBoardViewModel) r()).K.observe(this, new eb.c(16, new e(this, 2)));
        ((LeagueLeaderBoardViewModel) r()).f9024u.observe(this, new eb.c(16, new e(this, 3)));
        ((LeagueLeaderBoardViewModel) r()).M.observe(this, new eb.c(16, new e(this, 4)));
        ((LeagueLeaderBoardViewModel) r()).N.observe(this, new eb.c(16, new e(this, 5)));
        ((LeagueLeaderBoardViewModel) r()).O.observe(this, new eb.c(16, new e(this, 6)));
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel10 = (LeagueLeaderBoardViewModel) r();
        leagueLeaderBoardViewModel10.Q.observe(this, new eb.c(16, f.f42366b));
        ((LeagueLeaderBoardViewModel) r()).f9020q.observe(this, new eb.c(16, new g(this)));
        ((LeagueLeaderBoardViewModel) r()).f9026w.observe(this, new eb.c(16, new e(this, 7)));
        ((LeagueLeaderBoardViewModel) r()).f9027x.observe(this, new eb.c(16, new e(this, 9)));
        ((LeagueLeaderBoardViewModel) r()).A.observe(this, new eb.c(16, new e(this, 10)));
        ((LeagueLeaderBoardViewModel) r()).B.observe(this, new eb.c(16, new e(this, 11)));
        LeagueSharedViewModel leagueSharedViewModel = this.f42390m;
        if (leagueSharedViewModel != null) {
            leagueSharedViewModel.f9063n.observe(this, new eb.c(16, new e(this, 12)));
            ((LeagueLeaderBoardViewModel) r()).f9025v.observe(this, new eb.c(16, new e(this, 13)));
            ((LeagueLeaderBoardViewModel) r()).P.observe(this, new eb.c(16, new e(this, 14)));
            ((LeagueLeaderBoardViewModel) r()).U.observe(this, new eb.c(16, new e(this, 15)));
            ((LeagueLeaderBoardViewModel) r()).S.observe(this, new eb.c(16, new e(this, i10)));
            return;
        }
        Intrinsics.k("leagueSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void E(View view) {
        ArenaGame arenaGame;
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        yr layoutLeagueWinner = ((ij) q()).B;
        Intrinsics.checkNotNullExpressionValue(layoutLeagueWinner, "layoutLeagueWinner");
        this.f42384g = layoutLeagueWinner;
        l9 cellLeagueDeclaredWinnerBoard = ((ij) q()).f5052v;
        Intrinsics.checkNotNullExpressionValue(cellLeagueDeclaredWinnerBoard, "cellLeagueDeclaredWinnerBoard");
        this.f42385h = cellLeagueDeclaredWinnerBoard;
        if (getActivity() instanceof LeagueDetailPostJoiningActivity) {
            j0 activity = getActivity();
            Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
            e0 e0Var = ((LeagueDetailPostJoiningViewModel) ((LeagueDetailPostJoiningActivity) activity).x()).f8997y;
            if (e0Var != null) {
                e0Var.observe(this, new eb.c(16, new e(this, 25)));
            }
        } else {
            ((LeagueLeaderBoardViewModel) r()).f9028y = LeagueStatus.LEAGUE_WINNER_NOT_DECLARED;
            ((LeagueLeaderBoardViewModel) r()).j(LeagueStatus.LEAGUE_WINNER_DECLARED);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arenaGame = (ArenaGame) arguments.getParcelable("LEAGUE");
        } else {
            arenaGame = null;
        }
        if (!(arenaGame instanceof ArenaGame)) {
            arenaGame = null;
        }
        if (arenaGame != null) {
            ((LeagueLeaderBoardViewModel) r()).f9021r.postValue(arenaGame);
            ((LeagueLeaderBoardViewModel) r()).f9029z = Boolean.valueOf(arenaGame.getWinCash());
            ((ij) q()).L.setOnRefreshListener(new androidx.fragment.app.g(15, this, arenaGame));
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f42386i = new a(lifecycle, new e(this, 26));
        androidx.lifecycle.o lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        this.f42387j = new a(lifecycle2, new e(this, 27));
        ij ijVar = (ij) q();
        a aVar = this.f42386i;
        if (aVar != null) {
            ijVar.F.setAdapter(aVar);
            ij ijVar2 = (ij) q();
            a aVar2 = this.f42387j;
            if (aVar2 != null) {
                ijVar2.f5054x.setAdapter(aVar2);
                androidx.lifecycle.o lifecycle3 = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle3, "<get-lifecycle>(...)");
                final int i10 = 0;
                if (arenaGame != null) {
                    z10 = arenaGame.getWinCash();
                } else {
                    z10 = false;
                }
                this.f42388k = new ad.a(lifecycle3, z10, new e(this, 28));
                ij ijVar3 = (ij) q();
                ad.a aVar3 = this.f42388k;
                if (aVar3 != null) {
                    ijVar3.P.setAdapter(aVar3);
                    ((ij) q()).f5050t.setItemSelectListener(new eb.f(this, 0));
                    ((ij) q()).I.a(new z7.c(this, 3));
                    ((ij) q()).f5053w.setOnClickListener(new c(0));
                    ((ij) q()).K.setOnClickListener(new View.OnClickListener(this) { // from class: zc.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f42363b;

                        {
                            this.f42363b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = i10;
                            i this$0 = this.f42363b;
                            switch (i11) {
                                case 0:
                                    int i12 = i.f42383n;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) this$0.r();
                                    leagueLeaderBoardViewModel.f9084g.postValue(Boolean.TRUE);
                                    yk.g.H(u0.f(leagueLeaderBoardViewModel), null, null, new q(leagueLeaderBoardViewModel, null), 3);
                                    this$0.z(new AnalyticEvent("app_completed_league_share_achievement", null, 2, null));
                                    return;
                                default:
                                    int i13 = i.f42383n;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    LeagueLeaderBoardViewModel leagueLeaderBoardViewModel2 = (LeagueLeaderBoardViewModel) this$0.r();
                                    TopLeaguesDto topLeaguesDto = (TopLeaguesDto) leagueLeaderBoardViewModel2.f9023t.getValue();
                                    if (topLeaguesDto != null && topLeaguesDto.getWinners() != null) {
                                        leagueLeaderBoardViewModel2.A.postValue(new kj.j(hl.f.y(new Pair("LEAGUE", leagueLeaderBoardViewModel2.f9021r.getValue()))));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    final int i11 = 1;
                    ((ij) q()).M.setOnClickListener(new View.OnClickListener(this) { // from class: zc.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i f42363b;

                        {
                            this.f42363b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i112 = i11;
                            i this$0 = this.f42363b;
                            switch (i112) {
                                case 0:
                                    int i12 = i.f42383n;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) this$0.r();
                                    leagueLeaderBoardViewModel.f9084g.postValue(Boolean.TRUE);
                                    yk.g.H(u0.f(leagueLeaderBoardViewModel), null, null, new q(leagueLeaderBoardViewModel, null), 3);
                                    this$0.z(new AnalyticEvent("app_completed_league_share_achievement", null, 2, null));
                                    return;
                                default:
                                    int i13 = i.f42383n;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    LeagueLeaderBoardViewModel leagueLeaderBoardViewModel2 = (LeagueLeaderBoardViewModel) this$0.r();
                                    TopLeaguesDto topLeaguesDto = (TopLeaguesDto) leagueLeaderBoardViewModel2.f9023t.getValue();
                                    if (topLeaguesDto != null && topLeaguesDto.getWinners() != null) {
                                        leagueLeaderBoardViewModel2.A.postValue(new kj.j(hl.f.y(new Pair("LEAGUE", leagueLeaderBoardViewModel2.f9021r.getValue()))));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                Intrinsics.k("leagueDeclaredWinnerAdapter");
                throw null;
            }
            Intrinsics.k("currentUserLeagueLeaderBoardAdapter");
            throw null;
        }
        Intrinsics.k("leagueLeaderBoardAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((LeagueLeaderBoardViewModel) r()).f9018o;
        if (eVar != null) {
            ft.b.b(eVar);
        }
        MediaPlayer mediaPlayer = this.f42389l;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) r();
        jt.e eVar = leagueLeaderBoardViewModel.f9018o;
        if (eVar != null) {
            ft.b.b(eVar);
        }
        mt.f g10 = new mt.c(at.e.a(5L, TimeUnit.SECONDS), new za.e(20, f.f42372h)).g(((kq.e) leagueLeaderBoardViewModel.f9079b).J());
        jt.e eVar2 = new jt.e(new za.e(21, new n(leagueLeaderBoardViewModel, 3)), gt.e.f17572d);
        g10.e(eVar2);
        leagueLeaderBoardViewModel.f9018o = eVar2;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ArenaRepository arenaRepository = bVar.a();
        yk.g.i(arenaRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(LeagueLeaderBoardViewModel.class), new ea.n(k10, c10, arenaRepository, userRepository, 3));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, LeagueLeaderBoardViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueLeaderBoardViewModel.class, "<this>", LeagueLeaderBoardViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(leagueLeaderBoardViewModel);
            this.f17284b = leagueLeaderBoardViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f42390m = fragmentComponent.e();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
