package em;

import android.app.Application;
import com.firebase.ui.auth.ui.email.CheckEmailHandler;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthViewModelBase f15706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f15708d;

    public /* synthetic */ c(AuthViewModelBase authViewModelBase, Object obj, AbstractSafeParcelable abstractSafeParcelable, int i10) {
        this.f15705a = i10;
        this.f15706b = authViewModelBase;
        this.f15707c = obj;
        this.f15708d = abstractSafeParcelable;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f15705a;
        AbstractSafeParcelable abstractSafeParcelable = this.f15708d;
        Object obj = this.f15707c;
        AuthViewModelBase authViewModelBase = this.f15706b;
        switch (i10) {
            case 0:
                CheckEmailHandler checkEmailHandler = (CheckEmailHandler) authViewModelBase;
                String str = (String) obj;
                Credential credential = (Credential) abstractSafeParcelable;
                checkEmailHandler.getClass();
                if (task.isSuccessful()) {
                    checkEmailHandler.h(am.d.c(new am.e((String) task.getResult(), str, null, credential.getName(), credential.getProfilePictureUri())));
                    return;
                } else {
                    checkEmailHandler.h(am.d.a(task.getException()));
                    return;
                }
            default:
                EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) authViewModelBase;
                zp.d dVar = (zp.d) abstractSafeParcelable;
                Application e10 = emailLinkSignInHandler.e();
                ((im.b) obj).getClass();
                im.b.a(e10);
                if (task.isSuccessful()) {
                    emailLinkSignInHandler.i(dVar);
                    return;
                } else {
                    emailLinkSignInHandler.h(am.d.a(task.getException()));
                    return;
                }
        }
    }
}
