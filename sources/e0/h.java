package e0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public x1.t f14694b;

    /* renamed from: c, reason: collision with root package name */
    public x1.t f14695c;

    /* renamed from: d, reason: collision with root package name */
    public int f14696d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f14698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j0 j0Var, yt.a aVar) {
        super(aVar);
        this.f14698f = j0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f14698f, aVar);
        hVar.f14697e = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x0073). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
