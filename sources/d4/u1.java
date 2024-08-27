package d4;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u1 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f13835b;

    /* renamed from: c, reason: collision with root package name */
    public View f13836c;

    /* renamed from: d, reason: collision with root package name */
    public int f13837d;

    /* renamed from: e, reason: collision with root package name */
    public int f13838e;

    /* renamed from: f, reason: collision with root package name */
    public int f13839f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13841h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ViewGroup viewGroup, yt.a aVar) {
        super(aVar);
        this.f13841h = viewGroup;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u1 u1Var = new u1(this.f13841h, aVar);
        u1Var.f13840g = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:6:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009f -> B:7:0x00a3). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r12.f13839f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.f13838e
            int r4 = r12.f13837d
            android.view.ViewGroup r5 = r12.f13835b
            java.lang.Object r6 = r12.f13840g
            pu.i r6 = (pu.i) r6
            ut.n.b(r13)
            r13 = r12
            goto L98
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            int r1 = r12.f13838e
            int r4 = r12.f13837d
            android.view.View r5 = r12.f13836c
            android.view.ViewGroup r6 = r12.f13835b
            java.lang.Object r7 = r12.f13840g
            pu.i r7 = (pu.i) r7
            ut.n.b(r13)
            r13 = r12
            goto L65
        L35:
            ut.n.b(r13)
            java.lang.Object r13 = r12.f13840g
            pu.i r13 = (pu.i) r13
            android.view.ViewGroup r1 = r12.f13841h
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r12
        L44:
            if (r5 >= r4) goto La8
            android.view.View r7 = r1.getChildAt(r5)
            r6.f13840g = r13
            r6.f13835b = r1
            r6.f13836c = r7
            r6.f13837d = r5
            r6.f13838e = r4
            r6.f13839f = r3
            r13.b(r7, r6)
            zt.a r8 = zt.a.f42823a
            if (r8 != r0) goto L5e
            return r0
        L5e:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L65:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L9f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            d4.u1 r8 = new d4.u1
            r9 = 0
            r8.<init>(r5, r9)
            d4.t1 r5 = pu.j.a(r8)
            r13.f13840g = r7
            r13.f13835b = r6
            r13.f13836c = r9
            r13.f13837d = r4
            r13.f13838e = r1
            r13.f13839f = r2
            r7.getClass()
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r7.c(r5, r13)
            zt.a r8 = zt.a.f42823a
            if (r5 != r8) goto L91
            goto L93
        L91:
            kotlin.Unit r5 = kotlin.Unit.f23355a
        L93:
            if (r5 != r0) goto L96
            return r0
        L96:
            r5 = r6
            r6 = r7
        L98:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto La3
        L9f:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        La3:
            int r4 = r4 + r3
            r10 = r5
            r5 = r4
            r4 = r10
            goto L44
        La8:
            kotlin.Unit r13 = kotlin.Unit.f23355a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
