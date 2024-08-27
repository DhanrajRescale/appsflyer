package d6;

import b4.l;
import e5.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: c, reason: collision with root package name */
    public long f13947c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f13948d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f13949e;

    public static Serializable i(int i10, p pVar) {
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(pVar.o())).doubleValue());
                                pVar.G(2);
                                return date;
                            }
                            int x10 = pVar.x();
                            ArrayList arrayList = new ArrayList(x10);
                            for (int i11 = 0; i11 < x10; i11++) {
                                Serializable i12 = i(pVar.u(), pVar);
                                if (i12 != null) {
                                    arrayList.add(i12);
                                }
                            }
                            return arrayList;
                        }
                        return j(pVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String k10 = k(pVar);
                        int u10 = pVar.u();
                        if (u10 == 9) {
                            return hashMap;
                        }
                        Serializable i13 = i(u10, pVar);
                        if (i13 != null) {
                            hashMap.put(k10, i13);
                        }
                    }
                } else {
                    return k(pVar);
                }
            } else {
                if (pVar.u() != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(pVar.o()));
        }
    }

    public static HashMap j(p pVar) {
        int x10 = pVar.x();
        HashMap hashMap = new HashMap(x10);
        for (int i10 = 0; i10 < x10; i10++) {
            String k10 = k(pVar);
            Serializable i11 = i(pVar.u(), pVar);
            if (i11 != null) {
                hashMap.put(k10, i11);
            }
        }
        return hashMap;
    }

    public static String k(p pVar) {
        int z10 = pVar.z();
        int i10 = pVar.f15037b;
        pVar.G(z10);
        return new String(pVar.f15036a, i10, z10);
    }

    public final boolean h(long j10, p pVar) {
        if (pVar.u() != 2 || !"onMetaData".equals(k(pVar)) || pVar.a() == 0 || pVar.u() != 8) {
            return false;
        }
        HashMap j11 = j(pVar);
        Object obj = j11.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f13947c = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j11.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f13948d = new long[size];
                this.f13949e = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f13948d[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f13949e[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f13948d = new long[0];
                        this.f13949e = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
