package t;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a0 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public b0 f34825b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f34826c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f34827d;

    /* renamed from: e, reason: collision with root package name */
    public int f34828e;

    /* renamed from: f, reason: collision with root package name */
    public int f34829f;

    /* renamed from: g, reason: collision with root package name */
    public int f34830g;

    /* renamed from: h, reason: collision with root package name */
    public int f34831h;

    /* renamed from: i, reason: collision with root package name */
    public long f34832i;

    /* renamed from: j, reason: collision with root package name */
    public int f34833j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f34834k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f34835l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f34836m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, b0 b0Var, yt.a aVar) {
        super(aVar);
        this.f34835l = d0Var;
        this.f34836m = b0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        a0 a0Var = new a0(this.f34835l, this.f34836m, aVar);
        a0Var.f34834k = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009c -> B:5:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a7 -> B:6:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:7:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b7 -> B:19:0x00b8). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
