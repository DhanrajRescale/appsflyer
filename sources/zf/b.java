package zf;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.ui;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.cards.KycTutorialCardViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import t3.i;
import t3.p;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzf/b;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/cards/KycTutorialCardViewModel;", "Lba/ui;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends m<KycTutorialCardViewModel, ui> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f42442h = 0;

    /* renamed from: g, reason: collision with root package name */
    public Integer f42443g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_tutorial_card;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Integer num = this.f42443g;
        Resources.Theme theme = null;
        if (num != null && num.intValue() == 0) {
            ui uiVar = (ui) q();
            Resources resources = getResources();
            j0 activity = getActivity();
            if (activity != null) {
                theme = activity.getTheme();
            }
            ThreadLocal threadLocal = p.f35324a;
            uiVar.f6323s.setImageDrawable(i.a(resources, R.drawable.ic_allow_contacts_access, theme));
            ui uiVar2 = (ui) q();
            uiVar2.f6324t.setText(getString(R.string.kyc_tutorial_card_message_one));
            return;
        }
        if (num != null && num.intValue() == 1) {
            ui uiVar3 = (ui) q();
            Resources resources2 = getResources();
            j0 activity2 = getActivity();
            if (activity2 != null) {
                theme = activity2.getTheme();
            }
            ThreadLocal threadLocal2 = p.f35324a;
            uiVar3.f6323s.setImageDrawable(i.a(resources2, R.drawable.ic_bull_coffee, theme));
            ui uiVar4 = (ui) q();
            uiVar4.f6324t.setText(getString(R.string.kyc_tutorial_card_message_two));
            return;
        }
        if (num != null && num.intValue() == 2) {
            ui uiVar5 = (ui) q();
            Resources resources3 = getResources();
            j0 activity3 = getActivity();
            if (activity3 != null) {
                theme = activity3.getTheme();
            }
            ThreadLocal threadLocal3 = p.f35324a;
            uiVar5.f6323s.setImageDrawable(i.a(resources3, R.drawable.ic_bull_selfie, theme));
            ui uiVar6 = (ui) q();
            uiVar6.f6324t.setText(getString(R.string.kyc_tutorial_card_message_three));
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(KycTutorialCardViewModel.class), new ea.c(k10, c10, userRepository, 28));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycTutorialCardViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycTutorialCardViewModel.class, "<this>", KycTutorialCardViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycTutorialCardViewModel kycTutorialCardViewModel = (KycTutorialCardViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycTutorialCardViewModel);
            this.f17284b = kycTutorialCardViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
