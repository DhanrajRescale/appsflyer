package t;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f34839a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final pu.h f34840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f34841c;

    /* JADX WARN: Type inference failed for: r3v2, types: [yt.a, java.lang.Object, pu.h] */
    public b0(d0 d0Var) {
        this.f34841c = d0Var;
        a0 block = new a0(d0Var, this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        ?? obj = new Object();
        obj.f31430d = zt.f.a(obj, obj, block);
        this.f34840b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34840b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f34840b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f34839a;
        if (i10 != -1) {
            this.f34841c.k(i10);
            this.f34839a = -1;
        }
    }
}
