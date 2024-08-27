package sb;

import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(FeedStreamViewModel feedStreamViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f34533b = feedStreamViewModel;
        this.f34534c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o0(this.f34533b, this.f34534c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:6:0x0011, B:7:0x0057, B:8:0x0062, B:10:0x006b, B:13:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0095, B:23:0x00b1, B:29:0x001d, B:30:0x0031, B:32:0x003b, B:34:0x004c, B:38:0x0024), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[EDGE_INSN: B:17:0x0082->B:18:0x0082 BREAK  A[LOOP:0: B:8:0x0062->B:15:0x0062], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: Exception -> 0x00c2, LOOP:1: B:19:0x008f->B:21:0x0095, LOOP_END, TryCatch #0 {Exception -> 0x00c2, blocks: (B:6:0x0011, B:7:0x0057, B:8:0x0062, B:10:0x006b, B:13:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0095, B:23:0x00b1, B:29:0x001d, B:30:0x0031, B:32:0x003b, B:34:0x004c, B:38:0x0024), top: B:2:0x000b }] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f34532a
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = r9.f34534c
            com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel r6 = r9.f34533b
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            ut.n.b(r10)     // Catch: java.lang.Exception -> Lc2
            goto L57
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            ut.n.b(r10)     // Catch: java.lang.Exception -> Lc2
            goto L31
        L21:
            ut.n.b(r10)
            com.assetgro.stockgro.data.repository.ChatRepository r10 = r6.f8835p     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "User"
            r9.f34532a = r3     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r10 = r10.joinSocialGroup(r5, r1, r9)     // Catch: java.lang.Exception -> Lc2
            if (r10 != r0) goto L31
            return r0
        L31:
            nv.v0 r10 = (nv.v0) r10     // Catch: java.lang.Exception -> Lc2
            okhttp3.Response r1 = r10.f29302a     // Catch: java.lang.Exception -> Lc2
            boolean r1 = r1.isSuccessful()     // Catch: java.lang.Exception -> Lc2
            if (r1 != 0) goto L4c
            sb.s r0 = new sb.s     // Catch: java.lang.Exception -> Lc2
            okhttp3.Response r10 = r10.f29302a     // Catch: java.lang.Exception -> Lc2
            java.lang.String r10 = r10.message()     // Catch: java.lang.Exception -> Lc2
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lc2
            r6.k(r0)     // Catch: java.lang.Exception -> Lc2
            kotlin.Unit r10 = kotlin.Unit.f23355a     // Catch: java.lang.Exception -> Lc2
            return r10
        L4c:
            r9.f34532a = r4     // Catch: java.lang.Exception -> Lc2
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = kp.j.K(r7, r9)     // Catch: java.lang.Exception -> Lc2
            if (r10 != r0) goto L57
            return r0
        L57:
            e1.s r10 = r6.f8838s     // Catch: java.lang.Exception -> Lc2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc2
            r0.<init>()     // Catch: java.lang.Exception -> Lc2
            java.util.ListIterator r10 = r10.listIterator()     // Catch: java.lang.Exception -> Lc2
        L62:
            r1 = r10
            e1.x r1 = (e1.x) r1     // Catch: java.lang.Exception -> Lc2
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> Lc2
            if (r4 == 0) goto L82
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Exception -> Lc2
            r4 = r1
            hb.u r4 = (hb.u) r4     // Catch: java.lang.Exception -> Lc2
            hb.s r4 = r4.f18230a     // Catch: java.lang.Exception -> Lc2
            hb.r r4 = r4.f18227d     // Catch: java.lang.Exception -> Lc2
            java.lang.String r4 = r4.f18218e     // Catch: java.lang.Exception -> Lc2
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r5)     // Catch: java.lang.Exception -> Lc2
            if (r4 == 0) goto L62
            r0.add(r1)     // Catch: java.lang.Exception -> Lc2
            goto L62
        L82:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc2
            int r1 = vt.z.k(r0)     // Catch: java.lang.Exception -> Lc2
            r10.<init>(r1)     // Catch: java.lang.Exception -> Lc2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lc2
        L8f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Lc2
            hb.u r1 = (hb.u) r1     // Catch: java.lang.Exception -> Lc2
            hb.s r1 = r1.f18230a     // Catch: java.lang.Exception -> Lc2
            hb.r r4 = r1.f18227d     // Catch: java.lang.Exception -> Lc2
            hb.r r4 = hb.r.a(r4, r3)     // Catch: java.lang.Exception -> Lc2
            r7 = 55
            hb.s r1 = hb.s.a(r1, r4, r2, r7)     // Catch: java.lang.Exception -> Lc2
            hb.u r1 = hb.u.a(r1)     // Catch: java.lang.Exception -> Lc2
            r10.add(r1)     // Catch: java.lang.Exception -> Lc2
            goto L8f
        Lb1:
            sb.c0 r0 = new sb.c0     // Catch: java.lang.Exception -> Lc2
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lc2
            r6.k(r0)     // Catch: java.lang.Exception -> Lc2
            sb.t r10 = new sb.t     // Catch: java.lang.Exception -> Lc2
            r10.<init>(r5)     // Catch: java.lang.Exception -> Lc2
            r6.k(r10)     // Catch: java.lang.Exception -> Lc2
            goto Lca
        Lc2:
            sb.s r10 = new sb.s
            r10.<init>(r2)
            r6.k(r10)
        Lca:
            kotlin.Unit r10 = kotlin.Unit.f23355a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
