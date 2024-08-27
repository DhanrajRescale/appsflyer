package wl;

import android.app.Dialog;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f39190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, androidx.fragment.app.j0 j0Var) {
        super(j0Var, R.style.com_facebook_auth_dialog);
        this.f39190a = iVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f39190a.getClass();
        super.onBackPressed();
    }
}
