package t8;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import y8.m;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public List f35599a;

    /* renamed from: b, reason: collision with root package name */
    public m f35600b;

    /* renamed from: c, reason: collision with root package name */
    public int f35601c;

    /* renamed from: d, reason: collision with root package name */
    public int f35602d;

    /* renamed from: e, reason: collision with root package name */
    public int f35603e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f35604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f35605g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f35606h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f35607i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f35608j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n8.e f35609k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y8.j f35610l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a aVar, m mVar, List list, n8.e eVar, y8.j jVar, yt.a aVar2) {
        super(2, aVar2);
        this.f35605g = iVar;
        this.f35606h = aVar;
        this.f35607i = mVar;
        this.f35608j = list;
        this.f35609k = eVar;
        this.f35610l = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f35605g, this.f35606h, this.f35607i, this.f35608j, this.f35609k, this.f35610l, aVar);
        hVar.f35604f = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (vt.v.o(d9.e.f14221a, r7) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d7 -> B:5:0x00da). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
