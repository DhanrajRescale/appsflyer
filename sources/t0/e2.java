package t0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class e2 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public List f34984a;

    /* renamed from: b, reason: collision with root package name */
    public List f34985b;

    /* renamed from: c, reason: collision with root package name */
    public List f34986c;

    /* renamed from: d, reason: collision with root package name */
    public t.d0 f34987d;

    /* renamed from: e, reason: collision with root package name */
    public t.d0 f34988e;

    /* renamed from: f, reason: collision with root package name */
    public v0.c f34989f;

    /* renamed from: g, reason: collision with root package name */
    public t.d0 f34990g;

    /* renamed from: h, reason: collision with root package name */
    public int f34991h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ a1 f34992i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2 f34993j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, yt.a aVar) {
        super(3, aVar);
        this.f34993j = f2Var;
    }

    public static final void i(t.d0 d0Var, t.d0 d0Var2, t.d0 d0Var3, f2 f2Var, v0.c cVar, List list, List list2, List list3) {
        synchronized (f2Var.f34999b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y yVar = (y) ((e0) list3.get(i10));
                    yVar.f();
                    f2Var.E(yVar);
                }
                list3.clear();
                Object[] objArr = d0Var.f34863b;
                long[] jArr = d0Var.f34862a;
                int length = jArr.length - 2;
                long j10 = -9187201950435737472L;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        long[] jArr2 = jArr;
                        if ((((~j11) << 7) & j11 & j10) != j10) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j11 & 255) < 128) {
                                    y yVar2 = (y) ((e0) objArr[(i11 << 3) + i13]);
                                    yVar2.f();
                                    f2Var.E(yVar2);
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        jArr = jArr2;
                        j10 = -9187201950435737472L;
                    }
                }
                d0Var.e();
                Object[] objArr2 = d0Var2.f34863b;
                long[] jArr3 = d0Var2.f34862a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr3[i14];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & 255) < 128) {
                                    ((y) ((e0) objArr2[(i14 << 3) + i16])).l();
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                d0Var2.e();
                cVar.clear();
                Object[] objArr3 = d0Var3.f34863b;
                long[] jArr4 = d0Var3.f34862a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j13 = jArr4[i17];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j13 & 255) < 128) {
                                    y yVar3 = (y) ((e0) objArr3[(i17 << 3) + i19]);
                                    yVar3.f();
                                    f2Var.E(yVar3);
                                }
                                j13 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length3) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                d0Var3.e();
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void j(List list, f2 f2Var) {
        list.clear();
        synchronized (f2Var.f34999b) {
            try {
                ArrayList arrayList = f2Var.f35007j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((c1) arrayList.get(i10));
                }
                f2Var.f35007j.clear();
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        e2 e2Var = new e2(this.f34993j, (yt.a) obj3);
        e2Var.f34992i = (a1) obj2;
        return e2Var.invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013d -> B:6:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01f7 -> B:24:0x0087). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
