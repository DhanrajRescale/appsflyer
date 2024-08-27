package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public j f40616b;

    /* renamed from: c, reason: collision with root package name */
    public qu.f0 f40617c;

    /* renamed from: d, reason: collision with root package name */
    public int f40618d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f40620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f40621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, yt.a aVar, qu.f0 f0Var) {
        super(aVar);
        this.f40620f = f0Var;
        this.f40621g = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b bVar = new b(this.f40621g, aVar, this.f40620f);
        bVar.f40619e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:31|34|35|36|37|38|39|40|41|42|43|44|45|46|(1:48)(11:49|9|10|11|(0)(0)|17|18|19|20|21|(2:72|73)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:31|(1:33)|34|35|36|37|38|39|40|41|42|43|44|45|46|(1:48)(11:49|9|10|11|(0)(0)|17|18|19|20|21|(2:72|73)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
    
        r9 = r2;
        r2 = r5;
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        r8 = r17;
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        ((d2.j3) c2.g.p(r8, d2.s1.f13631p)).e();
        r8.f40789z.o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010f, code lost:
    
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        r17 = r12;
        r18 = r13;
        r9 = r2;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        r17 = r12;
        r18 = r13;
        r7 = r14;
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c A[Catch: all -> 0x0022, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001a, B:10:0x00c5, B:54:0x0131, B:57:0x014c), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0103  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [yt.a, kotlin.coroutines.CoroutineContext$Element, qu.g0] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y.j, qu.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00be -> B:9:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0137 -> B:18:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x015e -> B:20:0x0149). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
