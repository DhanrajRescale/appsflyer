package g7;

import kotlin.collections.IndexedValue;

/* loaded from: classes.dex */
public final class o extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public p f16960a;

    /* renamed from: b, reason: collision with root package name */
    public IndexedValue f16961b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f16963d;

    /* renamed from: e, reason: collision with root package name */
    public int f16964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, yt.a aVar) {
        super(aVar);
        this.f16963d = pVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16962c = obj;
        this.f16964e |= Integer.MIN_VALUE;
        return this.f16963d.a(null, this);
    }
}
