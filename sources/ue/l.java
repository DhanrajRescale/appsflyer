package ue;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import g7.x3;
import g7.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends x3 {

    /* renamed from: b, reason: collision with root package name */
    public final FollowerRepository f37107b;

    public l(FollowerRepository followersRepository) {
        Intrinsics.checkNotNullParameter(followersRepository, "followersRepository");
        this.f37107b = followersRepository;
    }

    @Override // g7.x3
    public final Object a(y3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.f17149b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x0063, B:15:0x0069, B:17:0x006f, B:19:0x0074, B:21:0x007c, B:23:0x0084, B:26:0x0092, B:28:0x0096, B:30:0x009e, B:32:0x00a4, B:33:0x00aa, B:36:0x008b, B:37:0x0082, B:38:0x00ae, B:46:0x004b), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x0063, B:15:0x0069, B:17:0x006f, B:19:0x0074, B:21:0x007c, B:23:0x0084, B:26:0x0092, B:28:0x0096, B:30:0x009e, B:32:0x00a4, B:33:0x00aa, B:36:0x008b, B:37:0x0082, B:38:0x00ae, B:46:0x004b), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    @Override // g7.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(g7.s3 r10, yt.a r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ue.k
            if (r0 == 0) goto L14
            r0 = r11
            ue.k r0 = (ue.k) r0
            int r1 = r0.f37106e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37106e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ue.k r0 = new ue.k
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f37104c
            zt.a r0 = zt.a.f42823a
            int r1 = r6.f37106e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            int r10 = r6.f37103b
            int r0 = r6.f37102a
            ut.n.b(r11)     // Catch: java.lang.Exception -> L2d
            goto L63
        L2d:
            r10 = move-exception
            goto Lbf
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            ut.n.b(r11)
            java.lang.Object r11 = r10.a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L48
            int r11 = r11.intValue()
            goto L49
        L48:
            r11 = 0
        L49:
            int r10 = r10.f17052a
            com.assetgro.stockgro.data.repository.FollowerRepository r1 = r9.f37107b     // Catch: java.lang.Exception -> L2d
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r6.f37102a = r11     // Catch: java.lang.Exception -> L2d
            r6.f37103b = r10     // Catch: java.lang.Exception -> L2d
            r6.f37106e = r2     // Catch: java.lang.Exception -> L2d
            r2 = r10
            r3 = r11
            java.lang.Object r1 = com.assetgro.stockgro.data.repository.FollowerRepository.getMemberInvitedGroups$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2d
            if (r1 != r0) goto L61
            return r0
        L61:
            r0 = r11
            r11 = r1
        L63:
            nv.v0 r11 = (nv.v0) r11     // Catch: java.lang.Exception -> L2d
            okhttp3.Response r1 = r11.f29302a     // Catch: java.lang.Exception -> L2d
            java.lang.Object r2 = r11.f29303b
            boolean r1 = r1.isSuccessful()     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto Lae
            r11 = r2
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r11 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r11     // Catch: java.lang.Exception -> L2d
            if (r11 == 0) goto L82
            java.lang.Object r11 = r11.getData()     // Catch: java.lang.Exception -> L2d
            com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse r11 = (com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse) r11     // Catch: java.lang.Exception -> L2d
            if (r11 == 0) goto L82
            java.util.List r11 = r11.getPrivacyLayerUserGroups()     // Catch: java.lang.Exception -> L2d
            if (r11 != 0) goto L84
        L82:
            vt.i0 r11 = vt.i0.f38321a     // Catch: java.lang.Exception -> L2d
        L84:
            g7.u3 r1 = new g7.u3     // Catch: java.lang.Exception -> L2d
            r3 = 0
            if (r0 != 0) goto L8b
            r5 = r3
            goto L92
        L8b:
            int r4 = r0 - r10
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L2d
            r5.<init>(r4)     // Catch: java.lang.Exception -> L2d
        L92:
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r2 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r2     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r2.getData()     // Catch: java.lang.Exception -> L2d
            com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse r2 = (com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse) r2     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto Laa
            boolean r2 = r2.getEndOfResponse()     // Catch: java.lang.Exception -> L2d
            if (r2 != 0) goto Laa
            int r0 = r0 + r10
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Exception -> L2d
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2d
        Laa:
            r1.<init>(r11, r5, r3)     // Catch: java.lang.Exception -> L2d
            goto Lbe
        Lae:
            g7.t3 r1 = new g7.t3     // Catch: java.lang.Exception -> L2d
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Exception -> L2d
            okhttp3.Response r11 = r11.f29302a     // Catch: java.lang.Exception -> L2d
            java.lang.String r11 = r11.message()     // Catch: java.lang.Exception -> L2d
            r10.<init>(r11)     // Catch: java.lang.Exception -> L2d
            r1.<init>(r10)     // Catch: java.lang.Exception -> L2d
        Lbe:
            return r1
        Lbf:
            g7.t3 r11 = new g7.t3
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.l.c(g7.s3, yt.a):java.lang.Object");
    }
}
