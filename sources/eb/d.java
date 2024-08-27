package eb;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileRegisterFragment f15305b;

    public /* synthetic */ d(MobileRegisterFragment mobileRegisterFragment, int i10) {
        this.f15304a = i10;
        this.f15305b = mobileRegisterFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i10 = this.f15304a;
        MobileRegisterFragment mobileRegisterFragment = this.f15305b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                mobileRegisterFragment.getClass();
                mobileRegisterFragment.startActivity(new Intent(mobileRegisterFragment.requireActivity(), (Class<?>) AppTncActivity.class));
                return;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                mobileRegisterFragment.getClass();
                mobileRegisterFragment.startActivity(new Intent(mobileRegisterFragment.requireActivity(), (Class<?>) AppPrivacyPolicyActivity.class));
                return;
        }
    }
}
