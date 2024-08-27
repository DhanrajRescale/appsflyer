package lp;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f25048a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f25049b;

    public r0(s0 s0Var) {
        int i10 = ((o1) s0Var).f25029f;
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        y1 it = s0Var.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i11] = entry.getKey();
            objArr2[i11] = entry.getValue();
            i11++;
        }
        this.f25048a = objArr;
        this.f25049b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f25048a;
        boolean z10 = objArr instanceof v0;
        Object[] objArr2 = this.f25049b;
        if (!z10) {
            q0 q0Var = new q0(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                q0Var.b(objArr[i10], objArr2[i10]);
            }
            return q0Var.a();
        }
        v0 v0Var = (v0) objArr;
        q0 q0Var2 = new q0(v0Var.size());
        y1 it = v0Var.iterator();
        y1 it2 = ((i0) objArr2).iterator();
        while (it.hasNext()) {
            q0Var2.b(it.next(), it2.next());
        }
        return q0Var2.a();
    }
}
