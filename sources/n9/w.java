package n9;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f28543a;

    /* renamed from: b, reason: collision with root package name */
    public int f28544b;

    /* renamed from: c, reason: collision with root package name */
    public int f28545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f28546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f28547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f28548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f28550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f28551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f28552j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f28553k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hu.c cVar, Context context, r rVar, String str, String str2, String str3, String str4, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f28546d = cVar;
        this.f28547e = context;
        this.f28548f = rVar;
        this.f28549g = str;
        this.f28550h = str2;
        this.f28551i = str3;
        this.f28552j = str4;
        this.f28553k = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f28546d, this.f28547e, this.f28548f, this.f28549g, this.f28550h, this.f28551i, this.f28552j, this.f28553k, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1 A[Catch: all -> 0x0114, TryCatch #2 {all -> 0x0114, blocks: (B:10:0x00de, B:11:0x00e8, B:15:0x00fc, B:27:0x007b, B:29:0x0085, B:32:0x008c, B:35:0x009d, B:37:0x00a1, B:40:0x00a8, B:43:0x00b8, B:46:0x00ce, B:49:0x00c1, B:52:0x00ca, B:53:0x00b0, B:55:0x0093, B:74:0x0108, B:77:0x0112, B:78:0x0113, B:13:0x00e9, B:73:0x00fe), top: B:9:0x00de, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0 A[Catch: all -> 0x0114, TryCatch #2 {all -> 0x0114, blocks: (B:10:0x00de, B:11:0x00e8, B:15:0x00fc, B:27:0x007b, B:29:0x0085, B:32:0x008c, B:35:0x009d, B:37:0x00a1, B:40:0x00a8, B:43:0x00b8, B:46:0x00ce, B:49:0x00c1, B:52:0x00ca, B:53:0x00b0, B:55:0x0093, B:74:0x0108, B:77:0x0112, B:78:0x0113, B:13:0x00e9, B:73:0x00fe), top: B:9:0x00de, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00db -> B:9:0x00de). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
