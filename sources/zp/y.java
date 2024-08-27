package zp;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzade;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class y implements aq.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f42791a;

    public y(FirebaseAuth firebaseAuth) {
        this.f42791a = firebaseAuth;
    }

    @Override // aq.y
    public final void a(zzade zzadeVar, h hVar) {
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(hVar);
        aq.g0 g0Var = (aq.g0) hVar;
        g0Var.getClass();
        g0Var.f2716a = (zzade) Preconditions.checkNotNull(zzadeVar);
        FirebaseAuth firebaseAuth = this.f42791a;
        firebaseAuth.getClass();
        FirebaseAuth.h(firebaseAuth, hVar, zzadeVar, true, false);
    }
}
