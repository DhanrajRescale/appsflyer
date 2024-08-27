package com.firebase.ui.auth.ui.email;

import android.os.Bundle;
import cm.a;
import cm.b;
import com.assetgro.stockgro.prod.R;
import em.e;
import em.f;
import em.i;
import em.j;

/* loaded from: classes.dex */
public class EmailLinkErrorRecoveryActivity extends a implements i, e {
    @Override // cm.g
    public final void b() {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // cm.g
    public final void f(int i10) {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b jVar;
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        if (getIntent().getIntExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", -1) == 116) {
            jVar = new f();
        } else {
            jVar = new j();
        }
        A(jVar, "EmailLinkPromptEmailFragment", false, false);
    }
}
