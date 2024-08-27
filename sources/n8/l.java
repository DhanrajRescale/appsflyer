package n8;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class l extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public o f28381a;

    /* renamed from: b, reason: collision with root package name */
    public y8.o f28382b;

    /* renamed from: c, reason: collision with root package name */
    public y8.j f28383c;

    /* renamed from: d, reason: collision with root package name */
    public e f28384d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f28385e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f28387g;

    /* renamed from: h, reason: collision with root package name */
    public int f28388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, yt.a aVar) {
        super(aVar);
        this.f28387g = oVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f28386f = obj;
        this.f28388h |= Integer.MIN_VALUE;
        return o.a(this.f28387g, null, 0, this);
    }
}
