package zp;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class g0 extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f42749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f42750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f42751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42752j;

    public /* synthetic */ g0(FirebaseAuth firebaseAuth, String str, Object obj, int i10) {
        this.f42749g = i10;
        this.f42752j = firebaseAuth;
        this.f42750h = str;
        this.f42751i = obj;
    }

    @Override // vl.b
    public final Task r0(String str) {
        int i10 = this.f42749g;
        Object obj = this.f42751i;
        FirebaseAuth firebaseAuth = this.f42752j;
        String str2 = this.f42750h;
        switch (i10) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email ".concat(String.valueOf(str2)));
                }
                return firebaseAuth.f11631e.zzx(firebaseAuth.f11627a, this.f42750h, (b) obj, firebaseAuth.f11637k, str);
            case 1:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for ".concat(String.valueOf(str2)));
                }
                return firebaseAuth.f11631e.zzy(firebaseAuth.f11627a, this.f42750h, (b) obj, firebaseAuth.f11637k, str);
            default:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email ".concat(String.valueOf(str2)));
                }
                return firebaseAuth.f11631e.zzd(firebaseAuth.f11627a, this.f42750h, (String) obj, firebaseAuth.f11637k, str, new y(firebaseAuth));
        }
    }
}
