package qu;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class w0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final h f32288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f32289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(a1 a1Var, long j10, i iVar) {
        super(j10);
        this.f32289d = a1Var;
        this.f32288c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32288c.q(this.f32289d, Unit.f23355a);
    }

    @Override // qu.y0
    public final String toString() {
        return super.toString() + this.f32288c;
    }
}
