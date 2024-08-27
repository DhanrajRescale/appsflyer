package bm;

import aq.d0;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import q0.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInKickstarter f7134a;

    public /* synthetic */ f(SignInKickstarter signInKickstarter) {
        this.f7134a = signInKickstarter;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f7134a.h(am.d.a(exc));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        zp.e eVar = (zp.e) obj;
        SignInKickstarter signInKickstarter = this.f7134a;
        signInKickstarter.getClass();
        d0 d0Var = (d0) eVar;
        signInKickstarter.j(new g0(new am.e(d0Var.f2700c.f42730a, d0Var.f2698a.f2717b.f2707f, null, null, null)).a(), eVar);
    }
}
