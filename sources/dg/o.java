package dg;

import ba.sd;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends y1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f14373w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final sd f14374u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f14375v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, sd binding) {
        super(binding.f27491e);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f14375v = pVar;
        this.f14374u = binding;
        binding.f6067z.setOnClickListener(new bb.a(14, this, pVar));
    }
}
