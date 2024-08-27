package e1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int[] f14890b;

    /* renamed from: c, reason: collision with root package name */
    public int f14891c;

    /* renamed from: d, reason: collision with root package name */
    public int f14892d;

    /* renamed from: e, reason: collision with root package name */
    public int f14893e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f14895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, yt.a aVar) {
        super(aVar);
        this.f14895g = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        m mVar = new m(this.f14895g, aVar);
        mVar.f14894f = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00e4 -> B:7:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00e7 -> B:7:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:21:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:21:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0075 -> B:34:0x0078). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
