package mm;

import am.d;
import aq.d0;
import aq.e0;
import aq.g0;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import zp.e;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmailLinkSignInHandler f27829a;

    public /* synthetic */ b(EmailLinkSignInHandler emailLinkSignInHandler) {
        this.f27829a = emailLinkSignInHandler;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f27829a.h(d.a(exc));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        e eVar = (e) obj;
        EmailLinkSignInHandler emailLinkSignInHandler = this.f27829a;
        emailLinkSignInHandler.getClass();
        g0 g0Var = ((d0) eVar).f2698a;
        e0 e0Var = g0Var.f2717b;
        emailLinkSignInHandler.j(new q0.g0(new am.e("emailLink", e0Var.f2707f, null, e0Var.f2704c, g0Var.getPhotoUrl())).a(), eVar);
    }
}
