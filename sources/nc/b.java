package nc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ba.of;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeagueDetailActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import d2.y0;
import el.l;
import iu.k;
import kj.f;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.h;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i10) {
        super(1);
        this.f28611a = i10;
        this.f28612b = dVar;
    }

    public final void a(ArenaGame arenaGame) {
        int i10 = this.f28611a;
        d dVar = this.f28612b;
        switch (i10) {
            case 0:
                Intrinsics.c(arenaGame);
                int i11 = d.f28615i;
                dVar.getClass();
                AnalyticEvent analyticEvent = new AnalyticEvent("app_league_info_open", null, 2, null);
                analyticEvent.getParam().putAll(l.j0(arenaGame));
                analyticEvent.getParam().put("is_continue", Boolean.TRUE);
                dVar.x(analyticEvent);
                dVar.A(analyticEvent);
                Intent intent = new Intent(dVar.getContext(), (Class<?>) LeagueDetailPreJoiningActivity.class);
                intent.putExtra("LEAGUE", arenaGame);
                dVar.startActivityForResult(intent, 10018);
                return;
            default:
                Intrinsics.c(arenaGame);
                int i12 = d.f28615i;
                dVar.getClass();
                if (Intrinsics.a(arenaGame.getStatus(), "W")) {
                    Intent intent2 = new Intent(dVar.getContext(), (Class<?>) CompletedLeagueDetailActivity.class);
                    intent2.putExtra("LEAGUE", arenaGame);
                    dVar.startActivity(intent2);
                    return;
                } else {
                    Intent intent3 = new Intent(dVar.getContext(), (Class<?>) LeagueDetailPostJoiningActivity.class);
                    intent3.putExtra("LEAGUE", arenaGame);
                    dVar.startActivity(intent3);
                    return;
                }
        }
    }

    public final void d(String str) {
        String leagueId;
        int i10 = this.f28611a;
        d dVar = this.f28612b;
        switch (i10) {
            case 2:
                if (str != null) {
                    switch (str.hashCode()) {
                        case -491059176:
                            if (str.equals("LEAGUE_PACKAGE_HIGHER")) {
                                String string = dVar.getString(R.string.text_league_package_higher);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                d.H(dVar, string);
                                return;
                            }
                            return;
                        case -225923604:
                            if (str.equals("INVITE_ONLY_LEAGUE")) {
                                String string2 = dVar.getString(R.string.text_error_league_invite_only);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                d.H(dVar, string2);
                                return;
                            }
                            return;
                        case 68539799:
                            if (str.equals("INVALID_LEAGUE")) {
                                String string3 = dVar.getString(R.string.text_league_invalid);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                d.H(dVar, string3);
                                return;
                            }
                            return;
                        case 588902307:
                            if (str.equals("LEAGUE_TIME_EXPIRED")) {
                                String string4 = dVar.getString(R.string.text_error_league_time_expired);
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                d.H(dVar, string4);
                                return;
                            }
                            return;
                        case 842017104:
                            if (str.equals("LEAGUE_SEATS_FULL")) {
                                String string5 = dVar.getString(R.string.text_error_league_full);
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                d.H(dVar, string5);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            default:
                if (Intrinsics.a(str, "ArenaAssetHostFragmentV2")) {
                    int i11 = d.f28615i;
                    Bundle extras = dVar.requireActivity().getIntent().getExtras();
                    if (extras != null && (leagueId = extras.getString("leagueId")) != null && dVar.I().I && leagueId.length() > 0) {
                        ArenaAssetHostViewModel arenaAssetHostViewModel = (ArenaAssetHostViewModel) dVar.r();
                        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
                        if (!arenaAssetHostViewModel.f8943o.b(qf.b.f31928c)) {
                            h c10 = arenaAssetHostViewModel.f8942n.checkLeagueEligibilty(leagueId).c(((kq.e) arenaAssetHostViewModel.f9079b).J());
                            jt.d dVar2 = new jt.d(new za.e(7, new y0(23, arenaAssetHostViewModel, leagueId)), new za.e(8, new mc.a(arenaAssetHostViewModel, 1)));
                            c10.a(dVar2);
                            arenaAssetHostViewModel.f9080c.c(dVar2);
                        }
                    }
                    dVar.requireActivity().getIntent().replaceExtras((Bundle) null);
                    dVar.I().I = false;
                    return;
                }
                return;
        }
    }

    public final void e(j jVar) {
        int i10 = this.f28611a;
        d dVar = this.f28612b;
        switch (i10) {
            case 4:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Bundle arguments = dVar.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("IS_MAINTENANCE_ON", booleanValue);
                    }
                    of ofVar = (of) dVar.q();
                    e eVar = dVar.f28617h;
                    if (eVar != null) {
                        ofVar.f5661t.setAdapter(eVar);
                        e eVar2 = dVar.f28617h;
                        if (eVar2 != null) {
                            eVar2.f28618m = booleanValue;
                            eVar2.d();
                            return;
                        } else {
                            Intrinsics.k("hostTabAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("hostTabAdapter");
                    throw null;
                }
                return;
            default:
                ((of) dVar.q()).f5660s.f(true, true, true);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView;
        switch (this.f28611a) {
            case 0:
                a((ArenaGame) obj);
                return Unit.f23355a;
            case 1:
                a((ArenaGame) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            case 4:
                e((j) obj);
                return Unit.f23355a;
            case 5:
                e((j) obj);
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                int intValue = num.intValue();
                int i10 = d.f28615i;
                View actionView = ((of) this.f28612b.q()).f5664w.getMenu().findItem(R.id.menu_item_notifications).getActionView();
                if (actionView != null) {
                    textView = (TextView) actionView.findViewById(R.id.cart_badge_notification);
                } else {
                    textView = null;
                }
                if (textView != null) {
                    f.u(textView, intValue);
                }
                return Unit.f23355a;
        }
    }
}
