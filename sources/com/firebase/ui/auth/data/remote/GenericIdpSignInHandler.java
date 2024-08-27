package com.firebase.ui.auth.data.remote;

import am.e;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import aq.e0;
import aq.g0;
import aq.j;
import cm.c;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzaas;
import com.google.android.gms.internal.p002firebaseauthapi.zzace;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import ek.h0;
import h.r0;
import im.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pp.g;
import zl.b;
import zl.d;
import zp.d0;
import zp.h;

/* loaded from: classes.dex */
public class GenericIdpSignInHandler extends ProviderSignInBase<b> {
    public GenericIdpSignInHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
        if (i10 == 117) {
            d b10 = d.b(intent);
            if (b10 == null) {
                h(am.d.a(new UserCancellationException()));
            } else {
                h(am.d.c(b10));
            }
        }
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void j(FirebaseAuth firebaseAuth, c cVar, String str) {
        boolean z10;
        Task task;
        h(am.d.b());
        am.b y10 = cVar.y();
        h0 k10 = k(str, firebaseAuth);
        if (y10 != null) {
            a.b().getClass();
            if (a.a(firebaseAuth, y10)) {
                cVar.x();
                h hVar = firebaseAuth.f11632f;
                hVar.getClass();
                Preconditions.checkNotNull(cVar);
                Preconditions.checkNotNull(k10);
                g0 g0Var = (g0) hVar;
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(g.e(g0Var.f2718c));
                firebaseAuth2.getClass();
                Preconditions.checkNotNull(cVar);
                Preconditions.checkNotNull(k10);
                Preconditions.checkNotNull(hVar);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                r0 r0Var = firebaseAuth2.f11643q.f2760b;
                if (!r0Var.f17735a) {
                    j jVar = new j(r0Var, cVar, taskCompletionSource, firebaseAuth2, hVar);
                    r0Var.f17736b = jVar;
                    a5.b.a(cVar).b(jVar, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
                    r0Var.f17735a = true;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    task = Tasks.forException(zzaag.zza(new Status(17057)));
                } else {
                    Context applicationContext = cVar.getApplicationContext();
                    Preconditions.checkNotNull(applicationContext);
                    Preconditions.checkNotNull(firebaseAuth2);
                    Preconditions.checkNotNull(hVar);
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    g gVar = firebaseAuth2.f11627a;
                    gVar.a();
                    edit.putString("firebaseAppName", gVar.f31272b);
                    edit.putString("firebaseUserUid", g0Var.f2717b.f2702a);
                    edit.commit();
                    Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                    intent.setClass(cVar, GenericIdpActivity.class);
                    intent.setPackage(cVar.getPackageName());
                    intent.putExtras((Bundle) k10.f15593b);
                    cVar.startActivity(intent);
                    task = taskCompletionSource.getTask();
                }
                task.addOnSuccessListener(new bm.b(this, k10, 0)).addOnFailureListener(new androidx.fragment.app.h(this, firebaseAuth, y10, k10, 1));
                return;
            }
        }
        cVar.x();
        firebaseAuth.e(cVar, k10).addOnSuccessListener(new bm.b(this, k10, 1)).addOnFailureListener(new bm.c(0, this, k10));
    }

    public final h0 k(String str, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseAuth);
        if (FacebookSdk.FACEBOOK_COM.equals(str) && !zzace.zzg(firebaseAuth.f11627a)) {
            throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        g gVar = firebaseAuth.f11627a;
        gVar.a();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", gVar.f31273c.f31280a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaas.zza().zzb());
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.a());
        g gVar2 = firebaseAuth.f11627a;
        gVar2.a();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", gVar2.f31272b);
        ArrayList<String> stringArrayList = ((b) this.f10961d).a().getStringArrayList("generic_oauth_scopes");
        HashMap hashMap = (HashMap) ((b) this.f10961d).a().getSerializable("generic_oauth_custom_parameters");
        if (stringArrayList != null) {
            bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(stringArrayList));
        }
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new h0(bundle);
    }

    public final void l(boolean z10, String str, g0 g0Var, d0 d0Var, boolean z11) {
        String str2 = d0Var.f42732c;
        if (str2 == null && z10) {
            str2 = "fake_access_token";
        }
        String str3 = d0Var.f42735f;
        if (str3 == null && z10) {
            str3 = "fake_secret";
        }
        e0 e0Var = g0Var.f2717b;
        q0.g0 g0Var2 = new q0.g0(new e(str, e0Var.f2707f, null, e0Var.f2704c, g0Var.getPhotoUrl()));
        g0Var2.f31494d = str2;
        g0Var2.f31495e = str3;
        g0Var2.f31493c = d0Var;
        g0Var2.f31491a = z11;
        h(am.d.c(g0Var2.a()));
    }
}
