package ls;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import com.assetgro.stockgro.prod.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class k0 implements Runnable, m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25232a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25233b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25235d;

    public k0(l0 l0Var, a0 a0Var, Activity activity) {
        this.f25232a = 0;
        this.f25235d = l0Var;
        this.f25233b = a0Var;
        this.f25234c = activity;
    }

    @Override // ls.m0
    public final void a() {
        ((Executor) this.f25234c).execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        g1 g1Var = null;
        switch (this.f25232a) {
            case 0:
                ReentrantLock reentrantLock = g1.f25205d;
                reentrantLock.lock();
                try {
                    if (g1.a()) {
                        el.l.T0("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                    } else {
                        a0 a0Var = (a0) this.f25233b;
                        if (a0Var == null) {
                            a0Var = ((l0) this.f25235d).d();
                        }
                        if (a0Var == null) {
                            el.l.T0("MixpanelAPI.API", "No notification available, will not show.");
                        } else {
                            z b10 = a0Var.b();
                            if (b10 == z.f25368b && !kp.j.C(((Activity) this.f25234c).getApplicationContext())) {
                                el.l.T0("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                            } else {
                                int b11 = g1.b(new e1(a0Var, zq.f.I((Activity) this.f25234c)), ((l0) this.f25235d).c(), ((l0) this.f25235d).f25236a.f25262d);
                                if (b11 <= 0) {
                                    el.l.M("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                                } else {
                                    int ordinal = b10.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            el.l.M("MixpanelAPI.API", "Unrecognized notification type " + b10 + " can't be shown");
                                        } else {
                                            el.l.T0("MixpanelAPI.API", "Sending intent for takeover notification.");
                                            Intent intent = new Intent(((Activity) this.f25234c).getApplicationContext(), (Class<?>) ms.a.class);
                                            intent.addFlags(268435456);
                                            intent.addFlags(131072);
                                            intent.putExtra("com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY", b11);
                                            ((Activity) this.f25234c).startActivity(intent);
                                        }
                                    } else {
                                        reentrantLock.lock();
                                        try {
                                            int i10 = g1.f25209h;
                                            if ((i10 <= 0 || i10 == b11) && g1.f25207f != null) {
                                                g1.f25206e = System.currentTimeMillis();
                                                g1.f25209h = b11;
                                                g1Var = g1.f25207f;
                                            }
                                            if (g1Var == null) {
                                                el.l.T0("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                                            } else {
                                                v vVar = new v();
                                                n0 n0Var = ((l0) this.f25235d).f25236a;
                                                e1 e1Var = (e1) g1Var.f25212c;
                                                vVar.f25308a = n0Var;
                                                vVar.f25312e = b11;
                                                vVar.f25313f = e1Var;
                                                vVar.setRetainInstance(true);
                                                el.l.T0("MixpanelAPI.API", "Attempting to show mini notification.");
                                                FragmentTransaction beginTransaction = ((Activity) this.f25234c).getFragmentManager().beginTransaction();
                                                beginTransaction.setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down);
                                                beginTransaction.add(android.R.id.content, vVar);
                                                try {
                                                    beginTransaction.commit();
                                                } catch (IllegalStateException unused) {
                                                    el.l.T0("MixpanelAPI.API", "Unable to show notification.");
                                                    n nVar = ((l0) this.f25235d).f25236a.f25268j;
                                                    synchronized (nVar) {
                                                        try {
                                                            if (!d0.E) {
                                                                ArrayList arrayList = a0Var.f25118i;
                                                                if (arrayList != null && !arrayList.isEmpty()) {
                                                                    nVar.f25248e.add(a0Var);
                                                                } else {
                                                                    nVar.f25247d.add(a0Var);
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            reentrantLock.unlock();
                                        }
                                    }
                                    Object obj = this.f25235d;
                                    if (!((l0) obj).f25236a.f25261c.f25154f) {
                                        ((l0) obj).j(a0Var);
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            default:
                Iterator it = ((Set) this.f25233b).iterator();
                if (!it.hasNext()) {
                    n0 n0Var2 = (n0) this.f25235d;
                    k kVar = n0Var2.f25267i;
                    n nVar2 = n0Var2.f25268j;
                    synchronized (nVar2) {
                        hashSet = nVar2.f25254k;
                    }
                    kVar.getClass();
                    if (hashSet.contains("urbanairship")) {
                        kVar.a();
                    }
                    if (hashSet.contains("braze")) {
                        try {
                            Object invoke = Class.forName("com.appboy.Appboy").getMethod("getInstance", Context.class).invoke(null, kVar.f25229b);
                            String str = (String) invoke.getClass().getMethod("getDeviceId", new Class[0]).invoke(invoke, new Object[0]);
                            Object invoke2 = invoke.getClass().getMethod("getCurrentUser", new Class[0]).invoke(invoke, new Object[0]);
                            if (invoke2 == null) {
                                el.l.V0("MixpanelAPI.CnctInts", "Make sure Braze is initialized properly before Mixpanel.");
                                return;
                            }
                            String str2 = (String) invoke2.getClass().getMethod("getUserId", new Class[0]).invoke(invoke2, new Object[0]);
                            n0 n0Var3 = kVar.f25228a;
                            if (str != null && !str.isEmpty()) {
                                n0Var3.b(str, n0Var3.f25265g.c());
                                n0Var3.f25263e.f(str, "$braze_device_id");
                            }
                            if (str2 != null && !str2.isEmpty()) {
                                n0Var3.b(str2, n0Var3.f25265g.c());
                                n0Var3.f25263e.f(str2, "$braze_external_id");
                                return;
                            }
                            return;
                        } catch (ClassNotFoundException e10) {
                            el.l.W0("MixpanelAPI.CnctInts", "Braze SDK not found but Braze is integrated on Mixpanel", e10);
                            return;
                        } catch (IllegalAccessException e11) {
                            el.l.N("MixpanelAPI.CnctInts", "method invocation failed", e11);
                            return;
                        } catch (NoSuchMethodException e12) {
                            el.l.N("MixpanelAPI.CnctInts", "Braze SDK class exists but methods do not", e12);
                            return;
                        } catch (InvocationTargetException e13) {
                            el.l.N("MixpanelAPI.CnctInts", "method invocation failed", e13);
                            return;
                        } catch (Exception e14) {
                            el.l.N("MixpanelAPI.CnctInts", "Error setting braze people properties", e14);
                            return;
                        }
                    }
                    return;
                }
                a3.a.u(it.next());
                throw null;
        }
    }

    public k0(n0 n0Var) {
        this.f25232a = 1;
        this.f25235d = n0Var;
        this.f25233b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f25234c = Executors.newSingleThreadExecutor();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i10) {
        this(n0Var);
        this.f25232a = 1;
    }
}
