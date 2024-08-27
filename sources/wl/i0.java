package wl;

import android.os.Bundle;
import com.facebook.FacebookException;
import kotlin.jvm.internal.Intrinsics;
import nl.r0;

/* loaded from: classes.dex */
public final class i0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f39210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f39211b;

    public i0(j0 j0Var, q qVar) {
        this.f39210a = j0Var;
        this.f39211b = qVar;
    }

    @Override // nl.r0
    public final void a(Bundle bundle, FacebookException facebookException) {
        j0 j0Var = this.f39210a;
        j0Var.getClass();
        q request = this.f39211b;
        Intrinsics.checkNotNullParameter(request, "request");
        j0Var.o(request, bundle, facebookException);
    }
}
