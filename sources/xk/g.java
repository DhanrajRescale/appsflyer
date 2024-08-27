package xk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final ek.h f40363f = new ek.h(10, 0);

    /* renamed from: g, reason: collision with root package name */
    public static g f40364g;

    /* renamed from: a, reason: collision with root package name */
    public final a5.b f40365a;

    /* renamed from: b, reason: collision with root package name */
    public final b f40366b;

    /* renamed from: c, reason: collision with root package name */
    public a f40367c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f40368d;

    /* renamed from: e, reason: collision with root package name */
    public Date f40369e;

    public g(a5.b localBroadcastManager, b accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f40365a = localBroadcastManager;
        this.f40366b = accessTokenCache;
        this.f40368d = new AtomicBoolean(false);
        this.f40369e = new Date(0L);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [xk.f, java.lang.Object] */
    public final void a() {
        nl.x xVar;
        a aVar = this.f40367c;
        if (aVar == null) {
            return;
        }
        int i10 = 0;
        if (!this.f40368d.compareAndSet(false, true)) {
            return;
        }
        this.f40369e = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? obj = new Object();
        z[] zVarArr = new z[2];
        c cVar = new c(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "permission,status");
        String str = z.f40475j;
        z w10 = ek.e.w(aVar, "me/permissions", cVar);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        w10.f40482d = bundle;
        e0 e0Var = e0.f40353a;
        w10.k(e0Var);
        zVarArr[0] = w10;
        d dVar = new d(obj, i10);
        String str2 = aVar.f40322k;
        if (str2 == null) {
            str2 = "facebook";
        }
        if (Intrinsics.a(str2, FacebookSdk.INSTAGRAM)) {
            xVar = new nl.x(1);
        } else {
            xVar = new nl.x(0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("grant_type", xVar.f28965b);
        bundle2.putString(PaymentConstants.CLIENT_ID, aVar.f40319h);
        bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        z w11 = ek.e.w(aVar, xVar.f28964a, dVar);
        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
        w11.f40482d = bundle2;
        w11.k(e0Var);
        zVarArr[1] = w11;
        c0 requests = new c0(zVarArr);
        e callback = new e(obj, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this);
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = requests.f40338d;
        if (!arrayList.contains(callback)) {
            arrayList.add(callback);
        }
        Intrinsics.checkNotNullParameter(requests, "requests");
        nl.n0.J(requests);
        new a0(requests).executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
    }

    public final void b(a aVar, a aVar2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f40365a.c(intent);
    }

    public final void c(a aVar, boolean z10) {
        Date date;
        a aVar2 = this.f40367c;
        this.f40367c = aVar;
        this.f40368d.set(false);
        this.f40369e = new Date(0L);
        if (z10) {
            b bVar = this.f40366b;
            if (aVar != null) {
                bVar.b(aVar);
            } else {
                bVar.f40326a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                if (FacebookSdk.isLegacyTokenUpgradeSupported()) {
                    bVar.a().f40362a.edit().clear().apply();
                }
                nl.n0.d(FacebookSdk.getApplicationContext());
            }
        }
        if (!nl.n0.a(aVar2, aVar)) {
            b(aVar2, aVar);
            Context applicationContext = FacebookSdk.getApplicationContext();
            Date date2 = a.f40309l;
            a q10 = ek.h.q();
            AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
            if (ek.h.x()) {
                if (q10 == null) {
                    date = null;
                } else {
                    date = q10.f40312a;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(applicationContext, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, q10.f40312a.getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
