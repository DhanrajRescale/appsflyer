package com.assetgro.stockgro.ui.payments.kyc;

import a3.a;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.navigation.i;
import ba.qi;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import p004if.c;
import vl.b;
import xf.o;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycQuerySubmittedFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycFAQViewModel;", "Lba/qi;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycQuerySubmittedFragment extends m<KycFAQViewModel, qi> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9689h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9690g = new i(a0.a(o.class), new z1(this, 27));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_query_submitted;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        j0 activity = getActivity();
        Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        b r10 = ((h.m) activity).r();
        if (r10 != null) {
            r10.l0(getString(R.string.text_query_submitted));
        }
        qi qiVar = (qi) q();
        String string = getString(R.string.text_request_no);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        i iVar = this.f9690g;
        qiVar.f5870t.setText(a.m(new Object[]{((o) iVar.getValue()).f40227a.getRequestId()}, 1, string, "format(...)"));
        qi qiVar2 = (qi) q();
        qiVar2.f5871u.setText(((o) iVar.getValue()).f40227a.getMessage());
        qi qiVar3 = (qi) q();
        qiVar3.f5872v.setText(((o) iVar.getValue()).f40227a.getUserEmail());
        qi qiVar4 = (qi) q();
        qiVar4.f5869s.setOnClickListener(new c(this, 14));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.d();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        g.i(h10);
        this.f17287e = h10;
    }
}
