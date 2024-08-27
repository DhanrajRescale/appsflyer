package t6;

import b3.t;
import e5.x;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class i implements s6.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f35434a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f35435b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f35436c;

    /* renamed from: d, reason: collision with root package name */
    public g f35437d;

    /* renamed from: e, reason: collision with root package name */
    public long f35438e;

    /* renamed from: f, reason: collision with root package name */
    public long f35439f;

    /* JADX WARN: Type inference failed for: r2v1, types: [h5.a, t6.h, java.lang.Object] */
    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f35434a.add(new h5.f(1));
        }
        this.f35435b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f35435b;
            t tVar = new t(this, 16);
            ?? aVar = new h5.a();
            aVar.f35433f = tVar;
            arrayDeque.add(aVar);
        }
        this.f35436c = new PriorityQueue();
    }

    @Override // s6.c
    public final void a(long j10) {
        this.f35438e = j10;
    }

    @Override // h5.e
    public final void b(s6.d dVar) {
        boolean z10;
        if (dVar == this.f35437d) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        g gVar = (g) dVar;
        if (gVar.g(Integer.MIN_VALUE)) {
            gVar.i();
            this.f35434a.add(gVar);
        } else {
            long j10 = this.f35439f;
            this.f35439f = 1 + j10;
            gVar.f35432k = j10;
            this.f35436c.add(gVar);
        }
        this.f35437d = null;
    }

    @Override // h5.e
    public final Object d() {
        boolean z10;
        if (this.f35437d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        ArrayDeque arrayDeque = this.f35434a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f35437d = gVar;
        return gVar;
    }

    public abstract j e();

    public abstract void f(g gVar);

    @Override // h5.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f35439f = 0L;
        this.f35438e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f35436c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f35434a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = x.f15050a;
            gVar.i();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f35437d;
        if (gVar2 != null) {
            gVar2.i();
            arrayDeque.add(gVar2);
            this.f35437d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // h5.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s6.e c() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.f35435b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.f35436c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            t6.g r3 = (t6.g) r3
            int r4 = e5.x.f15050a
            long r3 = r3.f18004f
            long r5 = r12.f35438e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            t6.g r1 = (t6.g) r1
            r3 = 4
            boolean r4 = r1.g(r3)
            java.util.ArrayDeque r5 = r12.f35434a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            s6.e r0 = (s6.e) r0
            r0.e(r3)
            r1.i()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            t6.j r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            s6.e r0 = (s6.e) r0
            long r7 = r1.f18004f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.j(r7, r9, r10)
            r1.i()
            r5.add(r1)
            return r0
        L66:
            r1.i()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.i.c():s6.e");
    }

    public abstract boolean h();

    @Override // h5.e
    public void release() {
    }
}
