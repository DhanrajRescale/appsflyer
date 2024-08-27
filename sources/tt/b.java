package tt;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import rt.d;
import yk.g;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f36391g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final a[] f36392h = new a[0];

    /* renamed from: i, reason: collision with root package name */
    public static final a[] f36393i = new a[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f36394a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f36395b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f36396c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f36397d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f36398e;

    /* renamed from: f, reason: collision with root package name */
    public long f36399f;

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f36396c = reentrantReadWriteLock.readLock();
        this.f36397d = reentrantReadWriteLock.writeLock();
        this.f36395b = new AtomicReference(f36392h);
        this.f36394a = new AtomicReference();
        this.f36398e = new AtomicReference();
    }

    @Override // at.g
    public final void b(Object obj) {
        if (obj != null) {
            if (this.f36398e.get() != null) {
                return;
            }
            Lock lock = this.f36397d;
            lock.lock();
            this.f36399f++;
            this.f36394a.lazySet(obj);
            lock.unlock();
            for (a aVar : (a[]) this.f36395b.get()) {
                aVar.b(this.f36399f, obj);
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (this.f36398e.get() != null) {
            bVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        r1 = (java.lang.Object[]) r7.f14634c;
        r7 = r7.f14632a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        if (r2 >= r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:
    
        r3 = r1[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        if (r3 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        if (r0.d(r3) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00af, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
    
        r1 = r1[r7];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // at.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(at.g r7) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.b.f(at.g):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f36395b;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (aVarArr2[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f36392h;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // at.g
    public final void onComplete() {
        AtomicReference atomicReference = this.f36398e;
        rt.a aVar = rt.b.f33993a;
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        d dVar = d.f33995a;
        AtomicReference atomicReference2 = this.f36395b;
        a[] aVarArr = f36393i;
        a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            Lock lock = this.f36397d;
            lock.lock();
            this.f36399f++;
            this.f36394a.lazySet(dVar);
            lock.unlock();
        }
        for (a aVar2 : aVarArr2) {
            aVar2.b(this.f36399f, dVar);
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (th2 != null) {
            AtomicReference atomicReference = this.f36398e;
            while (!atomicReference.compareAndSet(null, th2)) {
                if (atomicReference.get() != null) {
                    g.M(th2);
                    return;
                }
            }
            rt.c cVar = new rt.c(th2);
            AtomicReference atomicReference2 = this.f36395b;
            a[] aVarArr = f36393i;
            a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                Lock lock = this.f36397d;
                lock.lock();
                this.f36399f++;
                this.f36394a.lazySet(cVar);
                lock.unlock();
            }
            for (a aVar : aVarArr2) {
                aVar.b(this.f36399f, cVar);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
}
