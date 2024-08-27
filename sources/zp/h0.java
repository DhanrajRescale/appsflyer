package zp;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class h0 extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f42753g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42754h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f42755i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f42756j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f42757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42758l;

    public h0(FirebaseAuth firebaseAuth, String str, boolean z10, h hVar, String str2, String str3) {
        this.f42758l = firebaseAuth;
        this.f42753g = str;
        this.f42754h = z10;
        this.f42755i = hVar;
        this.f42756j = str2;
        this.f42757k = str3;
    }

    @Override // vl.b
    public final Task r0(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f42753g;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email ".concat(String.valueOf(str2)));
        }
        boolean z10 = this.f42754h;
        FirebaseAuth firebaseAuth = this.f42758l;
        if (z10) {
            return firebaseAuth.f11631e.zzs(firebaseAuth.f11627a, (h) Preconditions.checkNotNull(this.f42755i), this.f42753g, this.f42756j, this.f42757k, str, new z(firebaseAuth, 0));
        }
        return firebaseAuth.f11631e.zzD(firebaseAuth.f11627a, this.f42753g, this.f42756j, this.f42757k, str, new y(firebaseAuth));
    }
}
