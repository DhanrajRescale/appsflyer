package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import android.text.TextUtils;
import androidx.fragment.app.h;
import bm.c;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import el.l;
import ie.n;
import im.a;
import im.b;
import lp.g0;
import zl.d;
import zp.f;

/* loaded from: classes.dex */
public class EmailLinkSignInHandler extends SignInViewModelBase {
    public EmailLinkSignInHandler(Application application) {
        super(application);
    }

    public final void k(d dVar, String str) {
        Task c10;
        if (TextUtils.isEmpty(str)) {
            h(am.d.a(new FirebaseUiException(6)));
            return;
        }
        a b10 = a.b();
        b bVar = b.f20115c;
        String str2 = ((am.b) this.f10961d).f748h;
        if (dVar == null) {
            f d10 = g0.d(str, str2);
            f d11 = g0.d(str, str2);
            FirebaseAuth firebaseAuth = this.f10958g;
            am.b bVar2 = (am.b) this.f10961d;
            b10.getClass();
            if (a.a(firebaseAuth, bVar2)) {
                c10 = firebaseAuth.f11632f.S(d10);
            } else {
                c10 = firebaseAuth.c(d10);
            }
            c10.addOnSuccessListener(new c(3, this, bVar)).addOnFailureListener(new n(2, this, bVar, d11));
            return;
        }
        zp.d b02 = l.b0(dVar);
        f d12 = g0.d(dVar.c(), str2);
        FirebaseAuth firebaseAuth2 = this.f10958g;
        am.b bVar3 = (am.b) this.f10961d;
        b10.getClass();
        if (a.a(firebaseAuth2, bVar3)) {
            b10.d(d12, b02, (am.b) this.f10961d).addOnCompleteListener(new em.c(this, bVar, b02, 1));
        } else {
            this.f10958g.c(d12).continueWithTask(new h(this, bVar, b02, dVar, 3)).addOnSuccessListener(new mm.b(this)).addOnFailureListener(new mm.b(this));
        }
    }
}
