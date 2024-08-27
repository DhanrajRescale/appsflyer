package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f3 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Object f40699b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40700c;

    /* renamed from: d, reason: collision with root package name */
    public iu.z f40701d;

    /* renamed from: e, reason: collision with root package name */
    public long f40702e;

    /* renamed from: f, reason: collision with root package name */
    public int f40703f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f40704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f40705h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hu.c f40706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f40707j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f40708k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f40709l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k1 f40710m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(qu.f0 f0Var, hu.c cVar, Function1 function1, Function1 function12, Function1 function13, k1 k1Var, yt.a aVar) {
        super(aVar);
        this.f40705h = f0Var;
        this.f40706i = cVar;
        this.f40707j = function1;
        this.f40708k = function12;
        this.f40709l = function13;
        this.f40710m = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        f3 f3Var = new f3(this.f40705h, this.f40706i, this.f40707j, this.f40708k, this.f40709l, this.f40710m, aVar);
        f3Var.f40704g = obj;
        return f3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[Catch: PointerEventTimeoutCancellationException -> 0x00f9, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00f9, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00fd), top: B:58:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd A[Catch: PointerEventTimeoutCancellationException -> 0x00f9, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00f9, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00fd), top: B:58:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c4  */
    /* JADX WARN: Type inference failed for: r12v0, types: [au.h, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v43, types: [yt.a, kotlin.coroutines.CoroutineContext$Element, qu.g0] */
    /* JADX WARN: Type inference failed for: r2v44 */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.f3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
