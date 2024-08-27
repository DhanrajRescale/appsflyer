package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.z f40759a;

    /* renamed from: b, reason: collision with root package name */
    public iu.z f40760b;

    /* renamed from: c, reason: collision with root package name */
    public int f40761c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f40763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, yt.a aVar) {
        super(2, aVar);
        this.f40763e = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i iVar = new i(this.f40763e, aVar);
        iVar.f40762d = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[Catch: CancellationException -> 0x00e0, TryCatch #1 {CancellationException -> 0x00e0, blocks: (B:29:0x00c3, B:31:0x00c9, B:35:0x00e2, B:37:0x00e6), top: B:28:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2 A[Catch: CancellationException -> 0x00e0, TryCatch #1 {CancellationException -> 0x00e0, blocks: (B:29:0x00c3, B:31:0x00c9, B:35:0x00e2, B:37:0x00e6), top: B:28:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: CancellationException -> 0x00f9, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x00f9, blocks: (B:22:0x009d, B:46:0x00bd), top: B:21:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f6 -> B:9:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010c -> B:9:0x005b). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
