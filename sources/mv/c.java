package mv;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28083a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f28084b;

    /* renamed from: c, reason: collision with root package name */
    public final short[] f28085c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f28086d;

    public c(String str, String[] strArr, short[] sArr, AtomicReferenceArray atomicReferenceArray) {
        this.f28086d = atomicReferenceArray;
        this.f28083a = str;
        this.f28084b = strArr;
        this.f28085c = sArr;
    }

    public final String toString() {
        return this.f28083a;
    }
}
