package lk;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.work.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t.j0;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public static final ek.h f24884i = new ek.h(7);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.h f24885a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f24888d;

    /* renamed from: e, reason: collision with root package name */
    public final ek.h f24889e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24886b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24887c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final t.f f24890f = new j0(0);

    /* renamed from: g, reason: collision with root package name */
    public final t.f f24891g = new j0(0);

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f24892h = new Bundle();

    /* JADX WARN: Type inference failed for: r0v2, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t.j0, t.f] */
    public h(ek.h hVar) {
        this.f24889e = hVar == null ? f24884i : hVar;
        this.f24888d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, t.f fVar) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var != null && g0Var.getView() != null) {
                fVar.put(g0Var.getView(), g0Var);
                c(g0Var.getChildFragmentManager().f1646c.f(), fVar);
            }
        }
    }

    public static boolean i(Context context) {
        Activity a10 = a(context);
        if (a10 != null && a10.isFinishing()) {
            return false;
        }
        return true;
    }

    public final void b(FragmentManager fragmentManager, t.f fVar) {
        Fragment fragment;
        List<Fragment> fragments;
        if (Build.VERSION.SDK_INT >= 26) {
            fragments = fragmentManager.getFragments();
            for (Fragment fragment2 : fragments) {
                if (fragment2.getView() != null) {
                    fVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), fVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            Bundle bundle = this.f24892h;
            bundle.putInt("key", i10);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                fVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), fVar);
            }
            i10 = i11;
        }
    }

    public final com.bumptech.glide.h d(Context context) {
        if (context != null) {
            char[] cArr = rk.k.f33950a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.j0) {
                    return f((androidx.fragment.app.j0) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (rk.k.g()) {
                        return d(activity.getApplicationContext());
                    }
                    if (!activity.isDestroyed()) {
                        g g10 = g(activity.getFragmentManager(), null, i(activity));
                        com.bumptech.glide.h hVar = g10.f24881d;
                        if (hVar == null) {
                            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(activity);
                            this.f24889e.getClass();
                            com.bumptech.glide.h hVar2 = new com.bumptech.glide.h(b10, g10.f24878a, g10.f24879b, activity);
                            g10.f24881d = hVar2;
                            return hVar2;
                        }
                        return hVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return d(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f24885a == null) {
                synchronized (this) {
                    try {
                        if (this.f24885a == null) {
                            com.bumptech.glide.b b11 = com.bumptech.glide.b.b(context.getApplicationContext());
                            ek.h hVar3 = this.f24889e;
                            ek.h hVar4 = new ek.h(6);
                            u uVar = new u(7);
                            Context applicationContext = context.getApplicationContext();
                            hVar3.getClass();
                            this.f24885a = new com.bumptech.glide.h(b11, hVar4, uVar, applicationContext);
                        }
                    } finally {
                    }
                }
            }
            return this.f24885a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.h e(g0 g0Var) {
        if (g0Var.getContext() != null) {
            if (rk.k.g()) {
                return d(g0Var.getContext().getApplicationContext());
            }
            d1 childFragmentManager = g0Var.getChildFragmentManager();
            Context context = g0Var.getContext();
            j h10 = h(childFragmentManager, g0Var, g0Var.isVisible());
            com.bumptech.glide.h hVar = h10.f24897e;
            if (hVar == null) {
                com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
                this.f24889e.getClass();
                com.bumptech.glide.h hVar2 = new com.bumptech.glide.h(b10, h10.f24893a, h10.f24894b, context);
                h10.f24897e = hVar2;
                return hVar2;
            }
            return hVar;
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public final com.bumptech.glide.h f(androidx.fragment.app.j0 j0Var) {
        if (rk.k.g()) {
            return d(j0Var.getApplicationContext());
        }
        if (!j0Var.isDestroyed()) {
            j h10 = h(j0Var.getSupportFragmentManager(), null, i(j0Var));
            com.bumptech.glide.h hVar = h10.f24897e;
            if (hVar == null) {
                com.bumptech.glide.b b10 = com.bumptech.glide.b.b(j0Var);
                this.f24889e.getClass();
                com.bumptech.glide.h hVar2 = new com.bumptech.glide.h(b10, h10.f24893a, h10.f24894b, j0Var);
                h10.f24897e = hVar2;
                return hVar2;
            }
            return hVar;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final g g(FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        g gVar = (g) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (gVar == null) {
            HashMap hashMap = this.f24886b;
            g gVar2 = (g) hashMap.get(fragmentManager);
            if (gVar2 == null) {
                gVar2 = new g();
                gVar2.f24883f = fragment;
                if (fragment != null && fragment.getActivity() != null) {
                    gVar2.a(fragment.getActivity());
                }
                if (z10) {
                    gVar2.f24878a.c();
                }
                hashMap.put(fragmentManager, gVar2);
                fragmentManager.beginTransaction().add(gVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f24888d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return gVar2;
        }
        return gVar;
    }

    public final j h(d1 d1Var, g0 g0Var, boolean z10) {
        j jVar = (j) d1Var.C("com.bumptech.glide.manager");
        if (jVar == null) {
            HashMap hashMap = this.f24887c;
            j jVar2 = (j) hashMap.get(d1Var);
            if (jVar2 == null) {
                jVar2 = new j();
                jVar2.f24898f = g0Var;
                if (g0Var != null && g0Var.getContext() != null) {
                    g0 g0Var2 = g0Var;
                    while (g0Var2.getParentFragment() != null) {
                        g0Var2 = g0Var2.getParentFragment();
                    }
                    d1 fragmentManager = g0Var2.getFragmentManager();
                    if (fragmentManager != null) {
                        jVar2.p(g0Var.getContext(), fragmentManager);
                    }
                }
                if (z10) {
                    jVar2.f24893a.c();
                }
                hashMap.put(d1Var, jVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
                aVar.e(0, jVar2, "com.bumptech.glide.manager", 1);
                aVar.h(true);
                this.f24888d.obtainMessage(2, d1Var).sendToTarget();
            }
            return jVar2;
        }
        return jVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        Object obj3;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                obj3 = null;
                z10 = false;
                obj2 = null;
                if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z10;
            }
            obj = (d1) message.obj;
            remove = this.f24887c.remove(obj);
        } else {
            obj = (FragmentManager) message.obj;
            remove = this.f24886b.remove(obj);
        }
        Object obj4 = remove;
        obj2 = obj;
        obj3 = obj4;
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }
}
