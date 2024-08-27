package lp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24988b;

    /* renamed from: c, reason: collision with root package name */
    public int f24989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24990d;

    public h0() {
        kp.j.A(4, "initialCapacity");
        this.f24988b = new Object[4];
        this.f24989c = 0;
    }

    public final void a0(Object obj) {
        obj.getClass();
        d0(this.f24989c + 1);
        Object[] objArr = this.f24988b;
        int i10 = this.f24989c;
        this.f24989c = i10 + 1;
        objArr[i10] = obj;
    }

    public void b0(Object obj) {
        a0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h0 c0(List list) {
        if (list instanceof Collection) {
            d0(list.size() + this.f24989c);
            if (list instanceof i0) {
                this.f24989c = ((i0) list).e(this.f24989c, this.f24988b);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        return this;
    }

    public final void d0(int i10) {
        Object[] objArr = this.f24988b;
        if (objArr.length < i10) {
            this.f24988b = Arrays.copyOf(objArr, bl.j.z(objArr.length, i10));
            this.f24990d = false;
        } else if (this.f24990d) {
            this.f24988b = (Object[]) objArr.clone();
            this.f24990d = false;
        }
    }
}
