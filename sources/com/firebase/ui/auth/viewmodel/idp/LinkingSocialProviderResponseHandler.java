package com.firebase.ui.auth.viewmodel.idp;

import am.b;
import android.app.Application;
import android.text.TextUtils;
import androidx.fragment.app.g;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.firebase.auth.FirebaseAuth;
import el.l;
import i5.w;
import im.a;
import zl.c;
import zp.d;
import zp.h;

/* loaded from: classes.dex */
public class LinkingSocialProviderResponseHandler extends SignInViewModelBase {

    /* renamed from: h, reason: collision with root package name */
    public d f10963h;

    /* renamed from: i, reason: collision with root package name */
    public String f10964i;

    public LinkingSocialProviderResponseHandler(Application application) {
        super(application);
    }

    public final void k(zl.d dVar) {
        h hVar;
        if (!dVar.f()) {
            h(am.d.a(dVar.f42568f));
            return;
        }
        String e10 = dVar.e();
        if (!TextUtils.equals(e10, "password") && !TextUtils.equals(e10, "phone")) {
            String str = this.f10964i;
            int i10 = 6;
            if (str != null && !str.equals(dVar.c())) {
                h(am.d.a(new FirebaseUiException(6)));
                return;
            }
            h(am.d.b());
            if (c.f42557c.contains(dVar.e()) && this.f10963h != null && (hVar = this.f10958g.f11632f) != null && !hVar.R()) {
                this.f10958g.f11632f.S(this.f10963h).addOnSuccessListener(new bm.c(8, this, dVar)).addOnFailureListener(new w(6));
                return;
            }
            a b10 = a.b();
            d b02 = l.b0(dVar);
            FirebaseAuth firebaseAuth = this.f10958g;
            b bVar = (b) this.f10961d;
            b10.getClass();
            if (a.a(firebaseAuth, bVar)) {
                d dVar2 = this.f10963h;
                if (dVar2 == null) {
                    i(b02);
                    return;
                } else {
                    b10.d(b02, dVar2, (b) this.f10961d).addOnSuccessListener(new bm.c(9, this, b02)).addOnFailureListener(new nm.a(this));
                    return;
                }
            }
            this.f10958g.c(b02).continueWithTask(new nm.a(this)).addOnCompleteListener(new g(i10, this, dVar));
            return;
        }
        throw new IllegalStateException("This handler cannot be used to link email or phone providers.");
    }
}
