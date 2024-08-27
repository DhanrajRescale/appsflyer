package com.firebase.ui.auth.data.remote;

import am.b;
import android.app.Application;
import android.content.Intent;
import cm.c;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.google.firebase.auth.FirebaseAuth;
import zl.d;

/* loaded from: classes.dex */
public class EmailSignInHandler extends SingleProviderSignInHandler<Void> {
    public EmailSignInHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
        if (i11 != 5 && i10 == 106) {
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
        b y10 = cVar.y();
        int i10 = EmailActivity.f10911c;
        cVar.startActivityForResult(c.v(cVar, EmailActivity.class, y10), 106);
    }
}
