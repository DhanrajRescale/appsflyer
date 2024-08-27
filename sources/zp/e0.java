package zp;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaal;
import com.google.android.gms.internal.p002firebaseauthapi.zzado;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class e0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f42737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42739c;

    public /* synthetic */ e0(FirebaseAuth firebaseAuth, p pVar, String str) {
        this.f42739c = firebaseAuth;
        this.f42737a = pVar;
        this.f42738b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String str;
        String str2;
        boolean z10;
        String str3;
        boolean isSuccessful = task.isSuccessful();
        p pVar = this.f42737a;
        if (!isSuccessful) {
            Exception exception = task.getException();
            if (exception instanceof FirebaseAuthMissingActivityForRecaptchaException) {
                FirebaseAuth.j((FirebaseAuthMissingActivityForRecaptchaException) exception, pVar, this.f42738b);
                return;
            }
            if (task.getException() != null) {
                str3 = task.getException().getMessage();
            } else {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(str3)));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str = null;
            str2 = null;
        } else {
            str = ((aq.w) task.getResult()).f2761a;
            str2 = ((aq.w) task.getResult()).f2762b;
        }
        FirebaseAuth firebaseAuth = this.f42739c;
        firebaseAuth.getClass();
        long longValue = pVar.f42772b.longValue();
        if (longValue >= 0 && longValue <= 120) {
            String checkNotEmpty = Preconditions.checkNotEmpty(pVar.f42775e);
            if (pVar.f42777g != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            String str4 = firebaseAuth.f11635i;
            String str5 = firebaseAuth.f11637k;
            pp.g gVar = firebaseAuth.f11627a;
            gVar.a();
            zzado zzadoVar = new zzado(checkNotEmpty, longValue, z11, str4, str5, str, str2, zzaal.zza(gVar.f31271a));
            firebaseAuth.f11633g.getClass();
            boolean isEmpty = TextUtils.isEmpty(str);
            r rVar = pVar.f42773c;
            if (isEmpty && !pVar.f42778h) {
                rVar = new f0(firebaseAuth, pVar, rVar);
            }
            firebaseAuth.f11631e.zzR(firebaseAuth.f11627a, zzadoVar, rVar, pVar.f42776f, pVar.f42774d);
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }
}
