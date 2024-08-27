package bm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import aq.d0;
import aq.e0;
import aq.g0;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.messaging.s;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import ek.h0;
import ek.u;
import i5.w;
import j5.l;
import java.util.Date;
import java.util.Map;
import jr.i;
import m5.t;
import on.h;
import pn.j;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnFailureListener, OnSuccessListener, Continuation, qn.a, mq.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7129c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f7127a = i10;
        this.f7128b = obj;
        this.f7129c = obj2;
    }

    @Override // mq.a
    public final void e(mq.c cVar) {
        mq.a aVar = (mq.a) this.f7128b;
        mq.a aVar2 = (mq.a) this.f7129c;
        aVar.e(cVar);
        aVar2.e(cVar);
    }

    @Override // qn.a
    public final Object execute() {
        int i10 = this.f7127a;
        Object obj = this.f7129c;
        Object obj2 = this.f7128b;
        switch (i10) {
            case 11:
                Iterable iterable = (Iterable) obj;
                j jVar = (j) ((h) obj2).f30140c;
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.a().compileStatement("DELETE FROM events WHERE _id in " + j.j(iterable)).execute();
                }
                return null;
            default:
                h hVar = (h) obj2;
                hVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long intValue = ((Integer) entry.getValue()).intValue();
                    mn.c cVar = mn.c.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    j jVar2 = (j) hVar.f30146i;
                    jVar2.getClass();
                    jVar2.c(new l(str, intValue, cVar));
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i10;
        int i11 = this.f7127a;
        Object obj = this.f7129c;
        Object obj2 = this.f7128b;
        switch (i11) {
            case 0:
                GenericIdpSignInHandler genericIdpSignInHandler = (GenericIdpSignInHandler) obj2;
                h0 h0Var = (h0) obj;
                genericIdpSignInHandler.getClass();
                if (exc instanceof FirebaseAuthException) {
                    try {
                        i10 = da.e.F(((FirebaseAuthException) exc).f11651a);
                    } catch (IllegalArgumentException unused) {
                        i10 = 37;
                    }
                    if (exc instanceof FirebaseAuthUserCollisionException) {
                        FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
                        genericIdpSignInHandler.h(am.d.a(new FirebaseUiUserCollisionException(h0Var.j(), firebaseAuthUserCollisionException.f11653c, firebaseAuthUserCollisionException.f11652b)));
                        return;
                    } else if (i10 == 36) {
                        genericIdpSignInHandler.h(am.d.a(new UserCancellationException()));
                        return;
                    } else {
                        genericIdpSignInHandler.h(am.d.a(exc));
                        return;
                    }
                }
                genericIdpSignInHandler.h(am.d.a(exc));
                return;
            default:
                SignInKickstarter signInKickstarter = (SignInKickstarter) obj2;
                Credential credential = (Credential) obj;
                signInKickstarter.getClass();
                if ((exc instanceof FirebaseAuthInvalidUserException) || (exc instanceof FirebaseAuthInvalidCredentialsException)) {
                    hm.b.a(signInKickstarter.e()).delete(credential);
                }
                signInKickstarter.m();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f7127a;
        Object obj2 = this.f7129c;
        Object obj3 = this.f7128b;
        switch (i10) {
            case 1:
                ((SignInKickstarter) obj3).j((zl.d) obj2, (zp.e) obj);
                return;
            case 2:
            case 6:
            default:
                ((PhoneProviderResponseHandler) obj3).j((zl.d) obj2, (zp.e) obj);
                return;
            case 3:
                EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) obj3;
                zp.e eVar = (zp.e) obj;
                Application e10 = emailLinkSignInHandler.e();
                ((im.b) obj2).getClass();
                im.b.a(e10);
                g0 g0Var = ((d0) eVar).f2698a;
                e0 e0Var = g0Var.f2717b;
                emailLinkSignInHandler.j(new q0.g0(new am.e("emailLink", e0Var.f2707f, null, e0Var.f2704c, g0Var.getPhotoUrl())).a(), eVar);
                return;
            case 4:
                ((EmailProviderResponseHandler) obj3).j((zl.d) obj2, (zp.e) obj);
                return;
            case 5:
                ((WelcomeBackPasswordHandler) obj3).i((zp.d) obj2);
                return;
            case 7:
                ((WelcomeBackPasswordHandler) obj3).j((zl.d) obj2, (zp.e) obj);
                return;
            case 8:
                ((LinkingSocialProviderResponseHandler) obj3).j((zl.d) obj2, (zp.e) obj);
                return;
            case 9:
                ((LinkingSocialProviderResponseHandler) obj3).i((zp.d) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f7127a) {
            case 6:
                zp.d dVar = (zp.d) this.f7128b;
                zl.d dVar2 = (zl.d) this.f7129c;
                zp.e eVar = (zp.e) task.getResult(Exception.class);
                if (dVar == null) {
                    return Tasks.forResult(eVar);
                }
                return ((d0) eVar).f2698a.S(dVar).continueWithTask(new u(dVar2, 5)).addOnFailureListener(new t("WBPasswordHandler", "linkWithCredential+merge failed.", 1));
            case 14:
                Context context = (Context) this.f7128b;
                Intent intent = (Intent) this.f7129c;
                Object obj = com.google.firebase.messaging.h.f11753c;
                if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
                    return com.google.firebase.messaging.h.a(context, intent).continueWith(new n.a(7), new w(26));
                }
                return task;
            case 15:
                s sVar = (s) this.f7128b;
                String str = (String) this.f7129c;
                synchronized (sVar) {
                    sVar.f11779b.remove(str);
                }
                return task;
            case 16:
                i iVar = (i) this.f7128b;
                Map map = (Map) this.f7129c;
                int[] iArr = i.f21606k;
                return iVar.b(0L, task, map);
            default:
                i iVar2 = (i) this.f7128b;
                Date date = (Date) this.f7129c;
                int[] iArr2 = i.f21606k;
                iVar2.getClass();
                if (task.isSuccessful()) {
                    jr.l lVar = iVar2.f21614h;
                    synchronized (lVar.f21627b) {
                        lVar.f21626a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            jr.l lVar2 = iVar2.f21614h;
                            synchronized (lVar2.f21627b) {
                                lVar2.f21626a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            jr.l lVar3 = iVar2.f21614h;
                            synchronized (lVar3.f21627b) {
                                lVar3.f21626a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                }
                return task;
        }
    }
}
