package fu;

import d4.t1;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public String f16265a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f16267c;

    public l(t1 t1Var) {
        this.f16267c = t1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16265a == null && !this.f16266b) {
            String readLine = ((BufferedReader) this.f16267c.f13832b).readLine();
            this.f16265a = readLine;
            if (readLine == null) {
                this.f16266b = true;
            }
        }
        if (this.f16265a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.f16265a;
            this.f16265a = null;
            Intrinsics.c(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
