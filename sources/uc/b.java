package uc;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import g7.x3;
import g7.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends x3 {

    /* renamed from: b, reason: collision with root package name */
    public final ArenaRepository f37063b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37064c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37065d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37066e;

    public b(ArenaRepository arenaRepository, String assetClass, String sortBy, String sortDirection) {
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        this.f37063b = arenaRepository;
        this.f37064c = assetClass;
        this.f37065d = sortBy;
        this.f37066e = sortDirection;
    }

    @Override // g7.x3
    public final Object a(y3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:13:0x005e, B:15:0x0064, B:17:0x006a, B:19:0x006f, B:21:0x0077, B:25:0x0082, B:26:0x008b, B:28:0x008f, B:30:0x0097, B:32:0x009d, B:34:0x00a5, B:36:0x00ad, B:37:0x00b3, B:42:0x007d, B:43:0x00b9, B:50:0x0047), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:13:0x005e, B:15:0x0064, B:17:0x006a, B:19:0x006f, B:21:0x0077, B:25:0x0082, B:26:0x008b, B:28:0x008f, B:30:0x0097, B:32:0x009d, B:34:0x00a5, B:36:0x00ad, B:37:0x00b3, B:42:0x007d, B:43:0x00b9, B:50:0x0047), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    @Override // g7.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(g7.s3 r9, yt.a r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof uc.a
            if (r0 == 0) goto L14
            r0 = r10
            uc.a r0 = (uc.a) r0
            int r1 = r0.f37062d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37062d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            uc.a r0 = new uc.a
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f37060b
            zt.a r0 = zt.a.f42823a
            int r1 = r6.f37062d
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 != r7) goto L2e
            int r9 = r6.f37059a
            ut.n.b(r10)     // Catch: java.lang.Exception -> L2b
            goto L5e
        L2b:
            r9 = move-exception
            goto Lca
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            ut.n.b(r10)
            java.lang.Object r9 = r9.a()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L46
            int r9 = r9.intValue()
            goto L47
        L46:
            r9 = r7
        L47:
            com.assetgro.stockgro.data.repository.ArenaRepository r1 = r8.f37063b     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r8.f37064c     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r8.f37065d     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r8.f37066e     // Catch: java.lang.Exception -> L2b
            r6.f37059a = r9     // Catch: java.lang.Exception -> L2b
            r6.f37062d = r7     // Catch: java.lang.Exception -> L2b
            java.lang.Object r10 = r1.getAllUpcomingLeaguesLokiWithAssetClass(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2b
            if (r10 != r0) goto L5e
            return r0
        L5e:
            nv.v0 r10 = (nv.v0) r10     // Catch: java.lang.Exception -> L2b
            okhttp3.Response r0 = r10.f29302a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r1 = r10.f29303b
            boolean r0 = r0.isSuccessful()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto Lb9
            r10 = r1
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r10 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r10     // Catch: java.lang.Exception -> L2b
            if (r10 == 0) goto L7d
            java.lang.Object r10 = r10.getData()     // Catch: java.lang.Exception -> L2b
            com.assetgro.stockgro.data.model.arenaV2.ArenaAllData r10 = (com.assetgro.stockgro.data.model.arenaV2.ArenaAllData) r10     // Catch: java.lang.Exception -> L2b
            if (r10 == 0) goto L7d
            java.util.List r10 = r10.getArenaSections()     // Catch: java.lang.Exception -> L2b
            if (r10 != 0) goto L7f
        L7d:
            vt.i0 r10 = vt.i0.f38321a     // Catch: java.lang.Exception -> L2b
        L7f:
            r0 = 0
            if (r9 <= r7) goto L8a
            int r2 = r9 + (-1)
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Exception -> L2b
            r3.<init>(r2)     // Catch: java.lang.Exception -> L2b
            goto L8b
        L8a:
            r3 = r0
        L8b:
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r1 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r1     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r1.getData()     // Catch: java.lang.Exception -> L2b
            com.assetgro.stockgro.data.model.arenaV2.ArenaAllData r1 = (com.assetgro.stockgro.data.model.arenaV2.ArenaAllData) r1     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Laa
            java.util.List r1 = r1.getArenaSections()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Laa
            java.lang.Object r1 = vt.g0.C(r1)     // Catch: java.lang.Exception -> L2b
            com.assetgro.stockgro.data.model.arenaV2.ArenaSection r1 = (com.assetgro.stockgro.data.model.arenaV2.ArenaSection) r1     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Laa
            int r1 = r1.getTotalPages()     // Catch: java.lang.Exception -> L2b
            goto Lab
        Laa:
            r1 = r7
        Lab:
            if (r9 >= r1) goto Lb3
            int r9 = r9 + r7
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L2b
            r0.<init>(r9)     // Catch: java.lang.Exception -> L2b
        Lb3:
            g7.u3 r9 = new g7.u3     // Catch: java.lang.Exception -> L2b
            r9.<init>(r10, r3, r0)     // Catch: java.lang.Exception -> L2b
            goto Lc9
        Lb9:
            g7.t3 r9 = new g7.t3     // Catch: java.lang.Exception -> L2b
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L2b
            okhttp3.Response r10 = r10.f29302a     // Catch: java.lang.Exception -> L2b
            java.lang.String r10 = r10.message()     // Catch: java.lang.Exception -> L2b
            r0.<init>(r10)     // Catch: java.lang.Exception -> L2b
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2b
        Lc9:
            return r9
        Lca:
            g7.t3 r10 = new g7.t3
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.b.c(g7.s3, yt.a):java.lang.Object");
    }
}
