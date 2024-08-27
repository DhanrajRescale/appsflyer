package com.assetgro.stockgro.ui.payments.kyc;

import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import androidx.viewpager.widget.ViewPager;
import ba.si;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycStepFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import lc.b;
import qu.i0;
import ut.g;
import ut.h;
import xf.q;
import xf.r;
import zf.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycStepFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycStepViewModel;", "Lba/si;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycStepFragment extends m<KycStepViewModel, si> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9691i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final g f9692g = h.a(new b(this, 27));

    /* renamed from: h, reason: collision with root package name */
    public final i f9693h = new i(a0.a(r.class), new z1(this, 28));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_steps;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewPager viewPager = ((si) q()).f6089t;
        final int i10 = 0;
        viewPager.setClipToPadding(false);
        viewPager.setPadding(64, 4, 64, 4);
        viewPager.setPageMargin(16);
        viewPager.setAdapter((a) this.f9692g.getValue());
        ((si) q()).f6091v.setViewPager(((si) q()).f6089t);
        String string = getString(R.string.mobile_number_not_linked);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 0);
        ((si) q()).f6090u.setText(spannableString);
        SpannableString spannableString2 = new SpannableString(getString(R.string.kyc_acceptance_message));
        spannableString2.setSpan(new q(this, 0), 47, 65, 33);
        final int i11 = 1;
        spannableString2.setSpan(new q(this, 1), spannableString2.length() - 15, spannableString2.length() - 1, 33);
        ((si) q()).f6088s.setText(spannableString2);
        ((si) q()).f6088s.setMovementMethod(LinkMovementMethod.getInstance());
        ((si) q()).f6092w.setOnClickListener(new View.OnClickListener(this) { // from class: xf.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycStepFragment f40229b;

            {
                this.f40229b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                KycStepFragment this$0 = this.f40229b;
                switch (i12) {
                    case 0:
                        int i13 = KycStepFragment.f9691i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = r3.k.checkSelfPermission(this$0.requireActivity(), "android.permission.CAMERA");
                        androidx.navigation.i iVar = this$0.f9693h;
                        if (checkSelfPermission == 0) {
                            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) KycWebViewActivity.class);
                            intent.putExtra("KycData", ((r) iVar.getValue()).f40232a);
                            this$0.startActivity(intent);
                            this$0.requireActivity().finish();
                            return;
                        }
                        q6.l.h(this$0).l(R.id.moveToPermissionScreen, ((r) iVar.getValue()).a(), null);
                        return;
                    default:
                        int i14 = KycStepFragment.f9691i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://uidai.gov.in/my-aadhaar/about-your-aadhaar/updating-data-on-aadhaar.html")));
                        return;
                }
            }
        });
        ((si) q()).f6090u.setOnClickListener(new View.OnClickListener(this) { // from class: xf.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycStepFragment f40229b;

            {
                this.f40229b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                KycStepFragment this$0 = this.f40229b;
                switch (i12) {
                    case 0:
                        int i13 = KycStepFragment.f9691i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = r3.k.checkSelfPermission(this$0.requireActivity(), "android.permission.CAMERA");
                        androidx.navigation.i iVar = this$0.f9693h;
                        if (checkSelfPermission == 0) {
                            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) KycWebViewActivity.class);
                            intent.putExtra("KycData", ((r) iVar.getValue()).f40232a);
                            this$0.startActivity(intent);
                            this$0.requireActivity().finish();
                            return;
                        }
                        q6.l.h(this$0).l(R.id.moveToPermissionScreen, ((r) iVar.getValue()).a(), null);
                        return;
                    default:
                        int i14 = KycStepFragment.f9691i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://uidai.gov.in/my-aadhaar/about-your-aadhaar/updating-data-on-aadhaar.html")));
                        return;
                }
            }
        });
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(KycStepViewModel.class), new ea.c(k10, c10, userRepository, 27));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycStepViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycStepViewModel.class, "<this>", KycStepViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycStepViewModel kycStepViewModel = (KycStepViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(kycStepViewModel);
            this.f17284b = kycStepViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
