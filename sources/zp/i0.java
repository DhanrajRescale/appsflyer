package zp;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class i0 extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f42761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f42762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42763j;

    public i0(FirebaseAuth firebaseAuth, boolean z10, h hVar, f fVar) {
        this.f42763j = firebaseAuth;
        this.f42760g = z10;
        this.f42761h = hVar;
        this.f42762i = fVar;
    }

    @Override // vl.b
    public final Task r0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z10 = this.f42760g;
        FirebaseAuth firebaseAuth = this.f42763j;
        if (z10) {
            return firebaseAuth.f11631e.zzq(firebaseAuth.f11627a, (h) Preconditions.checkNotNull(this.f42761h), this.f42762i, str, new z(firebaseAuth, 0));
        }
        return firebaseAuth.f11631e.zzE(firebaseAuth.f11627a, this.f42762i, str, new y(firebaseAuth));
    }
}
