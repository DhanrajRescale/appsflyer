package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t.d0 f35034a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f35035b;

    /* renamed from: c, reason: collision with root package name */
    public su.g f35036c;

    /* renamed from: d, reason: collision with root package name */
    public e1.f f35037d;

    /* renamed from: e, reason: collision with root package name */
    public Object f35038e;

    /* renamed from: f, reason: collision with root package name */
    public int f35039f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f35040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f35041h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f35041h = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h3 h3Var = new h3(this.f35041h, aVar);
        h3Var.f35040g = obj;
        return h3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h3) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0020, B:11:0x00af, B:15:0x00c4, B:17:0x00c9, B:20:0x00d4, B:22:0x00e9, B:24:0x00f5, B:26:0x00ff, B:31:0x010c, B:39:0x011c, B:42:0x0125, B:45:0x012f, B:50:0x0136, B:56:0x014e, B:58:0x0157, B:70:0x017f, B:71:0x0182, B:78:0x0040, B:81:0x0056, B:84:0x0080, B:90:0x0095, B:100:0x0192, B:101:0x0195, B:86:0x008a, B:89:0x0092, B:97:0x018d, B:98:0x0190, B:88:0x008e, B:52:0x0143, B:55:0x014b, B:66:0x017a, B:67:0x017d), top: B:2:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183 A[LOOP:0: B:16:0x00c7->B:47:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134 A[EDGE_INSN: B:48:0x0134->B:49:0x0134 BREAK  A[LOOP:0: B:16:0x00c7->B:47:0x0183], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0020, B:11:0x00af, B:15:0x00c4, B:17:0x00c9, B:20:0x00d4, B:22:0x00e9, B:24:0x00f5, B:26:0x00ff, B:31:0x010c, B:39:0x011c, B:42:0x0125, B:45:0x012f, B:50:0x0136, B:56:0x014e, B:58:0x0157, B:70:0x017f, B:71:0x0182, B:78:0x0040, B:81:0x0056, B:84:0x0080, B:90:0x0095, B:100:0x0192, B:101:0x0195, B:86:0x008a, B:89:0x0092, B:97:0x018d, B:98:0x0190, B:88:0x008e, B:52:0x0143, B:55:0x014b, B:66:0x017a, B:67:0x017d), top: B:2:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016d -> B:10:0x016e). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
