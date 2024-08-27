package cm;

import android.content.Context;
import android.content.Intent;
import com.firebase.ui.auth.ui.credentials.CredentialSaveActivity;
import el.l;
import h.m;
import zp.h;

/* loaded from: classes.dex */
public abstract class c extends m implements g {

    /* renamed from: b, reason: collision with root package name */
    public am.b f8229b;

    public static Intent v(Context context, Class cls, am.b bVar) {
        l.A("context cannot be null", context, new Object[0]);
        Intent intent = new Intent(context, (Class<?>) cls);
        l.A("flowParams cannot be null", bVar, new Object[0]);
        Intent putExtra = intent.putExtra("extra_flow_params", bVar);
        putExtra.setExtrasClassLoader(zl.c.class.getClassLoader());
        return putExtra;
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 102 || i11 == 5) {
            w(i11, intent);
        }
    }

    public void w(int i10, Intent intent) {
        setResult(i10, intent);
        finish();
    }

    public final zl.c x() {
        return zl.c.a(y().f741a);
    }

    public final am.b y() {
        if (this.f8229b == null) {
            this.f8229b = (am.b) getIntent().getParcelableExtra("extra_flow_params");
        }
        return this.f8229b;
    }

    public final void z(h hVar, zl.d dVar, String str) {
        String x02;
        if (dVar == null) {
            x02 = null;
        } else {
            x02 = l.x0(dVar.e());
        }
        startActivityForResult(v(this, CredentialSaveActivity.class, y()).putExtra("extra_credential", hm.a.a(hVar, str, x02)).putExtra("extra_idp_response", dVar), 102);
    }
}
