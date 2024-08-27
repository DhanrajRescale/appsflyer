package xa;

import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ek.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f40145a;

    public b(LoginActivity loginActivity) {
        this.f40145a = loginActivity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            int i10 = LoginActivity.f8700l;
            String str = "getInstanceId failed: " + task.getException();
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("LoginActivity", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "LoginActivity").getClass();
            u.k(objArr);
            return;
        }
        String firebaseToken = (String) task.getResult();
        if (firebaseToken != null) {
            LoginViewModel loginViewModel = (LoginViewModel) this.f40145a.x();
            Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
            loginViewModel.f9081d.setFirebaseToken(firebaseToken);
            int i11 = LoginActivity.f8700l;
            String concat = "firebase instance token: ".concat(firebaseToken);
            Object[] objArr2 = new Object[0];
            Intrinsics.checkNotNullParameter("LoginActivity", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g(concat, "s", objArr2, "params", "LoginActivity").getClass();
            u.k(objArr2);
            return;
        }
        int i12 = LoginActivity.f8700l;
        Object[] objArr3 = new Object[0];
        Intrinsics.checkNotNullParameter("LoginActivity", "tag");
        com.google.android.gms.internal.p002firebaseauthapi.a.g("firebase instance token was null", "s", objArr3, "params", "LoginActivity").getClass();
        u.k(objArr3);
    }
}
