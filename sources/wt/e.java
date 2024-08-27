package wt;

import d4.t0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends t0 implements Iterator, ju.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d map, int i10) {
        super(map);
        this.f39474e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                Intrinsics.checkNotNullParameter(map, "map");
                return;
            } else {
                Intrinsics.checkNotNullParameter(map, "map");
                super(map);
                return;
            }
        }
        Intrinsics.checkNotNullParameter(map, "map");
        super(map);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f39474e;
        Serializable serializable = this.f13830d;
        switch (i10) {
            case 0:
                b();
                int i11 = this.f13827a;
                d dVar = (d) serializable;
                if (i11 < dVar.f39466f) {
                    this.f13827a = i11 + 1;
                    this.f13828b = i11;
                    f fVar = new f(dVar, i11);
                    f();
                    return fVar;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i12 = this.f13827a;
                d dVar2 = (d) serializable;
                if (i12 < dVar2.f39466f) {
                    this.f13827a = i12 + 1;
                    this.f13828b = i12;
                    Object obj = dVar2.f39461a[i12];
                    f();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i13 = this.f13827a;
                d dVar3 = (d) serializable;
                if (i13 < dVar3.f39466f) {
                    this.f13827a = i13 + 1;
                    this.f13828b = i13;
                    Object[] objArr = dVar3.f39462b;
                    Intrinsics.c(objArr);
                    Object obj2 = objArr[this.f13828b];
                    f();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
