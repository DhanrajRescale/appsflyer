package t8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import y8.m;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f35592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.j f35593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f35595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n8.e f35596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w8.c f35597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f35598h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, y8.j jVar, Object obj, m mVar, n8.e eVar, w8.c cVar, l lVar, yt.a aVar) {
        super(2, aVar);
        this.f35592b = iVar;
        this.f35593c = jVar;
        this.f35594d = obj;
        this.f35595e = mVar;
        this.f35596f = eVar;
        this.f35597g = cVar;
        this.f35598h = lVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f35592b, this.f35593c, this.f35594d, this.f35595e, this.f35596f, this.f35597g, this.f35598h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
