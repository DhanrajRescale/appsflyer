package cm;

import android.os.Bundle;
import androidx.fragment.app.d1;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public abstract class a extends c {
    public final void A(b bVar, String str, boolean z10, boolean z11) {
        d1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        if (z10) {
            aVar.f1799b = R.anim.fui_slide_in_right;
            aVar.f1800c = R.anim.fui_slide_out_left;
            aVar.f1801d = 0;
            aVar.f1802e = 0;
        }
        aVar.f(R.id.fragment_register_email, bVar, str);
        if (z11) {
            aVar.c(null);
            aVar.h(false);
        } else {
            aVar.d();
            aVar.h(false);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.FirebaseUI);
        setTheme(y().f744d);
        if (y().f754n) {
            setRequestedOrientation(1);
        }
    }
}
