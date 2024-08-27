package dp;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import h.a0;
import java.util.HashSet;
import ll.o;
import nf.r;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o f14437a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14439c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f14440d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f14441e;

    public c(Context context) {
        o oVar = new o("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f14440d = new HashSet();
        this.f14441e = null;
        this.f14437a = oVar;
        this.f14438b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f14439c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(r rVar) {
        this.f14437a.k("registerListener", new Object[0]);
        this.f14440d.add(rVar);
        b();
    }

    public final void b() {
        a0 a0Var;
        HashSet hashSet = this.f14440d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.f14439c;
        if (!isEmpty && this.f14441e == null) {
            a0 a0Var2 = new a0(this);
            this.f14441e = a0Var2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f14438b;
            if (i10 >= 33) {
                context.registerReceiver(a0Var2, intentFilter, 2);
            } else {
                context.registerReceiver(a0Var2, intentFilter);
            }
        }
        if (hashSet.isEmpty() && (a0Var = this.f14441e) != null) {
            context.unregisterReceiver(a0Var);
            this.f14441e = null;
        }
    }
}
