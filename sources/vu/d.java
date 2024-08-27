package vu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final kp.g f38360a = new kp.g("CLOSED", 1);

    public static final Object a(z zVar, long j10, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (zVar.f38412c >= j10 && !zVar.c()) {
                return zVar;
            }
            Object obj = e.f38362a.get(zVar);
            kp.g gVar = f38360a;
            if (obj == gVar) {
                return gVar;
            }
            z zVar2 = (z) ((e) obj);
            if (zVar2 == null) {
                zVar2 = (z) function2.invoke(Long.valueOf(zVar.f38412c + 1), zVar);
                do {
                    atomicReferenceFieldUpdater = e.f38362a;
                    if (atomicReferenceFieldUpdater.compareAndSet(zVar, null, zVar2)) {
                        if (zVar.c()) {
                            zVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(zVar) == null);
            }
            zVar = zVar2;
        }
    }
}
