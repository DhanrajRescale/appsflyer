package lp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b extends y1 {

    /* renamed from: a, reason: collision with root package name */
    public int f24959a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f24960b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.f24959a;
        if (i10 != 4) {
            int e10 = w.k.e(i10);
            if (e10 == 0) {
                return true;
            }
            if (e10 == 2) {
                return false;
            }
            this.f24959a = 4;
            w0 w0Var = (w0) this;
            int i11 = w0Var.f25071c;
            Object obj = null;
            Object obj2 = w0Var.f25073e;
            Iterator it = w0Var.f25072d;
            switch (i11) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((kp.h) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    w0Var.f24959a = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((s1) obj2).f25055c.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    w0Var.f24959a = 3;
                    break;
            }
            this.f24960b = obj;
            if (this.f24959a == 3) {
                return false;
            }
            this.f24959a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f24959a = 2;
            Object obj = this.f24960b;
            this.f24960b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
