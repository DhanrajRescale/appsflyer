package d8;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.u;
import j8.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.l;
import k8.q;

/* loaded from: classes.dex */
public final class e implements f8.b, b8.a, q {

    /* renamed from: j, reason: collision with root package name */
    public static final String f14191j = u.C("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14194c;

    /* renamed from: d, reason: collision with root package name */
    public final h f14195d;

    /* renamed from: e, reason: collision with root package name */
    public final f8.c f14196e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f14199h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14200i = false;

    /* renamed from: g, reason: collision with root package name */
    public int f14198g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14197f = new Object();

    public e(Context context, int i10, String str, h hVar) {
        this.f14192a = context;
        this.f14193b = i10;
        this.f14195d = hVar;
        this.f14194c = str;
        this.f14196e = new f8.c(context, hVar.f14205b, this);
    }

    public final void a() {
        synchronized (this.f14197f) {
            try {
                this.f14196e.c();
                this.f14195d.f14206c.b(this.f14194c);
                PowerManager.WakeLock wakeLock = this.f14199h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    u.w().u(f14191j, String.format("Releasing wakelock %s for WorkSpec %s", this.f14199h, this.f14194c), new Throwable[0]);
                    this.f14199h.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        u.w().u(f14191j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        a();
        int i10 = this.f14193b;
        h hVar = this.f14195d;
        Context context = this.f14192a;
        if (z10) {
            hVar.e(new b.d(hVar, b.c(context, this.f14194c), i10));
        }
        if (this.f14200i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.e(new b.d(hVar, intent, i10));
        }
    }

    public final void c() {
        Integer valueOf = Integer.valueOf(this.f14193b);
        String str = this.f14194c;
        this.f14199h = l.a(this.f14192a, String.format("%s (%s)", str, valueOf));
        String str2 = f14191j;
        u.w().u(str2, String.format("Acquiring wakelock %s for WorkSpec %s", this.f14199h, str), new Throwable[0]);
        this.f14199h.acquire();
        k o10 = this.f14195d.f14208e.f4110c.n().o(str);
        if (o10 == null) {
            f();
            return;
        }
        boolean b10 = o10.b();
        this.f14200i = b10;
        if (!b10) {
            u.w().u(str2, String.format("No constraints for %s", str), new Throwable[0]);
            e(Collections.singletonList(str));
        } else {
            this.f14196e.b(Collections.singletonList(o10));
        }
    }

    @Override // f8.b
    public final void d(ArrayList arrayList) {
        f();
    }

    @Override // f8.b
    public final void e(List list) {
        if (!list.contains(this.f14194c)) {
            return;
        }
        synchronized (this.f14197f) {
            try {
                if (this.f14198g == 0) {
                    this.f14198g = 1;
                    u.w().u(f14191j, String.format("onAllConstraintsMet for %s", this.f14194c), new Throwable[0]);
                    if (this.f14195d.f14207d.g(this.f14194c, null)) {
                        this.f14195d.f14206c.a(this.f14194c, this);
                    } else {
                        a();
                    }
                } else {
                    u.w().u(f14191j, String.format("Already started work for %s", this.f14194c), new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f14197f) {
            try {
                if (this.f14198g < 2) {
                    this.f14198g = 2;
                    u w10 = u.w();
                    String str = f14191j;
                    w10.u(str, String.format("Stopping work for WorkSpec %s", this.f14194c), new Throwable[0]);
                    Context context = this.f14192a;
                    String str2 = this.f14194c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f14195d;
                    hVar.e(new b.d(hVar, intent, this.f14193b));
                    if (this.f14195d.f14207d.d(this.f14194c)) {
                        u.w().u(str, String.format("WorkSpec %s needs to be rescheduled", this.f14194c), new Throwable[0]);
                        Intent c10 = b.c(this.f14192a, this.f14194c);
                        h hVar2 = this.f14195d;
                        hVar2.e(new b.d(hVar2, c10, this.f14193b));
                    } else {
                        u.w().u(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f14194c), new Throwable[0]);
                    }
                } else {
                    u.w().u(f14191j, String.format("Already stopped work for %s", this.f14194c), new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
