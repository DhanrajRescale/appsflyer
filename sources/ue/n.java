package ue;

import com.assetgro.stockgro.data.repository.ChatRepository;
import g7.x3;
import g7.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends x3 {

    /* renamed from: b, reason: collision with root package name */
    public final String f37113b;

    /* renamed from: c, reason: collision with root package name */
    public final ChatRepository f37114c;

    public n(String groupId, ChatRepository chatRepository) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f37113b = groupId;
        this.f37114c = chatRepository;
    }

    @Override // g7.x3
    public final Object a(y3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.f17149b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:18:0x006e, B:20:0x0076, B:22:0x007e, B:25:0x008c, B:27:0x0090, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:35:0x0085, B:36:0x007c, B:37:0x00a8, B:45:0x0049), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:18:0x006e, B:20:0x0076, B:22:0x007e, B:25:0x008c, B:27:0x0090, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:35:0x0085, B:36:0x007c, B:37:0x00a8, B:45:0x0049), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // g7.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(g7.s3 r8, yt.a r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ue.m
            if (r0 == 0) goto L13
            r0 = r9
            ue.m r0 = (ue.m) r0
            int r1 = r0.f37112e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37112e = r1
            goto L18
        L13:
            ue.m r0 = new ue.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f37110c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f37112e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r8 = r0.f37109b
            int r0 = r0.f37108a
            ut.n.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L5d
        L2b:
            r8 = move-exception
            goto Lb9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ut.n.b(r9)
            java.lang.Object r9 = r8.a()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L46
            int r9 = r9.intValue()
            goto L47
        L46:
            r9 = 0
        L47:
            int r8 = r8.f17052a
            com.assetgro.stockgro.data.repository.ChatRepository r2 = r7.f37114c     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r7.f37113b     // Catch: java.lang.Exception -> L2b
            r0.f37108a = r9     // Catch: java.lang.Exception -> L2b
            r0.f37109b = r8     // Catch: java.lang.Exception -> L2b
            r0.f37112e = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = r2.getGroupInfoInviteMembers(r9, r8, r4, r0)     // Catch: java.lang.Exception -> L2b
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r6 = r0
            r0 = r9
            r9 = r6
        L5d:
            nv.v0 r9 = (nv.v0) r9     // Catch: java.lang.Exception -> L2b
            okhttp3.Response r1 = r9.f29302a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r9.f29303b
            boolean r1 = r1.isSuccessful()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto La8
            r9 = r2
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r9 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r9     // Catch: java.lang.Exception -> L2b
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r9.getData()     // Catch: java.lang.Exception -> L2b
            com.assetgro.stockgro.data.model.GroupInfoInvitesResponse r9 = (com.assetgro.stockgro.data.model.GroupInfoInvitesResponse) r9     // Catch: java.lang.Exception -> L2b
            if (r9 == 0) goto L7c
            java.util.List r9 = r9.getMembers()     // Catch: java.lang.Exception -> L2b
            if (r9 != 0) goto L7e
        L7c:
            vt.i0 r9 = vt.i0.f38321a     // Catch: java.lang.Exception -> L2b
        L7e:
            g7.u3 r1 = new g7.u3     // Catch: java.lang.Exception -> L2b
            r3 = 0
            if (r0 != 0) goto L85
            r5 = r3
            goto L8c
        L85:
            int r4 = r0 - r8
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L2b
            r5.<init>(r4)     // Catch: java.lang.Exception -> L2b
        L8c:
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r2 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r2     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto La4
            java.lang.Object r2 = r2.getData()     // Catch: java.lang.Exception -> L2b
            com.assetgro.stockgro.data.model.GroupInfoInvitesResponse r2 = (com.assetgro.stockgro.data.model.GroupInfoInvitesResponse) r2     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto La4
            boolean r2 = r2.getEndOfResponse()     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto La4
            int r0 = r0 + r8
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Exception -> L2b
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2b
        La4:
            r1.<init>(r9, r5, r3)     // Catch: java.lang.Exception -> L2b
            goto Lb8
        La8:
            g7.t3 r1 = new g7.t3     // Catch: java.lang.Exception -> L2b
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Exception -> L2b
            okhttp3.Response r9 = r9.f29302a     // Catch: java.lang.Exception -> L2b
            java.lang.String r9 = r9.message()     // Catch: java.lang.Exception -> L2b
            r8.<init>(r9)     // Catch: java.lang.Exception -> L2b
            r1.<init>(r8)     // Catch: java.lang.Exception -> L2b
        Lb8:
            return r1
        Lb9:
            g7.t3 r9 = new g7.t3
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.n.c(g7.s3, yt.a):java.lang.Object");
    }
}
