package ab;

import android.content.DialogInterface;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f294a) {
            case 0:
                int i11 = MobileLoginFragment.f8723k;
                dialogInterface.dismiss();
                return;
            default:
                ArrayList arrayList = gd.f.f17265m;
                if (i10 == -1) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
        }
    }
}
