package ij;

import android.view.animation.Animation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20055a;

    /* renamed from: b, reason: collision with root package name */
    public int f20056b;

    /* renamed from: c, reason: collision with root package name */
    public int f20057c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f20059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Animation f20060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Animation f20061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, Animation animation, Animation animation2, yt.a aVar) {
        super(2, aVar);
        this.f20059e = list;
        this.f20060f = animation;
        this.f20061g = animation2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e eVar = new e(this.f20059e, this.f20060f, this.f20061g, aVar);
        eVar.f20058d = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:7:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r14.f20057c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r14.f20056b
            int r4 = r14.f20055a
            java.lang.Object r5 = r14.f20058d
            qu.f0 r5 = (qu.f0) r5
            ut.n.b(r15)
            r15 = r5
            r5 = r1
            r1 = r14
            goto L81
        L1c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L24:
            int r1 = r14.f20056b
            int r4 = r14.f20055a
            java.lang.Object r5 = r14.f20058d
            qu.f0 r5 = (qu.f0) r5
            ut.n.b(r15)
            r11 = r4
            r4 = r1
            r1 = r14
            goto L6d
        L33:
            ut.n.b(r15)
            java.lang.Object r15 = r14.f20058d
            qu.f0 r15 = (qu.f0) r15
            r1 = r14
        L3b:
            boolean r4 = hl.f.u0(r15)
            if (r4 == 0) goto L85
            java.util.List r4 = r1.f20059e
            int r4 = r4.size()
            r5 = 0
            r11 = r5
        L49:
            if (r11 >= r4) goto L3b
            xu.e r5 = qu.r0.f32255a
            qu.b2 r12 = vu.u.f38408a
            ij.d r13 = new ij.d
            java.util.List r6 = r1.f20059e
            android.view.animation.Animation r8 = r1.f20060f
            android.view.animation.Animation r9 = r1.f20061g
            r10 = 0
            r5 = r13
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f20058d = r15
            r1.f20055a = r11
            r1.f20056b = r4
            r1.f20057c = r3
            java.lang.Object r5 = yk.g.e0(r12, r13, r1)
            if (r5 != r0) goto L6c
            return r0
        L6c:
            r5 = r15
        L6d:
            r1.f20058d = r5
            r1.f20055a = r11
            r1.f20056b = r4
            r1.f20057c = r2
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r15 = kp.j.K(r6, r1)
            if (r15 != r0) goto L7e
            return r0
        L7e:
            r15 = r5
            r5 = r4
            r4 = r11
        L81:
            int r11 = r4 + 1
            r4 = r5
            goto L49
        L85:
            kotlin.Unit r15 = kotlin.Unit.f23355a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
