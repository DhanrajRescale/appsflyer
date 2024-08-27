package pu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class e implements Iterator, ju.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f31418b;

    /* renamed from: d, reason: collision with root package name */
    public Object f31420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Sequence f31421e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31417a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f31419c = -1;

    public e(f fVar) {
        this.f31421e = fVar;
        this.f31418b = fVar.f31422a.iterator();
    }

    public final void b() {
        Object next;
        boolean booleanValue;
        do {
            Iterator it = this.f31418b;
            if (it.hasNext()) {
                next = it.next();
                Sequence sequence = this.f31421e;
                booleanValue = ((Boolean) ((f) sequence).f31423b.invoke(next)).booleanValue();
                ((f) sequence).getClass();
            } else {
                this.f31419c = 0;
                return;
            }
        } while (booleanValue);
        this.f31420d = next;
        this.f31419c = 1;
    }

    public final void c() {
        Iterator it = this.f31418b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((q) this.f31421e).f31435c.invoke(next)).booleanValue()) {
                this.f31419c = 1;
                this.f31420d = next;
                return;
            }
        }
        this.f31419c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31417a) {
            case 0:
                if (this.f31419c == -1) {
                    b();
                }
                if (this.f31419c != 1) {
                    return false;
                }
                return true;
            default:
                if (this.f31419c == -1) {
                    c();
                }
                if (this.f31419c != 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31417a) {
            case 0:
                if (this.f31419c == -1) {
                    b();
                }
                if (this.f31419c != 0) {
                    Object obj = this.f31420d;
                    this.f31420d = null;
                    this.f31419c = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.f31419c == -1) {
                    c();
                }
                if (this.f31419c != 0) {
                    Object obj2 = this.f31420d;
                    this.f31420d = null;
                    this.f31419c = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31417a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(q qVar) {
        this.f31421e = qVar;
        this.f31418b = ((Sequence) qVar.f31434b).iterator();
    }
}
