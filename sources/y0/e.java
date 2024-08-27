package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final s[] f41020a;

    /* renamed from: b, reason: collision with root package name */
    public int f41021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41022c = true;

    public e(r rVar, s[] sVarArr) {
        this.f41020a = sVarArr;
        sVarArr[0].b(Integer.bitCount(rVar.f41042a) * 2, 0, rVar.f41045d);
        this.f41021b = 0;
        b();
    }

    public final void b() {
        int i10 = this.f41021b;
        s[] sVarArr = this.f41020a;
        s sVar = sVarArr[i10];
        if (sVar.f41048c < sVar.f41047b) {
            return;
        }
        while (-1 < i10) {
            int c10 = c(i10);
            if (c10 == -1) {
                s sVar2 = sVarArr[i10];
                int i11 = sVar2.f41048c;
                Object[] objArr = sVar2.f41046a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    sVar2.f41048c = i11 + 1;
                    c10 = c(i10);
                }
            }
            if (c10 != -1) {
                this.f41021b = c10;
                return;
            }
            if (i10 > 0) {
                s sVar3 = sVarArr[i10 - 1];
                int i12 = sVar3.f41048c;
                int length2 = sVar3.f41046a.length;
                sVar3.f41048c = i12 + 1;
            }
            sVarArr[i10].b(0, 0, r.f41041e.f41045d);
            i10--;
        }
        this.f41022c = false;
    }

    public final int c(int i10) {
        s[] sVarArr = this.f41020a;
        s sVar = sVarArr[i10];
        int i11 = sVar.f41048c;
        if (i11 < sVar.f41047b) {
            return i10;
        }
        Object[] objArr = sVar.f41046a;
        if (i11 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i11];
            Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            r rVar = (r) obj;
            if (i10 == 6) {
                s sVar2 = sVarArr[i10 + 1];
                Object[] objArr2 = rVar.f41045d;
                sVar2.b(objArr2.length, 0, objArr2);
            } else {
                sVarArr[i10 + 1].b(Integer.bitCount(rVar.f41042a) * 2, 0, rVar.f41045d);
            }
            return c(i10 + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41022c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f41022c) {
            Object next = this.f41020a[this.f41021b].next();
            b();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
