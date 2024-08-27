package com.assetgro.stockgro.feature_market.presentation.fno.order;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.h1;
import ba.ll;
import ba.ml;
import ca.c;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.domain.model.StockOptionPendingDto;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionPendingOrderViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.order.OptionOrderPendingActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import da.a;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/order/OptionOrderPendingActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/OptionPendingOrderViewModel;", "Lba/ll;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionOrderPendingActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f8646k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.fragment_option_pending_order;
    }

    @Override // gd.b
    public final void I() {
        final boolean z10;
        Object obj;
        Object parcelable;
        ml mlVar = (ml) ((ll) w());
        mlVar.B = (OptionPendingOrderViewModel) x();
        synchronized (mlVar) {
            mlVar.C |= 2;
        }
        mlVar.a(24);
        mlVar.m();
        Bundle extras = getIntent().getExtras();
        Object value = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = extras.getParcelable("STOCK_OPTION_PENDING", StockOptionPendingDto.class);
                obj = (Parcelable) parcelable;
            } else {
                Object parcelable2 = extras.getParcelable("STOCK_OPTION_PENDING");
                if (parcelable2 instanceof StockOptionPendingDto) {
                    value = parcelable2;
                }
                obj = (StockOptionPendingDto) value;
            }
            value = (StockOptionPendingDto) obj;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            z10 = extras2.getBoolean("CALL_FROM_PORTFOLIO");
        } else {
            z10 = false;
        }
        if (value != null) {
            OptionPendingOrderViewModel optionPendingOrderViewModel = (OptionPendingOrderViewModel) x();
            Intrinsics.checkNotNullParameter(value, "value");
            optionPendingOrderViewModel.f8579n.setValue(value);
        }
        ((ll) w()).A.setOnClickListener(new j(this, 6));
        ((ll) w()).f5370t.setOnClickListener(new View.OnClickListener() { // from class: ka.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i10 = OptionOrderPendingActivity.f8646k;
                OptionOrderPendingActivity context = OptionOrderPendingActivity.this;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Boolean bool = null;
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("Not connected to internet", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("Not connected to internet", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                if (z10) {
                    Intent intent = new Intent(context, (Class<?>) OptionsListHostActivity.class);
                    intent.addFlags(67108864);
                    intent.addFlags(536870912);
                    StockOptionPendingDto stockOptionPendingDto = (StockOptionPendingDto) ((OptionPendingOrderViewModel) context.x()).f8580o.getValue();
                    if (stockOptionPendingDto != null) {
                        str = stockOptionPendingDto.getPortfolioId();
                    } else {
                        str = null;
                    }
                    intent.putExtra("PORTFOLIO_ID", str);
                    intent.putExtra("CALL_FROM_PORTFOLIO", true);
                    StockOptionPendingDto stockOptionPendingDto2 = (StockOptionPendingDto) ((OptionPendingOrderViewModel) context.x()).f8580o.getValue();
                    if (stockOptionPendingDto2 != null) {
                        bool = Boolean.valueOf(stockOptionPendingDto2.isModelPortfolio());
                    }
                    intent.putExtra("IS_MODEL", bool);
                    context.startActivity(intent);
                }
                context.finish();
            }
        });
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(OptionPendingOrderViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 8));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, OptionPendingOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(OptionPendingOrderViewModel.class, "<this>", OptionPendingOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            OptionPendingOrderViewModel optionPendingOrderViewModel = (OptionPendingOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(optionPendingOrderViewModel);
            this.f17254b = optionPendingOrderViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
