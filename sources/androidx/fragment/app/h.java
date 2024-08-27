package androidx.fragment.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements y3.f, OnFailureListener, OnSuccessListener, Continuation, pn.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1711e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1707a = i10;
        this.f1708b = obj;
        this.f1709c = obj2;
        this.f1710d = obj3;
        this.f1711e = obj4;
    }

    @Override // y3.f
    public final void a() {
        View view = (View) this.f1708b;
        n this$0 = (n) this.f1709c;
        i animationInfo = (i) this.f1710d;
        f2 operation = (f2) this.f1711e;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.f1769a.endViewTransition(view);
        animationInfo.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    @Override // pn.h
    public final Object apply(Object obj) {
        pn.j jVar = (pn.j) this.f1708b;
        String str = (String) this.f1709c;
        Map map = (Map) this.f1710d;
        h8.h hVar = (h8.h) this.f1711e;
        gn.b bVar = pn.j.f31244f;
        jVar.getClass();
        return (mn.a) pn.j.l(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new ie.n(6, jVar, map, hVar));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i10 = this.f1707a;
        Object obj = this.f1711e;
        Object obj2 = this.f1710d;
        Object obj3 = this.f1709c;
        Object obj4 = this.f1708b;
        switch (i10) {
            case 1:
                GenericIdpSignInHandler genericIdpSignInHandler = (GenericIdpSignInHandler) obj4;
                FirebaseAuth firebaseAuth = (FirebaseAuth) obj3;
                am.b bVar = (am.b) obj2;
                ek.h0 h0Var = (ek.h0) obj;
                genericIdpSignInHandler.getClass();
                if (!(exc instanceof FirebaseAuthUserCollisionException)) {
                    genericIdpSignInHandler.h(am.d.a(exc));
                    return;
                }
                FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
                zp.d dVar = firebaseAuthUserCollisionException.f11652b;
                String str = firebaseAuthUserCollisionException.f11653c;
                el.l.S(firebaseAuth, bVar, str).addOnSuccessListener(new h(genericIdpSignInHandler, h0Var, dVar, str, 2));
                return;
            default:
                EmailProviderResponseHandler emailProviderResponseHandler = (EmailProviderResponseHandler) obj4;
                im.a aVar = (im.a) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                emailProviderResponseHandler.getClass();
                if (exc instanceof FirebaseAuthUserCollisionException) {
                    FirebaseAuth firebaseAuth2 = emailProviderResponseHandler.f10958g;
                    am.b bVar2 = (am.b) emailProviderResponseHandler.f10961d;
                    aVar.getClass();
                    if (im.a.a(firebaseAuth2, bVar2)) {
                        Preconditions.checkNotEmpty(str2);
                        Preconditions.checkNotEmpty(str3);
                        emailProviderResponseHandler.i(new zp.f(str2, str3, null, null, false));
                        return;
                    } else {
                        Log.w("EmailProviderResponseHa", "Got a collision error during a non-upgrade flow", exc);
                        el.l.S(emailProviderResponseHandler.f10958g, (am.b) emailProviderResponseHandler.f10961d, str2).continueWithTask(new i5.w(5)).addOnSuccessListener(new da.d(21, emailProviderResponseHandler, str2)).addOnFailureListener(new dj.e(emailProviderResponseHandler, 10));
                        return;
                    }
                }
                emailProviderResponseHandler.h(am.d.a(exc));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [q0.g0, java.lang.Object] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        GenericIdpSignInHandler genericIdpSignInHandler = (GenericIdpSignInHandler) this.f1708b;
        ek.h0 h0Var = (ek.h0) this.f1709c;
        zp.d dVar = (zp.d) this.f1710d;
        String str = (String) this.f1711e;
        List list = (List) obj;
        genericIdpSignInHandler.getClass();
        if (list.isEmpty()) {
            genericIdpSignInHandler.h(am.d.a(new FirebaseUiException(3, "Unable to complete the linkingflow - the user is using unsupported providers.")));
        } else {
            if (list.contains(h0Var.j())) {
                ?? obj2 = new Object();
                obj2.f31493c = dVar;
                genericIdpSignInHandler.h(am.d.a(new FirebaseAuthAnonymousUpgradeException(obj2.a())));
                return;
            }
            genericIdpSignInHandler.h(am.d.a(new FirebaseUiUserCollisionException(h0Var.j(), str, dVar)));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) this.f1708b;
        im.b bVar = (im.b) this.f1709c;
        zp.d dVar = (zp.d) this.f1710d;
        zl.d dVar2 = (zl.d) this.f1711e;
        Application e10 = emailLinkSignInHandler.e();
        bVar.getClass();
        im.b.a(e10);
        if (task.isSuccessful()) {
            return ((aq.d0) ((zp.e) task.getResult())).f2698a.S(dVar).continueWithTask(new ek.u(dVar2, 5)).addOnFailureListener(new m5.t("EmailLinkSignInHandler", "linkWithCredential+merge failed.", 1));
        }
        return task;
    }
}
