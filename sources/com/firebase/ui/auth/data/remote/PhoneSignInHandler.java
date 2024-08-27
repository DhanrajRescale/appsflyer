package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import cm.c;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.google.firebase.auth.FirebaseAuth;
import zl.b;
import zl.d;

/* loaded from: classes.dex */
public class PhoneSignInHandler extends SingleProviderSignInHandler<b> {
    public PhoneSignInHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
        if (i10 == 107) {
            d b10 = d.b(intent);
            if (b10 == null) {
                h(am.d.a(new UserCancellationException()));
            } else {
                h(am.d.c(b10));
            }
        }
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void j(FirebaseAuth firebaseAuth, c cVar, String str) {
        am.b y10 = cVar.y();
        Bundle a10 = ((b) this.f10961d).a();
        int i10 = PhoneActivity.f10951d;
        cVar.startActivityForResult(c.v(cVar, PhoneActivity.class, y10).putExtra("extra_params", a10), 107);
    }
}
