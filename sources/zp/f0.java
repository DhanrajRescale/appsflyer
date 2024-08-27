package zp;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

/* loaded from: classes2.dex */
public final class f0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f42745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f42746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42747c;

    public f0(FirebaseAuth firebaseAuth, p pVar, r rVar) {
        this.f42747c = firebaseAuth;
        this.f42745a = pVar;
        this.f42746b = rVar;
    }

    @Override // zp.r
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f42746b.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // zp.r
    public final void onCodeSent(String str, q qVar) {
        this.f42746b.onCodeSent(str, qVar);
    }

    @Override // zp.r
    public final void onVerificationCompleted(o oVar) {
        this.f42746b.onVerificationCompleted(oVar);
    }

    @Override // zp.r
    public final void onVerificationFailed(FirebaseException firebaseException) {
        int i10 = zzaag.zzb;
        boolean z10 = firebaseException instanceof FirebaseAuthException;
        p pVar = this.f42745a;
        if (z10 && ((FirebaseAuthException) firebaseException).f11651a.endsWith("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
            pVar.f42778h = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number ".concat(String.valueOf(pVar.f42775e)));
            this.f42747c.getClass();
            FirebaseAuth.i(pVar);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + pVar.f42775e + ", error - " + firebaseException.getMessage());
        this.f42746b.onVerificationFailed(firebaseException);
    }
}
