package eh;

import au.i;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15435a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FollowerFollowingViewModel f15437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f15438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FollowerFollowingViewModel followerFollowingViewModel, List list, yt.a aVar) {
        super(2, aVar);
        this.f15437c = followerFollowingViewModel;
        this.f15438d = list;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        f fVar = new f(this.f15437c, this.f15438d, aVar);
        fVar.f15436b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r12.f15435a
            r2 = 3
            r3 = 0
            java.util.List r4 = r12.f15438d
            com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel r5 = r12.f15437c
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L28
            if (r1 == r8) goto L20
            if (r1 != r6) goto L18
            ut.n.b(r13)
            goto L98
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f15436b
            qu.f0 r1 = (qu.f0) r1
            ut.n.b(r13)
            goto L44
        L28:
            ut.n.b(r13)
            java.lang.Object r13 = r12.f15436b
            r1 = r13
            qu.f0 r1 = (qu.f0) r1
            eh.d r13 = new eh.d
            r13.<init>(r5, r3)
            qu.m0 r13 = yk.g.d(r1, r3, r13, r2)
            r12.f15436b = r1
            r12.f15435a = r8
            java.lang.Object r13 = r13.u(r12)
            if (r13 != r0) goto L44
            return r0
        L44:
            nv.v0 r13 = (nv.v0) r13
            okhttp3.Response r9 = r13.f29302a
            boolean r9 = r9.isSuccessful()
            if (r9 == 0) goto L84
            java.lang.Object r13 = r13.f29303b
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r13 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r13
            if (r13 == 0) goto L84
            java.lang.Object r13 = r13.getData()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L84
            boolean r9 = r13.isEmpty()
            r9 = r9 ^ r8
            java.lang.String r10 = "Followers"
            if (r9 == 0) goto L72
            java.lang.Object r9 = r13.get(r7)
            com.assetgro.stockgro.data.model.FollowerFollowingData r9 = (com.assetgro.stockgro.data.model.FollowerFollowingData) r9
            r9.setTitleFollowerFollowing(r10)
            r4.addAll(r7, r13)
            goto L84
        L72:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.assetgro.stockgro.data.model.FollowerFollowingData r9 = new com.assetgro.stockgro.data.model.FollowerFollowingData
            vt.i0 r11 = vt.i0.f38321a
            r9.<init>(r11, r10)
            r13.add(r9)
            r4.addAll(r7, r13)
        L84:
            eh.e r13 = new eh.e
            r13.<init>(r5, r3)
            qu.m0 r13 = yk.g.d(r1, r3, r13, r2)
            r12.f15436b = r3
            r12.f15435a = r6
            java.lang.Object r13 = r13.u(r12)
            if (r13 != r0) goto L98
            return r0
        L98:
            nv.v0 r13 = (nv.v0) r13
            okhttp3.Response r0 = r13.f29302a
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto Ld8
            java.lang.Object r13 = r13.f29303b
            com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto r13 = (com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto) r13
            if (r13 == 0) goto Ld8
            java.lang.Object r13 = r13.getData()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto Ld8
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ r8
            java.lang.String r1 = "Following"
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r13.get(r7)
            com.assetgro.stockgro.data.model.FollowerFollowingData r0 = (com.assetgro.stockgro.data.model.FollowerFollowingData) r0
            r0.setTitleFollowerFollowing(r1)
            r4.addAll(r8, r13)
            goto Ld8
        Lc6:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.assetgro.stockgro.data.model.FollowerFollowingData r0 = new com.assetgro.stockgro.data.model.FollowerFollowingData
            vt.i0 r2 = vt.i0.f38321a
            r0.<init>(r2, r1)
            r13.add(r0)
            r4.addAll(r8, r13)
        Ld8:
            kotlin.Unit r13 = kotlin.Unit.f23355a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
