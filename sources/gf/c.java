package gf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, yt.a aVar) {
        super(2, aVar);
        this.f17357b = eVar;
        this.f17358c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f17357b, this.f17358c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r3.equals(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[RETURN] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
