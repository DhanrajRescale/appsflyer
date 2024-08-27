package vu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38399a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new s(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38399a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a10 = sVar.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                s c10 = sVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38399a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.b()) {
                return;
            }
            s c10 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }

    public final int c() {
        s sVar = (s) f38399a.get(this);
        sVar.getClass();
        long j10 = s.f38402f.get(sVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38399a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object d10 = sVar.d();
            if (d10 != s.f38403g) {
                return d10;
            }
            s c10 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }
}
