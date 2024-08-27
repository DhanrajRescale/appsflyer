package com.firebase.ui.auth;

import am.b;
import android.content.Intent;
import cm.e;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.google.android.gms.auth.api.credentials.Credential;
import zl.d;

/* loaded from: classes.dex */
public class KickoffActivity extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10897g = 0;

    /* renamed from: f, reason: collision with root package name */
    public SignInKickstarter f10898f;

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 106 && (i11 == 113 || i11 == 114)) {
            b y10 = y();
            y10.f748h = null;
            setIntent(getIntent().putExtra("extra_flow_params", y10));
        }
        SignInKickstarter signInKickstarter = this.f10898f;
        signInKickstarter.getClass();
        if (i10 != 101) {
            if (i10 != 109) {
                switch (i10) {
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        return;
                }
            }
            if (i11 != 113 && i11 != 114) {
                d b10 = d.b(intent);
                if (b10 == null) {
                    signInKickstarter.h(am.d.a(new UserCancellationException()));
                    return;
                }
                if (b10.f()) {
                    signInKickstarter.h(am.d.c(b10));
                    return;
                }
                FirebaseUiException firebaseUiException = b10.f42568f;
                if (firebaseUiException.f10892a == 5) {
                    signInKickstarter.h(am.d.a(new FirebaseAuthAnonymousUpgradeException(b10)));
                    return;
                } else {
                    signInKickstarter.h(am.d.a(firebaseUiException));
                    return;
                }
            }
            signInKickstarter.m();
            return;
        }
        if (i11 == -1) {
            signInKickstarter.k((Credential) intent.getParcelableExtra(Credential.EXTRA_KEY));
        } else {
            signInKickstarter.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(r4);
     */
    @Override // cm.e, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            androidx.lifecycle.g1 r0 = new androidx.lifecycle.g1
            r0.<init>(r4)
            java.lang.Class<com.firebase.ui.auth.data.remote.SignInKickstarter> r1 = com.firebase.ui.auth.data.remote.SignInKickstarter.class
            androidx.lifecycle.a1 r0 = r0.a(r1)
            com.firebase.ui.auth.data.remote.SignInKickstarter r0 = (com.firebase.ui.auth.data.remote.SignInKickstarter) r0
            r4.f10898f = r0
            am.b r1 = r4.y()
            r0.f(r1)
            com.firebase.ui.auth.data.remote.SignInKickstarter r0 = r4.f10898f
            androidx.lifecycle.e0 r0 = r0.f10959e
            zl.e r1 = new zl.e
            r2 = 0
            r1.<init>(r4, r4, r2)
            r0.observe(r4, r1)
            am.b r0 = r4.y()
            java.util.List r1 = r0.f742b
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            zl.b r2 = (zl.b) r2
            java.lang.String r2 = r2.f42555a
            java.lang.String r3 = "google.com"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L30
            goto L56
        L47:
            boolean r1 = r0.f751k
            if (r1 != 0) goto L56
            boolean r0 = r0.f750j
            if (r0 == 0) goto L50
            goto L56
        L50:
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            goto L5e
        L56:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            com.google.android.gms.tasks.Task r0 = r0.makeGooglePlayServicesAvailable(r4)
        L5e:
            androidx.fragment.app.g r1 = new androidx.fragment.app.g
            r2 = 29
            r1.<init>(r2, r4, r5)
            com.google.android.gms.tasks.Task r5 = r0.addOnSuccessListener(r4, r1)
            dj.e r0 = new dj.e
            r1 = 6
            r0.<init>(r4, r1)
            r5.addOnFailureListener(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.ui.auth.KickoffActivity.onCreate(android.os.Bundle):void");
    }
}
