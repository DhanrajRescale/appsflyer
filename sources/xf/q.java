package xf;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycStepFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycStepFragment f40231b;

    public /* synthetic */ q(KycStepFragment kycStepFragment, int i10) {
        this.f40230a = i10;
        this.f40231b = kycStepFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View p02) {
        int i10 = this.f40230a;
        KycStepFragment kycStepFragment = this.f40231b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(p02, "p0");
                kycStepFragment.startActivity(new Intent(kycStepFragment.requireContext(), (Class<?>) AppTncActivity.class));
                return;
            default:
                Intrinsics.checkNotNullParameter(p02, "p0");
                kycStepFragment.startActivity(new Intent(kycStepFragment.requireContext(), (Class<?>) AppPrivacyPolicyActivity.class));
                return;
        }
    }
}
