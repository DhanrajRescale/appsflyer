package com.assetgro.stockgro.ui.payments.kyc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.h1;
import ba.e1;
import ca.c;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import de.d;
import ea.v;
import gd.b;
import ij.k;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import xf.c0;
import xf.d0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycWebViewActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycWebViewViewModel;", "Lba/e1;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycWebViewActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final d f9704k = new d(26, 0);

    @Override // gd.b
    public final int F() {
        return R.layout.activity_kyc;
    }

    @Override // gd.b
    public final void I() {
        e1 e1Var = (e1) w();
        k kVar = new k(this);
        WebView webView = e1Var.f4557s;
        webView.setWebViewClient(kVar);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        int i10 = 0;
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        KycResponseDto kycResponseDto = null;
        webView.setLayerType(2, null);
        WebView.setWebContentsDebuggingEnabled(true);
        int checkSelfPermission = checkSelfPermission("android.permission.CAMERA");
        ArrayList arrayList = new ArrayList();
        if (checkSelfPermission != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!arrayList.isEmpty()) {
            requestPermissions((String[]) arrayList.toArray(new String[0]), 111);
        }
        ((e1) w()).f4557s.setWebChromeClient(new c0(this, i10));
        ((e1) w()).f4557s.setWebViewClient(new d0(this, i10));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("KycData");
        if (parcelableExtra instanceof KycResponseDto) {
            kycResponseDto = (KycResponseDto) parcelableExtra;
        }
        if (kycResponseDto != null) {
            webView.loadUrl(kycResponseDto.getCaptureLink() + "&redirect_uri=https://stockgro.club/");
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        int i10 = yf.b.f41614i;
        Bundle bundle = new Bundle();
        yf.b bVar = new yf.b();
        bVar.setArguments(bundle);
        bVar.show(getSupportFragmentManager(), "KycCancelBottomSheetDialogFragment");
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i10 == 1234) {
            if (r3.k.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
                Intent intent = new Intent(this, (Class<?>) KycHostActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    intent.putExtras(extras);
                }
                startActivity(intent);
                finish();
                return;
            }
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
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
        c factory = new c(a0.a(KycWebViewViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 13));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, KycWebViewViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycWebViewViewModel.class, "<this>", KycWebViewViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycWebViewViewModel kycWebViewViewModel = (KycWebViewViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycWebViewViewModel);
            this.f17254b = kycWebViewViewModel;
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
