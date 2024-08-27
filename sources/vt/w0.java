package vt;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w0 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Object f38344b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f38345c;

    /* renamed from: d, reason: collision with root package name */
    public int f38346d;

    /* renamed from: e, reason: collision with root package name */
    public int f38347e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f38348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38349g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38350h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterator f38351i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f38352j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f38353k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i10, int i11, Iterator it, boolean z10, boolean z11, yt.a aVar) {
        super(aVar);
        this.f38349g = i10;
        this.f38350h = i11;
        this.f38351i = it;
        this.f38352j = z10;
        this.f38353k = z11;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        w0 w0Var = new w0(this.f38349g, this.f38350h, this.f38351i, this.f38352j, this.f38353k, aVar);
        w0Var.f38348f = obj;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x017b -> B:12:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0146 -> B:30:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x009e -> B:61:0x0052). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
