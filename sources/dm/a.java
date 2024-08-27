package dm;

import android.content.Intent;
import cm.c;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.ui.credentials.CredentialSaveActivity;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import zl.d;

/* loaded from: classes.dex */
public final class a extends lm.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f14417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, c cVar2, Object obj, int i10) {
        super(cVar2);
        this.f14415e = i10;
        this.f14417g = cVar;
        this.f14416f = obj;
    }

    @Override // lm.a
    public final void a(Exception exc) {
        int i10 = this.f14415e;
        Object obj = this.f14416f;
        c cVar = this.f14417g;
        switch (i10) {
            case 0:
                ((CredentialSaveActivity) cVar).w(-1, ((d) obj).h());
                return;
            case 1:
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((AuthMethodPickerActivity) cVar).w(0, new Intent().putExtra("extra_idp_response", d.a(exc)));
                    return;
                } else {
                    c(d.a(exc));
                    return;
                }
            case 2:
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((SingleSignInActivity) cVar).w(0, new Intent().putExtra("extra_idp_response", d.a(exc)));
                    return;
                } else {
                    ((SingleSignInActivity) cVar).f10939f.l(d.a(exc));
                    return;
                }
            default:
                ((LinkingSocialProviderResponseHandler) obj).k(d.a(exc));
                return;
        }
    }

    @Override // lm.a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f14415e) {
            case 0:
                e((d) obj);
                return;
            case 1:
                e((d) obj);
                return;
            case 2:
                e((d) obj);
                return;
            default:
                e((d) obj);
                return;
        }
    }

    public final void c(d dVar) {
        boolean z10;
        boolean contains = zl.c.f42558d.contains((String) this.f14416f);
        int i10 = 0;
        c cVar = this.f14417g;
        if (contains) {
            ((AuthMethodPickerActivity) cVar).x();
            z10 = true;
        } else {
            z10 = false;
        }
        if (!dVar.f()) {
            ((AuthMethodPickerActivity) cVar).f10933c.l(dVar);
            return;
        }
        if (z10) {
            ((AuthMethodPickerActivity) cVar).f10933c.l(dVar);
            return;
        }
        AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) cVar;
        if (dVar.f()) {
            i10 = -1;
        }
        authMethodPickerActivity.w(i10, dVar.h());
    }

    public final void e(d dVar) {
        int i10 = this.f14415e;
        Object obj = this.f14416f;
        int i11 = -1;
        c cVar = this.f14417g;
        switch (i10) {
            case 0:
                ((CredentialSaveActivity) cVar).w(-1, dVar.h());
                return;
            case 1:
                c(dVar);
                return;
            case 2:
                if (zl.c.f42558d.contains((String) obj)) {
                    ((SingleSignInActivity) cVar).x();
                } else if (dVar.f()) {
                    SingleSignInActivity singleSignInActivity = (SingleSignInActivity) cVar;
                    if (!dVar.f()) {
                        i11 = 0;
                    }
                    singleSignInActivity.w(i11, dVar.h());
                    return;
                }
                ((SingleSignInActivity) cVar).f10939f.l(dVar);
                return;
            default:
                WelcomeBackIdpPrompt welcomeBackIdpPrompt = (WelcomeBackIdpPrompt) cVar;
                welcomeBackIdpPrompt.x();
                if (!zl.c.f42558d.contains(dVar.e()) && dVar.f42564b == null && ((LinkingSocialProviderResponseHandler) obj).f10963h == null) {
                    welcomeBackIdpPrompt.w(-1, dVar.h());
                    return;
                } else {
                    ((LinkingSocialProviderResponseHandler) obj).k(dVar);
                    return;
                }
        }
    }
}
