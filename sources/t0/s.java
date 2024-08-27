package t0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35197a;

    public /* synthetic */ s(int i10) {
        this.f35197a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = -1;
        switch (this.f35197a) {
            case 0:
                return Intrinsics.f(((u0) obj).f35215b, ((u0) obj2).f35215b);
            case 1:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
                float f10 = aVar.f1423x.f7827o.f7797y;
                float f11 = aVar2.f1423x.f7827o.f7797y;
                if (f10 == f11) {
                    return Intrinsics.f(aVar.s(), aVar2.s());
                }
                return Float.compare(f10, f11);
            case 2:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f23354b).intValue() - ((Number) pair.f23353a).intValue()) - (((Number) pair2.f23354b).intValue() - ((Number) pair2.f23353a).intValue());
            case 3:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b10 = bArr[i11];
                    byte b11 = bArr2[i11];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 5:
                m5.b bVar = (m5.b) obj;
                m5.b bVar2 = (m5.b) obj2;
                int compare = Integer.compare(bVar.f27511c, bVar2.f27511c);
                if (compare == 0) {
                    return bVar.f27510b.compareTo(bVar2.f27510b);
                }
                return compare;
            case 6:
                return ((b5.v) obj2).f3648h - ((b5.v) obj).f3648h;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                lp.i1 i1Var = u5.p.f36827j;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                lp.i1 i1Var2 = u5.p.f36827j;
                return 0;
            case 9:
                return ((u5.f) Collections.max((List) obj)).compareTo((u5.f) Collections.max((List) obj2));
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                return lp.c0.f(new s(14).compare((u5.o) Collections.max(list, new s(12)), (u5.o) Collections.max(list2, new s(13)))).a(list.size(), list2.size()).b((u5.o) Collections.max(list, new s(15)), (u5.o) Collections.max(list2, new s(16)), new s(17)).e();
            case 11:
                return ((u5.l) ((List) obj).get(0)).compareTo((u5.l) ((List) obj2).get(0));
            case 12:
                return u5.o.d((u5.o) obj, (u5.o) obj2);
            case 13:
                return u5.o.d((u5.o) obj, (u5.o) obj2);
            case 14:
                return u5.o.d((u5.o) obj, (u5.o) obj2);
            case 15:
                return u5.o.c((u5.o) obj, (u5.o) obj2);
            case 16:
                return u5.o.c((u5.o) obj, (u5.o) obj2);
            case 17:
                return u5.o.c((u5.o) obj, (u5.o) obj2);
            case 18:
                return ((v5.s) obj).f37764a - ((v5.s) obj2).f37764a;
            case 19:
                return Float.compare(((v5.s) obj).f37766c, ((v5.s) obj2).f37766c);
            case 20:
            default:
                tl.a aVar3 = (tl.a) obj;
                tl.a data = (tl.a) obj2;
                Intrinsics.checkNotNullExpressionValue(data, "o2");
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Long l10 = aVar3.f36158c;
                if (l10 == null) {
                    return -1;
                }
                long longValue = l10.longValue();
                Long l11 = data.f36158c;
                if (l11 != null) {
                    long longValue2 = l11.longValue();
                    if (longValue2 < longValue) {
                        return -1;
                    }
                    if (longValue2 == longValue) {
                        return 0;
                    }
                }
                return 1;
            case 21:
                return Integer.compare(((t6.d) obj2).f35395b, ((t6.d) obj).f35395b);
            case 22:
                return Integer.compare(((a7.d) obj).f225a.f228b, ((a7.d) obj2).f225a.f228b);
            case 23:
                return Long.compare(((a7.c) obj).f222b, ((a7.c) obj2).f222b);
            case 24:
                d7.j0 j0Var = (d7.j0) obj;
                d7.j0 j0Var2 = (d7.j0) obj2;
                int compare2 = Integer.compare(j0Var2.f14057b, j0Var.f14057b);
                if (compare2 == 0) {
                    int compareTo = j0Var.f14058c.compareTo(j0Var2.f14058c);
                    if (compareTo == 0) {
                        return j0Var.f14059d.compareTo(j0Var2.f14059d);
                    }
                    return compareTo;
                }
                return compare2;
            case 25:
                d7.j0 j0Var3 = (d7.j0) obj;
                d7.j0 j0Var4 = (d7.j0) obj2;
                int compare3 = Integer.compare(j0Var4.f14056a, j0Var3.f14056a);
                if (compare3 == 0) {
                    int compareTo2 = j0Var4.f14058c.compareTo(j0Var3.f14058c);
                    if (compareTo2 == 0) {
                        return j0Var4.f14059d.compareTo(j0Var3.f14059d);
                    }
                    return compareTo2;
                }
                return compare3;
            case 26:
                pl.c cVar = (pl.c) obj;
                pl.c data2 = (pl.c) obj2;
                AtomicBoolean atomicBoolean = ql.c.f32089a;
                if (sl.a.b(ql.c.class)) {
                    return 0;
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(data2, "o2");
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(data2, "data");
                    Long l12 = cVar.f31164g;
                    if (l12 != null) {
                        long longValue3 = l12.longValue();
                        Long l13 = data2.f31164g;
                        if (l13 != null) {
                            long longValue4 = l13.longValue();
                            if (longValue4 >= longValue3) {
                                if (longValue4 == longValue3) {
                                    i10 = 0;
                                }
                            }
                        }
                        i10 = 1;
                    }
                    return i10;
                } catch (Throwable th2) {
                    sl.a.a(ql.c.class, th2);
                    return 0;
                }
            case 27:
                pl.c cVar2 = (pl.c) obj;
                pl.c data3 = (pl.c) obj2;
                Intrinsics.checkNotNullExpressionValue(data3, "o2");
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                Long l14 = cVar2.f31164g;
                if (l14 == null) {
                    return -1;
                }
                long longValue5 = l14.longValue();
                Long l15 = data3.f31164g;
                if (l15 != null) {
                    long longValue6 = l15.longValue();
                    if (longValue6 < longValue5) {
                        return -1;
                    }
                    if (longValue6 == longValue5) {
                        return 0;
                    }
                }
                return 1;
        }
    }
}
