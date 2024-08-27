package eb;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.zf;
import com.assetgro.stockgro.feature_onboarding.presentation.register.InvitationResponseViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import iu.a0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Leb/a;", "Lgd/h;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/register/InvitationResponseViewModel;", "Lba/zf;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends gd.h<InvitationResponseViewModel, zf> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15299i = 0;

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(InvitationResponseViewModel.class), new b0(schedulerProvider, compositeDisposable, 5));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, InvitationResponseViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(InvitationResponseViewModel.class, "<this>", InvitationResponseViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            InvitationResponseViewModel invitationResponseViewModel = (InvitationResponseViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(invitationResponseViewModel);
            this.f17270b = invitationResponseViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_bottom_sheet_invitation_response;
    }

    @Override // gd.h
    public final void z(View view) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        Pair pair = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("TYPE");
        } else {
            serializable = null;
        }
        if (serializable instanceof Pair) {
            pair = (Pair) serializable;
        }
        if (pair != null) {
            boolean booleanValue = ((Boolean) pair.f23353a).booleanValue();
            if (booleanValue) {
                ((zf) r()).f6847u.setText(getString(R.string.invitation_code_success_message));
                ((zf) r()).f6846t.setText(getString(R.string.invitation_code_success_message_two));
                ((zf) r()).f6848v.setImageDrawable(r3.k.getDrawable(requireContext(), R.drawable.ic_payment_successful));
            } else if (!booleanValue) {
                ((zf) r()).f6847u.setText((CharSequence) pair.f23354b);
                ((zf) r()).f6848v.setImageDrawable(r3.k.getDrawable(requireContext(), R.drawable.ic_payment_failed));
            }
        }
        ((zf) r()).f6845s.setOnClickListener(new bb.a(2, pair, this));
    }
}
