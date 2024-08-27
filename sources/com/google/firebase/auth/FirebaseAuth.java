package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import aq.a;
import aq.a0;
import aq.g0;
import aq.l;
import aq.q;
import aq.s;
import aq.v;
import aq.w;
import aq.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzaac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzaal;
import com.google.android.gms.internal.p002firebaseauthapi.zzabu;
import com.google.android.gms.internal.p002firebaseauthapi.zzace;
import com.google.android.gms.internal.p002firebaseauthapi.zzada;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.internal.GenericIdpActivity;
import h.q0;
import h.r0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import m.j;
import mq.c;
import okhttp3.HttpUrl;
import pp.g;
import zp.b;
import zp.d;
import zp.d0;
import zp.e0;
import zp.f;
import zp.h;
import zp.h0;
import zp.i0;
import zp.o;
import zp.p;
import zp.y;
import zp.z;

/* loaded from: classes2.dex */
public abstract class FirebaseAuth implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g f11627a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11628b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f11629c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f11630d;

    /* renamed from: e, reason: collision with root package name */
    public final zzaac f11631e;

    /* renamed from: f, reason: collision with root package name */
    public h f11632f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f11633g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f11634h;

    /* renamed from: i, reason: collision with root package name */
    public String f11635i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f11636j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11637k;

    /* renamed from: l, reason: collision with root package name */
    public q.h f11638l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f11639m;

    /* renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f11640n;

    /* renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f11641o;

    /* renamed from: p, reason: collision with root package name */
    public final q f11642p;

    /* renamed from: q, reason: collision with root package name */
    public final v f11643q;

    /* renamed from: r, reason: collision with root package name */
    public final x f11644r;

    /* renamed from: s, reason: collision with root package name */
    public final c f11645s;

    /* renamed from: t, reason: collision with root package name */
    public final c f11646t;

    /* renamed from: u, reason: collision with root package name */
    public s f11647u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f11648v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f11649w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f11650x;

    /* JADX WARN: Removed duplicated region for block: B:14:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [aq.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(pp.g r5, mq.c r6, mq.c r7, java.util.concurrent.Executor r8, java.util.concurrent.Executor r9, java.util.concurrent.ScheduledExecutorService r10, java.util.concurrent.Executor r11) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(pp.g, mq.c, mq.c, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void f(FirebaseAuth firebaseAuth, h hVar) {
        if (hVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((g0) hVar).f2717b.f2702a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f11650x.execute(new q0(firebaseAuth, 25));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [qq.b, java.lang.Object] */
    public static void g(FirebaseAuth firebaseAuth, h hVar) {
        String str;
        if (hVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((g0) hVar).f2717b.f2702a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (hVar != null) {
            str = ((g0) hVar).f2716a.zze();
        } else {
            str = null;
        }
        ?? obj = new Object();
        obj.f32128a = str;
        firebaseAuth.f11650x.execute(new j(firebaseAuth, (Object) obj, 19));
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) g.d().b(FirebaseAuth.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(com.google.firebase.auth.FirebaseAuth r16, zp.h r17, com.google.android.gms.internal.p002firebaseauthapi.zzade r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.h(com.google.firebase.auth.FirebaseAuth, zp.h, com.google.android.gms.internal.firebase-auth-api.zzade, boolean, boolean):void");
    }

    public static void i(p pVar) {
        Task forResult;
        Task task;
        Task zzk;
        pVar.getClass();
        String checkNotEmpty = Preconditions.checkNotEmpty(pVar.f42775e);
        if (pVar.f42777g == null) {
            if (zzabu.zzd(checkNotEmpty, pVar.f42773c, pVar.f42776f, pVar.f42774d)) {
                return;
            }
        }
        final FirebaseAuth firebaseAuth = pVar.f42771a;
        final x xVar = firebaseAuth.f11644r;
        final Activity activity = pVar.f42776f;
        g gVar = firebaseAuth.f11627a;
        gVar.a();
        boolean zza = zzaal.zza(gVar.f31271a);
        boolean z10 = pVar.f42778h;
        xVar.getClass();
        final v vVar = v.f2758c;
        if (!zzace.zzg(gVar)) {
            firebaseAuth.f11633g.getClass();
            Log.i("x", "ForceRecaptchaFlow from phoneAuthOptions = " + z10 + ", ForceRecaptchaFlow from firebaseSettings = false");
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            aq.p pVar2 = vVar.f2759a;
            pVar2.getClass();
            if (DefaultClock.getInstance().currentTimeMillis() - pVar2.f2752c < 3600000) {
                task = pVar2.f2751b;
            } else {
                task = null;
            }
            if (task != null) {
                if (task.isSuccessful()) {
                    forResult = Tasks.forResult(new w((String) task.getResult(), null));
                } else {
                    Log.e("x", "Error in previous reCAPTCHA flow: ".concat(String.valueOf(task.getException().getMessage())));
                    Log.e("x", "Continuing with application verification as normal");
                }
            }
            if (zza && !z10) {
                gVar.a();
                IntegrityManager create = IntegrityManagerFactory.create(gVar.f31271a);
                if (!TextUtils.isEmpty(xVar.f2764a)) {
                    zzk = Tasks.forResult(new zzada(xVar.f2764a));
                } else {
                    zzk = firebaseAuth.f11631e.zzk();
                }
                zzk.continueWithTask(firebaseAuth.f11649w, new l(xVar, checkNotEmpty, create)).addOnCompleteListener(new OnCompleteListener() { // from class: aq.b
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        String message;
                        x.this.getClass();
                        boolean isSuccessful = task2.isSuccessful();
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        if (isSuccessful && task2.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task2.getResult()).token())) {
                            taskCompletionSource2.setResult(new w(null, ((IntegrityTokenResponse) task2.getResult()).token()));
                            return;
                        }
                        if (task2.getException() == null) {
                            message = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            message = task2.getException().getMessage();
                        }
                        Log.e("x", "Play Integrity Token fetch failed, falling back to Recaptcha".concat(String.valueOf(message)));
                        x.a(firebaseAuth, vVar, activity, taskCompletionSource2);
                    }
                });
            } else {
                x.a(firebaseAuth, vVar, activity, taskCompletionSource);
            }
            forResult = taskCompletionSource.getTask();
        } else {
            forResult = Tasks.forResult(new w(null, null));
        }
        forResult.addOnCompleteListener(new e0(firebaseAuth, pVar, checkNotEmpty));
    }

    public static final void j(FirebaseAuthMissingActivityForRecaptchaException firebaseAuthMissingActivityForRecaptchaException, p pVar, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback with MissingActivity exception for phone number/uid - ".concat(String.valueOf(str)));
        pVar.f42774d.execute(new j(zzabu.zza(str, pVar.f42773c, null), firebaseAuthMissingActivityForRecaptchaException, 18));
    }

    public final String a() {
        String str;
        synchronized (this.f11636j) {
            str = this.f11637k;
        }
        return str;
    }

    public final Task b(String str, b bVar) {
        Preconditions.checkNotEmpty(str);
        if (bVar == null) {
            bVar = new b(new zp.a());
        }
        String str2 = this.f11635i;
        if (str2 != null) {
            bVar.f42719h = str2;
        }
        bVar.f42720i = 1;
        return new zp.g0(this, str, bVar, 0).s0(this, this.f11637k, this.f11639m);
    }

    public final Task c(d dVar) {
        zp.c cVar;
        Preconditions.checkNotNull(dVar);
        d R = dVar.R();
        if (R instanceof f) {
            f fVar = (f) R;
            if (!(!TextUtils.isEmpty(fVar.f42742c))) {
                String str = fVar.f42740a;
                String str2 = (String) Preconditions.checkNotNull(fVar.f42741b);
                String str3 = this.f11637k;
                return new h0(this, str, false, null, str2, str3).s0(this, str3, this.f11640n);
            }
            String checkNotEmpty = Preconditions.checkNotEmpty(fVar.f42742c);
            zzap zzapVar = zp.c.f42722d;
            Preconditions.checkNotEmpty(checkNotEmpty);
            try {
                cVar = new zp.c(checkNotEmpty);
            } catch (IllegalArgumentException unused) {
                cVar = null;
            }
            if (cVar != null && !TextUtils.equals(this.f11637k, cVar.f42725c)) {
                return Tasks.forException(zzaag.zza(new Status(17072)));
            }
            return new i0(this, false, null, fVar).s0(this, this.f11637k, this.f11639m);
        }
        boolean z10 = R instanceof o;
        g gVar = this.f11627a;
        zzaac zzaacVar = this.f11631e;
        if (z10) {
            return zzaacVar.zzF(gVar, (o) R, this.f11637k, new y(this));
        }
        return zzaacVar.zzB(gVar, R, this.f11637k, new y(this));
    }

    public final void d() {
        q qVar = this.f11642p;
        Preconditions.checkNotNull(qVar);
        h hVar = this.f11632f;
        if (hVar != null) {
            Preconditions.checkNotNull(hVar);
            qVar.f2753a.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", ((g0) hVar).f2717b.f2702a)).apply();
            this.f11632f = null;
        }
        qVar.f2753a.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        f(this, null);
        s sVar = this.f11647u;
        if (sVar != null) {
            aq.f fVar = sVar.f2756a;
            fVar.f2714c.removeCallbacks(fVar.f2715d);
        }
    }

    public final Task e(Activity activity, ek.h0 h0Var) {
        Preconditions.checkNotNull(h0Var);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        r0 r0Var = this.f11643q.f2760b;
        if (!r0Var.f17735a) {
            aq.j jVar = new aq.j(r0Var, activity, taskCompletionSource, this, null);
            r0Var.f17736b = jVar;
            a5.b.a(activity).b(jVar, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
            r0Var.f17735a = true;
            v.c(activity.getApplicationContext(), this);
            Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
            intent.setClass(activity, GenericIdpActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtras((Bundle) h0Var.f15593b);
            activity.startActivity(intent);
            return taskCompletionSource.getTask();
        }
        return Tasks.forException(zzaag.zza(new Status(17057)));
    }

    public final Task k(h hVar, d0 d0Var) {
        String str;
        zp.c cVar;
        Preconditions.checkNotNull(hVar);
        Preconditions.checkNotNull(d0Var);
        d R = d0Var.R();
        if (R instanceof f) {
            f fVar = (f) R;
            if (!TextUtils.isEmpty(fVar.f42741b)) {
                str = "password";
            } else {
                str = "emailLink";
            }
            if ("password".equals(str)) {
                String str2 = fVar.f42740a;
                String checkNotEmpty = Preconditions.checkNotEmpty(fVar.f42741b);
                String J = hVar.J();
                return new h0(this, str2, true, hVar, checkNotEmpty, J).s0(this, J, this.f11640n);
            }
            String checkNotEmpty2 = Preconditions.checkNotEmpty(fVar.f42742c);
            zzap zzapVar = zp.c.f42722d;
            Preconditions.checkNotEmpty(checkNotEmpty2);
            try {
                cVar = new zp.c(checkNotEmpty2);
            } catch (IllegalArgumentException unused) {
                cVar = null;
            }
            if (cVar != null && !TextUtils.equals(this.f11637k, cVar.f42725c)) {
                return Tasks.forException(zzaag.zza(new Status(17072)));
            }
            return new i0(this, true, hVar, fVar).s0(this, this.f11637k, this.f11639m);
        }
        int i10 = 0;
        if (R instanceof o) {
            return this.f11631e.zzu(this.f11627a, hVar, (o) R, this.f11637k, new z(this, i10));
        }
        return this.f11631e.zzo(this.f11627a, hVar, R, hVar.J(), new z(this, i10));
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull g gVar) {
        return (FirebaseAuth) gVar.b(FirebaseAuth.class);
    }
}
