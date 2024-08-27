package ot;

import ht.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final int f30415i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f30416j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f30417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30418b;

    /* renamed from: c, reason: collision with root package name */
    public long f30419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30420d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f30421e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30422f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f30423g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f30424h;

    public b(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f30417a = atomicLong;
        this.f30424h = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i10) - 1));
        int i11 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.f30421e = atomicReferenceArray;
        this.f30420d = i11;
        this.f30418b = Math.min(numberOfLeadingZeros / 4, f30415i);
        this.f30423g = atomicReferenceArray;
        this.f30422f = i11;
        this.f30419c = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // ht.c
    public final void clear() {
        while (true) {
            if (i() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // ht.c
    public final Object i() {
        boolean z10;
        AtomicReferenceArray atomicReferenceArray = this.f30423g;
        AtomicLong atomicLong = this.f30424h;
        long j10 = atomicLong.get();
        int i10 = this.f30422f;
        int i11 = ((int) j10) & i10;
        Object obj = atomicReferenceArray.get(i11);
        if (obj == f30416j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
            return obj;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f30423g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i11);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
        }
        return obj2;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        if (this.f30417a.get() == this.f30424h.get()) {
            return true;
        }
        return false;
    }

    @Override // ht.c
    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.f30421e;
            AtomicLong atomicLong = this.f30417a;
            long j10 = atomicLong.get();
            int i10 = this.f30420d;
            int i11 = ((int) j10) & i10;
            if (j10 < this.f30419c) {
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j10 + 1);
                return true;
            }
            long j11 = this.f30418b + j10;
            if (atomicReferenceArray.get(((int) j11) & i10) == null) {
                this.f30419c = j11 - 1;
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j10 + 1);
                return true;
            }
            long j12 = j10 + 1;
            if (atomicReferenceArray.get(((int) j12) & i10) == null) {
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j12);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f30421e = atomicReferenceArray2;
            this.f30419c = (j10 + i10) - 1;
            atomicReferenceArray2.lazySet(i11, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i11, f30416j);
            atomicLong.lazySet(j12);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
