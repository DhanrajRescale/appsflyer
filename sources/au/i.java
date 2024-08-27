package au;

import iu.a0;
import iu.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class i extends c implements iu.g {
    private final int arity;

    public i(int i10, yt.a aVar) {
        super(aVar);
        this.arity = i10;
    }

    @Override // iu.g
    public int getArity() {
        return this.arity;
    }

    @Override // au.a
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            a0.f20536a.getClass();
            String a10 = b0.a(this);
            Intrinsics.checkNotNullExpressionValue(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
