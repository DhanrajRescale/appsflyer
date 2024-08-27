package rc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.v9;
import ba.w9;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.widget.ConstraintLayoutWithGreyscaleDisableSupport;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.chip.Chip;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import k7.y1;
import k7.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public Context f33590d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f33591e;

    /* renamed from: f, reason: collision with root package name */
    public String f33592f;

    /* renamed from: g, reason: collision with root package name */
    public d f33593g;

    /* renamed from: h, reason: collision with root package name */
    public e f33594h;

    /* renamed from: i, reason: collision with root package name */
    public i f33595i;

    @Override // k7.z0
    public final int a() {
        return this.f33591e.size();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, final int i10) {
        String string;
        c holder = (c) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        v9 v9Var = holder.f33586u;
        ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport = v9Var.f6404s;
        TextView seatsFullScreen = v9Var.I;
        Intrinsics.checkNotNullExpressionValue(seatsFullScreen, "seatsFullScreen");
        constraintLayoutWithGreyscaleDisableSupport.m(seatsFullScreen);
        v9 v9Var2 = holder.f33586u;
        ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport2 = v9Var2.f6404s;
        ImageView leagueIcon = v9Var2.A;
        Intrinsics.checkNotNullExpressionValue(leagueIcon, "leagueIcon");
        constraintLayoutWithGreyscaleDisableSupport2.m(leagueIcon);
        v9 v9Var3 = holder.f33586u;
        ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport3 = v9Var3.f6404s;
        Chip leagueType = v9Var3.E;
        Intrinsics.checkNotNullExpressionValue(leagueType, "leagueType");
        constraintLayoutWithGreyscaleDisableSupport3.m(leagueType);
        v9 v9Var4 = holder.f33586u;
        ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport4 = v9Var4.f6404s;
        Chip duration = v9Var4.f6408w;
        Intrinsics.checkNotNullExpressionValue(duration, "duration");
        constraintLayoutWithGreyscaleDisableSupport4.m(duration);
        v9 v9Var5 = holder.f33586u;
        ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport5 = v9Var5.f6404s;
        ConstraintLayout upcomingHeaderContainer = v9Var5.M;
        Intrinsics.checkNotNullExpressionValue(upcomingHeaderContainer, "upcomingHeaderContainer");
        constraintLayoutWithGreyscaleDisableSupport5.m(upcomingHeaderContainer);
        w9 w9Var = (w9) holder.f33586u;
        w9Var.P = (ArenaGame) this.f33591e.get(i10);
        synchronized (w9Var) {
            w9Var.T |= 1;
        }
        w9Var.a(6);
        w9Var.m();
        Object obj = this.f33591e.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final ArenaGame arenaGame = (ArenaGame) obj;
        w9 w9Var2 = (w9) holder.f33586u;
        w9Var2.O = this.f33594h;
        synchronized (w9Var2) {
            w9Var2.T |= 2;
        }
        w9Var2.a(17);
        w9Var2.m();
        if (el.l.q0(arenaGame.getTradeStart())) {
            ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport6 = holder.f33586u.f6404s;
            Context context = this.f33590d;
            if (context != null) {
                constraintLayoutWithGreyscaleDisableSupport6.setBackgroundColor(r3.k.getColor(context, R.color.black_1A1A1A_10));
                holder.f33586u.M.setAlpha(0.5f);
                holder.f33586u.A.setAlpha(0.5f);
                holder.f33586u.E.setAlpha(0.5f);
                holder.f33586u.f6408w.setAlpha(0.5f);
            } else {
                Intrinsics.k(LogCategory.CONTEXT);
                throw null;
            }
        }
        if (!Intrinsics.a(this.f33592f, "open") && !Intrinsics.a(this.f33592f, "promoted")) {
            TextView leaguePrivateName = holder.f33586u.C;
            Intrinsics.checkNotNullExpressionValue(leaguePrivateName, "leaguePrivateName");
            zq.f.m0(leaguePrivateName);
        } else {
            TextView leaguePrivateName2 = holder.f33586u.C;
            Intrinsics.checkNotNullExpressionValue(leaguePrivateName2, "leaguePrivateName");
            zq.f.M(leaguePrivateName2);
        }
        holder.f33586u.f27491e.setOnClickListener(new View.OnClickListener() { // from class: rc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d dVar;
                ArenaGame cardData = ArenaGame.this;
                Intrinsics.checkNotNullParameter(cardData, "$cardData");
                h this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT <= cardData.getTradeStart() && (dVar = this$0.f33593g) != null) {
                    Object obj2 = this$0.f33591e.get(i10);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    ArenaGame arenaGame2 = (ArenaGame) obj2;
                    sc.i iVar = (sc.i) dVar;
                    Intrinsics.checkNotNullParameter(arenaGame2, "arenaGame");
                    AnalyticEvent analyticEvent = new AnalyticEvent("app_league_info_open", null, 2, null);
                    analyticEvent.getParam().putAll(el.l.j0(arenaGame2));
                    analyticEvent.getParam().put("is_continue", Boolean.TRUE);
                    iVar.x(analyticEvent);
                    fd.c cVar = ((ArenaUpcomingViewModel) iVar.r()).f8960q;
                    if (cVar != null) {
                        cVar.a();
                        Intent intent = new Intent(iVar.getContext(), (Class<?>) LeagueDetailPreJoiningActivity.class);
                        intent.putExtra("LEAGUE", arenaGame2);
                        iVar.startActivityForResult(intent, 10018);
                        return;
                    }
                    Intrinsics.k("timer");
                    throw null;
                }
            }
        });
        TextView textView = holder.f33586u.H;
        if (kj.a.f23207b) {
            Context context2 = this.f33590d;
            if (context2 != null) {
                string = context2.getString(R.string.reward_pool);
            } else {
                Intrinsics.k(LogCategory.CONTEXT);
                throw null;
            }
        } else {
            Context context3 = this.f33590d;
            if (context3 != null) {
                string = context3.getString(R.string.bonus_pool);
            } else {
                Intrinsics.k(LogCategory.CONTEXT);
                throw null;
            }
        }
        textView.setText(string);
        holder.f33586u.f6404s.setOnTouchListener(new ha.g(this, 1));
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f33590d = context;
        if (context != null) {
            LayoutInflater from = LayoutInflater.from(context);
            int i11 = v9.Q;
            DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
            v9 v9Var = (v9) m4.m.g(from, R.layout.cell_league_upcoming, parent, false, null);
            Intrinsics.checkNotNullExpressionValue(v9Var, "inflate(...)");
            return new c(v9Var);
        }
        Intrinsics.k(LogCategory.CONTEXT);
        throw null;
    }
}
