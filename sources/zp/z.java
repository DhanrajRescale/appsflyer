package zp;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzade;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class z implements aq.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42793b;

    public /* synthetic */ z(FirebaseAuth firebaseAuth, int i10) {
        this.f42792a = i10;
        this.f42793b = firebaseAuth;
    }

    @Override // aq.y
    public final void a(zzade zzadeVar, h hVar) {
        int i10 = this.f42792a;
        FirebaseAuth firebaseAuth = this.f42793b;
        switch (i10) {
            case 0:
                Preconditions.checkNotNull(zzadeVar);
                Preconditions.checkNotNull(hVar);
                aq.g0 g0Var = (aq.g0) hVar;
                g0Var.getClass();
                g0Var.f2716a = (zzade) Preconditions.checkNotNull(zzadeVar);
                FirebaseAuth.h(firebaseAuth, hVar, zzadeVar, true, true);
                return;
            default:
                FirebaseAuth.h(firebaseAuth, hVar, zzadeVar, true, true);
                return;
        }
    }

    public final void b(Status status) {
        int i10 = this.f42792a;
        FirebaseAuth firebaseAuth = this.f42793b;
        switch (i10) {
            case 0:
                if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
                    firebaseAuth.d();
                    return;
                }
                return;
            default:
                int statusCode = status.getStatusCode();
                if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
                    firebaseAuth.d();
                    return;
                }
                return;
        }
    }
}
