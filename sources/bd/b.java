package bd;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.e0;
import ba.kj;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.kaopiz.kprogresshud.f;
import iu.k;
import java.util.Arrays;
import java.util.List;
import kj.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import rg.e;
import yc.g;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6942b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i10) {
        super(1);
        this.f6941a = i10;
        this.f6942b = dVar;
    }

    public final void a(LeagueUnifiedResponseDto leagueUnifiedResponseDto) {
        int i10 = this.f6941a;
        d dVar = this.f6942b;
        switch (i10) {
            case 25:
                UnifiedPortfolio portfolio = leagueUnifiedResponseDto.getPortfolio();
                ((LeaguePortfolioViewModel) dVar.r()).f9006u.postValue(portfolio);
                ((LeaguePortfolioViewModel) dVar.r()).f9003r = portfolio;
                return;
            default:
                LeagueSharedViewModel leagueSharedViewModel = dVar.f6950k;
                if (leagueSharedViewModel != null) {
                    leagueSharedViewModel.f9063n.postValue(leagueUnifiedResponseDto);
                    return;
                } else {
                    Intrinsics.k("leagueSharedViewModel");
                    throw null;
                }
        }
    }

    public final void d(Boolean bool) {
        int i10;
        f fVar;
        int i11 = this.f6941a;
        int i12 = 8;
        d dVar = this.f6942b;
        switch (i11) {
            case 3:
                ((kj) dVar.q()).f5255t.f6351w.H.setVisibility(8);
                ((kj) dVar.q()).f5255t.f6351w.G.setVisibility(8);
                return;
            case 4:
                TextView textView = ((kj) dVar.q()).f5255t.M;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = R.string.unrealised_profit;
                } else {
                    i10 = R.string.unrealised_loss;
                }
                textView.setText(dVar.getString(i10));
                return;
            case 8:
                LinearLayout linearLayout = ((kj) dVar.q()).f5255t.f6351w.B;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    i12 = 0;
                } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                linearLayout.setVisibility(i12);
                return;
            case 12:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((kj) dVar.q()).f5256u.setRefreshing(true);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((kj) dVar.q()).f5256u.setRefreshing(false);
                        return;
                    }
                    return;
                }
            case 13:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((kj) dVar.q()).f5255t.F.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((kj) dVar.q()).f5255t.F.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 15:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((kj) dVar.q()).f5255t.A.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((kj) dVar.q()).f5255t.A.setVisibility(4);
                        return;
                    }
                    return;
                }
            case 16:
                kj kjVar = (kj) dVar.q();
                Intrinsics.c(bool);
                kjVar.f5256u.setEnabled(bool.booleanValue());
                return;
            case 17:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((kj) dVar.q()).f5255t.f6354z.setVisibility(0);
                    ((kj) dVar.q()).f5255t.f6350v.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((kj) dVar.q()).f5255t.f6354z.setVisibility(8);
                        ((kj) dVar.q()).f5255t.f6350v.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 18:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((kj) dVar.q()).f5255t.A.setVisibility(0);
                    ((kj) dVar.q()).f5255t.f6348t.setVisibility(0);
                    ((kj) dVar.q()).f5255t.f6349u.setVisibility(8);
                    ((kj) dVar.q()).f5255t.E.setVisibility(8);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((kj) dVar.q()).f5255t.f6348t.setVisibility(8);
                    ((kj) dVar.q()).f5255t.f6349u.setVisibility(0);
                    ((kj) dVar.q()).f5255t.E.setVisibility(0);
                    return;
                }
                return;
            case 23:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    f fVar2 = dVar.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = dVar.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    String str = ((LeaguePortfolioViewModel) dVar.r()).B;
                    if (str != null) {
                        if (Intrinsics.a(str, "EQUITY")) {
                            ((kj) dVar.q()).f5255t.f6351w.f6576v.setText(dVar.getString(R.string.cash_balance));
                        } else if (Intrinsics.a(str, "OPTIONS")) {
                            ((kj) dVar.q()).f5255t.f6351w.f6576v.setText(dVar.getString(R.string.margin_avaliable));
                        }
                        ((kj) dVar.q()).f5255t.f6351w.f6574t.setVisibility(0);
                        ((kj) dVar.q()).f5255t.f6351w.f6575u.setVisibility(0);
                        return;
                    }
                    Intrinsics.k("leagueAssetClass");
                    throw null;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((kj) dVar.q()).f5255t.f6351w.f6574t.setVisibility(8);
                    ((kj) dVar.q()).f5255t.f6351w.f6575u.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public final void e(String str) {
        int i10 = this.f6941a;
        d dVar = this.f6942b;
        switch (i10) {
            case 0:
                ((kj) dVar.q()).f5255t.L.setText(str);
                return;
            case 1:
                String str2 = ((LeaguePortfolioViewModel) dVar.r()).B;
                if (str2 != null) {
                    if (Intrinsics.a(str2, "OPTIONS")) {
                        ((kj) dVar.q()).f5255t.K.setText(dVar.getString(R.string.transaction_charges_10_order));
                        return;
                    }
                    if (Intrinsics.a(str2, "EQUITY")) {
                        TextView textView = ((kj) dVar.q()).f5255t.K;
                        String string = dVar.getString(R.string.transaction_charges_dynamic);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        textView.setText(format);
                        return;
                    }
                    return;
                }
                Intrinsics.k("leagueAssetClass");
                throw null;
            case 2:
                ((kj) dVar.q()).f5255t.J.setText(str);
                return;
            case 5:
                ((kj) dVar.q()).f5255t.f6353y.setText(str);
                return;
            case 6:
                Intrinsics.c(str);
                if (w.s(str, "-", false)) {
                    ((kj) dVar.q()).f5255t.f6351w.E.setText(dVar.getString(R.string.text_loss));
                } else {
                    ((kj) dVar.q()).f5255t.f6351w.E.setText(dVar.getString(R.string.text_profit));
                }
                ((kj) dVar.q()).f5255t.f6351w.D.setText(str);
                return;
            case 7:
                ((kj) dVar.q()).f5255t.f6351w.f6577w.setText(str.toString());
                return;
            case 9:
                if (Intrinsics.a(str, "POSITIVE")) {
                    ImageView imageView = ((kj) dVar.q()).f5255t.f6351w.f6578x;
                    imageView.setImageResource(R.drawable.ic_stock_up_arrow);
                    zq.f.m0(imageView);
                    return;
                } else if (Intrinsics.a(str, "NEGATIVE")) {
                    ImageView imageView2 = ((kj) dVar.q()).f5255t.f6351w.f6578x;
                    imageView2.setImageResource(R.drawable.ic_stock_down_arrow);
                    zq.f.m0(imageView2);
                    return;
                } else {
                    ImageView changeTypeIcon = ((kj) dVar.q()).f5255t.f6351w.f6578x;
                    Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                    zq.f.M(changeTypeIcon);
                    return;
                }
            case 11:
                ((kj) dVar.q()).f5255t.D.setText(str);
                return;
            case 22:
                Intrinsics.c(str);
                int i11 = d.f6945m;
                dVar.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", dVar.getString(R.string.invite_a_friend));
                intent.putExtra("android.intent.extra.TEXT", str);
                dVar.startActivity(Intent.createChooser(intent, dVar.getString(R.string.game_start_invite_friends_title)));
                return;
            case 27:
                ((kj) dVar.q()).f5255t.f6351w.C.setText(str);
                return;
            default:
                ((kj) dVar.q()).f5255t.f6351w.f6573s.setText(str);
                return;
        }
    }

    public final void f(List list) {
        UnifiedPortfolio unifiedPortfolio;
        UnifiedPortfolio unifiedPortfolio2;
        int i10 = this.f6941a;
        d dVar = this.f6942b;
        switch (i10) {
            case 10:
                if (list != null && !list.isEmpty() && (unifiedPortfolio = ((LeaguePortfolioViewModel) dVar.r()).f9003r) != null) {
                    ((kj) dVar.q()).f5255t.f6347s.setVisibility(0);
                    if (Intrinsics.a(unifiedPortfolio.getPortfolioStatus(), "Frozen")) {
                        ((kj) dVar.q()).f5255t.C.setVisibility(0);
                        ((kj) dVar.q()).f5255t.G.setVisibility(8);
                        kg.a aVar = dVar.f6948i;
                        if (aVar != null) {
                            aVar.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioStocksAdapter");
                            throw null;
                        }
                    }
                    ((kj) dVar.q()).f5255t.C.setVisibility(8);
                    ((kj) dVar.q()).f5255t.G.setVisibility(0);
                    sg.a aVar2 = dVar.f6946g;
                    if (aVar2 != null) {
                        aVar2.u(list);
                        return;
                    } else {
                        Intrinsics.k("portfolioSectorStocksAdapter");
                        throw null;
                    }
                }
                return;
            default:
                if (list != null && !list.isEmpty() && (unifiedPortfolio2 = ((LeaguePortfolioViewModel) dVar.r()).f9003r) != null) {
                    ((kj) dVar.q()).f5255t.f6347s.setVisibility(0);
                    if (Intrinsics.a(unifiedPortfolio2.getPortfolioStatus(), "Frozen")) {
                        ((kj) dVar.q()).f5255t.C.setVisibility(0);
                        ((kj) dVar.q()).f5255t.G.setVisibility(8);
                        e eVar = dVar.f6949j;
                        if (eVar != null) {
                            eVar.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioOptionAdapter");
                            throw null;
                        }
                    }
                    ((kj) dVar.q()).f5255t.C.setVisibility(8);
                    ((kj) dVar.q()).f5255t.G.setVisibility(0);
                    rg.a aVar3 = dVar.f6947h;
                    if (aVar3 != null) {
                        aVar3.u(list);
                        return;
                    } else {
                        Intrinsics.k("portfolioSectorOptionsAdapter");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f6941a;
        d dVar = this.f6942b;
        switch (i11) {
            case 0:
                e((String) obj);
                return Unit.f23355a;
            case 1:
                e((String) obj);
                return Unit.f23355a;
            case 2:
                e((String) obj);
                return Unit.f23355a;
            case 3:
                d((Boolean) obj);
                return Unit.f23355a;
            case 4:
                d((Boolean) obj);
                return Unit.f23355a;
            case 5:
                e((String) obj);
                return Unit.f23355a;
            case 6:
                e((String) obj);
                return Unit.f23355a;
            case 7:
                e((String) obj);
                return Unit.f23355a;
            case 8:
                d((Boolean) obj);
                return Unit.f23355a;
            case 9:
                e((String) obj);
                return Unit.f23355a;
            case 10:
                f((List) obj);
                return Unit.f23355a;
            case 11:
                e((String) obj);
                return Unit.f23355a;
            case 12:
                d((Boolean) obj);
                return Unit.f23355a;
            case 13:
                d((Boolean) obj);
                return Unit.f23355a;
            case 14:
                yc.f fVar = (yc.f) obj;
                if (fVar != null) {
                    ((kj) dVar.q()).f5254s.setVisibility(0);
                    int ordinal = fVar.ordinal();
                    String str = null;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                UnifiedPortfolio unifiedPortfolio = ((LeaguePortfolioViewModel) dVar.r()).f9003r;
                                if (unifiedPortfolio != null) {
                                    str = unifiedPortfolio.getPortfolioStatus();
                                }
                                if (Intrinsics.a(str, "Frozen")) {
                                    ((kj) dVar.q()).f5254s.setVisibility(8);
                                } else {
                                    kj kjVar = (kj) dVar.q();
                                    kjVar.f5254s.setText(dVar.getString(R.string.text_add_options));
                                    ((kj) dVar.q()).f5254s.setVisibility(0);
                                }
                            }
                        } else {
                            UnifiedPortfolio unifiedPortfolio2 = ((LeaguePortfolioViewModel) dVar.r()).f9003r;
                            if (unifiedPortfolio2 != null) {
                                str = unifiedPortfolio2.getPortfolioStatus();
                            }
                            if (Intrinsics.a(str, "Frozen")) {
                                ((kj) dVar.q()).f5254s.setVisibility(8);
                            } else {
                                kj kjVar2 = (kj) dVar.q();
                                kjVar2.f5254s.setText(dVar.getString(R.string.text_add_stocks));
                                ((kj) dVar.q()).f5254s.setVisibility(0);
                            }
                        }
                    } else {
                        UnifiedPortfolio unifiedPortfolio3 = ((LeaguePortfolioViewModel) dVar.r()).f9003r;
                        if (unifiedPortfolio3 != null) {
                            str = unifiedPortfolio3.getPortfolioStatus();
                        }
                        if (Intrinsics.a(str, "Frozen")) {
                            ((kj) dVar.q()).f5254s.setVisibility(8);
                        } else {
                            kj kjVar3 = (kj) dVar.q();
                            kjVar3.f5254s.setText(dVar.getString(R.string.modify_portfolio));
                            ((kj) dVar.q()).f5254s.setVisibility(0);
                        }
                    }
                } else {
                    ((kj) dVar.q()).f5254s.setVisibility(8);
                }
                return Unit.f23355a;
            case 15:
                d((Boolean) obj);
                return Unit.f23355a;
            case 16:
                d((Boolean) obj);
                return Unit.f23355a;
            case 17:
                d((Boolean) obj);
                return Unit.f23355a;
            case 18:
                d((Boolean) obj);
                return Unit.f23355a;
            case 19:
                LeagueStatus leagueStatus = (LeagueStatus) obj;
                LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) dVar.r();
                leaguePortfolioViewModel.C = leagueStatus;
                if (leagueStatus == null) {
                    i10 = -1;
                } else {
                    i10 = g.f41508a[leagueStatus.ordinal()];
                }
                e0 e0Var = leaguePortfolioViewModel.A;
                if (i10 != 1) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                e0Var.postValue(8);
                            }
                        } else {
                            e0Var.postValue(8);
                        }
                    } else {
                        ArenaGame arenaGame = (ArenaGame) leaguePortfolioViewModel.f9000o.getValue();
                        if (arenaGame != null) {
                            if (Intrinsics.a(arenaGame.getPortfolioSubmitted(), Boolean.TRUE)) {
                                e0Var.postValue(0);
                            } else {
                                e0Var.postValue(8);
                                leaguePortfolioViewModel.f9087j.postValue(new j(Unit.f23355a));
                                leaguePortfolioViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.league_exit_message_no_portfolio_submitted)));
                            }
                        }
                    }
                } else {
                    e0Var.postValue(8);
                }
                return Unit.f23355a;
            case 20:
                Integer num = (Integer) obj;
                kj kjVar4 = (kj) dVar.q();
                Intrinsics.c(num);
                kjVar4.f5254s.setVisibility(num.intValue());
                return Unit.f23355a;
            case 21:
                f((List) obj);
                return Unit.f23355a;
            case 22:
                e((String) obj);
                return Unit.f23355a;
            case 23:
                d((Boolean) obj);
                return Unit.f23355a;
            case 24:
                int i12 = d.f6945m;
                ((LeagueDetailPostJoiningViewModel) dVar.f6951l.getValue()).f9087j.postValue((j) obj);
                return Unit.f23355a;
            case 25:
                a((LeagueUnifiedResponseDto) obj);
                return Unit.f23355a;
            case 26:
                a((LeagueUnifiedResponseDto) obj);
                return Unit.f23355a;
            case 27:
                e((String) obj);
                return Unit.f23355a;
            case 28:
                d((Boolean) obj);
                return Unit.f23355a;
            default:
                e((String) obj);
                return Unit.f23355a;
        }
    }
}
