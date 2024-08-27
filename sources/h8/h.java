package h8;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import dv.k;
import dv.r;
import dv.t;
import ea.p0;
import el.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import l.f0;
import l.o;
import l.w;
import lp.g0;
import lp.o0;
import ls.d1;
import nv.w0;
import nv.x0;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import on.i;
import on.j;
import t.j0;
import t0.s;

/* loaded from: classes.dex */
public final class h implements k.a, xs.b, ln.b, Continuation {

    /* renamed from: f, reason: collision with root package name */
    public static h f18054f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18055a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18056b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18057c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18058d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18059e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18055a = i10;
        this.f18056b = obj;
        this.f18057c = obj2;
        this.f18058d = obj3;
        this.f18059e = obj4;
    }

    public static synchronized h h(Context context, m8.a aVar) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f18054f == null) {
                    f18054f = new h(context, aVar);
                }
                hVar = f18054f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static void k(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    @Override // k.a
    public final boolean a(k.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f18056b).onActionItemClicked(g(bVar), new w((Context) this.f18057c, (w3.b) menuItem));
    }

    @Override // k.a
    public final boolean b(k.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f18056b).onPrepareActionMode(g(bVar), i(oVar));
    }

    @Override // k.a
    public final boolean c(k.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f18056b).onCreateActionMode(g(bVar), i(oVar));
    }

    @Override // k.a
    public final void d(k.b bVar) {
        ((ActionMode.Callback) this.f18056b).onDestroyActionMode(g(bVar));
    }

    public final ArrayList e(o0 o0Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k(elapsedRealtime, (Map) this.f18056b);
        k(elapsedRealtime, (Map) this.f18057c);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            m5.b bVar = (m5.b) o0Var.get(i10);
            if (!((Map) this.f18056b).containsKey(bVar.f27510b) && !((Map) this.f18057c).containsKey(Integer.valueOf(bVar.f27511c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final t f(String str, dv.d dVar) {
        if (str != null) {
            List list = (List) this.f18057c;
            ListIterator listIterator = list.listIterator(list.size());
            r f10 = ((k) this.f18056b).f(str, dVar);
            loop0: while (listIterator.hasPrevious()) {
                if (Thread.currentThread().isInterrupted()) {
                    ((k) this.f18056b).getClass();
                    return null;
                }
                t tVar = (t) listIterator.previous();
                if (str.equals(tVar.f14601b)) {
                    return tVar;
                }
                if (f10 != null) {
                    Iterator it = f10.f14584k.iterator();
                    while (it.hasNext()) {
                        if (tVar.f14601b.equals((String) it.next())) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final k.g g(k.b bVar) {
        int size = ((ArrayList) this.f18058d).size();
        for (int i10 = 0; i10 < size; i10++) {
            k.g gVar = (k.g) ((ArrayList) this.f18058d).get(i10);
            if (gVar != null && gVar.f21761b == bVar) {
                return gVar;
            }
        }
        k.g gVar2 = new k.g((Context) this.f18057c, bVar);
        ((ArrayList) this.f18058d).add(gVar2);
        return gVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f18055a) {
            case 7:
                p0 p0Var = (p0) this.f18056b;
                ov.a gsonConverterFactory = (ov.a) ((Provider) this.f18057c).get();
                tr.h rxJava2CallAdapterFactory = (tr.h) ((Provider) this.f18058d).get();
                OkHttpClient okHttpClient = (OkHttpClient) ((Provider) this.f18059e).get();
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(rxJava2CallAdapterFactory, "rxJava2CallAdapterFactory");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                w0 w0Var = new w0();
                w0Var.a();
                ArrayList arrayList = w0Var.f29310d;
                Objects.requireNonNull(gsonConverterFactory, "factory == null");
                arrayList.add(gsonConverterFactory);
                Objects.requireNonNull(okHttpClient, "client == null");
                w0Var.f29308b = okHttpClient;
                ArrayList arrayList2 = w0Var.f29311e;
                Objects.requireNonNull(rxJava2CallAdapterFactory, "factory == null");
                arrayList2.add(rxJava2CallAdapterFactory);
                x0 b10 = w0Var.b();
                Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
                return b10;
            default:
                return new i((Executor) ((Provider) this.f18056b).get(), (pn.d) ((Provider) this.f18057c).get(), (j) ((Provider) this.f18058d).get(), (qn.b) ((Provider) this.f18059e).get());
        }
    }

    public final Menu i(o oVar) {
        Menu menu = (Menu) ((j0) this.f18059e).get(oVar);
        if (menu == null) {
            f0 f0Var = new f0((Context) this.f18057c, oVar);
            ((j0) this.f18059e).put(oVar, f0Var);
            return f0Var;
        }
        return menu;
    }

    public final synchronized boolean j(Object obj, String str) {
        if (!((ConcurrentMap) this.f18056b).containsKey(str)) {
            return false;
        }
        return !((d1) ((ConcurrentMap) this.f18056b).get(str)).f25176b.equals(obj);
    }

    public final m5.b l(o0 o0Var) {
        ArrayList e10 = e(o0Var);
        if (e10.size() < 2) {
            return (m5.b) g0.e(e10, null);
        }
        Collections.sort(e10, new s(5));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m5.b) e10.get(0)).f27511c;
        int i12 = 0;
        while (true) {
            if (i12 >= e10.size()) {
                break;
            }
            m5.b bVar = (m5.b) e10.get(i12);
            if (i11 != bVar.f27511c) {
                if (arrayList.size() == 1) {
                    return (m5.b) e10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f27510b, Integer.valueOf(bVar.f27512d)));
                i12++;
            }
        }
        m5.b bVar2 = (m5.b) ((Map) this.f18058d).get(arrayList);
        if (bVar2 == null) {
            List subList = e10.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((m5.b) subList.get(i14)).f27512d;
            }
            int nextInt = ((Random) this.f18059e).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    m5.b bVar3 = (m5.b) subList.get(i10);
                    i15 += bVar3.f27512d;
                    if (nextInt < i15) {
                        bVar2 = bVar3;
                        break;
                    }
                    i10++;
                } else {
                    bVar2 = (m5.b) g0.f(subList);
                    break;
                }
            }
            ((Map) this.f18058d).put(arrayList, bVar2);
        }
        return bVar2;
    }

    public final synchronized void m(Object obj, String str) {
        if (!((ConcurrentMap) this.f18056b).containsKey(str)) {
            l.V0("MixpanelAPI.Tweaks", "Attempt to set a tweak \"" + str + "\" which has never been defined.");
            return;
        }
        d1 d1Var = (d1) ((ConcurrentMap) this.f18056b).get(str);
        ((ConcurrentMap) this.f18056b).put(str, new d1(d1Var.f25175a, d1Var.f25177c, d1Var.f25178d, d1Var.f25179e, obj, d1Var.f25180f));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        q.h hVar;
        q.h hVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f18056b;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f18057c;
        String str = (String) this.f18058d;
        Continuation continuation = (Continuation) this.f18059e;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        int i10 = zzaag.zzb;
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).f11651a.endsWith("MISSING_RECAPTCHA_TOKEN")) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
            }
            synchronized (firebaseAuth) {
                hVar = firebaseAuth.f11638l;
            }
            if (hVar == null) {
                q.h hVar3 = new q.h(firebaseAuth.f11627a, firebaseAuth);
                synchronized (firebaseAuth) {
                    firebaseAuth.f11638l = hVar3;
                }
            }
            synchronized (firebaseAuth) {
                hVar2 = firebaseAuth.f11638l;
            }
            return hVar2.g(str, Boolean.FALSE, recaptchaAction).continueWithTask(continuation).continueWithTask(new com.google.firebase.messaging.t(str, hVar2, recaptchaAction, continuation, 11));
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10) {
        this(new Random());
        this.f18055a = i10;
        if (i10 == 4) {
            return;
        }
        if (i10 == 5) {
            this.f18056b = new j0();
            this.f18057c = new SparseArray();
            this.f18058d = new t.o();
            this.f18059e = new j0();
            return;
        }
        if (i10 == 9) {
            this.f18056b = null;
            this.f18057c = new ArrayList();
            this.f18058d = null;
            this.f18059e = HttpUrl.FRAGMENT_ENCODE_SET;
            return;
        }
        if (i10 != 13) {
            this.f18056b = new c3.e(256, 0);
            this.f18057c = new c3.e(256, 0);
            this.f18058d = new c3.e(256, 0);
            this.f18059e = new c3.g[32];
            return;
        }
        this.f18056b = new ConcurrentHashMap();
        this.f18057c = new ConcurrentHashMap();
        this.f18058d = new ConcurrentHashMap();
        this.f18059e = new ArrayList();
    }

    public h(k kVar) {
        this.f18055a = 14;
        this.f18057c = new ArrayList();
        this.f18059e = new HashSet();
        this.f18056b = kVar;
    }

    public h(Random random) {
        this.f18055a = 4;
        this.f18058d = new HashMap();
        this.f18059e = random;
        this.f18056b = new HashMap();
        this.f18057c = new HashMap();
    }

    public h(Context context, m8.a aVar) {
        this.f18055a = 0;
        Context applicationContext = context.getApplicationContext();
        this.f18056b = new c(applicationContext, aVar);
        this.f18057c = new c(applicationContext, aVar);
        this.f18058d = new f(applicationContext, aVar);
        this.f18059e = new c(applicationContext, aVar);
    }

    public h(String str, String str2) {
        this.f18055a = 8;
        Preconditions.checkNotNull(str);
        this.f18056b = str;
        this.f18058d = str2;
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f18055a = 1;
        this.f18057c = context;
        this.f18056b = callback;
        this.f18058d = new ArrayList();
        this.f18059e = new j0();
    }
}
