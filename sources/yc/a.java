package yc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba.m1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.social.domain.model.UserGroupLevelPermissions;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPostJoiningActivity f41475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LeagueDetailPostJoiningActivity leagueDetailPostJoiningActivity, int i10) {
        super(1);
        this.f41474a = i10;
        this.f41475b = leagueDetailPostJoiningActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f41474a;
        LeagueDetailPostJoiningActivity leagueDetailPostJoiningActivity = this.f41475b;
        switch (i10) {
            case 3:
                ((m1) leagueDetailPostJoiningActivity.w()).f5422y.setCurrentItem(0);
                return;
            case 4:
                ((m1) leagueDetailPostJoiningActivity.w()).f5422y.setCurrentItem(1);
                return;
            case 10:
                leagueDetailPostJoiningActivity.setResult(-1);
                leagueDetailPostJoiningActivity.finish();
                return;
            case 11:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((m1) leagueDetailPostJoiningActivity.w()).f5423z.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((m1) leagueDetailPostJoiningActivity.w()).f5423z.setVisibility(8);
                        return;
                    }
                    return;
                }
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6237u.setVisibility(0);
                    ((m1) leagueDetailPostJoiningActivity.w()).f5423z.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6237u.setVisibility(8);
                        ((m1) leagueDetailPostJoiningActivity.w()).f5423z.setVisibility(8);
                        return;
                    }
                    return;
                }
        }
    }

    public final void d(Integer num) {
        int i10 = this.f41474a;
        LeagueDetailPostJoiningActivity leagueDetailPostJoiningActivity = this.f41475b;
        switch (i10) {
            case 0:
                RelativeLayout relativeLayout = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6237u;
                Context context = relativeLayout.getContext();
                Intrinsics.c(num);
                relativeLayout.setBackground(r3.k.getDrawable(context, num.intValue()));
                return;
            case 1:
                View view = ((m1) leagueDetailPostJoiningActivity.w()).f5423z;
                Context context2 = view.getContext();
                Intrinsics.c(num);
                view.setBackgroundColor(r3.k.getColor(context2, num.intValue()));
                return;
            case 2:
                m1 m1Var = (m1) leagueDetailPostJoiningActivity.w();
                TextView textView = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6239w;
                Context context3 = m1Var.f5423z.getContext();
                Intrinsics.c(num);
                textView.setTextColor(r3.k.getColor(context3, num.intValue()));
                return;
            case 13:
                TextView textView2 = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6239w;
                Intrinsics.c(num);
                textView2.setText(leagueDetailPostJoiningActivity.getString(num.intValue()));
                return;
            case 15:
                LinearLayout linearLayout = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6236t;
                Context context4 = linearLayout.getContext();
                Intrinsics.c(num);
                linearLayout.setBackground(r3.k.getDrawable(context4, num.intValue()));
                return;
            case 16:
                ImageView imageView = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6238v;
                Context context5 = imageView.getContext();
                Intrinsics.c(num);
                imageView.setImageDrawable(r3.k.getDrawable(context5, num.intValue()));
                return;
            default:
                TextView textView3 = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6235s;
                Context context6 = textView3.getContext();
                Intrinsics.c(num);
                textView3.setTextColor(r3.k.getColor(context6, num.intValue()));
                TextView textView4 = ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6239w;
                textView4.setTextColor(r3.k.getColor(textView4.getContext(), num.intValue()));
                return;
        }
    }

    public final void e(kj.j jVar) {
        int i10 = this.f41474a;
        LeagueDetailPostJoiningActivity leagueDetailPostJoiningActivity = this.f41475b;
        switch (i10) {
            case 5:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Bundle extras = leagueDetailPostJoiningActivity.getIntent().getExtras();
                    if (extras != null) {
                        extras.putBoolean("IS_MAINTENANCE_ON", booleanValue);
                    }
                    m1 m1Var = (m1) leagueDetailPostJoiningActivity.w();
                    m mVar = leagueDetailPostJoiningActivity.f8985m;
                    if (mVar != null) {
                        m1Var.f5422y.setAdapter(mVar);
                        m mVar2 = leagueDetailPostJoiningActivity.f8985m;
                        if (mVar2 != null) {
                            mVar2.f41521n = booleanValue;
                            mVar2.e(2);
                            return;
                        } else {
                            Intrinsics.k("leaguePostJoiningTabAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("leaguePostJoiningTabAdapter");
                    throw null;
                }
                return;
            case 6:
            default:
                ((m1) leagueDetailPostJoiningActivity.w()).f5416s.o(false);
                return;
            case 7:
                m1 m1Var2 = (m1) leagueDetailPostJoiningActivity.w();
                m1Var2.f5416s.m((UserGroupLevelPermissions) ((LeagueDetailPostJoiningViewModel) leagueDetailPostJoiningActivity.x()).G.getValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LeagueStatus leagueStatus;
        boolean z10;
        int i10 = this.f41474a;
        LeagueDetailPostJoiningActivity leagueDetailPostJoiningActivity = this.f41475b;
        switch (i10) {
            case 0:
                d((Integer) obj);
                return Unit.f23355a;
            case 1:
                d((Integer) obj);
                return Unit.f23355a;
            case 2:
                d((Integer) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                e((kj.j) obj);
                return Unit.f23355a;
            case 6:
                ChatMessage chatMessage = (ChatMessage) obj;
                m1 m1Var = (m1) leagueDetailPostJoiningActivity.w();
                Intrinsics.c(chatMessage);
                m1Var.f5416s.n(chatMessage, ((LeagueDetailPostJoiningViewModel) leagueDetailPostJoiningActivity.x()).f9081d.getCurrentUserId(), true, (UserGroupLevelPermissions) ((LeagueDetailPostJoiningViewModel) leagueDetailPostJoiningActivity.x()).G.getValue());
                return Unit.f23355a;
            case 7:
                e((kj.j) obj);
                return Unit.f23355a;
            case 8:
                e((kj.j) obj);
                return Unit.f23355a;
            case 9:
                ArenaGame arenaGame = ((LeagueDetailPostJoiningViewModel) leagueDetailPostJoiningActivity.x()).f8988p;
                if (arenaGame != null) {
                    leagueStatus = arenaGame.getLeagueStatus();
                } else {
                    leagueStatus = null;
                }
                if (leagueStatus == LeagueStatus.LEAGUE_TRADING_NOT_STARTED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AnalyticEvent analyticEvent = new AnalyticEvent("app_joined_league_exit", p0.f(new Pair("league_started", Boolean.valueOf(!z10))));
                leagueDetailPostJoiningActivity.A(analyticEvent);
                leagueDetailPostJoiningActivity.D(analyticEvent);
                int i11 = lc.c.f24519j;
                Bundle bundle = new Bundle();
                lc.c cVar = new lc.c();
                cVar.setArguments(bundle);
                cVar.show(leagueDetailPostJoiningActivity.getSupportFragmentManager(), "LeagueExitBottomSheetDialogFragment");
                return Unit.f23355a;
            case 10:
                a((Boolean) obj);
                return Unit.f23355a;
            case 11:
                a((Boolean) obj);
                return Unit.f23355a;
            case 12:
                ((m1) leagueDetailPostJoiningActivity.w()).f5418u.f6235s.setText((String) obj);
                return Unit.f23355a;
            case 13:
                d((Integer) obj);
                return Unit.f23355a;
            case 14:
                a((Boolean) obj);
                return Unit.f23355a;
            case 15:
                d((Integer) obj);
                return Unit.f23355a;
            case 16:
                d((Integer) obj);
                return Unit.f23355a;
            default:
                d((Integer) obj);
                return Unit.f23355a;
        }
    }
}
