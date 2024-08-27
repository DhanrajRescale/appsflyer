package pu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public final class h extends i implements Iterator, yt.a, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f31427a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31428b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f31429c;

    /* renamed from: d, reason: collision with root package name */
    public yt.a f31430d;

    @Override // pu.i
    public final void b(Object obj, yt.a frame) {
        this.f31428b = obj;
        this.f31427a = 3;
        this.f31430d = frame;
        zt.a aVar = zt.a.f42823a;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // pu.i
    public final Object c(Iterator it, yt.a frame) {
        if (!it.hasNext()) {
            return Unit.f23355a;
        }
        this.f31429c = it;
        this.f31427a = 2;
        this.f31430d = frame;
        zt.a aVar = zt.a.f42823a;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException d() {
        int i10 = this.f31427a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f31427a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.k.f23369a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f31427a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f31429c;
                Intrinsics.c(it);
                if (it.hasNext()) {
                    this.f31427a = 2;
                    return true;
                }
                this.f31429c = null;
            }
            this.f31427a = 5;
            yt.a aVar = this.f31430d;
            Intrinsics.c(aVar);
            this.f31430d = null;
            l.Companion companion = ut.l.INSTANCE;
            aVar.resumeWith(Unit.f23355a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f31427a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f31427a = 0;
                    Object obj = this.f31428b;
                    this.f31428b = null;
                    return obj;
                }
                throw d();
            }
            this.f31427a = 1;
            Iterator it = this.f31429c;
            Intrinsics.c(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        ut.n.b(obj);
        this.f31427a = 4;
    }
}
