package com.firebase.ui.auth.viewmodel.idp;

import am.b;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import ek.u;
import el.l;
import im.a;
import java.util.List;
import nm.c;
import zl.d;
import zp.e;

/* loaded from: classes.dex */
public class SocialProviderResponseHandler extends SignInViewModelBase {
    public SocialProviderResponseHandler(Application application) {
        super(application);
    }

    public final void k(int i10, int i11, Intent intent) {
        FirebaseUiException firebaseUiException;
        if (i10 == 108) {
            d b10 = d.b(intent);
            if (i11 == -1) {
                h(am.d.c(b10));
                return;
            }
            if (b10 == null) {
                firebaseUiException = new FirebaseUiException(0, "Link canceled by user.");
            } else {
                firebaseUiException = b10.f42568f;
            }
            h(am.d.a(firebaseUiException));
        }
    }

    public final void l(final d dVar) {
        Task c10;
        boolean f10 = dVar.f();
        zp.d dVar2 = dVar.f42564b;
        if (!f10 && dVar2 == null && dVar.c() == null) {
            h(am.d.a(dVar.f42568f));
            return;
        }
        String e10 = dVar.e();
        if (!TextUtils.equals(e10, "password") && !TextUtils.equals(e10, "phone")) {
            h(am.d.b());
            if (dVar2 != null) {
                final int i10 = 1;
                l.S(this.f10958g, (b) this.f10961d, dVar.c()).addOnSuccessListener(new OnSuccessListener(this) { // from class: nm.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SocialProviderResponseHandler f28987b;

                    {
                        this.f28987b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        int i11 = i10;
                        zl.d dVar3 = dVar;
                        SocialProviderResponseHandler socialProviderResponseHandler = this.f28987b;
                        switch (i11) {
                            case 0:
                                socialProviderResponseHandler.j(dVar3, (e) obj);
                                return;
                            default:
                                List list = (List) obj;
                                socialProviderResponseHandler.getClass();
                                if (list.isEmpty()) {
                                    socialProviderResponseHandler.h(am.d.a(new FirebaseUiException(3, "No supported providers.")));
                                    return;
                                } else {
                                    socialProviderResponseHandler.m(dVar3, (String) list.get(0));
                                    return;
                                }
                        }
                    }
                }).addOnFailureListener(new nm.d(this, 1));
                return;
            }
            zp.d b02 = l.b0(dVar);
            a b10 = a.b();
            FirebaseAuth firebaseAuth = this.f10958g;
            b bVar = (b) this.f10961d;
            b10.getClass();
            if (a.a(firebaseAuth, bVar)) {
                c10 = firebaseAuth.f11632f.S(b02);
            } else {
                c10 = firebaseAuth.c(b02);
            }
            final int i11 = 0;
            c10.continueWithTask(new u(dVar, 5)).addOnSuccessListener(new OnSuccessListener(this) { // from class: nm.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SocialProviderResponseHandler f28987b;

                {
                    this.f28987b = this;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    int i112 = i11;
                    zl.d dVar3 = dVar;
                    SocialProviderResponseHandler socialProviderResponseHandler = this.f28987b;
                    switch (i112) {
                        case 0:
                            socialProviderResponseHandler.j(dVar3, (e) obj);
                            return;
                        default:
                            List list = (List) obj;
                            socialProviderResponseHandler.getClass();
                            if (list.isEmpty()) {
                                socialProviderResponseHandler.h(am.d.a(new FirebaseUiException(3, "No supported providers.")));
                                return;
                            } else {
                                socialProviderResponseHandler.m(dVar3, (String) list.get(0));
                                return;
                            }
                    }
                }
            }).addOnFailureListener(new c(this, dVar, b02));
            return;
        }
        throw new IllegalStateException("This handler cannot be used with email or phone providers");
    }

    public final void m(d dVar, String str) {
        if (str != null) {
            if (str.equals("password")) {
                Application e10 = e();
                b bVar = (b) this.f10961d;
                int i10 = WelcomeBackPasswordPrompt.f10925i;
                h(am.d.a(new IntentRequiredException(108, cm.c.v(e10, WelcomeBackPasswordPrompt.class, bVar).putExtra("extra_idp_response", dVar))));
                return;
            }
            if (str.equals("emailLink")) {
                Application e11 = e();
                b bVar2 = (b) this.f10961d;
                int i11 = WelcomeBackEmailLinkPrompt.f10921f;
                h(am.d.a(new IntentRequiredException(112, cm.c.v(e11, WelcomeBackEmailLinkPrompt.class, bVar2).putExtra("extra_idp_response", dVar))));
                return;
            }
            h(am.d.a(new IntentRequiredException(108, WelcomeBackIdpPrompt.B(e(), (b) this.f10961d, new am.e(str, dVar.c(), null, null, null), dVar))));
            return;
        }
        throw new IllegalStateException("No provider even though we received a FirebaseAuthUserCollisionException");
    }
}
