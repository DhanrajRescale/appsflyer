package lp;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class x0 extends y1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25080b;

    public x0(Object obj) {
        this.f25080b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f25079a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f25079a) {
            this.f25079a = true;
            return this.f25080b;
        }
        throw new NoSuchElementException();
    }
}
