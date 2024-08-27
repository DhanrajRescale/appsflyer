package pt;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class s extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31395a = 1;

    public s(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock access$getLock$cp;
        bv.f c10;
        switch (this.f31395a) {
            case 1:
                break;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                bv.f.access$getCompanion$p().getClass();
                access$getLock$cp = bv.f.access$getLock$cp();
                access$getLock$cp.lock();
                try {
                    bv.f.access$getCompanion$p().getClass();
                    c10 = bv.c.c();
                } finally {
                    access$getLock$cp.unlock();
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c10 == bv.f.access$getHead$cp()) {
                bv.f.access$getCompanion$p();
                bv.f.access$setHead$cp(null);
                return;
            } else {
                Unit unit = Unit.f23355a;
                access$getLock$cp.unlock();
                if (c10 != null) {
                    c10.timedOut();
                }
            }
        }
    }

    public s() {
        super("Okio Watchdog");
        setDaemon(true);
    }
}
