package com.firebase.ui.auth.data.remote;

import am.b;
import am.d;
import android.app.Application;
import cm.c;
import com.google.firebase.auth.FirebaseAuth;
import dj.e;
import ek.h0;
import im.a;

/* loaded from: classes.dex */
public class GenericIdpAnonymousUpgradeLinkingHandler extends GenericIdpSignInHandler {
    public GenericIdpAnonymousUpgradeLinkingHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.data.remote.GenericIdpSignInHandler, com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void j(FirebaseAuth firebaseAuth, c cVar, String str) {
        h(d.b());
        b y10 = cVar.y();
        h0 k10 = k(str, firebaseAuth);
        if (y10 != null) {
            a.b().getClass();
            if (a.a(firebaseAuth, y10)) {
                cVar.x();
                a.b().c(y10).e(cVar, k10).addOnSuccessListener(new u5.d((Object) this, false, (Object) k10)).addOnFailureListener(new e(this, 7));
                return;
            }
        }
        cVar.x();
        firebaseAuth.e(cVar, k10).addOnSuccessListener(new bm.b(this, k10, 1)).addOnFailureListener(new bm.c(0, this, k10));
    }
}
