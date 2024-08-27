package com.firebase.ui.auth.ui.email;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import cm.a;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.internal.Preconditions;
import em.g;
import em.h;
import em.l;
import em.n;
import zl.b;
import zl.d;

/* loaded from: classes.dex */
public class EmailActivity extends a implements em.a, l, g, n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10911c = 0;

    public final void B() {
        overridePendingTransition(R.anim.fui_slide_in_right, R.anim.fui_slide_out_left);
    }

    public final void C(b bVar, String str) {
        A(h.p(str, (zp.b) bVar.a().getParcelable("action_code_settings"), null, false), "EmailLinkFragment", false, false);
    }

    @Override // cm.g
    public final void b() {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    @Override // cm.g
    public final void f(int i10) {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 104 || i10 == 103) {
            w(i11, intent);
        }
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        String string = getIntent().getExtras().getString("extra_email");
        d dVar = (d) getIntent().getExtras().getParcelable("extra_idp_response");
        if (string != null && dVar != null) {
            b e02 = el.l.e0("emailLink", y().f742b);
            zp.b bVar = (zp.b) e02.a().getParcelable("action_code_settings");
            im.b bVar2 = im.b.f20115c;
            Application application = getApplication();
            bVar2.getClass();
            zp.d dVar2 = dVar.f42564b;
            if (dVar2 != null) {
                bVar2.f20116a = dVar2;
            }
            Preconditions.checkNotNull(application);
            Preconditions.checkNotNull(dVar);
            SharedPreferences.Editor edit = application.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
            edit.putString("com.firebase.ui.auth.data.client.email", dVar.c());
            edit.putString("com.firebase.ui.auth.data.client.provider", dVar.e());
            edit.putString("com.firebase.ui.auth.data.client.idpToken", dVar.f42565c);
            edit.putString("com.firebase.ui.auth.data.client.idpSecret", dVar.f42566d);
            edit.apply();
            A(h.p(string, bVar, dVar, e02.a().getBoolean("force_same_device")), "EmailLinkFragment", false, false);
            return;
        }
        b d02 = el.l.d0("password", y().f742b);
        if (d02 != null) {
            string = d02.a().getString("extra_default_email");
        }
        em.b bVar3 = new em.b();
        Bundle bundle2 = new Bundle();
        bundle2.putString("extra_email", string);
        bVar3.setArguments(bundle2);
        A(bVar3, "CheckEmailFragment", false, false);
    }
}
