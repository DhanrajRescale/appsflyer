package r0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f32635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f32637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f32638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4.c0 f32639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f32641g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f32642h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f32643i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32644j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f32645k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f32646l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f32647m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f32648n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, d4.c0 c0Var, int i10, int i11, b0.x1 x1Var, a2.k1 k1Var, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f32635a = arrayList;
        this.f32636b = arrayList2;
        this.f32637c = arrayList3;
        this.f32638d = arrayList4;
        this.f32639e = c0Var;
        this.f32640f = i10;
        this.f32641g = i11;
        this.f32642h = x1Var;
        this.f32643i = k1Var;
        this.f32644j = i12;
        this.f32645k = i13;
        this.f32646l = num;
        this.f32647m = arrayList5;
        this.f32648n = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        a2.z0 z0Var = (a2.z0) obj;
        List list = this.f32635a;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            a2.z0.d(z0Var, (a2.a1) list.get(i12), 0, 0);
        }
        List list2 = this.f32636b;
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            a2.z0.d(z0Var, (a2.a1) list2.get(i13), 0, 0);
        }
        List list3 = this.f32637c;
        int size3 = list3.size();
        int i14 = 0;
        while (true) {
            i10 = this.f32644j;
            if (i14 >= size3) {
                break;
            }
            a2.a1 a1Var = (a2.a1) list3.get(i14);
            int i15 = (this.f32640f - this.f32641g) / 2;
            a2.k1 k1Var = this.f32643i;
            a2.z0.d(z0Var, a1Var, this.f32642h.a(k1Var, k1Var.getLayoutDirection()) + i15, i10 - this.f32645k);
            i14++;
        }
        List list4 = this.f32638d;
        int size4 = list4.size();
        for (int i16 = 0; i16 < size4; i16++) {
            a2.a1 a1Var2 = (a2.a1) list4.get(i16);
            Integer num = this.f32646l;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            a2.z0.d(z0Var, a1Var2, 0, i10 - i11);
        }
        d4.c0 c0Var = this.f32639e;
        if (c0Var != null) {
            List list5 = this.f32647m;
            int size5 = list5.size();
            for (int i17 = 0; i17 < size5; i17++) {
                a2.a1 a1Var3 = (a2.a1) list5.get(i17);
                Integer num2 = this.f32648n;
                Intrinsics.c(num2);
                a2.z0.d(z0Var, a1Var3, c0Var.f13727a, i10 - num2.intValue());
            }
        }
        return Unit.f23355a;
    }
}
