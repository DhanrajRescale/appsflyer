package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public x1.k f40717b;

    /* renamed from: c, reason: collision with root package name */
    public int f40718c;

    /* renamed from: d, reason: collision with root package name */
    public int f40719d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu.z f40721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu.z f40722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(iu.z zVar, iu.z zVar2, yt.a aVar) {
        super(aVar);
        this.f40721f = zVar;
        this.f40722g = zVar2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g0 g0Var = new g0(this.f40721f, this.f40722g, aVar);
        g0Var.f40720e = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb A[EDGE_INSN: B:69:0x00cb->B:13:0x00cb BREAK  A[LOOP:0: B:7:0x00b8->B:10:0x00c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ad -> B:6:0x00af). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
