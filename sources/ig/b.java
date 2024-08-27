package ig;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import ba.b3;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioSharedViewModel;
import com.assetgro.stockgro.ui.stock.list.StockListHostActivity;
import iu.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t3.p;
import yo.n;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioDetailActivity f19968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PortfolioDetailActivity portfolioDetailActivity, int i10) {
        super(1);
        this.f19967a = i10;
        this.f19968b = portfolioDetailActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f19967a;
        PortfolioDetailActivity context = this.f19968b;
        switch (i10) {
            case 5:
                PortfolioSharedViewModel portfolioSharedViewModel = context.f9775k;
                if (portfolioSharedViewModel != null) {
                    portfolioSharedViewModel.f9791c.setValue(bool);
                    return;
                } else {
                    Intrinsics.k("model");
                    throw null;
                }
            case 13:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    String text = context.getResources().getString(R.string.text_reset_portfolio_success);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    }
                } else {
                    String text2 = context.getResources().getString(R.string.text_reset_portfolio_failure);
                    Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text2, "text");
                    if (text2.length() != 0) {
                        Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService2 = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    }
                }
                context.finish();
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((b3) context.w()).f4247t.f6237u.setVisibility(0);
                    ((b3) context.w()).A.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((b3) context.w()).f4247t.f6237u.setVisibility(8);
                        ((b3) context.w()).A.setVisibility(8);
                        return;
                    }
                    return;
                }
        }
    }

    public final void d(Integer num) {
        int i10 = this.f19967a;
        PortfolioDetailActivity portfolioDetailActivity = this.f19968b;
        switch (i10) {
            case 0:
                TextView textView = ((b3) portfolioDetailActivity.w()).f4247t.f6235s;
                Context context = textView.getContext();
                Intrinsics.c(num);
                textView.setTextColor(r3.k.getColor(context, num.intValue()));
                TextView textView2 = ((b3) portfolioDetailActivity.w()).f4247t.f6239w;
                textView2.setTextColor(r3.k.getColor(textView2.getContext(), num.intValue()));
                return;
            case 1:
                RelativeLayout relativeLayout = ((b3) portfolioDetailActivity.w()).f4247t.f6237u;
                Resources resources = relativeLayout.getResources();
                Intrinsics.c(num);
                int intValue = num.intValue();
                Resources.Theme theme = portfolioDetailActivity.getTheme();
                ThreadLocal threadLocal = p.f35324a;
                relativeLayout.setBackground(t3.i.a(resources, intValue, theme));
                return;
            case 2:
                View view = ((b3) portfolioDetailActivity.w()).A;
                Context context2 = view.getContext();
                Intrinsics.c(num);
                view.setBackgroundColor(r3.k.getColor(context2, num.intValue()));
                return;
            case 3:
                b3 b3Var = (b3) portfolioDetailActivity.w();
                TextView textView3 = ((b3) portfolioDetailActivity.w()).f4247t.f6239w;
                Context context3 = b3Var.A.getContext();
                Intrinsics.c(num);
                textView3.setTextColor(r3.k.getColor(context3, num.intValue()));
                return;
            case 7:
                if (((b3) portfolioDetailActivity.w()).f4250w.getSelectedTabPosition() == 0) {
                    b3 b3Var2 = (b3) portfolioDetailActivity.w();
                    Intrinsics.c(num);
                    b3Var2.f4246s.setVisibility(num.intValue());
                    return;
                }
                return;
            case 17:
                TextView textView4 = ((b3) portfolioDetailActivity.w()).f4247t.f6239w;
                Intrinsics.c(num);
                textView4.setText(portfolioDetailActivity.getString(num.intValue()));
                return;
            case 19:
                LinearLayout linearLayout = ((b3) portfolioDetailActivity.w()).f4247t.f6236t;
                Resources resources2 = linearLayout.getResources();
                Intrinsics.c(num);
                int intValue2 = num.intValue();
                Resources.Theme theme2 = portfolioDetailActivity.getTheme();
                ThreadLocal threadLocal2 = p.f35324a;
                linearLayout.setBackground(t3.i.a(resources2, intValue2, theme2));
                return;
            default:
                ImageView imageView = ((b3) portfolioDetailActivity.w()).f4247t.f6238v;
                Resources resources3 = imageView.getResources();
                Intrinsics.c(num);
                int intValue3 = num.intValue();
                Resources.Theme theme3 = portfolioDetailActivity.getTheme();
                ThreadLocal threadLocal3 = p.f35324a;
                imageView.setImageDrawable(t3.i.a(resources3, intValue3, theme3));
                return;
        }
    }

    public final void e(String str) {
        String str2;
        int i10 = this.f19967a;
        PortfolioDetailActivity portfolioDetailActivity = this.f19968b;
        switch (i10) {
            case 10:
                Object obj = null;
                if (Intrinsics.a(str, "EQUITY")) {
                    PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) portfolioDetailActivity.x();
                    e0 e0Var = portfolioDetailViewModel.T;
                    Pair[] pairArr = new Pair[3];
                    e0 e0Var2 = portfolioDetailViewModel.I;
                    Portfolio portfolio = (Portfolio) e0Var2.getValue();
                    if (portfolio != null) {
                        obj = portfolio.getPortfolioId();
                    }
                    pairArr[0] = new Pair("PORTFOLIO_ID", obj);
                    pairArr[1] = new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE);
                    pairArr[2] = new Pair("PORTFOLIO", e0Var2.getValue());
                    e0Var.postValue(new kj.j(hl.f.y(pairArr)));
                    return;
                }
                if (Intrinsics.a(str, "OPTIONS")) {
                    PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) portfolioDetailActivity.x();
                    e0 e0Var3 = portfolioDetailViewModel2.V;
                    Pair[] pairArr2 = new Pair[3];
                    e0 e0Var4 = portfolioDetailViewModel2.I;
                    Portfolio portfolio2 = (Portfolio) e0Var4.getValue();
                    if (portfolio2 != null) {
                        str2 = portfolio2.getPortfolioId();
                    } else {
                        str2 = null;
                    }
                    pairArr2[0] = new Pair("PORTFOLIO_ID", str2);
                    pairArr2[1] = new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE);
                    Portfolio portfolio3 = (Portfolio) e0Var4.getValue();
                    if (portfolio3 != null) {
                        obj = Boolean.valueOf(portfolio3.isModelPortfolio());
                    }
                    pairArr2[2] = new Pair("IS_MODEL", obj);
                    e0Var3.postValue(new kj.j(hl.f.y(pairArr2)));
                    return;
                }
                return;
            default:
                ((b3) portfolioDetailActivity.w()).f4247t.f6235s.setText(str);
                return;
        }
    }

    public final void f(jg.b bVar) {
        String c10;
        String c11;
        int i10 = this.f19967a;
        PortfolioDetailActivity context = this.f19968b;
        String text = "Success";
        switch (i10) {
            case 14:
                String a10 = bVar.a();
                if (a10 != null && (c10 = kj.f.c(a10)) != null) {
                    text = c10;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            default:
                String a11 = bVar.a();
                if (a11 != null && (c11 = kj.f.c(a11)) != null) {
                    text = c11;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                }
                context.finish();
                return;
        }
    }

    public final void i(kj.j jVar) {
        int i10 = this.f19967a;
        PortfolioDetailActivity portfolioDetailActivity = this.f19968b;
        switch (i10) {
            case 8:
                portfolioDetailActivity.finish();
                return;
            case 9:
                Portfolio portfolio = (Portfolio) jVar.a();
                if (portfolio != null) {
                    int i11 = PortfolioDetailActivity.f9774m;
                    d1 supportFragmentManager = portfolioDetailActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    o lifecycle = portfolioDetailActivity.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    ((b3) portfolioDetailActivity.w()).f4253z.setAdapter(new j(supportFragmentManager, lifecycle, portfolio));
                    b3 b3Var = (b3) portfolioDetailActivity.w();
                    b3 b3Var2 = (b3) portfolioDetailActivity.w();
                    new n(b3Var.f4250w, b3Var2.f4253z, new vc.b(portfolioDetailActivity, 18)).a();
                    return;
                }
                return;
            case 10:
            default:
                Bundle bundle = (Bundle) jVar.a();
                if (bundle != null) {
                    Intent intent = new Intent(portfolioDetailActivity, (Class<?>) OptionsListHostActivity.class);
                    intent.putExtras(bundle);
                    portfolioDetailActivity.f9776l.a(intent);
                    return;
                }
                return;
            case 11:
                Bundle bundle2 = (Bundle) jVar.a();
                if (bundle2 != null) {
                    Intent intent2 = new Intent(portfolioDetailActivity, (Class<?>) StockListHostActivity.class);
                    intent2.putExtras(bundle2);
                    portfolioDetailActivity.startActivityForResult(intent2, 10020);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19967a;
        PortfolioDetailActivity portfolioDetailActivity = this.f19968b;
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
                d((Integer) obj);
                return Unit.f23355a;
            case 4:
                String displayName = ((BottomSheetItem) obj).getDisplayName();
                int i11 = PortfolioDetailActivity.f9774m;
                ((TextView) ((b3) portfolioDetailActivity.w()).f4249v.findViewById(R.id.portfolio_collapsed_list_selector)).setText(displayName);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                ArenaGame arenaGame = (ArenaGame) obj;
                PortfolioSharedViewModel portfolioSharedViewModel = portfolioDetailActivity.f9775k;
                if (portfolioSharedViewModel != null) {
                    portfolioSharedViewModel.f9792d.postValue(arenaGame);
                    return Unit.f23355a;
                }
                Intrinsics.k("model");
                throw null;
            case 7:
                d((Integer) obj);
                return Unit.f23355a;
            case 8:
                i((kj.j) obj);
                return Unit.f23355a;
            case 9:
                i((kj.j) obj);
                return Unit.f23355a;
            case 10:
                e((String) obj);
                return Unit.f23355a;
            case 11:
                i((kj.j) obj);
                return Unit.f23355a;
            case 12:
                i((kj.j) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            case 14:
                f((jg.b) obj);
                return Unit.f23355a;
            case 15:
                f((jg.b) obj);
                return Unit.f23355a;
            case 16:
                e((String) obj);
                return Unit.f23355a;
            case 17:
                d((Integer) obj);
                return Unit.f23355a;
            case 18:
                a((Boolean) obj);
                return Unit.f23355a;
            case 19:
                d((Integer) obj);
                return Unit.f23355a;
            default:
                d((Integer) obj);
                return Unit.f23355a;
        }
    }
}
