package v;

import a2.a1;
import a2.z0;
import g7.b1;
import g7.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f37486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, List list) {
        super(1);
        this.f37485a = i10;
        this.f37486b = list;
    }

    public final Object a(int i10) {
        int i11 = this.f37485a;
        List list = this.f37486b;
        switch (i11) {
            case 9:
                list.get(i10);
                return null;
            case 10:
                list.get(i10);
                return null;
            case 11:
                list.get(i10);
                return null;
            case 12:
                list.get(i10);
                return null;
            case 13:
                list.get(i10);
                return null;
            case 14:
                list.get(i10);
                return null;
            case 15:
                list.get(i10);
                return null;
            case 16:
                list.get(i10);
                return null;
            case 17:
                list.get(i10);
                return null;
            case 18:
                list.get(i10);
                return null;
            case 19:
                list.get(i10);
                return null;
            case 20:
                list.get(i10);
                return null;
            case 21:
                list.get(i10);
                return null;
            default:
                list.get(i10);
                return null;
        }
    }

    public final void d(z0 z0Var) {
        int i10 = this.f37485a;
        List list = this.f37486b;
        switch (i10) {
            case 0:
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a1 a1Var = (a1) list.get(i11);
                    z0Var.getClass();
                    z0.c(a1Var, 0, 0, s0.g.f34069a);
                }
                return;
            case 1:
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    z0.g(z0Var, (a1) list.get(i12), 0, 0);
                }
                return;
            case 2:
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    a1 a1Var2 = (a1) list.get(i13);
                    z0Var.getClass();
                    z0.c(a1Var2, 0, 0, s0.g.f34069a);
                }
                return;
            case 3:
                int f10 = vt.y.f(list);
                if (f10 >= 0) {
                    int i14 = 0;
                    while (true) {
                        z0.g(z0Var, (a1) list.get(i14), 0, 0);
                        if (i14 != f10) {
                            i14++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 4:
            default:
                int f11 = vt.y.f(list);
                if (f11 >= 0) {
                    int i15 = 0;
                    while (true) {
                        z0.g(z0Var, (a1) list.get(i15), 0, 0);
                        if (i15 != f11) {
                            i15++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 5:
                int size4 = list.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    z0.h(z0Var, (a1) list.get(i16), 0, 0);
                }
                return;
            case 6:
                int size5 = list.size();
                for (int i17 = 0; i17 < size5; i17++) {
                    z0.g(z0Var, (a1) list.get(i17), 0, 0);
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37485a;
        List list = this.f37486b;
        int i11 = 0;
        switch (i10) {
            case 0:
                d((z0) obj);
                return Unit.f23355a;
            case 1:
                d((z0) obj);
                return Unit.f23355a;
            case 2:
                d((z0) obj);
                return Unit.f23355a;
            case 3:
                d((z0) obj);
                return Unit.f23355a;
            case 4:
                int size = list.size();
                while (i11 < size) {
                    ((Function1) list.get(i11)).invoke(obj);
                    i11++;
                }
                return Unit.f23355a;
            case 5:
                d((z0) obj);
                return Unit.f23355a;
            case 6:
                d((z0) obj);
                return Unit.f23355a;
            case 7:
                d((z0) obj);
                return Unit.f23355a;
            case 8:
                g7.d accessorState = (g7.d) obj;
                Intrinsics.checkNotNullParameter(accessorState, "accessorState");
                b1 b1Var = b1.f16663a;
                g7.z0 b10 = accessorState.b(b1Var);
                b1 b1Var2 = b1.f16665c;
                g7.z0 b11 = accessorState.b(b1Var2);
                b1 b1Var3 = b1.f16664b;
                g7.a1 a1Var = new g7.a1(b10, accessorState.b(b1Var3), b11);
                boolean z10 = b10 instanceof w0;
                w0[] w0VarArr = accessorState.f16700b;
                int length = w0VarArr.length;
                while (i11 < length) {
                    w0VarArr[i11] = null;
                    i11++;
                }
                if (z10) {
                    list.add(b1Var);
                    accessorState.c(b1Var, g7.a.f16640a);
                }
                if (a1Var.f16648c instanceof w0) {
                    if (!z10) {
                        list.add(b1Var2);
                    }
                    accessorState.a(b1Var2);
                }
                if (a1Var.f16647b instanceof w0) {
                    if (!z10) {
                        list.add(b1Var3);
                    }
                    accessorState.a(b1Var3);
                }
                return Unit.f23355a;
            case 9:
                a(((Number) obj).intValue());
                return null;
            case 10:
                a(((Number) obj).intValue());
                return null;
            case 11:
                a(((Number) obj).intValue());
                return null;
            case 12:
                a(((Number) obj).intValue());
                return null;
            case 13:
                a(((Number) obj).intValue());
                return null;
            case 14:
                a(((Number) obj).intValue());
                return null;
            case 15:
                a(((Number) obj).intValue());
                return null;
            case 16:
                a(((Number) obj).intValue());
                return null;
            case 17:
                a(((Number) obj).intValue());
                return null;
            case 18:
                a(((Number) obj).intValue());
                return null;
            case 19:
                a(((Number) obj).intValue());
                return null;
            case 20:
                a(((Number) obj).intValue());
                return null;
            case 21:
                a(((Number) obj).intValue());
                return null;
            default:
                a(((Number) obj).intValue());
                return null;
        }
    }
}
