package d8;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.u;
import k8.j;
import k8.l;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14201a;

    /* renamed from: b, reason: collision with root package name */
    public final h f14202b;

    public /* synthetic */ f(h hVar, int i10) {
        this.f14201a = i10;
        this.f14202b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        f fVar;
        boolean z10;
        boolean isEmpty;
        int i10 = 1;
        switch (this.f14201a) {
            case 0:
                synchronized (this.f14202b.f14211h) {
                    h hVar2 = this.f14202b;
                    hVar2.f14212i = (Intent) hVar2.f14211h.get(0);
                }
                Intent intent = this.f14202b.f14212i;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f14202b.f14212i.getIntExtra("KEY_START_ID", 0);
                    u w10 = u.w();
                    String str = h.f14203k;
                    w10.u(str, String.format("Processing command %s, %s", this.f14202b.f14212i, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a10 = l.a(this.f14202b.f14204a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                    try {
                        u.w().u(str, String.format("Acquiring operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.acquire();
                        h hVar3 = this.f14202b;
                        hVar3.f14209f.d(hVar3.f14212i, intExtra, hVar3);
                        u.w().u(str, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        hVar = this.f14202b;
                        fVar = new f(hVar, i10);
                    } catch (Throwable th2) {
                        try {
                            u w11 = u.w();
                            String str2 = h.f14203k;
                            w11.v(str2, "Unexpected error in onHandleIntent", th2);
                            u.w().u(str2, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                            a10.release();
                            hVar = this.f14202b;
                            fVar = new f(hVar, i10);
                        } catch (Throwable th3) {
                            u.w().u(h.f14203k, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                            a10.release();
                            h hVar4 = this.f14202b;
                            hVar4.e(new f(hVar4, i10));
                            throw th3;
                        }
                    }
                    hVar.e(fVar);
                    return;
                }
                return;
            default:
                h hVar5 = this.f14202b;
                hVar5.getClass();
                u w12 = u.w();
                String str3 = h.f14203k;
                w12.u(str3, "Checking if commands are complete.", new Throwable[0]);
                hVar5.c();
                synchronized (hVar5.f14211h) {
                    try {
                        if (hVar5.f14212i != null) {
                            u.w().u(str3, String.format("Removing command %s", hVar5.f14212i), new Throwable[0]);
                            if (((Intent) hVar5.f14211h.remove(0)).equals(hVar5.f14212i)) {
                                hVar5.f14212i = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        j jVar = (j) ((h.c) hVar5.f14205b).f17583b;
                        b bVar = hVar5.f14209f;
                        synchronized (bVar.f14185c) {
                            z10 = !bVar.f14184b.isEmpty();
                        }
                        if (!z10 && hVar5.f14211h.isEmpty()) {
                            synchronized (jVar.f22680c) {
                                isEmpty = true ^ jVar.f22678a.isEmpty();
                            }
                            if (!isEmpty) {
                                u.w().u(str3, "No more commands & intents.", new Throwable[0]);
                                g gVar = hVar5.f14213j;
                                if (gVar != null) {
                                    ((SystemAlarmService) gVar).a();
                                }
                            }
                        }
                        if (!hVar5.f14211h.isEmpty()) {
                            hVar5.f();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
