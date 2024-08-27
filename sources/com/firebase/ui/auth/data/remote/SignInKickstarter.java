package com.firebase.ui.auth.data.remote;

import am.b;
import am.d;
import am.e;
import android.app.Application;
import android.os.Bundle;
import cm.c;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;

/* loaded from: classes.dex */
public class SignInKickstarter extends SignInViewModelBase {
    public SignInKickstarter(Application application) {
        super(application);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r15.equals(com.google.android.gms.auth.api.credentials.IdentityProviders.GOOGLE) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.auth.api.credentials.Credential r15) {
        /*
            r14 = this;
            java.lang.String r6 = r15.getId()
            java.lang.String r7 = r15.getPassword()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L77
            java.lang.String r0 = r15.getAccountType()
            if (r0 != 0) goto L1b
            r14.m()
            goto Lc3
        L1b:
            java.lang.String r15 = r15.getAccountType()
            r15.getClass()
            int r0 = r15.hashCode()
            r1 = -1
            switch(r0) {
                case -1534095099: goto L56;
                case -1294469354: goto L4b;
                case -376862683: goto L42;
                case 746549591: goto L37;
                case 1721158175: goto L2c;
                default: goto L2a;
            }
        L2a:
            r8 = r1
            goto L60
        L2c:
            java.lang.String r0 = "https://www.facebook.com"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L35
            goto L2a
        L35:
            r8 = 4
            goto L60
        L37:
            java.lang.String r0 = "https://twitter.com"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L40
            goto L2a
        L40:
            r8 = 3
            goto L60
        L42:
            java.lang.String r0 = "https://accounts.google.com"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L60
            goto L2a
        L4b:
            java.lang.String r0 = "https://phone.firebase"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L54
            goto L2a
        L54:
            r8 = r9
            goto L60
        L56:
            java.lang.String r0 = "https://github.com"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L5f
            goto L2a
        L5f:
            r8 = 0
        L60:
            switch(r8) {
                case 0: goto L71;
                case 1: goto L6e;
                case 2: goto L6b;
                case 3: goto L68;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r15 = 0
            goto L73
        L65:
            java.lang.String r15 = "facebook.com"
            goto L73
        L68:
            java.lang.String r15 = "twitter.com"
            goto L73
        L6b:
            java.lang.String r15 = "google.com"
            goto L73
        L6e:
            java.lang.String r15 = "phone"
            goto L73
        L71:
            java.lang.String r15 = "github.com"
        L73:
            r14.l(r15, r6)
            goto Lc3
        L77:
            q0.g0 r10 = new q0.g0
            r5 = 0
            r4 = 0
            r3 = 0
            java.lang.String r1 = "password"
            am.e r11 = new am.e
            r0 = r11
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r10.<init>(r11)
            zl.d r10 = r10.a()
            am.d r0 = am.d.b()
            r14.h(r0)
            com.google.firebase.auth.FirebaseAuth r11 = r14.f10958g
            r11.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            java.lang.String r12 = r11.f11637k
            r4 = 0
            r3 = 0
            zp.h0 r13 = new zp.h0
            r0 = r13
            r1 = r11
            r2 = r6
            r5 = r7
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.recaptcha.RecaptchaAction r0 = r11.f11640n
            com.google.android.gms.tasks.Task r0 = r13.s0(r11, r12, r0)
            bm.c r1 = new bm.c
            r1.<init>(r9, r14, r10)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener(r1)
            bm.c r1 = new bm.c
            r1.<init>(r8, r14, r15)
            r0.addOnFailureListener(r1)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.ui.auth.data.remote.SignInKickstarter.k(com.google.android.gms.auth.api.credentials.Credential):void");
    }

    public final void l(String str, String str2) {
        str.getClass();
        if (!str.equals("phone")) {
            if (!str.equals("password")) {
                Application e10 = e();
                b bVar = (b) this.f10961d;
                e eVar = new e(str, str2, null, null, null);
                int i10 = SingleSignInActivity.f10938h;
                h(d.a(new IntentRequiredException(109, c.v(e10, SingleSignInActivity.class, bVar).putExtra("extra_user", eVar))));
                return;
            }
            Application e11 = e();
            b bVar2 = (b) this.f10961d;
            int i11 = EmailActivity.f10911c;
            h(d.a(new IntentRequiredException(106, c.v(e11, EmailActivity.class, bVar2).putExtra("extra_email", str2))));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_phone_number", str2);
        Application e12 = e();
        b bVar3 = (b) this.f10961d;
        int i12 = PhoneActivity.f10951d;
        h(d.a(new IntentRequiredException(107, c.v(e12, PhoneActivity.class, bVar3).putExtra("extra_params", bundle))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r0.equals("phone") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f10961d
            am.b r0 = (am.b) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L9b
            java.lang.Object r0 = r5.f10961d
            am.b r0 = (am.b) r0
            zl.b r1 = r0.f743c
            r2 = 0
            if (r1 == 0) goto L14
            goto L1d
        L14:
            java.util.List r0 = r0.f742b
            java.lang.Object r0 = r0.get(r2)
            r1 = r0
            zl.b r1 = (zl.b) r1
        L1d:
            java.lang.String r0 = r1.f42555a
            r0.getClass()
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case 106642798: goto L42;
                case 1216985755: goto L37;
                case 2120171958: goto L2c;
                default: goto L2a;
            }
        L2a:
            r2 = r4
            goto L4b
        L2c:
            java.lang.String r2 = "emailLink"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L35
            goto L2a
        L35:
            r2 = 2
            goto L4b
        L37:
            java.lang.String r2 = "password"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L40
            goto L2a
        L40:
            r2 = 1
            goto L4b
        L42:
            java.lang.String r3 = "phone"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L4b
            goto L2a
        L4b:
            switch(r2) {
                case 0: goto L72;
                case 1: goto L53;
                case 2: goto L53;
                default: goto L4e;
            }
        L4e:
            r1 = 0
            r5.l(r0, r1)
            goto Lb9
        L53:
            com.firebase.ui.auth.data.model.IntentRequiredException r0 = new com.firebase.ui.auth.data.model.IntentRequiredException
            android.app.Application r1 = r5.e()
            java.lang.Object r2 = r5.f10961d
            am.b r2 = (am.b) r2
            int r3 = com.firebase.ui.auth.ui.email.EmailActivity.f10911c
            java.lang.Class<com.firebase.ui.auth.ui.email.EmailActivity> r3 = com.firebase.ui.auth.ui.email.EmailActivity.class
            android.content.Intent r1 = cm.c.v(r1, r3, r2)
            r2 = 106(0x6a, float:1.49E-43)
            r0.<init>(r2, r1)
            am.d r0 = am.d.a(r0)
            r5.h(r0)
            goto Lb9
        L72:
            com.firebase.ui.auth.data.model.IntentRequiredException r0 = new com.firebase.ui.auth.data.model.IntentRequiredException
            android.app.Application r2 = r5.e()
            java.lang.Object r3 = r5.f10961d
            am.b r3 = (am.b) r3
            android.os.Bundle r1 = r1.a()
            int r4 = com.firebase.ui.auth.ui.phone.PhoneActivity.f10951d
            java.lang.Class<com.firebase.ui.auth.ui.phone.PhoneActivity> r4 = com.firebase.ui.auth.ui.phone.PhoneActivity.class
            android.content.Intent r2 = cm.c.v(r2, r4, r3)
            java.lang.String r3 = "extra_params"
            android.content.Intent r1 = r2.putExtra(r3, r1)
            r2 = 107(0x6b, float:1.5E-43)
            r0.<init>(r2, r1)
            am.d r0 = am.d.a(r0)
            r5.h(r0)
            goto Lb9
        L9b:
            com.firebase.ui.auth.data.model.IntentRequiredException r0 = new com.firebase.ui.auth.data.model.IntentRequiredException
            android.app.Application r1 = r5.e()
            java.lang.Object r2 = r5.f10961d
            am.b r2 = (am.b) r2
            int r3 = com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.f10932h
            java.lang.Class<com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity> r3 = com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.class
            android.content.Intent r1 = cm.c.v(r1, r3, r2)
            r2 = 105(0x69, float:1.47E-43)
            r0.<init>(r2, r1)
            am.d r0 = am.d.a(r0)
            r5.h(r0)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.ui.auth.data.remote.SignInKickstarter.m():void");
    }
}
