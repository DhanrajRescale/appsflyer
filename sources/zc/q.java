package zc;

import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f42405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueLeaderBoardViewModel f42406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LeagueLeaderBoardViewModel leagueLeaderBoardViewModel, yt.a aVar) {
        super(2, aVar);
        this.f42406b = leagueLeaderBoardViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f42406b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:5:0x000c, B:6:0x0036, B:7:0x003a, B:9:0x003e, B:11:0x004f, B:12:0x0056, B:16:0x005a, B:18:0x005e, B:20:0x006b, B:21:0x006f, B:22:0x0073, B:24:0x007c, B:26:0x0082, B:27:0x0086, B:31:0x001b, B:33:0x0025, B:35:0x002b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:5:0x000c, B:6:0x0036, B:7:0x003a, B:9:0x003e, B:11:0x004f, B:12:0x0056, B:16:0x005a, B:18:0x005e, B:20:0x006b, B:21:0x006f, B:22:0x0073, B:24:0x007c, B:26:0x0082, B:27:0x0086, B:31:0x001b, B:33:0x0025, B:35:0x002b), top: B:2:0x0008 }] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r5.f42405a
            r2 = 1
            r3 = 0
            com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel r4 = r5.f42406b
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            ut.n.b(r6)     // Catch: java.lang.Exception -> L8a
            goto L36
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            ut.n.b(r6)
            androidx.lifecycle.e0 r6 = r4.f9021r     // Catch: java.lang.Exception -> L8a
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L8a
            com.assetgro.stockgro.data.model.arenaV2.ArenaGame r6 = (com.assetgro.stockgro.data.model.arenaV2.ArenaGame) r6     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L39
            java.lang.String r6 = r6.getGameId()     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L39
            com.assetgro.stockgro.data.repository.ArenaRepository r1 = r4.f9017n     // Catch: java.lang.Exception -> L8a
            r5.f42405a = r2     // Catch: java.lang.Exception -> L8a
            java.lang.Object r6 = r1.shareYourAchievementCta(r6, r5)     // Catch: java.lang.Exception -> L8a
            if (r6 != r0) goto L36
            return r0
        L36:
            com.assetgro.stockgro.data.remote.NetworkResult r6 = (com.assetgro.stockgro.data.remote.NetworkResult) r6     // Catch: java.lang.Exception -> L8a
            goto L3a
        L39:
            r6 = r3
        L3a:
            boolean r0 = r6 instanceof com.assetgro.stockgro.data.remote.NetworkResult.Success     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L5a
            androidx.lifecycle.e0 r0 = r4.f9084g     // Catch: java.lang.Exception -> L8a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L8a
            r0.postValue(r1)     // Catch: java.lang.Exception -> L8a
            androidx.lifecycle.e0 r0 = r4.f9019p     // Catch: java.lang.Exception -> L8a
            java.lang.Object r6 = r6.getData()     // Catch: java.lang.Exception -> L8a
            com.assetgro.stockgro.data.remote.response.BaseResponseDto r6 = (com.assetgro.stockgro.data.remote.response.BaseResponseDto) r6     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.getData()     // Catch: java.lang.Exception -> L8a
            r3 = r6
            com.assetgro.stockgro.data.ArenaAchievementShareDto r3 = (com.assetgro.stockgro.data.ArenaAchievementShareDto) r3     // Catch: java.lang.Exception -> L8a
        L56:
            r0.setValue(r3)     // Catch: java.lang.Exception -> L8a
            goto Laf
        L5a:
            boolean r0 = r6 instanceof com.assetgro.stockgro.data.remote.NetworkResult.Error     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L73
            androidx.lifecycle.e0 r0 = r4.f9084g     // Catch: java.lang.Exception -> L8a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L8a
            r0.postValue(r1)     // Catch: java.lang.Exception -> L8a
            com.assetgro.stockgro.data.remote.SGError r6 = r6.getError()     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L6f
            java.lang.String r3 = r6.getErrorText()     // Catch: java.lang.Exception -> L8a
        L6f:
            r4.f(r3)     // Catch: java.lang.Exception -> L8a
            goto Laf
        L73:
            androidx.lifecycle.e0 r0 = r4.f9084g     // Catch: java.lang.Exception -> L8a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L8a
            r0.postValue(r1)     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L86
            com.assetgro.stockgro.data.remote.SGError r6 = r6.getError()     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L86
            java.lang.String r3 = r6.getErrorText()     // Catch: java.lang.Exception -> L8a
        L86:
            r4.f(r3)     // Catch: java.lang.Exception -> L8a
            goto Laf
        L8a:
            androidx.lifecycle.e0 r6 = r4.f9084g
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.postValue(r0)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "LeagueLeaderBoardViewModel"
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "s"
            java.lang.String r2 = "Unable to call share your achievement, No internet connection"
            java.lang.String r3 = "params"
            ek.u r0 = com.google.android.gms.internal.p002firebaseauthapi.a.g(r2, r1, r6, r3, r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r0.getClass()
            ek.u.l(r6)
        Laf:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
