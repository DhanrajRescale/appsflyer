package t0;

import android.os.Trace;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.ui.chat.helper.search.AssetUploadWorker;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34971a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f34976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f34977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f34978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f34979i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(String str, String str2, File file, String str3, String str4, AssetUploadWorker assetUploadWorker, String str5, iu.z zVar) {
        super(1);
        this.f34972b = str;
        this.f34973c = str2;
        this.f34974d = file;
        this.f34975e = str3;
        this.f34976f = str4;
        this.f34977g = assetUploadWorker;
        this.f34978h = str5;
        this.f34979i = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean w10;
        ?? r82;
        t.d0 d0Var;
        t.d0 d0Var2;
        t.d0 d0Var3;
        List list;
        char c10;
        switch (this.f34971a) {
            case 0:
                long longValue = ((Number) obj).longValue();
                f2 f2Var = (f2) this.f34972b;
                synchronized (f2Var.f34999b) {
                    w10 = f2Var.w();
                }
                if (w10) {
                    f2 f2Var2 = (f2) this.f34972b;
                    Trace.beginSection("Recomposer:animation");
                    try {
                        f2Var2.f34998a.e(longValue);
                        yq.b.m();
                        Unit unit = Unit.f23355a;
                    } finally {
                    }
                }
                f2 f2Var3 = (f2) this.f34972b;
                v0.c cVar = (v0.c) this.f34973c;
                t.d0 d0Var4 = (t.d0) this.f34974d;
                List list2 = (List) this.f34977g;
                List list3 = (List) this.f34978h;
                d0Var4 = (t.d0) this.f34975e;
                list2 = (List) this.f34979i;
                d0Var4 = (t.d0) this.f34976f;
                Trace.beginSection("Recomposer:recompose");
                try {
                    f2.s(f2Var3);
                    synchronized (f2Var3.f34999b) {
                        try {
                            v0.h hVar = f2Var3.f35005h;
                            int i10 = hVar.f37655c;
                            r82 = 0;
                            if (i10 > 0) {
                                Object[] objArr = hVar.f37653a;
                                int i11 = 0;
                                do {
                                    list2.add((e0) objArr[i11]);
                                    i11++;
                                } while (i11 < i10);
                            }
                            f2Var3.f35005h.g();
                            Unit unit2 = Unit.f23355a;
                        } finally {
                        }
                    }
                    cVar.clear();
                    while (true) {
                        if ((!list2.isEmpty()) || (!list3.isEmpty())) {
                            t.d0 d0Var5 = d0Var;
                            int i12 = r82;
                            List list4 = list3;
                            try {
                                try {
                                    int size = list2.size();
                                    int i13 = i12;
                                    while (i13 < size) {
                                        e0 e0Var = (e0) list2.get(i13);
                                        e0 r10 = f2.r(f2Var3, e0Var, cVar);
                                        if (r10 != null) {
                                            list2.add(r10);
                                            Unit unit3 = Unit.f23355a;
                                        }
                                        d0Var2 = d0Var5;
                                        try {
                                            d0Var2.d(e0Var);
                                            i13++;
                                            d0Var5 = d0Var2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            f2.D(f2Var3, e, true, 2);
                                            e2.i(d0Var4, d0Var4, d0Var2, f2Var3, cVar, list2, list4, list2);
                                            list2.clear();
                                            return Unit.f23355a;
                                        }
                                    }
                                    t.d0 d0Var6 = d0Var5;
                                    list2.clear();
                                    if (cVar.g() || f2Var3.f35005h.l()) {
                                        synchronized (f2Var3.f34999b) {
                                            try {
                                                List y10 = f2Var3.y();
                                                int size2 = y10.size();
                                                for (int i14 = i12; i14 < size2; i14++) {
                                                    e0 e0Var2 = (e0) y10.get(i14);
                                                    if (!d0Var6.a(e0Var2)) {
                                                        y yVar = (y) e0Var2;
                                                        if (yVar.w(cVar)) {
                                                            list2.add(yVar);
                                                        }
                                                    }
                                                }
                                                v0.h hVar2 = f2Var3.f35005h;
                                                int i15 = hVar2.f37655c;
                                                int i16 = i12;
                                                int i17 = i16;
                                                while (i16 < i15) {
                                                    e0 e0Var3 = (e0) hVar2.f37653a[i16];
                                                    if (!d0Var6.a(e0Var3) && !list2.contains(e0Var3)) {
                                                        list2.add(e0Var3);
                                                        i17++;
                                                    } else if (i17 > 0) {
                                                        Object[] objArr2 = hVar2.f37653a;
                                                        objArr2[i16 - i17] = objArr2[i16];
                                                    }
                                                    i16++;
                                                }
                                                int i18 = i15 - i17;
                                                vt.t.k(i18, i15, hVar2.f37653a);
                                                hVar2.f37655c = i18;
                                                Unit unit4 = Unit.f23355a;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (list2.isEmpty()) {
                                        try {
                                            e2.j(list4, f2Var3);
                                            while (!list4.isEmpty()) {
                                                List elements = f2Var3.B(list4, cVar);
                                                d0Var4.getClass();
                                                Intrinsics.checkNotNullParameter(elements, "elements");
                                                for (Object obj2 : elements) {
                                                    d0Var4.f34863b[d0Var4.f(obj2)] = obj2;
                                                }
                                                e2.j(list4, f2Var3);
                                            }
                                            r82 = i12;
                                            d0Var = d0Var6;
                                            list3 = list4;
                                        } catch (Exception e11) {
                                            f2.D(f2Var3, e11, true, 2);
                                            e2.i(d0Var4, d0Var4, d0Var6, f2Var3, cVar, list2, list4, list2);
                                        }
                                    } else {
                                        r82 = i12;
                                        d0Var = d0Var6;
                                        list3 = list4;
                                    }
                                } finally {
                                    list2.clear();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                d0Var2 = d0Var5;
                            }
                        } else {
                            try {
                                if (!list2.isEmpty()) {
                                    try {
                                        int size3 = list2.size();
                                        for (int i19 = r82; i19 < size3; i19++) {
                                            d0Var4.d((e0) list2.get(i19));
                                        }
                                        int size4 = list2.size();
                                        for (int i20 = r82; i20 < size4; i20++) {
                                            ((y) ((e0) list2.get(i20))).i();
                                        }
                                    } catch (Exception e13) {
                                        f2.D(f2Var3, e13, r82, 6);
                                        e2.i(d0Var4, d0Var4, d0Var, f2Var3, cVar, list2, list3, list2);
                                    }
                                }
                                if (d0Var4.c()) {
                                    try {
                                        try {
                                            d0Var4.i(d0Var4);
                                            try {
                                                Object[] objArr3 = d0Var4.f34863b;
                                                long[] jArr = d0Var4.f34862a;
                                                int length = jArr.length - 2;
                                                d0Var3 = d0Var;
                                                if (length >= 0) {
                                                    int i21 = 0;
                                                    while (true) {
                                                        try {
                                                            long j10 = jArr[i21];
                                                            long[] jArr2 = jArr;
                                                            list = list3;
                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i22 = 8 - ((~(i21 - length)) >>> 31);
                                                                for (int i23 = 0; i23 < i22; i23++) {
                                                                    if ((j10 & 255) < 128) {
                                                                        try {
                                                                            ((y) ((e0) objArr3[(i21 << 3) + i23])).k();
                                                                        } catch (Exception e14) {
                                                                            e = e14;
                                                                            f2.D(f2Var3, e, false, 6);
                                                                            e2.i(d0Var4, d0Var4, d0Var3, f2Var3, cVar, list2, list, list2);
                                                                            d0Var4.e();
                                                                            return Unit.f23355a;
                                                                        }
                                                                    }
                                                                    j10 >>= 8;
                                                                }
                                                                if (i22 != 8) {
                                                                }
                                                            }
                                                            if (i21 != length) {
                                                                i21++;
                                                                list3 = list;
                                                                jArr = jArr2;
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            list = list3;
                                                            f2.D(f2Var3, e, false, 6);
                                                            e2.i(d0Var4, d0Var4, d0Var3, f2Var3, cVar, list2, list, list2);
                                                            d0Var4.e();
                                                            return Unit.f23355a;
                                                        }
                                                    }
                                                } else {
                                                    list = list3;
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                d0Var3 = d0Var;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            d0Var3 = d0Var;
                                        }
                                    } finally {
                                    }
                                } else {
                                    d0Var3 = d0Var;
                                    list = list3;
                                }
                                if (d0Var4.c()) {
                                    try {
                                        try {
                                            Object[] objArr4 = d0Var4.f34863b;
                                            long[] jArr3 = d0Var4.f34862a;
                                            int length2 = jArr3.length - 2;
                                            if (length2 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j11 = jArr3[i24];
                                                    long[] jArr4 = jArr3;
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                            if ((j11 & 255) < 128) {
                                                                ((y) ((e0) objArr4[(i24 << 3) + i26])).l();
                                                            }
                                                            j11 >>= 8;
                                                        }
                                                        c10 = '\b';
                                                        if (i25 != 8) {
                                                        }
                                                    } else {
                                                        c10 = '\b';
                                                    }
                                                    if (i24 != length2) {
                                                        i24++;
                                                        jArr3 = jArr4;
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e18) {
                                        f2.D(f2Var3, e18, false, 6);
                                        e2.i(d0Var4, d0Var4, d0Var3, f2Var3, cVar, list2, list, list2);
                                        d0Var4.e();
                                    }
                                }
                                synchronized (f2Var3.f34999b) {
                                    f2Var3.v();
                                }
                                e1.p.i().m();
                                d0Var3.e();
                                cVar.clear();
                                f2Var3.f35011n = null;
                                Unit unit5 = Unit.f23355a;
                                return Unit.f23355a;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
                break;
            default:
                AssetUploadResponse assetUploadResponse = (AssetUploadResponse) obj;
                String url = assetUploadResponse.getUrl();
                if (url != null && url.length() != 0) {
                    Pair pair = new Pair("message_id", (String) this.f34972b);
                    Pair pair2 = new Pair("media", new Media(assetUploadResponse.getUrl(), (String) this.f34973c, ((File) this.f34974d).getName(), null, 8, null));
                    Pair pair3 = new Pair("sender_id", (String) this.f34975e);
                    Pair pair4 = new Pair("sender_name", (String) this.f34976f);
                    AssetUploadWorker assetUploadWorker = (AssetUploadWorker) this.f34977g;
                    dp.b.V0(assetUploadWorker.f9347c.getUserId(), new ge.b(assetUploadWorker, vt.p0.g(pair, pair2, pair3, pair4, new Pair("group_id", assetUploadWorker.f9349e), new Pair("token", (String) this.f34978h), new Pair("client_time_micros", Long.valueOf(System.currentTimeMillis() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)))));
                    HashMap hashMap = new HashMap();
                    hashMap.put("uri", assetUploadResponse.getUrl());
                    iu.z zVar = (iu.z) this.f34979i;
                    androidx.work.k kVar = new androidx.work.k(hashMap);
                    androidx.work.k.c(kVar);
                    zVar.f20560a = new androidx.work.s(kVar);
                }
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(t.d0 d0Var, t.d0 d0Var2, t.d0 d0Var3, f2 f2Var, v0.c cVar, List list, List list2, List list3) {
        super(1);
        this.f34972b = f2Var;
        this.f34973c = cVar;
        this.f34974d = d0Var;
        this.f34977g = list;
        this.f34978h = list2;
        this.f34975e = d0Var2;
        this.f34979i = list3;
        this.f34976f = d0Var3;
    }
}
