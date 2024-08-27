package com.assetgro.stockgro.ui.chat.guidelines;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.og;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import ij.k;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/guidelines/CommunityGuidelinesFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/guidelines/CommunityGuidelinesViewModel;", "Lba/og;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CommunityGuidelinesFragment extends m<CommunityGuidelinesViewModel, og> {

    /* renamed from: g, reason: collision with root package name */
    public ChatSharedViewModel f9345g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_community_guidelines;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ChatSharedViewModel chatSharedViewModel = this.f9345g;
        if (chatSharedViewModel != null) {
            chatSharedViewModel.f9135p.postValue(getString(R.string.text_community_guidelines));
            og ogVar = (og) q();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            k kVar = new k(requireContext);
            WebView webView = ogVar.f5665s;
            webView.setWebViewClient(kVar);
            webView.loadUrl("https://stockgro.club/guidelines/");
            return;
        }
        Intrinsics.k("chatSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(CommunityGuidelinesViewModel.class), new ea.c(k10, c10, userRepository, 23));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, CommunityGuidelinesViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(CommunityGuidelinesViewModel.class, "<this>", CommunityGuidelinesViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            CommunityGuidelinesViewModel communityGuidelinesViewModel = (CommunityGuidelinesViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(communityGuidelinesViewModel);
            this.f17284b = communityGuidelinesViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            this.f9345g = fragmentComponent.b();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
