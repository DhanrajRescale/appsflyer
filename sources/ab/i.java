package ab;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileLoginFragment f296b;

    public /* synthetic */ i(MobileLoginFragment mobileLoginFragment, int i10) {
        this.f295a = i10;
        this.f296b = mobileLoginFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i10 = this.f295a;
        MobileLoginFragment mobileLoginFragment = this.f296b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                mobileLoginFragment.getClass();
                mobileLoginFragment.startActivity(new Intent(mobileLoginFragment.requireActivity(), (Class<?>) AppTncActivity.class));
                return;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                mobileLoginFragment.getClass();
                mobileLoginFragment.startActivity(new Intent(mobileLoginFragment.requireActivity(), (Class<?>) AppPrivacyPolicyActivity.class));
                return;
        }
    }
}
