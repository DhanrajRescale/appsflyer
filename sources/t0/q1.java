package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f35137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35138b;

    /* renamed from: c, reason: collision with root package name */
    public int f35139c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f35140d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f35141e;

    /* renamed from: f, reason: collision with root package name */
    public final ut.g f35142f;

    public q1(int i10, ArrayList arrayList) {
        this.f35137a = arrayList;
        this.f35138b = i10;
        if (i10 >= 0) {
            this.f35140d = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                w0 w0Var = (w0) this.f35137a.get(i12);
                Integer valueOf = Integer.valueOf(w0Var.f35227c);
                int i13 = w0Var.f35228d;
                hashMap.put(valueOf, new q0(i12, i11, i13));
                i11 += i13;
            }
            this.f35141e = hashMap;
            this.f35142f = ut.h.a(new x.a(this, 19));
            return;
        }
        al.d.e1("Invalid start index");
        throw null;
    }

    public final int a(w0 w0Var) {
        q0 q0Var = (q0) this.f35141e.get(Integer.valueOf(w0Var.f35227c));
        if (q0Var != null) {
            return q0Var.f35135b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        HashMap hashMap = this.f35141e;
        q0 q0Var = (q0) hashMap.get(Integer.valueOf(i10));
        if (q0Var != null) {
            int i13 = q0Var.f35135b;
            int i14 = i11 - q0Var.f35136c;
            q0Var.f35136c = i11;
            if (i14 != 0) {
                for (q0 q0Var2 : hashMap.values()) {
                    if (q0Var2.f35135b >= i13 && !Intrinsics.a(q0Var2, q0Var) && (i12 = q0Var2.f35135b + i14) >= 0) {
                        q0Var2.f35135b = i12;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
