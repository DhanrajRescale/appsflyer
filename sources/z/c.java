package z;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f41849a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f41851c;

    /* renamed from: d, reason: collision with root package name */
    public int f41852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, yt.a aVar) {
        super(aVar);
        this.f41851c = hVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f41850b = obj;
        this.f41852d |= Integer.MIN_VALUE;
        return this.f41851c.c(null, s0.g.f34069a, null, this);
    }
}
