package com.google.firebase.messaging;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.TokenRefreshAuthenticator;
import com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText;
import com.flipkart.youtubeview.activity.YouTubeActivity;
import com.flipkart.youtubeview.webview.YouTubePlayerWebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuthException;
import ea.p0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import os.k0;
import t.j0;

/* loaded from: classes2.dex */
public final class t implements r5.b0, n5.m, xs.b, om.a, ln.b, Continuation {

    /* renamed from: f, reason: collision with root package name */
    public static t f11780f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11781a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11782b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11783c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11784d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11785e;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11781a = i10;
        this.f11782b = obj;
        this.f11783c = obj2;
        this.f11784d = obj3;
        this.f11785e = obj4;
    }

    public static boolean f(Context context, String str, q.g gVar) {
        gVar.f31448a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    public static synchronized t q() {
        t tVar;
        synchronized (t.class) {
            try {
                if (f11780f == null) {
                    f11780f = new t(0);
                }
                tVar = f11780f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    @Override // r5.b0
    public final void G(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).k(nVar, x(sVar));
        }
    }

    @Override // n5.m
    public final void I(int i10, r5.w wVar, Exception exc) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).e(exc);
        }
    }

    @Override // r5.b0
    public final void J(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).m(nVar, x(sVar));
        }
    }

    @Override // r5.b0
    public final void L(int i10, r5.w wVar, r5.s sVar) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).s(x(sVar));
        }
    }

    @Override // r5.b0
    public final void M(int i10, r5.w wVar, r5.n nVar, r5.s sVar, IOException iOException, boolean z10) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).o(nVar, x(sVar), iOException, z10);
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        kq.e eVar = new kq.e(iArr, valueAnimator);
        valueAnimator.addListener((Animator.AnimatorListener) this.f11785e);
        ((ArrayList) this.f11782b).add(eVar);
    }

    public final void b(View view, List list) {
        synchronized (((Set) this.f11785e)) {
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Set) this.f11785e).add(new os.f(view, (k0) list.get(i10), (Handler) this.f11783c));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        if (Thread.currentThread() == ((Handler) this.f11783c).getLooper().getThread()) {
            e();
        } else {
            ((Handler) this.f11783c).post(new os.a(this, 1));
        }
    }

    @Override // n5.m
    public final void d(int i10, r5.w wVar) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).f();
        }
    }

    public final void e() {
        List list;
        List list2;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (Activity activity : Collections.unmodifiableSet((Set) this.f11782b)) {
                String canonicalName = activity.getClass().getCanonicalName();
                View rootView = activity.getWindow().getDecorView().getRootView();
                synchronized (((Map) this.f11784d)) {
                    list = (List) ((Map) this.f11784d).get(canonicalName);
                    list2 = (List) ((Map) this.f11784d).get(null);
                }
                if (list != null) {
                    b(rootView, list);
                }
                if (list2 != null) {
                    b(rootView, list2);
                }
            }
            return;
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }

    @Override // n5.m
    public final void g(int i10, r5.w wVar) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).a();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f11781a) {
            case 6:
                p0 p0Var = (p0) this.f11782b;
                LogoutSubject logoutSubject = (LogoutSubject) ((Provider) this.f11783c).get();
                UserPreferences userPreferences = (UserPreferences) ((Provider) this.f11784d).get();
                NetworkService networkService = (NetworkService) ((Provider) this.f11785e).get();
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
                Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
                Intrinsics.checkNotNullParameter(networkService, "networkService");
                return new TokenRefreshAuthenticator(p0Var.f15254a, logoutSubject, userPreferences, networkService);
            default:
                Context context = (Context) ((Provider) this.f11782b).get();
                pn.d dVar = (pn.d) ((Provider) this.f11783c).get();
                on.a aVar = (on.a) ((Provider) this.f11784d).get();
                return new on.c(context, dVar, aVar);
        }
    }

    public final void h(String str) {
        ((l7.s) this.f11782b).b();
        q7.g a10 = ((l7.x) this.f11784d).a();
        if (str == null) {
            a10.d(1);
        } else {
            a10.f(1, str);
        }
        ((l7.s) this.f11782b).c();
        try {
            a10.g();
            ((l7.s) this.f11782b).h();
        } finally {
            ((l7.s) this.f11782b).f();
            ((l7.x) this.f11784d).c(a10);
        }
    }

    public final void i() {
        ((l7.s) this.f11782b).b();
        q7.g a10 = ((l7.x) this.f11785e).a();
        ((l7.s) this.f11782b).c();
        try {
            a10.g();
            ((l7.s) this.f11782b).h();
        } finally {
            ((l7.s) this.f11782b).f();
            ((l7.x) this.f11785e).c(a10);
        }
    }

    @Override // n5.m
    public final void j(int i10, r5.w wVar, int i11) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).d(i11);
        }
    }

    @Override // n5.m
    public final void k(int i10, r5.w wVar) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).b();
        }
    }

    public final void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((j0) this.f11783c).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final void m(int i10, CharSequence charSequence) {
        this.f11782b = HttpUrl.FRAGMENT_ENCODE_SET;
        if (charSequence.length() <= 0) {
            return;
        }
        for (int i11 = i10 - 1; i11 >= 0 && charSequence.charAt(i11) != ' ' && charSequence.charAt(i11) != '\n'; i11 += -1) {
            this.f11782b = ((String) this.f11782b) + charSequence.charAt(i11);
        }
        this.f11782b = new StringBuilder((String) this.f11782b).reverse().toString();
    }

    public final void n(String str) {
        ((ArrayList) this.f11785e).clear();
        Matcher matcher = Pattern.compile("((^|)@([\\p{N}|\\p{L}|_]{2,64}))+", 8).matcher(str);
        while (matcher.find()) {
            ((ArrayList) this.f11785e).add(matcher.group());
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll((ArrayList) this.f11785e);
        ((ArrayList) this.f11785e).clear();
        ((ArrayList) this.f11785e).addAll(hashSet);
    }

    @Override // r5.b0
    public final void o(int i10, r5.w wVar, r5.s sVar) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).d(x(sVar));
        }
    }

    public final void p(int i10, String str) {
        n(str.toString());
        m(i10, str);
        ((ArrayList) this.f11784d).clear();
        if (((String) this.f11782b).length() >= 2) {
            Iterator it = ((ArrayList) this.f11785e).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.contains((String) this.f11782b)) {
                    ((ArrayList) this.f11784d).add(str2);
                }
            }
        }
        x9.c cVar = (x9.c) this.f11783c;
        ArrayList arrayList = (ArrayList) this.f11784d;
        ((ArrayList) cVar.f40138b).clear();
        Iterator it2 = ((ArrayList) cVar.f40139c).iterator();
        while (it2.hasNext()) {
            sj.d dVar = (sj.d) it2.next();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (dVar.f34661a.toLowerCase().contains(((String) it3.next()).replaceAll("\\s", HttpUrl.FRAGMENT_ENCODE_SET).substring(1).toLowerCase())) {
                    ((ArrayList) cVar.f40138b).add(dVar);
                }
            }
        }
        if (((sj.c) cVar.f40140d) != null) {
            HashSet hashSet = new HashSet();
            hashSet.addAll((ArrayList) cVar.f40138b);
            ((ArrayList) cVar.f40138b).clear();
            ((ArrayList) cVar.f40138b).addAll(hashSet);
            if (((ArrayList) cVar.f40138b).size() > 0) {
                ((sj.c) cVar.f40140d).setSuggestionList((ArrayList) cVar.f40138b);
                return;
            }
            MentionableEditText mentionableEditText = (MentionableEditText) ((sj.c) cVar.f40140d);
            if (mentionableEditText.f10759h != null) {
                sj.h hVar = mentionableEditText.f10755d;
                ArrayList arrayList2 = hVar.f34668d;
                if (arrayList2 != null) {
                    arrayList2.clear();
                    hVar.d();
                }
                mentionableEditText.f10759h.dismiss();
                mentionableEditText.f10753b = false;
            }
        }
    }

    public final boolean r(Context context) {
        boolean z10;
        if (((Boolean) this.f11784d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11784d = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f11783c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11784d).booleanValue();
    }

    @Override // n5.m
    public final void s(int i10, r5.w wVar) {
        if (w(i10, wVar)) {
            ((n5.l) this.f11784d).c();
        }
    }

    public final boolean t(Context context) {
        boolean z10;
        if (((Boolean) this.f11783c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11783c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f11783c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11783c).booleanValue();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
            int i10 = zzaag.zzb;
            if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).f11651a.endsWith("INVALID_RECAPTCHA_TOKEN")) {
                if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ".concat(String.valueOf((String) this.f11782b)));
                }
                return ((q.h) this.f11783c).g((String) this.f11782b, Boolean.TRUE, (RecaptchaAction) this.f11784d).continueWithTask((Continuation) this.f11785e);
            }
            return task;
        }
        return task;
    }

    public final void u(j8.g gVar) {
        ((l7.s) this.f11782b).b();
        ((l7.s) this.f11782b).c();
        try {
            ((l7.b) this.f11783c).e(gVar);
            ((l7.s) this.f11782b).h();
        } finally {
            ((l7.s) this.f11782b).f();
        }
    }

    @Override // r5.b0
    public final void v(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        if (w(i10, wVar)) {
            ((l0.j) this.f11783c).q(nVar, x(sVar));
        }
    }

    public final boolean w(int i10, r5.w wVar) {
        r5.w wVar2;
        if (wVar != null) {
            wVar2 = ((r5.h) this.f11785e).s(this.f11782b, wVar);
            if (wVar2 == null) {
                return false;
            }
        } else {
            wVar2 = null;
        }
        int u10 = ((r5.h) this.f11785e).u(i10, this.f11782b);
        l0.j jVar = (l0.j) this.f11783c;
        if (jVar.f23773a != u10 || !e5.x.a((r5.w) jVar.f23774b, wVar2)) {
            this.f11783c = new l0.j((CopyOnWriteArrayList) ((r5.h) this.f11785e).f33077c.f23775c, u10, wVar2);
        }
        n5.l lVar = (n5.l) this.f11784d;
        if (lVar.f28314a != u10 || !e5.x.a(lVar.f28315b, wVar2)) {
            this.f11784d = new n5.l(((r5.h) this.f11785e).f33078d.f28316c, u10, wVar2);
            return true;
        }
        return true;
    }

    public final r5.s x(r5.s sVar) {
        long t10 = ((r5.h) this.f11785e).t(sVar.f33297f, this.f11782b);
        r5.h hVar = (r5.h) this.f11785e;
        Object obj = this.f11782b;
        long j10 = sVar.f33298g;
        long t11 = hVar.t(j10, obj);
        if (t10 == sVar.f33297f && t11 == j10) {
            return sVar;
        }
        return new r5.s(sVar.f33292a, sVar.f33293b, sVar.f33294c, sVar.f33295d, sVar.f33296e, t10, t11);
    }

    public final void y() {
        try {
            ((a.c) ((a.e) this.f11782b)).k();
        } catch (RemoteException unused) {
        }
    }

    public t(ArrayList arrayList, sj.c cVar) {
        this.f11781a = 7;
        this.f11784d = new ArrayList();
        this.f11785e = new ArrayList();
        this.f11783c = new x9.c(arrayList, cVar);
    }

    public t(l7.s sVar) {
        this.f11781a = 5;
        this.f11782b = sVar;
        this.f11783c = new j8.b(this, sVar, 4);
        this.f11784d = new j8.h(this, sVar, 0);
        this.f11785e = new j8.h(this, sVar, 1);
    }

    public t(q.g gVar, a.e eVar, ComponentName componentName, Context context) {
        this.f11781a = 2;
        this.f11785e = gVar;
        this.f11782b = eVar;
        this.f11783c = componentName;
        this.f11784d = context;
    }

    public t(int i10) {
        this.f11781a = i10;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f11782b = new c3.e(10, 1);
                this.f11783c = new j0();
                this.f11784d = new ArrayList();
                this.f11785e = new HashSet();
                return;
            }
            if (i10 == 10) {
                this.f11782b = new ArrayList();
                this.f11783c = null;
                this.f11784d = null;
                this.f11785e = new m.d(this, 6);
                return;
            }
            if (i10 == 13) {
                this.f11782b = new HashSet();
                this.f11783c = new Handler(Looper.getMainLooper());
                this.f11784d = new HashMap();
                this.f11785e = new HashSet();
                return;
            }
            if (i10 != 14) {
                this.f11782b = null;
                this.f11783c = null;
                this.f11784d = null;
                this.f11785e = new ArrayDeque();
                return;
            }
            this.f11782b = new ArrayList();
            this.f11783c = new ArrayList();
            this.f11784d = new ArrayList();
            this.f11785e = new ArrayList();
        }
    }

    public t(r5.h hVar, Object obj) {
        this.f11781a = 4;
        this.f11785e = hVar;
        this.f11783c = hVar.a(null);
        this.f11784d = new n5.l(hVar.f33078d.f28316c, 0, null);
        this.f11782b = obj;
    }

    public t(YouTubeActivity youTubeActivity, YouTubePlayerWebView youTubePlayerWebView, String str, ProgressBar progressBar) {
        this.f11781a = 8;
        this.f11785e = youTubeActivity;
        this.f11783c = youTubePlayerWebView;
        this.f11782b = str;
        this.f11784d = progressBar;
    }
}
