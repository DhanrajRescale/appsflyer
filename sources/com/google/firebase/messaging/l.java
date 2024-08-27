package com.google.firebase.messaging;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f11761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f11763c;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, String str, v vVar) {
        this.f11761a = firebaseMessaging;
        this.f11762b = str;
        this.f11763c = vVar;
    }

    public final Task a() {
        FirebaseMessaging firebaseMessaging = this.f11761a;
        m.w wVar = firebaseMessaging.f11689c;
        return wVar.e(wVar.n(xk.f.b((pp.g) wVar.f25760a), "*", new Bundle())).onSuccessTask(firebaseMessaging.f11693g, new l(firebaseMessaging, this.f11762b, this.f11763c));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        String f10;
        FirebaseMessaging firebaseMessaging = this.f11761a;
        String str = this.f11762b;
        v vVar = this.f11763c;
        String str2 = (String) obj;
        ll.o c10 = FirebaseMessaging.c(firebaseMessaging.f11688b);
        pp.g gVar = firebaseMessaging.f11687a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f31272b)) {
            f10 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            f10 = gVar.f();
        }
        String a10 = firebaseMessaging.f11694h.a();
        synchronized (c10) {
            String a11 = v.a(str2, System.currentTimeMillis(), a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f24937b).edit();
                edit.putString(f10 + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (vVar == null || !str2.equals(vVar.f11793a)) {
            pp.g gVar2 = firebaseMessaging.f11687a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f31272b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f31272b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new h(firebaseMessaging.f11688b).c(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
