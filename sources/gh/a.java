package gh;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.k1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingActivity;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import ej.p;
import iu.k;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import ni.j;
import t3.i;
import yk.g;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioHoldingActivity f17412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LeaguePortfolioHoldingActivity leaguePortfolioHoldingActivity, int i10) {
        super(1);
        this.f17411a = i10;
        this.f17412b = leaguePortfolioHoldingActivity;
    }

    public final void a(String portfolioId) {
        int i10 = 3;
        int i11 = this.f17411a;
        LeaguePortfolioHoldingActivity leaguePortfolioHoldingActivity = this.f17412b;
        switch (i11) {
            case 0:
                ((k1) leaguePortfolioHoldingActivity.w()).f5193t.setText(portfolioId);
                return;
            case 1:
                LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel = (LeaguePortfolioHoldingViewModel) leaguePortfolioHoldingActivity.x();
                Intrinsics.c(portfolioId);
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    leaguePortfolioHoldingViewModel.f9083f.setValue(j.i("Not connected to internet"));
                    return;
                }
                if (portfolioId.length() == 0) {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    Intrinsics.checkNotNullParameter("portfolio Id not received in LeaguePortfolioHoldingViewModel::getPortfolioHoldings", "message");
                    firebaseCrashlytics.recordException(new Exception("portfolio Id not received in LeaguePortfolioHoldingViewModel::getPortfolioHoldings"));
                    return;
                }
                e0 e0Var = leaguePortfolioHoldingViewModel.f9084g;
                e0Var.postValue(Boolean.TRUE);
                try {
                    g.H(u0.f(leaguePortfolioHoldingViewModel), null, null, new c(leaguePortfolioHoldingViewModel, portfolioId, null), 3);
                    return;
                } catch (Exception e10) {
                    e0Var.postValue(Boolean.FALSE);
                    e10.printStackTrace();
                    return;
                }
            case 2:
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.F.setText(portfolioId);
                return;
            case 3:
                String str = ((LeaguePortfolioHoldingViewModel) leaguePortfolioHoldingActivity.x()).f9992o;
                if (Intrinsics.a(str, "OPTIONS")) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5192s.I.setText(leaguePortfolioHoldingActivity.getString(R.string.transaction_charges_10_order));
                    return;
                }
                if (Intrinsics.a(str, "EQUITY")) {
                    TextView textView = ((k1) leaguePortfolioHoldingActivity.w()).f5192s.I;
                    String string = leaguePortfolioHoldingActivity.getString(R.string.transaction_charges_dynamic);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{portfolioId}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    textView.setText(format);
                    return;
                }
                return;
            case 4:
                LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel2 = (LeaguePortfolioHoldingViewModel) leaguePortfolioHoldingActivity.x();
                leaguePortfolioHoldingViewModel2.E.observe(leaguePortfolioHoldingActivity, new ch.c(4, new a(leaguePortfolioHoldingActivity, i10)));
                return;
            case 5:
                if (leaguePortfolioHoldingActivity.getSupportFragmentManager().C("SubscribeToAccessBottomSheetDialogFragment") == null) {
                    int i12 = p.f15521j;
                    ni.g.d(portfolioId, new AnalyticEvent("app_user_profile_league_portfolio_sub_upgrade", null, 2, null)).show(leaguePortfolioHoldingActivity.getSupportFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                    return;
                }
                return;
            case 6:
            default:
                ((k1) leaguePortfolioHoldingActivity.w()).f5198y.setText(portfolioId);
                return;
            case 7:
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.C.setText(portfolioId);
                return;
            case 8:
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6574t.setVisibility(8);
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6575u.setVisibility(8);
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6573s.setText(portfolioId);
                return;
            case 9:
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6580z.setText(leaguePortfolioHoldingActivity.getString(R.string.total_turnover));
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6579y.setText(portfolioId);
                return;
            case 10:
                Intrinsics.c(portfolioId);
                if (w.s(portfolioId, "-", false)) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5192s.E.setText(leaguePortfolioHoldingActivity.getString(R.string.text_loss));
                } else {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5192s.E.setText(leaguePortfolioHoldingActivity.getString(R.string.text_profit));
                }
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.D.setText(portfolioId);
                return;
        }
    }

    public final void d(List list) {
        int i10 = this.f17411a;
        LeaguePortfolioHoldingActivity leaguePortfolioHoldingActivity = this.f17412b;
        switch (i10) {
            case 12:
                if (list != null && !list.isEmpty()) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5192s.A.setVisibility(0);
                    ((k1) leaguePortfolioHoldingActivity.w()).f5195v.setEnabled(false);
                    o lifecycle = leaguePortfolioHoldingActivity.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    leaguePortfolioHoldingActivity.f9989k = new kg.a(lifecycle);
                    k1 k1Var = (k1) leaguePortfolioHoldingActivity.w();
                    kg.a aVar = leaguePortfolioHoldingActivity.f9989k;
                    if (aVar != null) {
                        k1Var.f5194u.setAdapter(aVar);
                        kg.a aVar2 = leaguePortfolioHoldingActivity.f9989k;
                        if (aVar2 != null) {
                            aVar2.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioStocksAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("frozenPortfolioStocksAdapter");
                    throw null;
                }
                return;
            default:
                if (list != null && !list.isEmpty()) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5192s.A.setVisibility(0);
                    ((k1) leaguePortfolioHoldingActivity.w()).f5195v.setEnabled(false);
                    o lifecycle2 = leaguePortfolioHoldingActivity.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                    leaguePortfolioHoldingActivity.f9990l = new rg.e(lifecycle2);
                    k1 k1Var2 = (k1) leaguePortfolioHoldingActivity.w();
                    rg.e eVar = leaguePortfolioHoldingActivity.f9990l;
                    if (eVar != null) {
                        k1Var2.f5194u.setAdapter(eVar);
                        rg.e eVar2 = leaguePortfolioHoldingActivity.f9990l;
                        if (eVar2 != null) {
                            eVar2.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioOptionAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("frozenPortfolioOptionAdapter");
                    throw null;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17411a;
        boolean z10 = false;
        LeaguePortfolioHoldingActivity leaguePortfolioHoldingActivity = this.f17412b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            case 6:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5195v.setRefreshing(true);
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((k1) leaguePortfolioHoldingActivity.w()).f5195v.setRefreshing(false);
                }
                return Unit.f23355a;
            case 7:
                a((String) obj);
                return Unit.f23355a;
            case 8:
                a((String) obj);
                return Unit.f23355a;
            case 9:
                a((String) obj);
                return Unit.f23355a;
            case 10:
                a((String) obj);
                return Unit.f23355a;
            case 11:
                Double d10 = (Double) obj;
                ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6577w.setText(String.valueOf(d10));
                Intrinsics.c(d10);
                if (d10.doubleValue() >= 0.0d) {
                    z10 = true;
                }
                if (z10) {
                    ImageView imageView = ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6578x;
                    Resources resources = leaguePortfolioHoldingActivity.getResources();
                    Resources.Theme theme = leaguePortfolioHoldingActivity.getTheme();
                    ThreadLocal threadLocal = t3.p.f35324a;
                    imageView.setImageDrawable(i.a(resources, R.drawable.ic_stock_up_arrow, theme));
                } else if (!z10) {
                    ImageView imageView2 = ((k1) leaguePortfolioHoldingActivity.w()).f5192s.f6578x;
                    Resources resources2 = leaguePortfolioHoldingActivity.getResources();
                    Resources.Theme theme2 = leaguePortfolioHoldingActivity.getTheme();
                    ThreadLocal threadLocal2 = t3.p.f35324a;
                    imageView2.setImageDrawable(i.a(resources2, R.drawable.ic_stock_down_arrow, theme2));
                }
                return Unit.f23355a;
            case 12:
                d((List) obj);
                return Unit.f23355a;
            case 13:
                d((List) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
