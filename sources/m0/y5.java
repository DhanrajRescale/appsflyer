package m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y5 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f27139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f27140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f27141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f27142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f27143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f27147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d4.c0 f27148j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Integer f27149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i10, int i11, int i12, Integer num, d4.c0 c0Var, Integer num2) {
        super(1);
        this.f27139a = arrayList;
        this.f27140b = arrayList2;
        this.f27141c = arrayList3;
        this.f27142d = arrayList4;
        this.f27143e = arrayList5;
        this.f27144f = i10;
        this.f27145g = i11;
        this.f27146h = i12;
        this.f27147i = num;
        this.f27148j = c0Var;
        this.f27149k = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        a2.z0 z0Var = (a2.z0) obj;
        List list = this.f27139a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            a2.z0.d(z0Var, (a2.a1) list.get(i14), 0, this.f27144f);
        }
        List list2 = this.f27140b;
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            a2.z0.d(z0Var, (a2.a1) list2.get(i15), 0, 0);
        }
        List list3 = this.f27141c;
        int size3 = list3.size();
        int i16 = 0;
        while (true) {
            i10 = this.f27145g;
            if (i16 >= size3) {
                break;
            }
            a2.z0.d(z0Var, (a2.a1) list3.get(i16), 0, i10 - this.f27146h);
            i16++;
        }
        List list4 = this.f27142d;
        int size4 = list4.size();
        for (int i17 = 0; i17 < size4; i17++) {
            a2.a1 a1Var = (a2.a1) list4.get(i17);
            Integer num = this.f27147i;
            if (num != null) {
                i13 = num.intValue();
            } else {
                i13 = 0;
            }
            a2.z0.d(z0Var, a1Var, 0, i10 - i13);
        }
        List list5 = this.f27143e;
        int size5 = list5.size();
        for (int i18 = 0; i18 < size5; i18++) {
            a2.a1 a1Var2 = (a2.a1) list5.get(i18);
            d4.c0 c0Var = this.f27148j;
            if (c0Var != null) {
                i11 = c0Var.f13727a;
            } else {
                i11 = 0;
            }
            Integer num2 = this.f27149k;
            if (num2 != null) {
                i12 = num2.intValue();
            } else {
                i12 = 0;
            }
            a2.z0.d(z0Var, a1Var2, i11, i10 - i12);
        }
        return Unit.f23355a;
    }
}
