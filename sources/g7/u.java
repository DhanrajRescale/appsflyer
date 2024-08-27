package g7;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f17077a;

    /* renamed from: b, reason: collision with root package name */
    public int f17078b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.h f17080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q.h hVar, yt.a aVar) {
        super(2, aVar);
        this.f17080d = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u uVar = new u(this.f17080d, aVar);
        uVar.f17079c = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r5.f17078b
            q.h r2 = r5.f17080d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.util.Iterator r1 = r5.f17077a
            java.lang.Object r2 = r5.f17079c
            tu.g r2 = (tu.g) r2
            ut.n.b(r6)
            goto L4e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            java.lang.Object r1 = r5.f17079c
            tu.g r1 = (tu.g) r1
            ut.n.b(r6)
            goto L3f
        L28:
            ut.n.b(r6)
            java.lang.Object r6 = r5.f17079c
            r1 = r6
            tu.g r1 = (tu.g) r1
            java.lang.Object r6 = r2.f31450b
            g7.h0 r6 = (g7.h0) r6
            r5.f17079c = r1
            r5.f17078b = r4
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L3f
            return r0
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r2.f31453e
            qu.o1 r2 = (qu.o1) r2
            r2.start()
            java.util.Iterator r6 = r6.iterator()
            r2 = r1
            r1 = r6
        L4e:
            r6 = r5
        L4f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r1.next()
            kotlin.collections.IndexedValue r4 = (kotlin.collections.IndexedValue) r4
            r6.f17079c = r2
            r6.f17077a = r1
            r6.f17078b = r3
            java.lang.Object r4 = r2.a(r4, r6)
            if (r4 != r0) goto L4f
            return r0
        L68:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
