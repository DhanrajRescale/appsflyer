package dg;

import com.assetgro.stockgro.data.repository.PaymentRepository;
import g7.x3;
import g7.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends x3 {

    /* renamed from: b, reason: collision with root package name */
    public final PaymentRepository f14370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14371c;

    /* renamed from: d, reason: collision with root package name */
    public final d f14372d;

    public n(PaymentRepository paymentRepository, String str, d paymentFilterOptions) {
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(paymentFilterOptions, "paymentFilterOptions");
        this.f14370b = paymentRepository;
        this.f14371c = str;
        this.f14372d = paymentFilterOptions;
    }

    @Override // g7.x3
    public final Object a(y3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.f17149b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[Catch: Exception -> 0x0029, HttpException -> 0x002c, IOException -> 0x002f, TryCatch #2 {IOException -> 0x002f, HttpException -> 0x002c, Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0060, B:14:0x0069, B:16:0x0071, B:17:0x0077, B:19:0x007b, B:22:0x0088, B:24:0x008e, B:26:0x0096, B:28:0x009e, B:29:0x00a4, B:34:0x0081, B:39:0x003d, B:41:0x0045, B:42:0x004b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: Exception -> 0x0029, HttpException -> 0x002c, IOException -> 0x002f, TryCatch #2 {IOException -> 0x002f, HttpException -> 0x002c, Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0060, B:14:0x0069, B:16:0x0071, B:17:0x0077, B:19:0x007b, B:22:0x0088, B:24:0x008e, B:26:0x0096, B:28:0x009e, B:29:0x00a4, B:34:0x0081, B:39:0x003d, B:41:0x0045, B:42:0x004b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: Exception -> 0x0029, HttpException -> 0x002c, IOException -> 0x002f, TryCatch #2 {IOException -> 0x002f, HttpException -> 0x002c, Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0060, B:14:0x0069, B:16:0x0071, B:17:0x0077, B:19:0x007b, B:22:0x0088, B:24:0x008e, B:26:0x0096, B:28:0x009e, B:29:0x00a4, B:34:0x0081, B:39:0x003d, B:41:0x0045, B:42:0x004b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // g7.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(g7.s3 r7, yt.a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dg.m
            if (r0 == 0) goto L13
            r0 = r8
            dg.m r0 = (dg.m) r0
            int r1 = r0.f14369d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14369d = r1
            goto L18
        L13:
            dg.m r0 = new dg.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f14367b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f14369d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r7 = r0.f14366a
            ut.n.b(r8)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            goto L60
        L29:
            r7 = move-exception
            goto La8
        L2c:
            r7 = move-exception
            goto Lae
        L2f:
            r7 = move-exception
            goto Lb4
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            ut.n.b(r8)
            java.lang.Object r7 = r7.a()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r7 == 0) goto L4a
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            goto L4b
        L4a:
            r7 = r3
        L4b:
            com.assetgro.stockgro.data.repository.PaymentRepository r8 = r6.f14370b     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            java.lang.String r4 = r6.f14371c     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            dg.d r5 = r6.f14372d     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            r0.f14366a = r7     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            r0.f14369d = r3     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            java.lang.Object r8 = r8.getWalletTransactions(r2, r4, r5, r0)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r8 != r1) goto L60
            return r1
        L60:
            nv.v0 r8 = (nv.v0) r8     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            java.lang.Object r0 = r8.f29303b     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            com.assetgro.stockgro.data.remote.response.BaseResponseDto r0 = (com.assetgro.stockgro.data.remote.response.BaseResponseDto) r0     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            r1 = 0
            if (r0 == 0) goto L76
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            com.assetgro.stockgro.data.model.WalletTransactionsDto r0 = (com.assetgro.stockgro.data.model.WalletTransactionsDto) r0     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r0 == 0) goto L76
            java.util.List r0 = r0.getTransactions()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            goto L77
        L76:
            r0 = r1
        L77:
            g7.u3 r2 = new g7.u3     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r0 != 0) goto L7d
            vt.i0 r0 = vt.i0.f38321a     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
        L7d:
            if (r7 != r3) goto L81
            r5 = r1
            goto L88
        L81:
            int r4 = r7 + (-1)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            r5.<init>(r4)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
        L88:
            java.lang.Object r8 = r8.f29303b     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            com.assetgro.stockgro.data.remote.response.BaseResponseDto r8 = (com.assetgro.stockgro.data.remote.response.BaseResponseDto) r8     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r8.getData()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            com.assetgro.stockgro.data.model.WalletTransactionsDto r8 = (com.assetgro.stockgro.data.model.WalletTransactionsDto) r8     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            if (r8 == 0) goto L9b
            int r8 = r8.getTotalPages()     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            goto L9c
        L9b:
            r8 = r3
        L9c:
            if (r7 >= r8) goto La4
            int r7 = r7 + r3
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
        La4:
            r2.<init>(r0, r5, r1)     // Catch: java.lang.Exception -> L29 retrofit2.HttpException -> L2c java.io.IOException -> L2f
            goto Lb9
        La8:
            g7.t3 r2 = new g7.t3
            r2.<init>(r7)
            goto Lb9
        Lae:
            g7.t3 r2 = new g7.t3
            r2.<init>(r7)
            goto Lb9
        Lb4:
            g7.t3 r2 = new g7.t3
            r2.<init>(r7)
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.n.c(g7.s3, yt.a):java.lang.Object");
    }
}
