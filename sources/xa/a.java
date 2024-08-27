package xa;

import android.content.Intent;
import androidx.navigation.t;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.kaopiz.kprogresshud.f;
import ek.u;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f40144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LoginActivity loginActivity, int i10) {
        super(1);
        this.f40143a = i10;
        this.f40144b = loginActivity;
    }

    public final void a(j jVar) {
        int i10 = this.f40143a;
        LoginActivity loginActivity = this.f40144b;
        switch (i10) {
            case 1:
                t tVar = loginActivity.f8701k;
                if (tVar != null) {
                    if (tVar != null) {
                        tVar.w(R.navigation.login_navigation, loginActivity.getIntent().getExtras());
                        return;
                    } else {
                        Intrinsics.k("navController");
                        throw null;
                    }
                }
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("Navigation Issue", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("NavController not initialized yet.", "s", objArr, "params", "Navigation Issue").getClass();
                u.k(objArr);
                FirebaseCrashlytics.getInstance().recordException(new Throwable("NavController not initialized  in LoginActivity"));
                return;
            case 2:
                t tVar2 = loginActivity.f8701k;
                if (tVar2 != null) {
                    if (tVar2 != null) {
                        tVar2.w(R.navigation.onboarding_navigation, loginActivity.getIntent().getExtras());
                        return;
                    } else {
                        Intrinsics.k("navController");
                        throw null;
                    }
                }
                Object[] objArr2 = new Object[0];
                Intrinsics.checkNotNullParameter("Navigation Issue", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("NavController not initialized yet.", "s", objArr2, "params", "Navigation Issue").getClass();
                u.k(objArr2);
                FirebaseCrashlytics.getInstance().recordException(new Throwable("NavController not initialized  in LoginActivity"));
                return;
            default:
                if (((Unit) jVar.a()) != null) {
                    Intent intent = new Intent(loginActivity, (Class<?>) MaintenanceWindowActivity.class);
                    intent.putExtra("DATA", qf.b.f31927b);
                    loginActivity.startActivity(intent);
                    loginActivity.finish();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40143a) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                boolean booleanValue = bool.booleanValue();
                LoginActivity loginActivity = this.f40144b;
                if (booleanValue) {
                    f fVar = loginActivity.f17255c;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    f fVar2 = loginActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 1:
                a((j) obj);
                return Unit.f23355a;
            case 2:
                a((j) obj);
                return Unit.f23355a;
            default:
                a((j) obj);
                return Unit.f23355a;
        }
    }
}
