package zp;

import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public abstract class r {
    private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        zza.i("Sms auto retrieval timed-out.", new Object[0]);
    }

    public abstract void onCodeSent(String str, q qVar);

    public abstract void onVerificationCompleted(o oVar);

    public abstract void onVerificationFailed(FirebaseException firebaseException);
}
