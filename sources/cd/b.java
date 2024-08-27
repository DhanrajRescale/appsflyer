package cd;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.o1;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.widget.ProgressBarWithCounter;
import com.assetgro.stockgro.widget.SwipeToJoinButton;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y.q0;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningActivity f8101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity, int i10) {
        super(1);
        this.f8100a = i10;
        this.f8101b = leagueDetailPreJoiningActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f8100a;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8101b;
        switch (i10) {
            case 2:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((o1) leagueDetailPreJoiningActivity.w()).F.setVisibility(0);
                    ((o1) leagueDetailPreJoiningActivity.w()).A.setVisibility(8);
                    ((o1) leagueDetailPreJoiningActivity.w()).C.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((o1) leagueDetailPreJoiningActivity.w()).F.setVisibility(8);
                        return;
                    }
                    return;
                }
            default:
                ((o1) leagueDetailPreJoiningActivity.w()).A.setVisibility(0);
                if (!((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9051r) {
                    ((o1) leagueDetailPreJoiningActivity.w()).C.setVisibility(0);
                }
                ArenaGame arenaGame = (ArenaGame) ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9050q.getValue();
                if (arenaGame != null) {
                    o1 o1Var = (o1) leagueDetailPreJoiningActivity.w();
                    q0 q0Var = new q0(19, arenaGame, leagueDetailPreJoiningActivity);
                    Object obj = b1.d.f3079a;
                    o1Var.f5635t.setContent(new b1.c(q0Var, true, -1031604892));
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f8100a;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8101b;
        switch (i10) {
            case 0:
                Intrinsics.c(str);
                int i11 = LeagueDetailPreJoiningActivity.f9045l;
                leagueDetailPreJoiningActivity.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", leagueDetailPreJoiningActivity.getString(R.string.invite_a_friend));
                intent.putExtra("android.intent.extra.TEXT", str);
                leagueDetailPreJoiningActivity.startActivity(Intent.createChooser(intent, leagueDetailPreJoiningActivity.getString(R.string.game_start_invite_friends_title)));
                return;
            case 1:
                Intent intent2 = new Intent(leagueDetailPreJoiningActivity, (Class<?>) LeagueDetailPostJoiningActivity.class);
                Object value = ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9050q.getValue();
                Intrinsics.d(value, "null cannot be cast to non-null type com.assetgro.stockgro.data.model.arenaV2.ArenaGame");
                intent2.putExtra("LEAGUE_ID", ((ArenaGame) value).getGameId());
                intent2.putExtra("LEAGUE", (Parcelable) ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9050q.getValue());
                leagueDetailPreJoiningActivity.startActivity(intent2);
                Unit unit = Unit.f23355a;
                leagueDetailPreJoiningActivity.setResult(-1);
                leagueDetailPreJoiningActivity.finish();
                return;
            default:
                SwipeToJoinButton swipeToJoinButton = ((o1) leagueDetailPreJoiningActivity.w()).B;
                swipeToJoinButton.f10742d = s0.g.f34069a;
                swipeToJoinButton.setAlpha(1.0f);
                swipeToJoinButton.invalidate();
                Toast.makeText(leagueDetailPreJoiningActivity, str, 0).show();
                return;
        }
    }

    public final void e(j jVar) {
        int i10 = this.f8100a;
        int i11 = 0;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8101b;
        switch (i10) {
            case 3:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null && bool.booleanValue()) {
                    ConstraintLayout paymentConfirmationContainer = ((o1) leagueDetailPreJoiningActivity.w()).D;
                    Intrinsics.checkNotNullExpressionValue(paymentConfirmationContainer, "paymentConfirmationContainer");
                    zq.f.M(paymentConfirmationContainer);
                    ComposeView composePortfolioState = ((o1) leagueDetailPreJoiningActivity.w()).f5637v;
                    Intrinsics.checkNotNullExpressionValue(composePortfolioState, "composePortfolioState");
                    zq.f.M(composePortfolioState);
                    ComposeView composeMaintainenceState = ((o1) leagueDetailPreJoiningActivity.w()).f5636u;
                    Intrinsics.checkNotNullExpressionValue(composeMaintainenceState, "composeMaintainenceState");
                    zq.f.m0(composeMaintainenceState);
                    o1 o1Var = (o1) leagueDetailPreJoiningActivity.w();
                    c cVar = new c(leagueDetailPreJoiningActivity, i11);
                    Object obj = b1.d.f3079a;
                    o1Var.f5636u.setContent(new b1.c(cVar, true, -808939297));
                    return;
                }
                return;
            case 9:
                Boolean bool2 = (Boolean) jVar.a();
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    SwipeToJoinButton swipeToJoinButton = ((o1) leagueDetailPreJoiningActivity.w()).B;
                    if (booleanValue) {
                        swipeToJoinButton.setEnabled(true);
                        swipeToJoinButton.setAlpha(1.0f);
                        return;
                    } else {
                        if (!booleanValue) {
                            swipeToJoinButton.setEnabled(false);
                            swipeToJoinButton.setAlpha(0.5f);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                Bundle bundle = (Bundle) jVar.a();
                if (bundle != null) {
                    Intent intent = new Intent(leagueDetailPreJoiningActivity, (Class<?>) RechargeWalletActivity.class);
                    intent.putExtras(bundle);
                    leagueDetailPreJoiningActivity.startActivityForResult(intent, 10019);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f8100a;
        int i11 = 2;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8101b;
        switch (i10) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                e((j) obj);
                return Unit.f23355a;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                ed.a aVar = leagueDetailPreJoiningActivity.f9046k;
                if (aVar != null) {
                    aVar.u(arrayList);
                    return Unit.f23355a;
                }
                Intrinsics.k("prizeDistributionAdapter");
                throw null;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                ArenaGame arenaGame = (ArenaGame) obj;
                o1 o1Var = (o1) leagueDetailPreJoiningActivity.w();
                String string = leagueDetailPreJoiningActivity.getString(R.string.seat_remaining);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ij.h hVar = ij.h.f20067a;
                int i12 = 1;
                o1Var.G.setText(a3.a.m(new Object[]{ij.h.f(arenaGame.getSeatsLeft(), 2)}, 1, string, "format(...)"));
                o1 o1Var2 = (o1) leagueDetailPreJoiningActivity.w();
                int maximumPlayers = arenaGame.getMaximumPlayers();
                int maximumPlayers2 = arenaGame.getMaximumPlayers() - arenaGame.getSeatsLeft();
                int minimumPlayers = arenaGame.getMinimumPlayers();
                ProgressBarWithCounter progressBarWithCounter = o1Var2.f5638w;
                progressBarWithCounter.maxValue = maximumPlayers;
                progressBarWithCounter.currentValue = maximumPlayers2;
                progressBarWithCounter.minValue = minimumPlayers;
                progressBarWithCounter.invalidate();
                if (arenaGame.getJoiningFee() > 0) {
                    SwipeToJoinButton next = ((o1) leagueDetailPreJoiningActivity.w()).B;
                    Intrinsics.checkNotNullExpressionValue(next, "next");
                    zq.f.M(next);
                    ComposeView composePortfolioState = ((o1) leagueDetailPreJoiningActivity.w()).f5637v;
                    Intrinsics.checkNotNullExpressionValue(composePortfolioState, "composePortfolioState");
                    zq.f.m0(composePortfolioState);
                    o1 o1Var3 = (o1) leagueDetailPreJoiningActivity.w();
                    c cVar = new c(leagueDetailPreJoiningActivity, i12);
                    Object obj2 = b1.d.f3079a;
                    o1Var3.f5637v.setContent(new b1.c(cVar, true, -1608378773));
                }
                if (Intrinsics.a(arenaGame.getPortfolioAvailable(), Boolean.FALSE)) {
                    ComposeView composePortfolioState2 = ((o1) leagueDetailPreJoiningActivity.w()).f5637v;
                    Intrinsics.checkNotNullExpressionValue(composePortfolioState2, "composePortfolioState");
                    zq.f.m0(composePortfolioState2);
                    o1 o1Var4 = (o1) leagueDetailPreJoiningActivity.w();
                    c cVar2 = new c(leagueDetailPreJoiningActivity, i11);
                    Object obj3 = b1.d.f3079a;
                    o1Var4.f5637v.setContent(new b1.c(cVar2, true, 1811523284));
                }
                if (arenaGame.getSeatsLeft() == 0) {
                    ConstraintLayout paymentConfirmationContainer = ((o1) leagueDetailPreJoiningActivity.w()).D;
                    Intrinsics.checkNotNullExpressionValue(paymentConfirmationContainer, "paymentConfirmationContainer");
                    zq.f.M(paymentConfirmationContainer);
                    ComposeView composePortfolioState3 = ((o1) leagueDetailPreJoiningActivity.w()).f5637v;
                    Intrinsics.checkNotNullExpressionValue(composePortfolioState3, "composePortfolioState");
                    zq.f.m0(composePortfolioState3);
                    o1 o1Var5 = (o1) leagueDetailPreJoiningActivity.w();
                    c cVar3 = new c(leagueDetailPreJoiningActivity, 3);
                    Object obj4 = b1.d.f3079a;
                    o1Var5.f5637v.setContent(new b1.c(cVar3, true, -229151821));
                }
                return Unit.f23355a;
            case 8:
                int i13 = 0;
                for (String str : (List) obj) {
                    int i14 = i13 + 1;
                    View inflate = leagueDetailPreJoiningActivity.getLayoutInflater().inflate(R.layout.cell_league_rule_v2, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                    if (i13 % 2 == 0) {
                        ((ConstraintLayout) inflate.findViewById(R.id.container)).setBackgroundColor(r3.k.getColor(leagueDetailPreJoiningActivity, R.color.white));
                    }
                    ((TextView) inflate.findViewById(R.id.rule)).setText(Html.fromHtml(str));
                    ((o1) leagueDetailPreJoiningActivity.w()).f5639x.addView(inflate);
                    i13 = i14;
                }
                return Unit.f23355a;
            case 9:
                e((j) obj);
                return Unit.f23355a;
            default:
                e((j) obj);
                return Unit.f23355a;
        }
    }
}
