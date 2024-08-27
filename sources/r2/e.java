package r2;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r3.k;
import xf.j;

/* loaded from: classes.dex */
public final class e extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33045a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33046b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f33045a = i10;
        this.f33046b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View p02) {
        int i10 = this.f33045a;
        Object obj = this.f33046b;
        switch (i10) {
            case 0:
                ((Function0) obj).mo2invoke();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(p02, "p0");
                ((WalletHomeViewModel) ((WalletHomeActivity) obj).x()).i();
                return;
            default:
                Intrinsics.checkNotNullParameter(p02, "widget");
                KycFAQViewModel kycFAQViewModel = (KycFAQViewModel) ((KycFAQFragment) obj).r();
                kycFAQViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(kycFAQViewModel), null, null, new j(kycFAQViewModel, null), 3);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        switch (this.f33045a) {
            case 1:
                Intrinsics.checkNotNullParameter(ds2, "ds");
                super.updateDrawState(ds2);
                ds2.setColor(k.getColor((WalletHomeActivity) this.f33046b, R.color.wallet_view_details_color));
                return;
            default:
                super.updateDrawState(ds2);
                return;
        }
    }
}
