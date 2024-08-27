package bm;

import aq.d0;
import com.firebase.ui.auth.data.remote.AnonymousSignInHandler;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import q0.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnonymousSignInHandler f7123a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f7123a.h(am.d.a(exc));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        AnonymousSignInHandler anonymousSignInHandler = this.f7123a;
        anonymousSignInHandler.getClass();
        boolean z10 = ((d0) ((zp.e) obj)).f2699b.f2692c;
        g0 g0Var = new g0(new am.e("anonymous", null, null, null, null));
        g0Var.f31491a = z10;
        anonymousSignInHandler.h(am.d.c(g0Var.a()));
    }
}
