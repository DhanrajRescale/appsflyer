package iu;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i10) {
        this.arity = i10;
    }

    @Override // iu.g
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        a0.f20536a.getClass();
        String a10 = b0.a(this);
        Intrinsics.checkNotNullExpressionValue(a10, "renderLambdaToString(...)");
        return a10;
    }
}
