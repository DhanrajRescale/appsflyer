package aq;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzaas;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import com.google.firebase.auth.internal.RecaptchaActivity;
import h.r0;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f2763b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public String f2764a;

    public static void a(FirebaseAuth firebaseAuth, v vVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task forException;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        pp.g gVar = firebaseAuth.f11627a;
        gVar.a();
        vVar.getClass();
        v.c(gVar.f31271a, firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (r0.f17734c == null) {
            r0.f17734c = new r0(8);
        }
        r0 r0Var = r0.f17734c;
        if (!r0Var.f17735a) {
            k kVar = new k(activity, taskCompletionSource2);
            r0Var.f17736b = kVar;
            a5.b.a(activity).b(kVar, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
            r0Var.f17735a = true;
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            pp.g gVar2 = firebaseAuth.f11627a;
            gVar2.a();
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", gVar2.f31273c.f31280a);
            if (!TextUtils.isEmpty(firebaseAuth.a())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.a());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaas.zza().zzb());
            gVar2.a();
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", gVar2.f31272b);
            activity.startActivity(intent);
            forException = taskCompletionSource2.getTask();
        } else {
            forException = Tasks.forException(zzaag.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        forException.addOnSuccessListener(new ll.o(15, taskCompletionSource)).addOnFailureListener(new ek.u(taskCompletionSource));
    }
}
