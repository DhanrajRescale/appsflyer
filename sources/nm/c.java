package nm;

import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnFailureListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SocialProviderResponseHandler f28989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zl.d f28990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zp.d f28991c;

    public /* synthetic */ c(SocialProviderResponseHandler socialProviderResponseHandler, zl.d dVar, zp.d dVar2) {
        this.f28989a = socialProviderResponseHandler;
        this.f28990b = dVar;
        this.f28991c = dVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (da.e.F(((com.google.firebase.auth.FirebaseAuthException) r5).f11651a) == 11) goto L10;
     */
    @Override // com.google.android.gms.tasks.OnFailureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFailure(java.lang.Exception r5) {
        /*
            r4 = this;
            com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler r0 = r4.f28989a
            r0.getClass()
            boolean r1 = r5 instanceof com.google.firebase.auth.FirebaseAuthInvalidUserException
            boolean r2 = r5 instanceof com.google.firebase.auth.FirebaseAuthException
            if (r2 == 0) goto L19
            r2 = r5
            com.google.firebase.auth.FirebaseAuthException r2 = (com.google.firebase.auth.FirebaseAuthException) r2
            java.lang.String r2 = r2.f11651a     // Catch: java.lang.IllegalArgumentException -> L19
            int r2 = da.e.F(r2)     // Catch: java.lang.IllegalArgumentException -> L19
            r3 = 11
            if (r2 != r3) goto L19
            goto L1b
        L19:
            if (r1 == 0) goto L2a
        L1b:
            com.firebase.ui.auth.FirebaseUiException r5 = new com.firebase.ui.auth.FirebaseUiException
            r1 = 12
            r5.<init>(r1)
            am.d r5 = am.d.a(r5)
            r0.h(r5)
            goto L5c
        L2a:
            boolean r1 = r5 instanceof com.google.firebase.auth.FirebaseAuthUserCollisionException
            if (r1 == 0) goto L5c
            zl.d r1 = r4.f28990b
            java.lang.String r2 = r1.c()
            if (r2 != 0) goto L3e
            am.d r5 = am.d.a(r5)
            r0.h(r5)
            goto L5c
        L3e:
            com.google.firebase.auth.FirebaseAuth r5 = r0.f10958g
            java.lang.Object r3 = r0.f10961d
            am.b r3 = (am.b) r3
            com.google.android.gms.tasks.Task r5 = el.l.S(r5, r3, r2)
            nm.c r2 = new nm.c
            zp.d r3 = r4.f28991c
            r2.<init>(r0, r1, r3)
            com.google.android.gms.tasks.Task r5 = r5.addOnSuccessListener(r2)
            nm.d r1 = new nm.d
            r2 = 0
            r1.<init>(r0, r2)
            r5.addOnFailureListener(r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.c.onFailure(java.lang.Exception):void");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        SocialProviderResponseHandler socialProviderResponseHandler = this.f28989a;
        socialProviderResponseHandler.getClass();
        zl.d dVar = this.f28990b;
        if (list.contains(dVar.e())) {
            socialProviderResponseHandler.i(this.f28991c);
        } else if (list.isEmpty()) {
            socialProviderResponseHandler.h(am.d.a(new FirebaseUiException(3, "No supported providers.")));
        } else {
            socialProviderResponseHandler.m(dVar, (String) list.get(0));
        }
    }
}
