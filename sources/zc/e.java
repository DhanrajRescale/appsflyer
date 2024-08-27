package zc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import ba.ij;
import ba.l9;
import ba.m1;
import ba.yr;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.CurrentUser;
import com.assetgro.stockgro.data.model.LeaderBoard;
import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.WinnersDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnersActivity;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f42365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, int i10) {
        super(1);
        this.f42364a = i10;
        this.f42365b = iVar;
    }

    public final void a(LeaderBoardUserDto it) {
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) iVar.r();
                String userId = it.getUserId();
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (Intrinsics.a(userId, leagueLeaderBoardViewModel.f9081d.getCurrentUserId())) {
                    iVar.startActivity(new Intent(iVar.getActivity(), (Class<?>) MyProfileActivity.class));
                    return;
                }
                Intent intent = new Intent(iVar.getActivity(), (Class<?>) UserProfileActivity.class);
                intent.putExtra("USER_IDENTIFIER", it.getUserId());
                intent.putExtra("USER_NAME", it.getName());
                iVar.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                LeagueLeaderBoardViewModel leagueLeaderBoardViewModel2 = (LeagueLeaderBoardViewModel) iVar.r();
                String userId2 = it.getUserId();
                Intrinsics.checkNotNullParameter(userId2, "userId");
                if (Intrinsics.a(userId2, leagueLeaderBoardViewModel2.f9081d.getCurrentUserId())) {
                    iVar.startActivity(new Intent(iVar.getActivity(), (Class<?>) MyProfileActivity.class));
                    return;
                }
                Intent intent2 = new Intent(iVar.getActivity(), (Class<?>) UserProfileActivity.class);
                intent2.putExtra("USER_IDENTIFIER", it.getUserId());
                intent2.putExtra("USER_NAME", it.getName());
                iVar.startActivity(intent2);
                return;
        }
    }

    public final void d(LeagueUnifiedResponseDto leagueUnifiedResponseDto) {
        LeaderBoard leaderBoard = null;
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 12:
                if (leagueUnifiedResponseDto != null) {
                    leaderBoard = leagueUnifiedResponseDto.getLeaderBoard();
                }
                ((LeagueLeaderBoardViewModel) iVar.r()).f9022s.postValue(leaderBoard);
                return;
            default:
                LeagueSharedViewModel leagueSharedViewModel = iVar.f42390m;
                if (leagueSharedViewModel != null) {
                    leagueSharedViewModel.f9063n.postValue(leagueUnifiedResponseDto);
                    return;
                } else {
                    Intrinsics.k("leagueSharedViewModel");
                    throw null;
                }
        }
    }

    public final void e(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 3:
                ij ijVar = (ij) iVar.q();
                Intrinsics.c(bool);
                ijVar.L.setEnabled(bool.booleanValue());
                return;
            case 4:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).O.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).O.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 5:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).A.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).A.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 6:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).J.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).J.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).G.setVisibility(0);
                    ((ij) iVar.q()).D.setVisibility(0);
                    ((ij) iVar.q()).H.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).G.setVisibility(8);
                        ((ij) iVar.q()).D.setVisibility(8);
                        ((ij) iVar.q()).H.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 8:
                ij ijVar2 = (ij) iVar.q();
                Intrinsics.c(bool);
                ijVar2.L.setRefreshing(bool.booleanValue());
                return;
            case 9:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = iVar.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = iVar.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            case 14:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).f5051u.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).f5051u.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 17:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).f5050t.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).f5050t.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 18:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((ij) iVar.q()).E.setVisibility(0);
                    ((ij) iVar.q()).C.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((ij) iVar.q()).E.setVisibility(8);
                        ((ij) iVar.q()).C.setVisibility(8);
                        ((ij) iVar.q()).f5049s.setVisibility(8);
                        return;
                    }
                    return;
                }
        }
    }

    public final void f(List list) {
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 1:
                Intrinsics.c(list);
                if (!list.isEmpty()) {
                    ((ij) iVar.q()).P.setVisibility(0);
                    ad.a aVar = iVar.f42388k;
                    if (aVar != null) {
                        aVar.u(list);
                        return;
                    } else {
                        Intrinsics.k("leagueDeclaredWinnerAdapter");
                        throw null;
                    }
                }
                return;
            case 2:
                ad.a aVar2 = iVar.f42388k;
                if (aVar2 != null) {
                    aVar2.u(list);
                    return;
                } else {
                    Intrinsics.k("leagueDeclaredWinnerAdapter");
                    throw null;
                }
            case 20:
                ((ij) iVar.q()).f5050t.setTitleList(list);
                return;
            case 22:
                if (list != null && !list.isEmpty()) {
                    ((ij) iVar.q()).f5049s.setVisibility(0);
                    a aVar3 = iVar.f42386i;
                    if (aVar3 != null) {
                        aVar3.u(list);
                        return;
                    } else {
                        Intrinsics.k("leagueLeaderBoardAdapter");
                        throw null;
                    }
                }
                ((ij) iVar.q()).f5049s.setVisibility(8);
                return;
            default:
                Intrinsics.c(list);
                if ((!list.isEmpty()) && ((LeaderBoardUserDto) list.get(0)).getName().length() > 0) {
                    ((ij) iVar.q()).f5055y.setVisibility(0);
                    ((ij) iVar.q()).f5054x.setVisibility(0);
                    a aVar4 = iVar.f42387j;
                    if (aVar4 != null) {
                        aVar4.u(list);
                        return;
                    } else {
                        Intrinsics.k("currentUserLeagueLeaderBoardAdapter");
                        throw null;
                    }
                }
                ((ij) iVar.q()).f5054x.setVisibility(8);
                ((ij) iVar.q()).f5055y.setVisibility(8);
                return;
        }
    }

    public final void i(kj.j jVar) {
        Bundle bundle;
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 10:
                if (jVar != null && (bundle = (Bundle) jVar.a()) != null) {
                    Intent intent = new Intent(iVar.requireContext(), (Class<?>) LeagueWinnersActivity.class);
                    intent.putExtras(bundle);
                    iVar.startActivity(intent);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    ((ij) iVar.q()).M.setVisibility(el.l.u(bool.booleanValue()));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f42364a;
        final int i11 = 0;
        final i iVar = this.f42365b;
        switch (i10) {
            case 0:
                CurrentUser currentUser = (CurrentUser) obj;
                if (currentUser != null) {
                    if (currentUser.getRank() > 3 && currentUser.getName().length() > 0) {
                        ((ij) iVar.q()).f5056z.setVisibility(0);
                        l9 l9Var = iVar.f42385h;
                        if (l9Var != null) {
                            TextView textView = l9Var.f5328s;
                            textView.setVisibility(0);
                            kj.f.o(textView, String.valueOf(currentUser.getRank()));
                            l9 l9Var2 = iVar.f42385h;
                            if (l9Var2 != null) {
                                l9Var2.f5329t.setText(currentUser.getName());
                                l9 l9Var3 = iVar.f42385h;
                                if (l9Var3 != null) {
                                    l9Var3.f5331v.setVisibility(8);
                                    l9 l9Var4 = iVar.f42385h;
                                    if (l9Var4 != null) {
                                        ImageView rewardIcon = l9Var4.f5332w;
                                        Intrinsics.checkNotNullExpressionValue(rewardIcon, "rewardIcon");
                                        al.d.c1(rewardIcon, ((LeagueLeaderBoardViewModel) iVar.r()).f9029z);
                                        l9 l9Var5 = iVar.f42385h;
                                        if (l9Var5 != null) {
                                            ImageView userImage = l9Var5.f5333x;
                                            Intrinsics.checkNotNullExpressionValue(userImage, "userImage");
                                            i.I(iVar, userImage, currentUser.getDisplayPicture());
                                            l9 l9Var6 = iVar.f42385h;
                                            if (l9Var6 != null) {
                                                ij.h hVar = ij.h.f20067a;
                                                l9Var6.f5330u.setText(ij.h.h(currentUser.getAmountWon(), 0, false, 4));
                                            } else {
                                                Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                                                throw null;
                                            }
                                        } else {
                                            Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                                            throw null;
                                        }
                                    } else {
                                        Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("cellLeagueDeclaredWinnerBoard");
                            throw null;
                        }
                    } else {
                        ((ij) iVar.q()).f5056z.setVisibility(8);
                    }
                }
                return Unit.f23355a;
            case 1:
                f((List) obj);
                return Unit.f23355a;
            case 2:
                f((List) obj);
                return Unit.f23355a;
            case 3:
                e((Boolean) obj);
                return Unit.f23355a;
            case 4:
                e((Boolean) obj);
                return Unit.f23355a;
            case 5:
                e((Boolean) obj);
                return Unit.f23355a;
            case 6:
                e((Boolean) obj);
                return Unit.f23355a;
            case 7:
                String str = (String) obj;
                Intrinsics.c(str);
                int i12 = i.f42383n;
                iVar.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", iVar.getString(R.string.invite_a_friend));
                intent.putExtra("android.intent.extra.TEXT", str);
                iVar.startActivity(Intent.createChooser(intent, iVar.getString(R.string.game_start_invite_friends_title)));
                return Unit.f23355a;
            case 8:
                e((Boolean) obj);
                return Unit.f23355a;
            case 9:
                e((Boolean) obj);
                return Unit.f23355a;
            case 10:
                i((kj.j) obj);
                return Unit.f23355a;
            case 11:
                i((kj.j) obj);
                return Unit.f23355a;
            case 12:
                d((LeagueUnifiedResponseDto) obj);
                return Unit.f23355a;
            case 13:
                d((LeagueUnifiedResponseDto) obj);
                return Unit.f23355a;
            case 14:
                e((Boolean) obj);
                return Unit.f23355a;
            case 15:
                j();
                return Unit.f23355a;
            case 16:
                j();
                return Unit.f23355a;
            case 17:
                e((Boolean) obj);
                return Unit.f23355a;
            case 18:
                e((Boolean) obj);
                return Unit.f23355a;
            case 19:
                e((Boolean) obj);
                return Unit.f23355a;
            case 20:
                f((List) obj);
                return Unit.f23355a;
            case 21:
                Integer num = (Integer) obj;
                ij ijVar = (ij) iVar.q();
                Intrinsics.c(num);
                ijVar.E.setText(iVar.getString(num.intValue()));
                return Unit.f23355a;
            case 22:
                f((List) obj);
                return Unit.f23355a;
            case 23:
                f((List) obj);
                return Unit.f23355a;
            case 24:
                final TopLeaguesDto topLeaguesDto = (TopLeaguesDto) obj;
                ((ij) iVar.q()).N.setVisibility(0);
                ((ij) iVar.q()).N.d();
                MediaPlayer create = MediaPlayer.create(iVar.getContext(), R.raw.applause);
                iVar.f42389l = create;
                if (create != null && !create.isPlaying()) {
                    create.start();
                }
                final int i13 = 1;
                if (!topLeaguesDto.getWinners().isEmpty()) {
                    yr yrVar = iVar.f42384g;
                    if (yrVar != null) {
                        yrVar.f6774w.setImageDrawable(r3.k.getDrawable(iVar.requireContext(), i.H(iVar, topLeaguesDto.getWinners().get(0).getRank())));
                        yr yrVar2 = iVar.f42384g;
                        if (yrVar2 != null) {
                            ImageView firstImage = yrVar2.f6771t;
                            Intrinsics.checkNotNullExpressionValue(firstImage, "firstImage");
                            i.I(iVar, firstImage, topLeaguesDto.getWinners().get(0).getProfileUrl());
                            yr yrVar3 = iVar.f42384g;
                            if (yrVar3 != null) {
                                yrVar3.f6773v.setText(topLeaguesDto.getWinners().get(0).getDisplayName());
                                yr yrVar4 = iVar.f42384g;
                                if (yrVar4 != null) {
                                    yrVar4.f6770s.setText(topLeaguesDto.getWinners().get(0).getAmount().getAbsolute());
                                    yr yrVar5 = iVar.f42384g;
                                    if (yrVar5 != null) {
                                        ImageView firstRewardIcon = yrVar5.f6775x;
                                        Intrinsics.checkNotNullExpressionValue(firstRewardIcon, "firstRewardIcon");
                                        al.d.c1(firstRewardIcon, ((LeagueLeaderBoardViewModel) iVar.r()).f9029z);
                                        yr yrVar6 = iVar.f42384g;
                                        if (yrVar6 != null) {
                                            yrVar6.f6772u.setOnClickListener(new View.OnClickListener() { // from class: zc.h
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i14 = i11;
                                                    TopLeaguesDto topLeaguesDto2 = topLeaguesDto;
                                                    i this$0 = iVar;
                                                    switch (i14) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(0));
                                                            return;
                                                        case 1:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(1));
                                                            return;
                                                        default:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(2));
                                                            return;
                                                    }
                                                }
                                            });
                                        } else {
                                            Intrinsics.k("layoutLeagueWinnerBinding");
                                            throw null;
                                        }
                                    } else {
                                        Intrinsics.k("layoutLeagueWinnerBinding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.k("layoutLeagueWinnerBinding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("layoutLeagueWinnerBinding");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("layoutLeagueWinnerBinding");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("layoutLeagueWinnerBinding");
                        throw null;
                    }
                }
                final int i14 = 2;
                if (topLeaguesDto.getWinners().size() >= 2) {
                    yr yrVar7 = iVar.f42384g;
                    if (yrVar7 != null) {
                        yrVar7.D.setImageDrawable(r3.k.getDrawable(iVar.requireContext(), i.H(iVar, topLeaguesDto.getWinners().get(1).getRank())));
                        yr yrVar8 = iVar.f42384g;
                        if (yrVar8 != null) {
                            ImageView secondImage = yrVar8.A;
                            Intrinsics.checkNotNullExpressionValue(secondImage, "secondImage");
                            i.I(iVar, secondImage, topLeaguesDto.getWinners().get(1).getProfileUrl());
                            yr yrVar9 = iVar.f42384g;
                            if (yrVar9 != null) {
                                yrVar9.C.setText(topLeaguesDto.getWinners().get(1).getDisplayName());
                                yr yrVar10 = iVar.f42384g;
                                if (yrVar10 != null) {
                                    yrVar10.f6777z.setText(topLeaguesDto.getWinners().get(1).getAmount().getAbsolute());
                                    yr yrVar11 = iVar.f42384g;
                                    if (yrVar11 != null) {
                                        ImageView secondRewardIcon = yrVar11.E;
                                        Intrinsics.checkNotNullExpressionValue(secondRewardIcon, "secondRewardIcon");
                                        al.d.c1(secondRewardIcon, ((LeagueLeaderBoardViewModel) iVar.r()).f9029z);
                                        yr yrVar12 = iVar.f42384g;
                                        if (yrVar12 != null) {
                                            yrVar12.B.setOnClickListener(new View.OnClickListener() { // from class: zc.h
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i142 = i13;
                                                    TopLeaguesDto topLeaguesDto2 = topLeaguesDto;
                                                    i this$0 = iVar;
                                                    switch (i142) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(0));
                                                            return;
                                                        case 1:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(1));
                                                            return;
                                                        default:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(2));
                                                            return;
                                                    }
                                                }
                                            });
                                        } else {
                                            Intrinsics.k("layoutLeagueWinnerBinding");
                                            throw null;
                                        }
                                    } else {
                                        Intrinsics.k("layoutLeagueWinnerBinding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.k("layoutLeagueWinnerBinding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("layoutLeagueWinnerBinding");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("layoutLeagueWinnerBinding");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("layoutLeagueWinnerBinding");
                        throw null;
                    }
                }
                if (topLeaguesDto.getWinners().size() >= 3) {
                    yr yrVar13 = iVar.f42384g;
                    if (yrVar13 != null) {
                        yrVar13.J.setImageDrawable(r3.k.getDrawable(iVar.requireContext(), i.H(iVar, topLeaguesDto.getWinners().get(2).getRank())));
                        yr yrVar14 = iVar.f42384g;
                        if (yrVar14 != null) {
                            ImageView thirdImage = yrVar14.G;
                            Intrinsics.checkNotNullExpressionValue(thirdImage, "thirdImage");
                            i.I(iVar, thirdImage, topLeaguesDto.getWinners().get(2).getProfileUrl());
                            yr yrVar15 = iVar.f42384g;
                            if (yrVar15 != null) {
                                yrVar15.I.setText(topLeaguesDto.getWinners().get(2).getDisplayName());
                                yr yrVar16 = iVar.f42384g;
                                if (yrVar16 != null) {
                                    yrVar16.F.setText(topLeaguesDto.getWinners().get(2).getAmount().getAbsolute());
                                    yr yrVar17 = iVar.f42384g;
                                    if (yrVar17 != null) {
                                        ImageView thirdRewardIcon = yrVar17.K;
                                        Intrinsics.checkNotNullExpressionValue(thirdRewardIcon, "thirdRewardIcon");
                                        al.d.c1(thirdRewardIcon, ((LeagueLeaderBoardViewModel) iVar.r()).f9029z);
                                        yr yrVar18 = iVar.f42384g;
                                        if (yrVar18 != null) {
                                            yrVar18.H.setOnClickListener(new View.OnClickListener() { // from class: zc.h
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i142 = i14;
                                                    TopLeaguesDto topLeaguesDto2 = topLeaguesDto;
                                                    i this$0 = iVar;
                                                    switch (i142) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(0));
                                                            return;
                                                        case 1:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(1));
                                                            return;
                                                        default:
                                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                            i.J(this$0, topLeaguesDto2.getWinners().get(2));
                                                            return;
                                                    }
                                                }
                                            });
                                        } else {
                                            Intrinsics.k("layoutLeagueWinnerBinding");
                                            throw null;
                                        }
                                    } else {
                                        Intrinsics.k("layoutLeagueWinnerBinding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.k("layoutLeagueWinnerBinding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("layoutLeagueWinnerBinding");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("layoutLeagueWinnerBinding");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("layoutLeagueWinnerBinding");
                        throw null;
                    }
                }
                return Unit.f23355a;
            case 25:
                ((LeagueLeaderBoardViewModel) iVar.r()).j((LeagueStatus) obj);
                return Unit.f23355a;
            case 26:
                a((LeaderBoardUserDto) obj);
                return Unit.f23355a;
            case 27:
                a((LeaderBoardUserDto) obj);
                return Unit.f23355a;
            default:
                WinnersDto data = (WinnersDto) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                i.J(iVar, data);
                return Unit.f23355a;
        }
    }

    public final void j() {
        int i10 = this.f42364a;
        i iVar = this.f42365b;
        switch (i10) {
            case 15:
                new ad.i().show(iVar.getChildFragmentManager(), "WinnerDeclaredMessageBottomSheetDialogFragment");
                try {
                    g0 C = iVar.getChildFragmentManager().C("SquareOffMessageBottomSheetDialogFragment");
                    if (C != null && C.isVisible()) {
                        ((ad.h) C).dismiss();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                if (iVar.requireActivity() instanceof LeagueDetailPostJoiningActivity) {
                    j0 requireActivity = iVar.requireActivity();
                    Intrinsics.d(requireActivity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity");
                    if (((m1) ((LeagueDetailPostJoiningActivity) requireActivity).w()).f5420w.getSelectedTabPosition() == 1) {
                        new ad.h().show(iVar.getChildFragmentManager(), "SquareOffMessageBottomSheetDialogFragment");
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
