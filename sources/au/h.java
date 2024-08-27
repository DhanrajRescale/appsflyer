package au;

import iu.a0;
import iu.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h extends g implements iu.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2799a;

    public h(yt.a aVar) {
        super(aVar);
        this.f2799a = 2;
    }

    @Override // iu.g
    public final int getArity() {
        return this.f2799a;
    }

    @Override // au.a
    public final String toString() {
        if (getCompletion() == null) {
            a0.f20536a.getClass();
            String a10 = b0.a(this);
            Intrinsics.checkNotNullExpressionValue(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
