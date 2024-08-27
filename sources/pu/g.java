package pu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f31424a;

    /* renamed from: b, reason: collision with root package name */
    public int f31425b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f31426c;

    public g(q qVar) {
        this.f31426c = qVar;
    }

    public final void b() {
        Object invoke;
        int i10;
        int i11 = this.f31425b;
        q qVar = this.f31426c;
        if (i11 == -2) {
            invoke = ((Function0) qVar.f31434b).mo2invoke();
        } else {
            Function1 function1 = qVar.f31435c;
            Object obj = this.f31424a;
            Intrinsics.c(obj);
            invoke = function1.invoke(obj);
        }
        this.f31424a = invoke;
        if (invoke == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f31425b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31425b < 0) {
            b();
        }
        if (this.f31425b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31425b < 0) {
            b();
        }
        if (this.f31425b != 0) {
            Object obj = this.f31424a;
            Intrinsics.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f31425b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
